package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ease extends js.Object {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  def getRatio(p: Double): Double
}

object Ease {
  @scala.inline
  def apply(getRatio: Double => Double): Ease = {
    val __obj = js.Dynamic.literal(getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Ease]
  }
}

