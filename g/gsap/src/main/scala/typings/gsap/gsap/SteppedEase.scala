package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteppedEase extends Ease {
  def config(steps: Double): SteppedEase = js.native
}

object SteppedEase {
  @scala.inline
  def apply(config: Double => SteppedEase, getRatio: Double => Double): SteppedEase = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[SteppedEase]
  }
  @scala.inline
  implicit class SteppedEaseOps[Self <: SteppedEase] (val x: Self) extends AnyVal {
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
    def setConfig(value: Double => SteppedEase): Self = this.set("config", js.Any.fromFunction1(value))
  }
  
}

