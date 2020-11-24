package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttResources extends js.Object {
  
  var dataColorField: js.UndefOr[String] = js.native
  
  var dataFormatField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
}
object GanttResources {
  
  @scala.inline
  def apply(): GanttResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttResources]
  }
  
  @scala.inline
  implicit class GanttResourcesOps[Self <: GanttResources] (val x: Self) extends AnyVal {
    
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
    def setDataColorField(value: String): Self = this.set("dataColorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataColorField: Self = this.set("dataColorField", js.undefined)
    
    @scala.inline
    def setDataFormatField(value: String): Self = this.set("dataFormatField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormatField: Self = this.set("dataFormatField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
