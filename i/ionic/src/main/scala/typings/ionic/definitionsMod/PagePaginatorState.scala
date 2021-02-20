package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagePaginatorState extends PaginatorState {
  
  var page: Double = js.native
  
  var page_size: js.UndefOr[Double] = js.native
}
object PagePaginatorState {
  
  @scala.inline
  def apply(done: Boolean, loaded: Double, page: Double): PagePaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePaginatorState]
  }
  
  @scala.inline
  implicit class PagePaginatorStateMutableBuilder[Self <: PagePaginatorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
  }
}
