package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for a date time object. e.g. 2018-01-01, 5th August.
  */
trait SchemaGooglePrivacyDlpV2DateTime extends StObject {
  
  /**
    * One or more of the following must be set. All fields are optional, but
    * when set must be valid date or time values.
    */
  var date: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.undefined
  
  var timeZone: js.UndefOr[SchemaGooglePrivacyDlpV2TimeZone] = js.undefined
}
object SchemaGooglePrivacyDlpV2DateTime {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DateTime]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DateTimeMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setTime(value: SchemaGoogleTypeTimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTimeZone(value: SchemaGooglePrivacyDlpV2TimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
