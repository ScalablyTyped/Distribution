package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerResource extends js.Object {
  
  var dataColorField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataValueField: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var valuePrimitive: js.UndefOr[Boolean] = js.native
}
object SchedulerResource {
  
  @scala.inline
  def apply(): SchedulerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerResource]
  }
  
  @scala.inline
  implicit class SchedulerResourceOps[Self <: SchedulerResource] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setDataValueField(value: String): Self = this.set("dataValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValueField: Self = this.set("dataValueField", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValuePrimitive(value: Boolean): Self = this.set("valuePrimitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePrimitive: Self = this.set("valuePrimitive", js.undefined)
  }
}
