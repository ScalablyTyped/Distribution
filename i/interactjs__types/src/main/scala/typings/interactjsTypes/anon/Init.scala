package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init extends StObject {
  
  def init(window: Any): Unit
  
  var isIOS: Boolean
  
  var isIOS7: Boolean
  
  var isIe9: Boolean
  
  var isOperaMobile: Boolean
  
  var pEventTypes: Cancel
  
  var prefixedMatchesSelector: matches
  
  var supportsPointerEvent: Boolean
  
  var supportsTouch: Boolean
  
  var wheelEvent: String
}
object Init {
  
  inline def apply(
    init: Any => Unit,
    isIOS: Boolean,
    isIOS7: Boolean,
    isIe9: Boolean,
    isOperaMobile: Boolean,
    pEventTypes: Cancel,
    supportsPointerEvent: Boolean,
    supportsTouch: Boolean,
    wheelEvent: String
  ): Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), isIOS = isIOS.asInstanceOf[js.Any], isIOS7 = isIOS7.asInstanceOf[js.Any], isIe9 = isIe9.asInstanceOf[js.Any], isOperaMobile = isOperaMobile.asInstanceOf[js.Any], pEventTypes = pEventTypes.asInstanceOf[js.Any], prefixedMatchesSelector = "matches", supportsPointerEvent = supportsPointerEvent.asInstanceOf[js.Any], supportsTouch = supportsTouch.asInstanceOf[js.Any], wheelEvent = wheelEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
  
  extension [Self <: Init](x: Self) {
    
    inline def setInit(value: Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    inline def setIsIOS7(value: Boolean): Self = StObject.set(x, "isIOS7", value.asInstanceOf[js.Any])
    
    inline def setIsIe9(value: Boolean): Self = StObject.set(x, "isIe9", value.asInstanceOf[js.Any])
    
    inline def setIsOperaMobile(value: Boolean): Self = StObject.set(x, "isOperaMobile", value.asInstanceOf[js.Any])
    
    inline def setPEventTypes(value: Cancel): Self = StObject.set(x, "pEventTypes", value.asInstanceOf[js.Any])
    
    inline def setPrefixedMatchesSelector(value: matches): Self = StObject.set(x, "prefixedMatchesSelector", value.asInstanceOf[js.Any])
    
    inline def setSupportsPointerEvent(value: Boolean): Self = StObject.set(x, "supportsPointerEvent", value.asInstanceOf[js.Any])
    
    inline def setSupportsTouch(value: Boolean): Self = StObject.set(x, "supportsTouch", value.asInstanceOf[js.Any])
    
    inline def setWheelEvent(value: String): Self = StObject.set(x, "wheelEvent", value.asInstanceOf[js.Any])
  }
}
