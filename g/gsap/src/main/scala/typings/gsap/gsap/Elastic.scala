package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elastic extends Ease {
  def config(amplitude: Double, period: Double): Elastic
}

object Elastic {
  @scala.inline
  def apply(config: (Double, Double) => Elastic, getRatio: Double => Double): Elastic = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction2(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Elastic]
  }
}

