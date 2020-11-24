package typings.kendoUi.kendo.data

import typings.kendoUi.anon.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSchemaWithConstructorModel extends DataSourceSchema {
  
  @JSName("model")
  var model_DataSourceSchemaWithConstructorModel: js.UndefOr[TypeofModel] = js.native
}
object DataSourceSchemaWithConstructorModel {
  
  @scala.inline
  def apply(): DataSourceSchemaWithConstructorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithConstructorModel]
  }
  
  @scala.inline
  implicit class DataSourceSchemaWithConstructorModelOps[Self <: DataSourceSchemaWithConstructorModel] (val x: Self) extends AnyVal {
    
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
    def setModel(value: TypeofModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
}
