package typings.ionicCore.navInterfaceMod

import typings.ionicCore.mod.FrameworkDelegate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavOptions extends RouterOutletOptions {
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  var updateURL: js.UndefOr[Boolean] = js.native
  var viewIsReady: js.UndefOr[js.Function1[/* enteringEl */ HTMLElement, js.Promise[_]]] = js.native
}

object NavOptions {
  @scala.inline
  def apply(): NavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavOptions]
  }
  @scala.inline
  implicit class NavOptionsOps[Self <: NavOptions] (val x: Self) extends AnyVal {
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
    def setDelegate(value: FrameworkDelegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    @scala.inline
    def setUpdateURL(value: Boolean): Self = this.set("updateURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateURL: Self = this.set("updateURL", js.undefined)
    @scala.inline
    def setViewIsReady(value: /* enteringEl */ HTMLElement => js.Promise[_]): Self = this.set("viewIsReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteViewIsReady: Self = this.set("viewIsReady", js.undefined)
  }
  
}

