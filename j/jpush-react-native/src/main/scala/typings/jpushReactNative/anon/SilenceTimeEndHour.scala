package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SilenceTimeEndHour extends StObject {
  
  var silenceTimeEndHour: Double
  
  var silenceTimeEndMinute: Double
  
  var silenceTimeStartHour: Double
  
  var silenceTimeStartMinute: Double
}
object SilenceTimeEndHour {
  
  inline def apply(
    silenceTimeEndHour: Double,
    silenceTimeEndMinute: Double,
    silenceTimeStartHour: Double,
    silenceTimeStartMinute: Double
  ): SilenceTimeEndHour = {
    val __obj = js.Dynamic.literal(silenceTimeEndHour = silenceTimeEndHour.asInstanceOf[js.Any], silenceTimeEndMinute = silenceTimeEndMinute.asInstanceOf[js.Any], silenceTimeStartHour = silenceTimeStartHour.asInstanceOf[js.Any], silenceTimeStartMinute = silenceTimeStartMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[SilenceTimeEndHour]
  }
  
  extension [Self <: SilenceTimeEndHour](x: Self) {
    
    inline def setSilenceTimeEndHour(value: Double): Self = StObject.set(x, "silenceTimeEndHour", value.asInstanceOf[js.Any])
    
    inline def setSilenceTimeEndMinute(value: Double): Self = StObject.set(x, "silenceTimeEndMinute", value.asInstanceOf[js.Any])
    
    inline def setSilenceTimeStartHour(value: Double): Self = StObject.set(x, "silenceTimeStartHour", value.asInstanceOf[js.Any])
    
    inline def setSilenceTimeStartMinute(value: Double): Self = StObject.set(x, "silenceTimeStartMinute", value.asInstanceOf[js.Any])
  }
}
