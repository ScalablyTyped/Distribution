package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a time of day. The date and time zone are either not significant
  * or are specified elsewhere. An API may choose to allow leap seconds.
  * Related types are google.type.Date and `google.protobuf.Timestamp`.
  */
@js.native
trait SchemaTimeOfDay extends StObject {
  
  /**
    * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
    * to allow the value &quot;24:00:00&quot; for scenarios like business
    * closing time.
    */
  var hours: js.UndefOr[Double] = js.native
  
  /**
    * Minutes of hour of day. Must be from 0 to 59.
    */
  var minutes: js.UndefOr[Double] = js.native
  
  /**
    * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
    */
  var nanos: js.UndefOr[Double] = js.native
  
  /**
    * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
    * allow the value 60 if it allows leap-seconds.
    */
  var seconds: js.UndefOr[Double] = js.native
}
object SchemaTimeOfDay {
  
  @scala.inline
  def apply(): SchemaTimeOfDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeOfDay]
  }
  
  @scala.inline
  implicit class SchemaTimeOfDayMutableBuilder[Self <: SchemaTimeOfDay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
