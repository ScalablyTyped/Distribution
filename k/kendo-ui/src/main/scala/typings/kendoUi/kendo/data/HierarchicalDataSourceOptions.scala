package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchicalDataSourceOptions extends DataSourceOptions {
  
  @JSName("schema")
  var schema_HierarchicalDataSourceOptions: js.UndefOr[HierarchicalDataSourceSchema] = js.native
}
object HierarchicalDataSourceOptions {
  
  @scala.inline
  def apply(): HierarchicalDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceOptions]
  }
  
  @scala.inline
  implicit class HierarchicalDataSourceOptionsMutableBuilder[Self <: HierarchicalDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: HierarchicalDataSourceSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
