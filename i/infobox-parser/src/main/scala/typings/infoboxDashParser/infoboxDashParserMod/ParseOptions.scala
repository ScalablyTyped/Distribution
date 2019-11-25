package typings.infoboxDashParser.infoboxDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var simplifyDataValues: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(simplifyDataValues: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(simplifyDataValues)) __obj.updateDynamic("simplifyDataValues")(simplifyDataValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

