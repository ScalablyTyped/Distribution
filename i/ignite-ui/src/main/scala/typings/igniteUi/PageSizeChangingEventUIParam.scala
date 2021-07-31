package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSizeChangingEventUIParam extends StObject {
  
  /**
    * Gets the current page size.
    */
  var currentPageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the new page size.
    */
  var newPageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object PageSizeChangingEventUIParam {
  
  @scala.inline
  def apply(): PageSizeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSizeChangingEventUIParam]
  }
  
  @scala.inline
  implicit class PageSizeChangingEventUIParamMutableBuilder[Self <: PageSizeChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPageSize(value: Double): Self = StObject.set(x, "currentPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageSizeUndefined: Self = StObject.set(x, "currentPageSize", js.undefined)
    
    @scala.inline
    def setNewPageSize(value: Double): Self = StObject.set(x, "newPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPageSizeUndefined: Self = StObject.set(x, "newPageSize", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
