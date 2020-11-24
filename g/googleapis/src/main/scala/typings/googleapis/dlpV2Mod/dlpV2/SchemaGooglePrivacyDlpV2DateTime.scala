package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for a date time object. e.g. 2018-01-01, 5th August.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DateTime extends js.Object {
  
  /**
    * One or more of the following must be set. All fields are optional, but
    * when set must be valid date or time values.
    */
  var date: js.UndefOr[SchemaGoogleTypeDate] = js.native
  
  var dayOfWeek: js.UndefOr[String] = js.native
  
  var time: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.native
  
  var timeZone: js.UndefOr[SchemaGooglePrivacyDlpV2TimeZone] = js.native
}
object SchemaGooglePrivacyDlpV2DateTime {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DateTime]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DateTimeOps[Self <: SchemaGooglePrivacyDlpV2DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: SchemaGoogleTypeDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    
    @scala.inline
    def setTime(value: SchemaGoogleTypeTimeOfDay): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTimeZone(value: SchemaGooglePrivacyDlpV2TimeZone): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
