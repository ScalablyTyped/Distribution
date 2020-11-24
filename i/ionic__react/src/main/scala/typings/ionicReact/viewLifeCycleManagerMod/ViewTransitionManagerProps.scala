package typings.ionicReact.viewLifeCycleManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewTransitionManagerProps extends js.Object {
  
  var mount: Boolean = js.native
  
  def removeView(): Unit = js.native
}
object ViewTransitionManagerProps {
  
  @scala.inline
  def apply(mount: Boolean, removeView: () => Unit): ViewTransitionManagerProps = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], removeView = js.Any.fromFunction0(removeView))
    __obj.asInstanceOf[ViewTransitionManagerProps]
  }
  
  @scala.inline
  implicit class ViewTransitionManagerPropsOps[Self <: ViewTransitionManagerProps] (val x: Self) extends AnyVal {
    
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
    def setMount(value: Boolean): Self = this.set("mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveView(value: () => Unit): Self = this.set("removeView", js.Any.fromFunction0(value))
  }
}
