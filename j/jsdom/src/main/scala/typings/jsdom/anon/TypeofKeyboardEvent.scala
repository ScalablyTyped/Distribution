package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0x00`
import typings.jsdom.jsdomInts.`0x01`
import typings.jsdom.jsdomInts.`0x02`
import typings.jsdom.jsdomInts.`0x03`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofKeyboardEvent extends StObject {
  
  /* standard dom */
  val DOM_KEY_LOCATION_LEFT: `0x01`
  
  /* standard dom */
  val DOM_KEY_LOCATION_NUMPAD: `0x03`
  
  /* standard dom */
  val DOM_KEY_LOCATION_RIGHT: `0x02`
  
  /* standard dom */
  val DOM_KEY_LOCATION_STANDARD: `0x00`
}
object TypeofKeyboardEvent {
  
  inline def apply(): TypeofKeyboardEvent = {
    val __obj = js.Dynamic.literal(DOM_KEY_LOCATION_LEFT = 0x01, DOM_KEY_LOCATION_NUMPAD = 0x03, DOM_KEY_LOCATION_RIGHT = 0x02, DOM_KEY_LOCATION_STANDARD = 0x00)
    __obj.asInstanceOf[TypeofKeyboardEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofKeyboardEvent] (val x: Self) extends AnyVal {
    
    inline def setDOM_KEY_LOCATION_LEFT(value: `0x01`): Self = StObject.set(x, "DOM_KEY_LOCATION_LEFT", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_NUMPAD(value: `0x03`): Self = StObject.set(x, "DOM_KEY_LOCATION_NUMPAD", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_RIGHT(value: `0x02`): Self = StObject.set(x, "DOM_KEY_LOCATION_RIGHT", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_STANDARD(value: `0x00`): Self = StObject.set(x, "DOM_KEY_LOCATION_STANDARD", value.asInstanceOf[js.Any])
  }
}
