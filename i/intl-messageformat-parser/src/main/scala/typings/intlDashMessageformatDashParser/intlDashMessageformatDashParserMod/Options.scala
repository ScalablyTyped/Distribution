package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Capture location info in AST
    * Default is false
    */
  var captureLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to convert `#` in plural rule options
    * to `{var, number}`
    * Default is true
    */
  var normalizeHashtagInPlural: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    captureLocation: js.UndefOr[Boolean] = js.undefined,
    normalizeHashtagInPlural: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureLocation)) __obj.updateDynamic("captureLocation")(captureLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeHashtagInPlural)) __obj.updateDynamic("normalizeHashtagInPlural")(normalizeHashtagInPlural.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

