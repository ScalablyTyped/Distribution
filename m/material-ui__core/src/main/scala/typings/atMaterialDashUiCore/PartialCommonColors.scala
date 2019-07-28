package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/colors/common.CommonColors> */
trait PartialCommonColors extends js.Object {
  var black: js.UndefOr[String] = js.undefined
  var white: js.UndefOr[String] = js.undefined
}

object PartialCommonColors {
  @scala.inline
  def apply(black: String = null, white: String = null): PartialCommonColors = {
    val __obj = js.Dynamic.literal()
    if (black != null) __obj.updateDynamic("black")(black)
    if (white != null) __obj.updateDynamic("white")(white)
    __obj.asInstanceOf[PartialCommonColors]
  }
}

