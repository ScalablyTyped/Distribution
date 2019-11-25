package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.categorical
import typings.mapboxDashGl.mapboxDashGlStrings.exponential
import typings.mapboxDashGl.mapboxDashGlStrings.hcl
import typings.mapboxDashGl.mapboxDashGlStrings.identity
import typings.mapboxDashGl.mapboxDashGlStrings.interval
import typings.mapboxDashGl.mapboxDashGlStrings.lab
import typings.mapboxDashGl.mapboxDashGlStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunction extends js.Object {
  var base: js.UndefOr[Double] = js.undefined
  var colorSpace: js.UndefOr[rgb | lab | hcl] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var stops: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  var `type`: js.UndefOr[identity | exponential | interval | categorical] = js.undefined
}

object StyleFunction {
  @scala.inline
  def apply(
    base: Int | Double = null,
    colorSpace: rgb | lab | hcl = null,
    default: js.Any = null,
    property: String = null,
    stops: js.Array[js.Array[_]] = null,
    `type`: identity | exponential | interval | categorical = null
  ): StyleFunction = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFunction]
  }
}

