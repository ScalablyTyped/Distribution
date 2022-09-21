package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePeriod extends StObject {
  
  /** The ending timestamp. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The starting timestamp. */
  var startTime: js.UndefOr[String] = js.undefined
}
object TimePeriod {
  
  inline def apply(): TimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePeriod]
  }
  
  extension [Self <: TimePeriod](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
