package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaModel
  extends StObject
     with /* index */ StringDictionary[js.Any] {
  
  var fields: js.UndefOr[js.Any] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object DataSourceSchemaModel {
  
  inline def apply(): DataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModel]
  }
  
  extension [Self <: DataSourceSchemaModel](x: Self) {
    
    inline def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
