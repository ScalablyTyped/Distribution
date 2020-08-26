package typings.ionicCore.transitionMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.navInterfaceMod.NavOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends NavOptions {
  var baseEl: js.Any = js.native
  var enteringEl: HTMLElement = js.native
  var leavingEl: js.UndefOr[HTMLElement] = js.native
  var progressCallback: js.UndefOr[js.Function1[/* ani */ js.UndefOr[Animation], Unit]] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(baseEl: js.Any, enteringEl: HTMLElement): TransitionOptions = {
    val __obj = js.Dynamic.literal(baseEl = baseEl.asInstanceOf[js.Any], enteringEl = enteringEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
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
    def setBaseEl(value: js.Any): Self = this.set("baseEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnteringEl(value: HTMLElement): Self = this.set("enteringEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeavingEl(value: HTMLElement): Self = this.set("leavingEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeavingEl: Self = this.set("leavingEl", js.undefined)
    @scala.inline
    def setProgressCallback(value: /* ani */ js.UndefOr[Animation] => Unit): Self = this.set("progressCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgressCallback: Self = this.set("progressCallback", js.undefined)
  }
  
}

