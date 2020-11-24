package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextRowRenderingEventUIParam extends js.Object {
  
  /**
    * Gets the current context row mode.
    */
  var contextRowMode: js.UndefOr[String] = js.native
  
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to the first data row. Null if there are no records.
    */
  var dataRow: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to igTreeGridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ContextRowRenderingEventUIParam {
  
  @scala.inline
  def apply(): ContextRowRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class ContextRowRenderingEventUIParamOps[Self <: ContextRowRenderingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setContextRowMode(value: String): Self = this.set("contextRowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextRowMode: Self = this.set("contextRowMode", js.undefined)
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = this.set("currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageIndex: Self = this.set("currentPageIndex", js.undefined)
    
    @scala.inline
    def setDataRow(value: js.Any): Self = this.set("dataRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRow: Self = this.set("dataRow", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
