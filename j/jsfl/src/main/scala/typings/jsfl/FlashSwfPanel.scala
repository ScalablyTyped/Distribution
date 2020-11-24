package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashSwfPanel extends js.Object {
  
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
  implicit class FlashSwfPanelOps[Self <: FlashSwfPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCall(value: () => js.Any): Self = this.set("call", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFocus(value: () => js.Any): Self = this.set("setFocus", js.Any.fromFunction0(value))
  }
}
