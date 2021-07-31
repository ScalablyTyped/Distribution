package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transfers can be scheduled to recur or to run just once.
  */
trait SchemaSchedule extends StObject {
  
  /**
    * The last day the recurring transfer will be run. If `scheduleEndDate` is
    * the same as `scheduleStartDate`, the transfer will be executed only once.
    */
  var scheduleEndDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The first day the recurring transfer is scheduled to run. If
    * `scheduleStartDate` is in the past, the transfer will run for the first
    * time on the following day. Required.
    */
  var scheduleStartDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The time in UTC at which the transfer will be scheduled to start in a
    * day. Transfers may start later than this time. If not specified,
    * recurring and one-time transfers that are scheduled to run today will run
    * immediately; recurring transfers that are scheduled to run on a future
    * date will start at approximately midnight UTC on that date. Note that
    * when configuring a transfer with the Cloud Platform Console, the
    * transfer&#39;s start time in a day is specified in your local timezone.
    */
  var startTimeOfDay: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaSchedule {
  
  @scala.inline
  def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  
  @scala.inline
  implicit class SchemaScheduleMutableBuilder[Self <: SchemaSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleEndDate(value: SchemaDate): Self = StObject.set(x, "scheduleEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleEndDateUndefined: Self = StObject.set(x, "scheduleEndDate", js.undefined)
    
    @scala.inline
    def setScheduleStartDate(value: SchemaDate): Self = StObject.set(x, "scheduleStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleStartDateUndefined: Self = StObject.set(x, "scheduleStartDate", js.undefined)
    
    @scala.inline
    def setStartTimeOfDay(value: SchemaTimeOfDay): Self = StObject.set(x, "startTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOfDayUndefined: Self = StObject.set(x, "startTimeOfDay", js.undefined)
  }
}
