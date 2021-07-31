package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about time ranges.
  */
trait SchemaTimeRange extends StObject {
  
  /**
    * The end of the time range.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The start of the time range.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaTimeRange {
  
  @scala.inline
  def apply(): SchemaTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeRange]
  }
  
  @scala.inline
  implicit class SchemaTimeRangeMutableBuilder[Self <: SchemaTimeRange] (val x: Self) extends AnyVal {
    
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
