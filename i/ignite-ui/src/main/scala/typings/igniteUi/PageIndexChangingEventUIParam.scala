package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageIndexChangingEventUIParam extends StObject {
  
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets new page index.
    */
  var newPageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object PageIndexChangingEventUIParam {
  
  @scala.inline
  def apply(): PageIndexChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangingEventUIParam]
  }
  
  @scala.inline
  implicit class PageIndexChangingEventUIParamMutableBuilder[Self <: PageIndexChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageIndexUndefined: Self = StObject.set(x, "currentPageIndex", js.undefined)
    
    @scala.inline
    def setNewPageIndex(value: Double): Self = StObject.set(x, "newPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPageIndexUndefined: Self = StObject.set(x, "newPageIndex", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
