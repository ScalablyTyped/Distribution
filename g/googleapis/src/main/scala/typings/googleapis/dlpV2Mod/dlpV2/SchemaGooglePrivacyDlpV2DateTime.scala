package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DateTime extends StObject {
  
  /**
    * One or more of the following must be set. Must be a valid date or time value.
    */
  var date: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Day of week
    */
  var dayOfWeek: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time of day
    */
  var time: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.undefined
  
  /**
    * Time zone
    */
  var timeZone: js.UndefOr[SchemaGooglePrivacyDlpV2TimeZone] = js.undefined
}
object SchemaGooglePrivacyDlpV2DateTime {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DateTime]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DateTime](x: Self) {
    
    inline def setDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setTime(value: SchemaGoogleTypeTimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimeZone(value: SchemaGooglePrivacyDlpV2TimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
