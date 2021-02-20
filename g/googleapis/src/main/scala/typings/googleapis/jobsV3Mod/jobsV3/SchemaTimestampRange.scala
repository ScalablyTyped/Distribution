package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a period of time between two timestamps.
  */
@js.native
trait SchemaTimestampRange extends StObject {
  
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
  implicit class SchemaTimestampRangeMutableBuilder[Self <: SchemaTimestampRange] (val x: Self) extends AnyVal {
    
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
