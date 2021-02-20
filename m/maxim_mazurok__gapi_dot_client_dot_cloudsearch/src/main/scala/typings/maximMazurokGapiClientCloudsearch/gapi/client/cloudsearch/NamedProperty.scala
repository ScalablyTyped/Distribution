package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedProperty extends StObject {
  
  var booleanValue: js.UndefOr[Boolean] = js.native
  
  var dateValues: js.UndefOr[DateValues] = js.native
  
  var doubleValues: js.UndefOr[DoubleValues] = js.native
  
  var enumValues: js.UndefOr[EnumValues] = js.native
  
  var htmlValues: js.UndefOr[HtmlValues] = js.native
  
  var integerValues: js.UndefOr[IntegerValues] = js.native
  
  /**
    * The name of the property. This name should correspond to the name of the property that was registered for object definition in the schema. The maximum allowable length for this
    * property is 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  var objectValues: js.UndefOr[ObjectValues] = js.native
  
  var textValues: js.UndefOr[TextValues] = js.native
  
  var timestampValues: js.UndefOr[TimestampValues] = js.native
}
object NamedProperty {
  
  @scala.inline
  def apply(): NamedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedProperty]
  }
  
  @scala.inline
  implicit class NamedPropertyMutableBuilder[Self <: NamedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDateValues(value: DateValues): Self = StObject.set(x, "dateValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateValuesUndefined: Self = StObject.set(x, "dateValues", js.undefined)
    
    @scala.inline
    def setDoubleValues(value: DoubleValues): Self = StObject.set(x, "doubleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValuesUndefined: Self = StObject.set(x, "doubleValues", js.undefined)
    
    @scala.inline
    def setEnumValues(value: EnumValues): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    @scala.inline
    def setHtmlValues(value: HtmlValues): Self = StObject.set(x, "htmlValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlValuesUndefined: Self = StObject.set(x, "htmlValues", js.undefined)
    
    @scala.inline
    def setIntegerValues(value: IntegerValues): Self = StObject.set(x, "integerValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValuesUndefined: Self = StObject.set(x, "integerValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectValues(value: ObjectValues): Self = StObject.set(x, "objectValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectValuesUndefined: Self = StObject.set(x, "objectValues", js.undefined)
    
    @scala.inline
    def setTextValues(value: TextValues): Self = StObject.set(x, "textValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextValuesUndefined: Self = StObject.set(x, "textValues", js.undefined)
    
    @scala.inline
    def setTimestampValues(value: TimestampValues): Self = StObject.set(x, "timestampValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValuesUndefined: Self = StObject.set(x, "timestampValues", js.undefined)
  }
}
