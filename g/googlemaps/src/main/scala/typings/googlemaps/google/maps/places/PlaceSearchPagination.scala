package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceSearchPagination extends StObject {
  
  var hasNextPage: Boolean
  
  def nextPage(): Unit
}
object PlaceSearchPagination {
  
  inline def apply(hasNextPage: Boolean, nextPage: () => Unit): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[PlaceSearchPagination]
  }
  
  extension [Self <: PlaceSearchPagination](x: Self) {
    
    inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
    
    inline def setNextPage(value: () => Unit): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
  }
}
