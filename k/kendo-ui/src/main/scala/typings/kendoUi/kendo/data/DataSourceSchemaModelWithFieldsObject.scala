package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaModelWithFieldsObject
  extends StObject
     with DataSourceSchemaModel {
  
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsObject: js.UndefOr[DataSourceSchemaModelFields] = js.undefined
}
object DataSourceSchemaModelWithFieldsObject {
  
  @scala.inline
  def apply(): DataSourceSchemaModelWithFieldsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsObject]
  }
  
  @scala.inline
  implicit class DataSourceSchemaModelWithFieldsObjectMutableBuilder[Self <: DataSourceSchemaModelWithFieldsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: DataSourceSchemaModelFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
