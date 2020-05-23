package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOptions extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var roundingSensitivity: js.UndefOr[Double] = js.undefined
  var unitNames: js.UndefOr[js.Object] = js.undefined
  var units: js.UndefOr[String] = js.undefined
}

object FormatterOptions {
  @scala.inline
  def apply(
    language: String = null,
    roundingSensitivity: js.UndefOr[Double] = js.undefined,
    unitNames: js.Object = null,
    units: String = null
  ): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(roundingSensitivity)) __obj.updateDynamic("roundingSensitivity")(roundingSensitivity.get.asInstanceOf[js.Any])
    if (unitNames != null) __obj.updateDynamic("unitNames")(unitNames.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterOptions]
  }
}

