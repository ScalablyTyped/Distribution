package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Back extends Ease {
  def config(overshoot: Double): Elastic
}

object Back {
  @scala.inline
  def apply(config: Double => Elastic, getRatio: Double => Double): Back = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Back]
  }
}

