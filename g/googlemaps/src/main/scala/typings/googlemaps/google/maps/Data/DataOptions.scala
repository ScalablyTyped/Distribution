package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.ControlPosition
import typings.googlemaps.google.maps.DrawingMode
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOptions extends js.Object {
  var controlPosition: js.UndefOr[ControlPosition] = js.native
  var controls: js.UndefOr[js.Array[DrawingMode] | Null] = js.native
  var drawingMode: js.UndefOr[DrawingMode | Null] = js.native
  var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var style: js.UndefOr[StylingFunction | StyleOptions] = js.native
}

object DataOptions {
  @scala.inline
  def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
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
    def setControlPosition(value: ControlPosition): Self = this.set("controlPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlPosition: Self = this.set("controlPosition", js.undefined)
    @scala.inline
    def setControlsVarargs(value: DrawingMode*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: js.Array[DrawingMode]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setControlsNull: Self = this.set("controls", null)
    @scala.inline
    def setDrawingMode(value: DrawingMode): Self = this.set("drawingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingMode: Self = this.set("drawingMode", js.undefined)
    @scala.inline
    def setDrawingModeNull: Self = this.set("drawingMode", null)
    @scala.inline
    def setFeatureFactory(value: /* geometry */ Geometry => Feature): Self = this.set("featureFactory", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFeatureFactory: Self = this.set("featureFactory", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setStyleFunction1(value: /* feature */ Feature => StyleOptions): Self = this.set("style", js.Any.fromFunction1(value))
    @scala.inline
    def setStyle(value: StylingFunction | StyleOptions): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

