package typings
package infoboxDashParserLib.infoboxDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var simplifyDataValues: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(simplifyDataValues: js.UndefOr[scala.Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(simplifyDataValues)) __obj.updateDynamic("simplifyDataValues")(simplifyDataValues)
    __obj.asInstanceOf[ParseOptions]
  }
}

