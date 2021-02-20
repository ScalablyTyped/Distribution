package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metrics value that holds number of executions counted.
  */
@js.native
trait SchemaMetricsValue extends StObject {
  
  /**
    * Required field indicating the end time of the interval.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Required field indicating the start time of the interval.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Indicates the number of executions counted.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaMetricsValue {
  
  @scala.inline
  def apply(): SchemaMetricsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricsValue]
  }
  
  @scala.inline
  implicit class SchemaMetricsValueMutableBuilder[Self <: SchemaMetricsValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
