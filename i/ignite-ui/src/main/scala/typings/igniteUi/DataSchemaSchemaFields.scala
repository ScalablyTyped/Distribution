package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSchemaSchemaFields
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * ParamType="function" optional="true" formatter function which accepts three parameters: val - value of the field; record - data source record; field - field definition; and return the formatted string. Formatter function is used when filtering by all fields.
    */
  var formatter: js.UndefOr[Any] = js.undefined
  
  /**
    * This option is applicable only for fields with fieldDataType="object". Reference to a function (string or function) that can be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this field.
    */
  var mapper: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Name of the field
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * data type of the fieldstring
    * number
    * bool
    * date
    * time
    * object
    *
    *
    * Valid values:
    * "time"
    */
  var `type`: js.UndefOr[String | Double | Boolean | js.Date | js.Object] = js.undefined
  
  /**
    * The XPath expression to map the node to the field
    */
  var xpath: js.UndefOr[String] = js.undefined
}
object DataSchemaSchemaFields {
  
  inline def apply(): DataSchemaSchemaFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSchemaSchemaFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSchemaSchemaFields] (val x: Self) extends AnyVal {
    
    inline def setFormatter(value: Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setMapper(value: String | js.Function): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
    
    inline def setMapperUndefined: Self = StObject.set(x, "mapper", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String | Double | Boolean | js.Date | js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
  }
}
