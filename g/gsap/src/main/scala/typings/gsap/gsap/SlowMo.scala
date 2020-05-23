package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlowMo extends Ease {
  def config(linearRatio: Double, power: Double, yoyoMode: Boolean): SlowMo
}

object SlowMo {
  @scala.inline
  def apply(config: (Double, Double, Boolean) => SlowMo, getRatio: Double => Double): SlowMo = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction3(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[SlowMo]
  }
}

