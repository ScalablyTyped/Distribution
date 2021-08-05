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
  
  inline def apply(): DataSourceSchemaWithOptionsModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithOptionsModel]
  }
  
  extension [Self <: DataSourceSchemaWithOptionsModel](x: Self) {
    
    inline def setModel(value: DataSourceSchemaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
