package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSchemaWithConstructorModel extends DataSourceSchema {
  
  @JSName("model")
  var model_DataSourceSchemaWithConstructorModel: js.UndefOr[TypeofModel with (Instantiable1[/* data */ js.UndefOr[js.Any], Model])] = js.native
}
object DataSourceSchemaWithConstructorModel {
  
  @scala.inline
  def apply(): DataSourceSchemaWithConstructorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithConstructorModel]
  }
  
  @scala.inline
  implicit class DataSourceSchemaWithConstructorModelMutableBuilder[Self <: DataSourceSchemaWithConstructorModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TypeofModel with (Instantiable1[/* data */ js.UndefOr[js.Any], Model])): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
