package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of primitive values supported by the system. Note that for the purposes
  * of inspection or transformation, the number of bytes considered to comprise
  * a &#39;Value&#39; is based on its representation as a UTF-8 encoded string.
  * For example, if &#39;integer_value&#39; is set to 123456789, the number of
  * bytes would be counted as 9, even though an int64 only holds up to 8 bytes
  * of data.
  */
trait SchemaGooglePrivacyDlpV2Value extends StObject {
  
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  var dateValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  var dayOfWeekValue: js.UndefOr[String] = js.undefined
  
  var floatValue: js.UndefOr[Double] = js.undefined
  
  var integerValue: js.UndefOr[String] = js.undefined
  
  var stringValue: js.UndefOr[String] = js.undefined
  
  var timeValue: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.undefined
  
  var timestampValue: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2Value {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Value]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ValueMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDateValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    @scala.inline
    def setDayOfWeekValue(value: String): Self = StObject.set(x, "dayOfWeekValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekValueUndefined: Self = StObject.set(x, "dayOfWeekValue", js.undefined)
    
    @scala.inline
    def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setTimeValue(value: SchemaGoogleTypeTimeOfDay): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeValueUndefined: Self = StObject.set(x, "timeValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
