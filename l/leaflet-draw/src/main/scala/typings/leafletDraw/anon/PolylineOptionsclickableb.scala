package typings.leafletDraw.anon

import typings.leaflet.mod.FillRule
import typings.leaflet.mod.LineCapShape
import typings.leaflet.mod.LineJoinShape
import typings.leaflet.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.PolylineOptions & {  clickable :boolean | undefined} */
@js.native
trait PolylineOptionsclickableb extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var dashArray: js.UndefOr[String | js.Array[Double]] = js.native
  var dashOffset: js.UndefOr[String] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var fillRule: js.UndefOr[FillRule] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
  var lineCap: js.UndefOr[LineCapShape] = js.native
  var lineJoin: js.UndefOr[LineJoinShape] = js.native
  var noClip: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var pane: js.UndefOr[String] = js.native
  var renderer: js.UndefOr[Renderer] = js.native
  var smoothFactor: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[Boolean] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object PolylineOptionsclickableb {
  @scala.inline
  def apply(): PolylineOptionsclickableb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptionsclickableb]
  }
  @scala.inline
  implicit class PolylineOptionsclickablebOps[Self <: PolylineOptionsclickableb] (val x: Self) extends AnyVal {
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setBubblingMouseEvents(value: Boolean): Self = this.set("bubblingMouseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubblingMouseEvents: Self = this.set("bubblingMouseEvents", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashArrayVarargs(value: Double*): Self = this.set("dashArray", js.Array(value :_*))
    @scala.inline
    def setDashArray(value: String | js.Array[Double]): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    @scala.inline
    def setDashOffset(value: String): Self = this.set("dashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashOffset: Self = this.set("dashOffset", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: FillRule): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setLineCap(value: LineCapShape): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineJoin(value: LineJoinShape): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setNoClip(value: Boolean): Self = this.set("noClip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoClip: Self = this.set("noClip", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSmoothFactor(value: Double): Self = this.set("smoothFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothFactor: Self = this.set("smoothFactor", js.undefined)
    @scala.inline
    def setStroke(value: Boolean): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

