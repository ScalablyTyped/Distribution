package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedProperty extends StObject {
  
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  var dateValues: js.UndefOr[DateValues] = js.undefined
  
  var doubleValues: js.UndefOr[DoubleValues] = js.undefined
  
  var enumValues: js.UndefOr[EnumValues] = js.undefined
  
  var htmlValues: js.UndefOr[HtmlValues] = js.undefined
  
  var integerValues: js.UndefOr[IntegerValues] = js.undefined
  
  /**
    * The name of the property. This name should correspond to the name of the property that was registered for object definition in the schema. The maximum allowable length for this
    * property is 256 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var objectValues: js.UndefOr[ObjectValues] = js.undefined
  
  var textValues: js.UndefOr[TextValues] = js.undefined
  
  var timestampValues: js.UndefOr[TimestampValues] = js.undefined
}
object NamedProperty {
  
  inline def apply(): NamedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedProperty] (val x: Self) extends AnyVal {
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDateValues(value: DateValues): Self = StObject.set(x, "dateValues", value.asInstanceOf[js.Any])
    
    inline def setDateValuesUndefined: Self = StObject.set(x, "dateValues", js.undefined)
    
    inline def setDoubleValues(value: DoubleValues): Self = StObject.set(x, "doubleValues", value.asInstanceOf[js.Any])
    
    inline def setDoubleValuesUndefined: Self = StObject.set(x, "doubleValues", js.undefined)
    
    inline def setEnumValues(value: EnumValues): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    inline def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    inline def setHtmlValues(value: HtmlValues): Self = StObject.set(x, "htmlValues", value.asInstanceOf[js.Any])
    
    inline def setHtmlValuesUndefined: Self = StObject.set(x, "htmlValues", js.undefined)
    
    inline def setIntegerValues(value: IntegerValues): Self = StObject.set(x, "integerValues", value.asInstanceOf[js.Any])
    
    inline def setIntegerValuesUndefined: Self = StObject.set(x, "integerValues", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectValues(value: ObjectValues): Self = StObject.set(x, "objectValues", value.asInstanceOf[js.Any])
    
    inline def setObjectValuesUndefined: Self = StObject.set(x, "objectValues", js.undefined)
    
    inline def setTextValues(value: TextValues): Self = StObject.set(x, "textValues", value.asInstanceOf[js.Any])
    
    inline def setTextValuesUndefined: Self = StObject.set(x, "textValues", js.undefined)
    
    inline def setTimestampValues(value: TimestampValues): Self = StObject.set(x, "timestampValues", value.asInstanceOf[js.Any])
    
    inline def setTimestampValuesUndefined: Self = StObject.set(x, "timestampValues", js.undefined)
  }
}
