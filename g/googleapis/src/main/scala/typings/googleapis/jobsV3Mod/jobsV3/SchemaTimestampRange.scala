package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a period of time between two timestamps.
  */
@js.native
trait SchemaTimestampRange extends js.Object {
  
  /**
    * End of the period.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Begin of the period.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaTimestampRange {
  
  @scala.inline
  def apply(): SchemaTimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampRange]
  }
  
  @scala.inline
  implicit class SchemaTimestampRangeOps[Self <: SchemaTimestampRange] (val x: Self) extends AnyVal {
    
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
  }
}
