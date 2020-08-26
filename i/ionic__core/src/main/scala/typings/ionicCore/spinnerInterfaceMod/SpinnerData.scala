package typings.ionicCore.spinnerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerData extends js.Object {
  var cx: js.UndefOr[Double] = js.native
  var cy: js.UndefOr[Double] = js.native
  var r: js.UndefOr[Double] = js.native
  var style: js.Any = js.native
  var transform: js.UndefOr[String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var y1: js.UndefOr[Double] = js.native
  var y2: js.UndefOr[Double] = js.native
}

object SpinnerData {
  @scala.inline
  def apply(style: js.Any): SpinnerData = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerData]
  }
  @scala.inline
  implicit class SpinnerDataOps[Self <: SpinnerData] (val x: Self) extends AnyVal {
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
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

