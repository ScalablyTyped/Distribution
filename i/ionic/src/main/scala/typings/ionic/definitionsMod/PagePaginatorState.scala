package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagePaginatorState
  extends StObject
     with PaginatorState {
  
  var page: Double
  
  var page_size: js.UndefOr[Double] = js.undefined
}
object PagePaginatorState {
  
  inline def apply(done: Boolean, loaded: Double, page: Double): PagePaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePaginatorState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagePaginatorState] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
  }
}
