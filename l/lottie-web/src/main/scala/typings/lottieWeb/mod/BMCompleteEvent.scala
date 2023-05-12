package typings.lottieWeb.mod

import typings.lottieWeb.lottieWebStrings.complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BMCompleteEvent extends StObject {
  
  var direction: Double
  
  var `type`: complete
}
object BMCompleteEvent {
  
  inline def apply(direction: Double): BMCompleteEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("complete")
    __obj.asInstanceOf[BMCompleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BMCompleteEvent] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setType(value: complete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
