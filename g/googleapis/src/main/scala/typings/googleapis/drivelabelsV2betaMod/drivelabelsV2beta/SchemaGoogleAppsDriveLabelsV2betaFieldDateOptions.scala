package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions extends StObject {
  
  /**
    * Output only. ICU date format.
    */
  var dateFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized date formatting option. Field values are rendered in this format according to their locale.
    */
  var dateFormatType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Maximum valid value (year, month, day).
    */
  var maxValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Output only. Minimum valid value (year, month, day).
    */
  var minValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldDateOptions](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatNull: Self = StObject.set(x, "dateFormat", null)
    
    inline def setDateFormatType(value: String): Self = StObject.set(x, "dateFormatType", value.asInstanceOf[js.Any])
    
    inline def setDateFormatTypeNull: Self = StObject.set(x, "dateFormatType", null)
    
    inline def setDateFormatTypeUndefined: Self = StObject.set(x, "dateFormatType", js.undefined)
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setMaxValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
