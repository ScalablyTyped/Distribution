package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineFillGradient extends js.Object {
  var center: js.UndefOr[js.Any] = js.native
  var end: js.UndefOr[js.Any] = js.native
  var radius: js.UndefOr[Double] = js.native
  var start: js.UndefOr[js.Any] = js.native
  var stops: js.UndefOr[js.Array[PolylineFillGradientStop]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object PolylineFillGradient {
  @scala.inline
  def apply(): PolylineFillGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineFillGradient]
  }
  @scala.inline
  implicit class PolylineFillGradientOps[Self <: PolylineFillGradient] (val x: Self) extends AnyVal {
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
    def setCenter(value: js.Any): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStopsVarargs(value: PolylineFillGradientStop*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[PolylineFillGradientStop]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

