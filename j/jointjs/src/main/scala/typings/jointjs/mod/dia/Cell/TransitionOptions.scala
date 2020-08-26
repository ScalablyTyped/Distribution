package typings.jointjs.mod.dia.Cell

import typings.jointjs.mod.util.interpolate.InterpolateFunction
import typings.jointjs.mod.util.timing.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends Options {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var timingFunction: js.UndefOr[TimingFunction] = js.native
  var valueFunction: js.UndefOr[InterpolateFunction[_]] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(): TransitionOptions = {
    val __obj = js.Dynamic.literal()
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setTimingFunction(value: /* time */ Double => Double): Self = this.set("timingFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
    @scala.inline
    def setValueFunction(value: (_, _) => js.Function1[/* time */ Double, _]): Self = this.set("valueFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValueFunction: Self = this.set("valueFunction", js.undefined)
  }
  
}

