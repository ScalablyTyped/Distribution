package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  var controlPosition: js.UndefOr[googlemapsLib.googleNs.mapsNs.ControlPosition] = js.undefined
  var controls: js.UndefOr[js.Array[googlemapsLib.googleNs.mapsNs.DrawingMode] | scala.Null] = js.undefined
  var drawingMode: js.UndefOr[googlemapsLib.googleNs.mapsNs.DrawingMode | scala.Null] = js.undefined
  var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.undefined
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  var style: js.UndefOr[StylingFunction | StyleOptions] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    controlPosition: googlemapsLib.googleNs.mapsNs.ControlPosition = null,
    controls: js.Array[googlemapsLib.googleNs.mapsNs.DrawingMode] = null,
    drawingMode: googlemapsLib.googleNs.mapsNs.DrawingMode = null,
    featureFactory: /* geometry */ Geometry => Feature = null,
    map: googlemapsLib.googleNs.mapsNs.Map = null,
    style: StylingFunction | StyleOptions = null
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPosition != null) __obj.updateDynamic("controlPosition")(controlPosition)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (drawingMode != null) __obj.updateDynamic("drawingMode")(drawingMode)
    if (featureFactory != null) __obj.updateDynamic("featureFactory")(js.Any.fromFunction1(featureFactory))
    if (map != null) __obj.updateDynamic("map")(map)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

