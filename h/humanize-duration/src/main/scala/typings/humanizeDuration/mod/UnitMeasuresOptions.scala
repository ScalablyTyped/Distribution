package typings.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitMeasuresOptions extends js.Object {
  var d: js.UndefOr[Double] = js.native
  var h: js.UndefOr[Double] = js.native
  var m: js.UndefOr[Double] = js.native
  var mo: js.UndefOr[Double] = js.native
  var ms: js.UndefOr[Double] = js.native
  var s: js.UndefOr[Double] = js.native
  var w: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object UnitMeasuresOptions {
  @scala.inline
  def apply(): UnitMeasuresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitMeasuresOptions]
  }
  @scala.inline
  implicit class UnitMeasuresOptionsOps[Self <: UnitMeasuresOptions] (val x: Self) extends AnyVal {
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
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMo(value: Double): Self = this.set("mo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMo: Self = this.set("mo", js.undefined)
    @scala.inline
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

