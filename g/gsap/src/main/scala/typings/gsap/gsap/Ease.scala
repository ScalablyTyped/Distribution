package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ease extends js.Object {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  def getRatio(p: Double): Double = js.native
}

object Ease {
  @scala.inline
  def apply(getRatio: Double => Double): Ease = {
    val __obj = js.Dynamic.literal(getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Ease]
  }
  @scala.inline
  implicit class EaseOps[Self <: Ease] (val x: Self) extends AnyVal {
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
    def setGetRatio(value: Double => Double): Self = this.set("getRatio", js.Any.fromFunction1(value))
  }
  
}

