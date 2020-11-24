package typings.ionicAngular.stackUtilsMod

import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackEvent extends js.Object {
  
  var animation: js.UndefOr[NavDirection] = js.native
  
  var direction: RouterDirection = js.native
  
  var enteringView: RouteView = js.native
  
  var tabSwitch: Boolean = js.native
}
object StackEvent {
  
  @scala.inline
  def apply(direction: RouterDirection, enteringView: RouteView, tabSwitch: Boolean): StackEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enteringView = enteringView.asInstanceOf[js.Any], tabSwitch = tabSwitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackEvent]
  }
  
  @scala.inline
  implicit class StackEventOps[Self <: StackEvent] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: RouterDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnteringView(value: RouteView): Self = this.set("enteringView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSwitch(value: Boolean): Self = this.set("tabSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: NavDirection): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
  }
}
