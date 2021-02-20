package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashSwfPanel extends StObject {
  
  def call(): js.Any = js.native
  
  var name: js.Any = js.native
  
  var path: js.Any = js.native
  
  def setFocus(): js.Any = js.native
}
object FlashSwfPanel {
  
  @scala.inline
  def apply(call: () => js.Any, name: js.Any, path: js.Any, setFocus: () => js.Any): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[FlashSwfPanel]
  }
  
  @scala.inline
  implicit class FlashSwfPanelMutableBuilder[Self <: FlashSwfPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCall(value: () => js.Any): Self = StObject.set(x, "call", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFocus(value: () => js.Any): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
  }
}
