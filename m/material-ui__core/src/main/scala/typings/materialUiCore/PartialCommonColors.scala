package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/colors/common.CommonColors> */
@js.native
trait PartialCommonColors extends js.Object {
  var black: js.UndefOr[String] = js.native
  var white: js.UndefOr[String] = js.native
}

object PartialCommonColors {
  @scala.inline
  def apply(black: String = null, white: String = null): PartialCommonColors = {
    val __obj = js.Dynamic.literal()
    if (black != null) __obj.updateDynamic("black")(black.asInstanceOf[js.Any])
    if (white != null) __obj.updateDynamic("white")(white.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCommonColors]
  }
}

