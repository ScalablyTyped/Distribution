package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSwfPanel extends StObject {
  
  def call(): js.Any
  
  var name: js.Any
  
  var path: js.Any
  
  def setFocus(): js.Any
}
object FlashSwfPanel {
  
  inline def apply(call: () => js.Any, name: js.Any, path: js.Any, setFocus: () => js.Any): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[FlashSwfPanel]
  }
  
  extension [Self <: FlashSwfPanel](x: Self) {
    
    inline def setCall(value: () => js.Any): Self = StObject.set(x, "call", js.Any.fromFunction0(value))
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSetFocus(value: () => js.Any): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
  }
}
