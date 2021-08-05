package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a period of time between two timestamps.
  */
trait SchemaTimestampRange extends StObject {
  
  /**
    * End of the period.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Begin of the period.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaTimestampRange {
  
  inline def apply(): SchemaTimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampRange]
  }
  
  extension [Self <: SchemaTimestampRange](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
