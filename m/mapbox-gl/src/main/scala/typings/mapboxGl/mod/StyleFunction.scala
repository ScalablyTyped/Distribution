package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.categorical
import typings.mapboxGl.mapboxGlStrings.exponential
import typings.mapboxGl.mapboxGlStrings.hcl
import typings.mapboxGl.mapboxGlStrings.identity
import typings.mapboxGl.mapboxGlStrings.interval
import typings.mapboxGl.mapboxGlStrings.lab
import typings.mapboxGl.mapboxGlStrings.rgb
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
    base: js.UndefOr[Double] = js.undefined,
    colorSpace: rgb | lab | hcl = null,
    default: js.Any = null,
    property: String = null,
    stops: js.Array[js.Array[_]] = null,
    `type`: identity | exponential | interval | categorical = null
  ): StyleFunction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFunction]
  }
}

