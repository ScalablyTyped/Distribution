package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lines extends js.Object {
  var dur: Double = js.native
  var lines: Double = js.native
  def fn(dur: Double, index: Double, total: Double): Y1 = js.native
}

object Lines {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => Y1, lines: Double): Lines = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
  @scala.inline
  implicit class LinesOps[Self <: Lines] (val x: Self) extends AnyVal {
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
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: (Double, Double, Double) => Y1): Self = this.set("fn", js.Any.fromFunction3(value))
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
  }
  
}

