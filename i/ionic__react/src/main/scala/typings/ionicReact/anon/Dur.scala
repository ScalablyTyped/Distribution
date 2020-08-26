package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dur extends js.Object {
  var dur: js.UndefOr[Double] = js.native
  var playTo: js.UndefOr[
    typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`
  ] = js.native
  var step: Double = js.native
}

object Dur {
  @scala.inline
  def apply(step: Double): Dur = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dur]
  }
  @scala.inline
  implicit class DurOps[Self <: Dur] (val x: Self) extends AnyVal {
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
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDur: Self = this.set("dur", js.undefined)
    @scala.inline
    def setPlayTo(value: typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`): Self = this.set("playTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayTo: Self = this.set("playTo", js.undefined)
  }
  
}

