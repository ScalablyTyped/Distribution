package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.touchcancel
import typings.mapboxGl.mapboxGlStrings.touchend
import typings.mapboxGl.mapboxGlStrings.touchstart
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mapbox-gl.mapbox-gl.MapTouchEvent & {  features :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature> | undefined} */
@js.native
trait MapLayerTouchEvent extends js.Object {
  var defaultPrevented: Boolean = js.native
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.native
  var lngLat: LngLat = js.native
  var lngLats: js.Array[LngLat] = js.native
  var originalEvent: TouchEvent = js.native
  var point: Point = js.native
  var points: js.Array[Point] = js.native
  var target: Map = js.native
  var `type`: touchstart | touchend | touchcancel = js.native
  def preventDefault(): Unit = js.native
}

object MapLayerTouchEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    lngLats: js.Array[LngLat],
    originalEvent: TouchEvent,
    point: Point,
    points: js.Array[Point],
    preventDefault: () => Unit,
    target: Map,
    `type`: touchstart | touchend | touchcancel
  ): MapLayerTouchEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], lngLats = lngLats.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerTouchEvent]
  }
  @scala.inline
  implicit class MapLayerTouchEventOps[Self <: MapLayerTouchEvent] (val x: Self) extends AnyVal {
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
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setLngLat(value: LngLat): Self = this.set("lngLat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLngLatsVarargs(value: LngLat*): Self = this.set("lngLats", js.Array(value :_*))
    @scala.inline
    def setLngLats(value: js.Array[LngLat]): Self = this.set("lngLats", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: TouchEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: Map): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: touchstart | touchend | touchcancel): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeaturesVarargs(value: MapboxGeoJSONFeature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[MapboxGeoJSONFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
  }
  
}

