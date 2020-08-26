package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.bounded
import typings.ionicCore.ionicCoreStrings.unbounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRippleEffect extends js.Object {
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  var `type`: js.UndefOr[bounded | unbounded] = js.native
}

object IonRippleEffect {
  @scala.inline
  def apply(): IonRippleEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRippleEffect]
  }
  @scala.inline
  implicit class IonRippleEffectOps[Self <: IonRippleEffect] (val x: Self) extends AnyVal {
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
    def setType(value: bounded | unbounded): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

