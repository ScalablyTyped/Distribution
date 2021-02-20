package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A time interval extending just after a start time through an end time. The
  * start time must not be later than the end time. The default start time is
  * the end time, making the startTime value technically optional. Whether this
  * is useful depends on the MetricKind. If the start and end times are the
  * same, the interval represents a point in time. This is appropriate for
  * GAUGE metrics, but not for DELTA and CUMULATIVE metrics, which cover a span
  * of time.
  */
@js.native
trait SchemaTimeInterval extends StObject {
  
  /**
    * Required. The end of the time interval.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The beginning of the time interval. The default value for the
    * start time is the end time. The start time must not be later than the end
    * time.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaTimeInterval {
  
  @scala.inline
  def apply(): SchemaTimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeInterval]
  }
  
  @scala.inline
  implicit class SchemaTimeIntervalMutableBuilder[Self <: SchemaTimeInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
