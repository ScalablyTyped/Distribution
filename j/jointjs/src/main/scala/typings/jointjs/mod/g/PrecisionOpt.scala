package typings.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecisionOpt extends js.Object {
  var precision: js.UndefOr[Double] = js.native
}

object PrecisionOpt {
  @scala.inline
  def apply(): PrecisionOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecisionOpt]
  }
  @scala.inline
  implicit class PrecisionOptOps[Self <: PrecisionOpt] (val x: Self) extends AnyVal {
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
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
  }
  
}

