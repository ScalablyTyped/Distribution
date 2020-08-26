package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Back extends Ease {
  def config(overshoot: Double): Elastic = js.native
}

object Back {
  @scala.inline
  def apply(config: Double => Elastic, getRatio: Double => Double): Back = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Back]
  }
  @scala.inline
  implicit class BackOps[Self <: Back] (val x: Self) extends AnyVal {
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
    def setConfig(value: Double => Elastic): Self = this.set("config", js.Any.fromFunction1(value))
  }
  
}

