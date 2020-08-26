package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elastic extends Ease {
  def config(amplitude: Double, period: Double): Elastic = js.native
}

object Elastic {
  @scala.inline
  def apply(config: (Double, Double) => Elastic, getRatio: Double => Double): Elastic = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction2(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Elastic]
  }
  @scala.inline
  implicit class ElasticOps[Self <: Elastic] (val x: Self) extends AnyVal {
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
    def setConfig(value: (Double, Double) => Elastic): Self = this.set("config", js.Any.fromFunction2(value))
  }
  
}

