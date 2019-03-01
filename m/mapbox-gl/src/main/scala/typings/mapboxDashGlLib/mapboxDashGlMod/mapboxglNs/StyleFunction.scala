package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunction extends js.Object {
  var base: js.UndefOr[scala.Double] = js.undefined
  var colorSpace: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.rgb | mapboxDashGlLib.mapboxDashGlLibStrings.lab | mapboxDashGlLib.mapboxDashGlLibStrings.hcl
  ] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var stops: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  var `type`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.identity | mapboxDashGlLib.mapboxDashGlLibStrings.exponential | mapboxDashGlLib.mapboxDashGlLibStrings.interval | mapboxDashGlLib.mapboxDashGlLibStrings.categorical
  ] = js.undefined
}

object StyleFunction {
  @scala.inline
  def apply(
    base: scala.Int | scala.Double = null,
    colorSpace: mapboxDashGlLib.mapboxDashGlLibStrings.rgb | mapboxDashGlLib.mapboxDashGlLibStrings.lab | mapboxDashGlLib.mapboxDashGlLibStrings.hcl = null,
    default: js.Any = null,
    property: java.lang.String = null,
    stops: js.Array[js.Array[_]] = null,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.identity | mapboxDashGlLib.mapboxDashGlLibStrings.exponential | mapboxDashGlLib.mapboxDashGlLibStrings.interval | mapboxDashGlLib.mapboxDashGlLibStrings.categorical = null
  ): StyleFunction = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (property != null) __obj.updateDynamic("property")(property)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFunction]
  }
}

