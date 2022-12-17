package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.Roomevents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  var search_categories: Roomevents
}
object SearchResponse {
  
  inline def apply(search_categories: Roomevents): SearchResponse = {
    val __obj = js.Dynamic.literal(search_categories = search_categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
  
  extension [Self <: SearchResponse](x: Self) {
    
    inline def setSearch_categories(value: Roomevents): Self = StObject.set(x, "search_categories", value.asInstanceOf[js.Any])
  }
}
