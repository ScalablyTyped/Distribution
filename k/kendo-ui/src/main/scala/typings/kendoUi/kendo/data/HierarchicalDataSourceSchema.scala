package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchicalDataSourceSchema extends DataSourceSchemaWithOptionsModel {
  
  @JSName("model")
  var model_HierarchicalDataSourceSchema: js.UndefOr[HierarchicalDataSourceSchemaModel] = js.native
}
object HierarchicalDataSourceSchema {
  
  @scala.inline
  def apply(): HierarchicalDataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchema]
  }
  
  @scala.inline
  implicit class HierarchicalDataSourceSchemaMutableBuilder[Self <: HierarchicalDataSourceSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: HierarchicalDataSourceSchemaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
