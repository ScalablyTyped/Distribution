package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.Roomevents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBody extends StObject {
  
  var search_categories: Roomevents
}
object SearchBody {
  
  inline def apply(search_categories: Roomevents): SearchBody = {
    val __obj = js.Dynamic.literal(search_categories = search_categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBody]
  }
  
  extension [Self <: SearchBody](x: Self) {
    
    inline def setSearch_categories(value: Roomevents): Self = StObject.set(x, "search_categories", value.asInstanceOf[js.Any])
  }
}
