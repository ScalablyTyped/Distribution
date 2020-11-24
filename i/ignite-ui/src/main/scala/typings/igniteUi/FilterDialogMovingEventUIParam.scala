package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDialogMovingEventUIParam extends js.Object {
  
  /**
    * Gets reference to filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.native
  
  /**
    * Gets the original position of the groupby dialog div as { top, left } object, relative to the page.
    */
  var originalPosition: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the current position of the groupby dialog div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[js.Any] = js.native
}
object FilterDialogMovingEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogMovingEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogMovingEventUIParamOps[Self <: FilterDialogMovingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setDialog(value: String): Self = this.set("dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = this.set("originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPosition: Self = this.set("originalPosition", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
