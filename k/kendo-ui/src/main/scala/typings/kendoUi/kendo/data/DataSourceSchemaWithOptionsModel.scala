package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaWithOptionsModel
  extends StObject
     with DataSourceSchema {
  
  @JSName("model")
  var model_DataSourceSchemaWithOptionsModel: js.UndefOr[DataSourceSchemaModel] = js.undefined
}
object DataSourceSchemaWithOptionsModel {
  
  @scala.inline
  def apply(): DataSourceSchemaWithOptionsModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithOptionsModel]
  }
  
  @scala.inline
  implicit class DataSourceSchemaWithOptionsModelMutableBuilder[Self <: DataSourceSchemaWithOptionsModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: DataSourceSchemaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
