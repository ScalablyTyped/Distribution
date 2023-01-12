package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capture extends StObject {
  
  var capture: Boolean
  
  var passive: Boolean
}
object Capture {
  
  inline def apply(capture: Boolean, passive: Boolean): Capture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capture] (val x: Self) extends AnyVal {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
  }
}
