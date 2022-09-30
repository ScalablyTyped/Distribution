package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEvent extends StObject {
  
  /**
    * Focus status
    */
  var focus: Boolean
}
object FocusEvent {
  
  inline def apply(focus: Boolean): FocusEvent = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEvent]
  }
  
  extension [Self <: FocusEvent](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
  }
}
