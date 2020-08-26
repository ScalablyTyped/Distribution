package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tolerance extends js.Object {
  var tolerance: Double = js.native
}

object Tolerance {
  @scala.inline
  def apply(tolerance: Double): Tolerance = {
    val __obj = js.Dynamic.literal(tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tolerance]
  }
  @scala.inline
  implicit class ToleranceOps[Self <: Tolerance] (val x: Self) extends AnyVal {
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
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
  }
  
}

