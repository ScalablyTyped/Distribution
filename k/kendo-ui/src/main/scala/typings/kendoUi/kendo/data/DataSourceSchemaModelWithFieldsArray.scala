package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaModelWithFieldsArray
  extends StObject
     with DataSourceSchemaModel {
  
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsArray: js.UndefOr[js.Array[DataSourceSchemaModelField]] = js.undefined
}
object DataSourceSchemaModelWithFieldsArray {
  
  @scala.inline
  def apply(): DataSourceSchemaModelWithFieldsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsArray]
  }
  
  @scala.inline
  implicit class DataSourceSchemaModelWithFieldsArrayMutableBuilder[Self <: DataSourceSchemaModelWithFieldsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[DataSourceSchemaModelField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: DataSourceSchemaModelField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
