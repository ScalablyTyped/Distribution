package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectangleOptions extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokePosition: js.UndefOr[StrokePosition] = js.native
  var strokeWeight: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object RectangleOptions {
  @scala.inline
  def apply(): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleOptions]
  }
  @scala.inline
  implicit class RectangleOptionsOps[Self <: RectangleOptions] (val x: Self) extends AnyVal {
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
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokePosition(value: StrokePosition): Self = this.set("strokePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokePosition: Self = this.set("strokePosition", js.undefined)
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

