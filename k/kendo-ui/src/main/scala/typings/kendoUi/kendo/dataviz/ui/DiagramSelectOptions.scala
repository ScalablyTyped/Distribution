package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramSelectOptions extends js.Object {
  
  var addToSelection: js.UndefOr[Boolean] = js.native
}
object DiagramSelectOptions {
  
  @scala.inline
  def apply(): DiagramSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramSelectOptions]
  }
  
  @scala.inline
  implicit class DiagramSelectOptionsOps[Self <: DiagramSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setAddToSelection(value: Boolean): Self = this.set("addToSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToSelection: Self = this.set("addToSelection", js.undefined)
  }
}
