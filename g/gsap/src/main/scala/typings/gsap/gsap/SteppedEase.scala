package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SteppedEase extends Ease {
  def config(steps: Double): SteppedEase
}

object SteppedEase {
  @scala.inline
  def apply(config: Double => SteppedEase, getRatio: Double => Double): SteppedEase = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[SteppedEase]
  }
}

