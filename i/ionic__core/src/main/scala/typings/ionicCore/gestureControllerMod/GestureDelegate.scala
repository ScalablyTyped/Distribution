package typings.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureDelegate extends js.Object {
  
  def canStart(): Boolean = js.native
  
  def capture(): Boolean = js.native
  
  var ctrl: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  var disableScroll: js.Any = js.native
  
  var id: js.Any = js.native
  
  var name: js.Any = js.native
  
  var priority: js.Any = js.native
  
  def release(): Unit = js.native
  
  def start(): Boolean = js.native
}
object GestureDelegate {
  
  @scala.inline
  def apply(
    canStart: () => Boolean,
    capture: () => Boolean,
    ctrl: js.Any,
    destroy: () => Unit,
    disableScroll: js.Any,
    id: js.Any,
    name: js.Any,
    priority: js.Any,
    release: () => Unit,
    start: () => Boolean
  ): GestureDelegate = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), capture = js.Any.fromFunction0(capture), ctrl = ctrl.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[GestureDelegate]
  }
  
  @scala.inline
  implicit class GestureDelegateOps[Self <: GestureDelegate] (val x: Self) extends AnyVal {
    
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
    def setCanStart(value: () => Boolean): Self = this.set("canStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCapture(value: () => Boolean): Self = this.set("capture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCtrl(value: js.Any): Self = this.set("ctrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableScroll(value: js.Any): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: js.Any): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Boolean): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
