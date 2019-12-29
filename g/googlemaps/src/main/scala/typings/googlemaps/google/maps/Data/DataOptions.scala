package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.ControlPosition
import typings.googlemaps.google.maps.DrawingMode
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  var controlPosition: js.UndefOr[ControlPosition] = js.undefined
  var controls: js.UndefOr[js.Array[DrawingMode] | Null] = js.undefined
  var drawingMode: js.UndefOr[DrawingMode | Null] = js.undefined
  var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
  var style: js.UndefOr[StylingFunction | StyleOptions] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    controlPosition: ControlPosition = null,
    controls: js.Array[DrawingMode] = null,
    drawingMode: DrawingMode = null,
    featureFactory: /* geometry */ Geometry => Feature = null,
    map: Map[Element] = null,
    style: StylingFunction | StyleOptions = null
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPosition != null) __obj.updateDynamic("controlPosition")(controlPosition.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (drawingMode != null) __obj.updateDynamic("drawingMode")(drawingMode.asInstanceOf[js.Any])
    if (featureFactory != null) __obj.updateDynamic("featureFactory")(js.Any.fromFunction1(featureFactory))
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

