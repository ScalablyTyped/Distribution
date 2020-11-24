package typings.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockerDelegate extends js.Object {
  
  def block(): Unit = js.native
  
  var ctrl: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  var disable: js.Any = js.native
  
  var disableScroll: js.Any = js.native
  
  var id: js.Any = js.native
  
  def unblock(): Unit = js.native
}
object BlockerDelegate {
  
  @scala.inline
  def apply(
    block: () => Unit,
    ctrl: js.Any,
    destroy: () => Unit,
    disable: js.Any,
    disableScroll: js.Any,
    id: js.Any,
    unblock: () => Unit
  ): BlockerDelegate = {
    val __obj = js.Dynamic.literal(block = js.Any.fromFunction0(block), ctrl = ctrl.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disable = disable.asInstanceOf[js.Any], disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unblock = js.Any.fromFunction0(unblock))
    __obj.asInstanceOf[BlockerDelegate]
  }
  
  @scala.inline
  implicit class BlockerDelegateOps[Self <: BlockerDelegate] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: () => Unit): Self = this.set("block", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCtrl(value: js.Any): Self = this.set("ctrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: js.Any): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScroll(value: js.Any): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnblock(value: () => Unit): Self = this.set("unblock", js.Any.fromFunction0(value))
  }
}
