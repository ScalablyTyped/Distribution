package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSwfPanel extends StObject {
  
  def call(): Any
  
  var name: Any
  
  var path: Any
  
  def setFocus(): Any
}
object FlashSwfPanel {
  
  inline def apply(call: () => Any, name: Any, path: Any, setFocus: () => Any): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[FlashSwfPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashSwfPanel] (val x: Self) extends AnyVal {
    
    inline def setCall(value: () => Any): Self = StObject.set(x, "call", js.Any.fromFunction0(value))
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSetFocus(value: () => Any): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
  }
}
