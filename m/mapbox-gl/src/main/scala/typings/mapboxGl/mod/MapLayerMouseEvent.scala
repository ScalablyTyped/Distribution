package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.click
import typings.mapboxGl.mapboxGlStrings.contextmenu
import typings.mapboxGl.mapboxGlStrings.dblclick
import typings.mapboxGl.mapboxGlStrings.mousedown
import typings.mapboxGl.mapboxGlStrings.mouseenter
import typings.mapboxGl.mapboxGlStrings.mouseleave
import typings.mapboxGl.mapboxGlStrings.mousemove
import typings.mapboxGl.mapboxGlStrings.mouseout
import typings.mapboxGl.mapboxGlStrings.mouseover
import typings.mapboxGl.mapboxGlStrings.mouseup
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mapbox-gl.mapbox-gl.MapMouseEvent & {  features ? :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature>} */
trait MapLayerMouseEvent extends js.Object {
  var defaultPrevented: Boolean
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.undefined
  var lngLat: LngLat
  var originalEvent: MouseEvent
  var point: Point
  var target: Map
  var `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
  def preventDefault(): Unit
}

object MapLayerMouseEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    originalEvent: MouseEvent,
    point: Point,
    preventDefault: () => Unit,
    target: Map,
    `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu,
    features: js.Array[MapboxGeoJSONFeature] = null
  ): MapLayerMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerMouseEvent]
  }
}

