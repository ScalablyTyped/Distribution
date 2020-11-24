package typings.ionicAngular.ionicLifecycleHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewWillEnter extends js.Object {
  
  /**
    * Fired when the component routing to is about to animate into view.
    */
  def ionViewWillEnter(): Unit = js.native
}
object ViewWillEnter {
  
  @scala.inline
  def apply(ionViewWillEnter: () => Unit): ViewWillEnter = {
    val __obj = js.Dynamic.literal(ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter))
    __obj.asInstanceOf[ViewWillEnter]
  }
  
  @scala.inline
  implicit class ViewWillEnterOps[Self <: ViewWillEnter] (val x: Self) extends AnyVal {
    
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
    def setIonViewWillEnter(value: () => Unit): Self = this.set("ionViewWillEnter", js.Any.fromFunction0(value))
  }
}
