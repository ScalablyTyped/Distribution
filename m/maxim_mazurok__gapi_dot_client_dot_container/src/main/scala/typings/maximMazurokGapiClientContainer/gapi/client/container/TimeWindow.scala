package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeWindow extends StObject {
  
  /** The time that the window ends. The end time should take place after the start time. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The time that the window first starts. */
  var startTime: js.UndefOr[String] = js.undefined
}
object TimeWindow {
  
  inline def apply(): TimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeWindow]
  }
  
  extension [Self <: TimeWindow](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
