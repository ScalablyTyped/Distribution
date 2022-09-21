package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Value extends StObject {
  
  /**
    * boolean
    */
  var booleanValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * date
    */
  var dateValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * day of week
    */
  var dayOfWeekValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * float
    */
  var floatValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * integer
    */
  var integerValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * string
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * time of day
    */
  var timeValue: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.undefined
  
  /**
    * timestamp
    */
  var timestampValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Value {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Value]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Value](x: Self) {
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueNull: Self = StObject.set(x, "booleanValue", null)
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDateValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    inline def setDayOfWeekValue(value: String): Self = StObject.set(x, "dayOfWeekValue", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekValueNull: Self = StObject.set(x, "dayOfWeekValue", null)
    
    inline def setDayOfWeekValueUndefined: Self = StObject.set(x, "dayOfWeekValue", js.undefined)
    
    inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    inline def setFloatValueNull: Self = StObject.set(x, "floatValue", null)
    
    inline def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    inline def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueNull: Self = StObject.set(x, "integerValue", null)
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTimeValue(value: SchemaGoogleTypeTimeOfDay): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
    
    inline def setTimeValueUndefined: Self = StObject.set(x, "timeValue", js.undefined)
    
    inline def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    inline def setTimestampValueNull: Self = StObject.set(x, "timestampValue", null)
    
    inline def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
