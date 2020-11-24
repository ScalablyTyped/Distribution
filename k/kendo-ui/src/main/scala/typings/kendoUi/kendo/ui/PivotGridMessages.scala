package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridMessages extends js.Object {
  
  var columnFields: js.UndefOr[String] = js.native
  
  var fieldMenu: js.UndefOr[PivotGridMessagesFieldMenu] = js.native
  
  var measureFields: js.UndefOr[String] = js.native
  
  var rowFields: js.UndefOr[String] = js.native
}
object PivotGridMessages {
  
  @scala.inline
  def apply(): PivotGridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessages]
  }
  
  @scala.inline
  implicit class PivotGridMessagesOps[Self <: PivotGridMessages] (val x: Self) extends AnyVal {
    
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
    def setColumnFields(value: String): Self = this.set("columnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFields: Self = this.set("columnFields", js.undefined)
    
    @scala.inline
    def setFieldMenu(value: PivotGridMessagesFieldMenu): Self = this.set("fieldMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMenu: Self = this.set("fieldMenu", js.undefined)
    
    @scala.inline
    def setMeasureFields(value: String): Self = this.set("measureFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureFields: Self = this.set("measureFields", js.undefined)
    
    @scala.inline
    def setRowFields(value: String): Self = this.set("rowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowFields: Self = this.set("rowFields", js.undefined)
  }
}
