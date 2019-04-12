package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var encoding: js.UndefOr[
    atHapiHapiLib.atHapiHapiLibStrings.none | atHapiHapiLib.atHapiHapiLibStrings.base64 | atHapiHapiLib.atHapiHapiLibStrings.base64json | atHapiHapiLib.atHapiHapiLibStrings.form | atHapiHapiLib.atHapiHapiLibStrings.iron
  ] = js.undefined
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  var isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var isSameSite: js.UndefOr[
    atHapiHapiLib.atHapiHapiLibNumbers.`false` | atHapiHapiLib.atHapiHapiLibStrings.Strict | atHapiHapiLib.atHapiHapiLibStrings.Lax
  ] = js.undefined
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  var strictHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(
    encoding: atHapiHapiLib.atHapiHapiLibStrings.none | atHapiHapiLib.atHapiHapiLibStrings.base64 | atHapiHapiLib.atHapiHapiLibStrings.base64json | atHapiHapiLib.atHapiHapiLibStrings.form | atHapiHapiLib.atHapiHapiLibStrings.iron = null,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isSameSite: atHapiHapiLib.atHapiHapiLibNumbers.`false` | atHapiHapiLib.atHapiHapiLibStrings.Strict | atHapiHapiLib.atHapiHapiLibStrings.Lax = null,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    strictHeader: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Base64 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly)
    if (isSameSite != null) __obj.updateDynamic("isSameSite")(isSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (!js.isUndefined(strictHeader)) __obj.updateDynamic("strictHeader")(strictHeader)
    __obj.asInstanceOf[Anon_Base64]
  }
}

