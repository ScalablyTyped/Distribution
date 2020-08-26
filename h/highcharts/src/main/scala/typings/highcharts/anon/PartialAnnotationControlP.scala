package typings.highcharts.anon

import typings.highcharts.mod.AnnotationControlPointPositionerFunction
import typings.highcharts.mod.AnnotationsControlPointStyleOptions
import typings.highcharts.mod.NavigationAnnotationsControlPointStyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<highcharts.highcharts.AnnotationControlPointOptionsObject> */
@js.native
trait PartialAnnotationControlP extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.native
  var style: js.UndefOr[
    AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions
  ] = js.native
  var symbol: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialAnnotationControlP {
  @scala.inline
  def apply(): PartialAnnotationControlP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnnotationControlP]
  }
  @scala.inline
  implicit class PartialAnnotationControlPOps[Self <: PartialAnnotationControlP] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPositioner(value: AnnotationControlPointPositionerFunction): Self = this.set("positioner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositioner: Self = this.set("positioner", js.undefined)
    @scala.inline
    def setStyle(value: AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

