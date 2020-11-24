package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewWillLeave extends js.Object {
  
  /**
    * Fired when the component routing from is about to animate.
    */
  def ionViewWillLeave(): Unit = js.native
}
object ViewWillLeave {
  
  @scala.inline
  def apply(ionViewWillLeave: () => Unit): ViewWillLeave = {
    val __obj = js.Dynamic.literal(ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave))
    __obj.asInstanceOf[ViewWillLeave]
  }
  
  @scala.inline
  implicit class ViewWillLeaveOps[Self <: ViewWillLeave] (val x: Self) extends AnyVal {
    
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
    def setIonViewWillLeave(value: () => Unit): Self = this.set("ionViewWillLeave", js.Any.fromFunction0(value))
  }
}
