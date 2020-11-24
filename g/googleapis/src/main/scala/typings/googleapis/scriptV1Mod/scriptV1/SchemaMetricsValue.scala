package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metrics value that holds number of executions counted.
  */
@js.native
trait SchemaMetricsValue extends js.Object {
  
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
  implicit class SchemaMetricsValueOps[Self <: SchemaMetricsValue] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
