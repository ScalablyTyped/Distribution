package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofKeyboardEvent extends StObject {
  
  /* standard dom */
  val DOM_KEY_LOCATION_LEFT: Double
  
  /* standard dom */
  val DOM_KEY_LOCATION_NUMPAD: Double
  
  /* standard dom */
  val DOM_KEY_LOCATION_RIGHT: Double
  
  /* standard dom */
  val DOM_KEY_LOCATION_STANDARD: Double
}
object TypeofKeyboardEvent {
  
  inline def apply(
    DOM_KEY_LOCATION_LEFT: Double,
    DOM_KEY_LOCATION_NUMPAD: Double,
    DOM_KEY_LOCATION_RIGHT: Double,
    DOM_KEY_LOCATION_STANDARD: Double
  ): TypeofKeyboardEvent = {
    val __obj = js.Dynamic.literal(DOM_KEY_LOCATION_LEFT = DOM_KEY_LOCATION_LEFT.asInstanceOf[js.Any], DOM_KEY_LOCATION_NUMPAD = DOM_KEY_LOCATION_NUMPAD.asInstanceOf[js.Any], DOM_KEY_LOCATION_RIGHT = DOM_KEY_LOCATION_RIGHT.asInstanceOf[js.Any], DOM_KEY_LOCATION_STANDARD = DOM_KEY_LOCATION_STANDARD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKeyboardEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofKeyboardEvent] (val x: Self) extends AnyVal {
    
    inline def setDOM_KEY_LOCATION_LEFT(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_LEFT", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_NUMPAD(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_NUMPAD", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_RIGHT(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_RIGHT", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_STANDARD(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_STANDARD", value.asInstanceOf[js.Any])
  }
}
