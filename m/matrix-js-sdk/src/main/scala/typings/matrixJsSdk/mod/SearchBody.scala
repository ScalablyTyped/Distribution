package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.RoomeventsEventcontext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBody extends StObject {
  
  var search_categories: RoomeventsEventcontext
}
object SearchBody {
  
  inline def apply(search_categories: RoomeventsEventcontext): SearchBody = {
    val __obj = js.Dynamic.literal(search_categories = search_categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchBody] (val x: Self) extends AnyVal {
    
    inline def setSearch_categories(value: RoomeventsEventcontext): Self = StObject.set(x, "search_categories", value.asInstanceOf[js.Any])
  }
}
