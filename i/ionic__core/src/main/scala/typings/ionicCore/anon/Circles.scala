package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circles extends js.Object {
  var circles: Double = js.native
  var dur: Double = js.native
  def fn(dur: Double, index: Double, total: Double): R = js.native
}

object Circles {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double, Double) => R): Circles = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
    __obj.asInstanceOf[Circles]
  }
  @scala.inline
  implicit class CirclesOps[Self <: Circles] (val x: Self) extends AnyVal {
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
    def setCircles(value: Double): Self = this.set("circles", value.asInstanceOf[js.Any])
    @scala.inline
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: (Double, Double, Double) => R): Self = this.set("fn", js.Any.fromFunction3(value))
  }
  
}

