package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageIndexChangingEventUIParam extends js.Object {
  
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets new page index.
    */
  var newPageIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object PageIndexChangingEventUIParam {
  
  @scala.inline
  def apply(): PageIndexChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangingEventUIParam]
  }
  
  @scala.inline
  implicit class PageIndexChangingEventUIParamOps[Self <: PageIndexChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = this.set("currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageIndex: Self = this.set("currentPageIndex", js.undefined)
    
    @scala.inline
    def setNewPageIndex(value: Double): Self = this.set("newPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPageIndex: Self = this.set("newPageIndex", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
