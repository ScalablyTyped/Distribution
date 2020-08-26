package typings.ionicCore.navInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavResult extends js.Object {
  var direction: js.UndefOr[NavDirection] = js.native
  var enteringView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.native
  var hasCompleted: Boolean = js.native
  var leavingView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.native
  var requiresTransition: Boolean = js.native
}

object NavResult {
  @scala.inline
  def apply(hasCompleted: Boolean, requiresTransition: Boolean): NavResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any], requiresTransition = requiresTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavResult]
  }
  @scala.inline
  implicit class NavResultOps[Self <: NavResult] (val x: Self) extends AnyVal {
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
    def setHasCompleted(value: Boolean): Self = this.set("hasCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiresTransition(value: Boolean): Self = this.set("requiresTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: NavDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEnteringView(value: typings.ionicCore.viewControllerMod.ViewController): Self = this.set("enteringView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnteringView: Self = this.set("enteringView", js.undefined)
    @scala.inline
    def setLeavingView(value: typings.ionicCore.viewControllerMod.ViewController): Self = this.set("leavingView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeavingView: Self = this.set("leavingView", js.undefined)
  }
  
}

