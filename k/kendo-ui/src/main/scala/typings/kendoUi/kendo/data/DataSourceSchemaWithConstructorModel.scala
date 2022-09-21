package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaWithConstructorModel
  extends StObject
     with DataSourceSchema {
  
  @JSName("model")
  var model_DataSourceSchemaWithConstructorModel: js.UndefOr[TypeofModel & (Instantiable1[/* data */ js.UndefOr[Any], Model])] = js.undefined
}
object DataSourceSchemaWithConstructorModel {
  
  inline def apply(): DataSourceSchemaWithConstructorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithConstructorModel]
  }
  
  extension [Self <: DataSourceSchemaWithConstructorModel](x: Self) {
    
    inline def setModel(value: TypeofModel & (Instantiable1[/* data */ js.UndefOr[Any], Model])): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
