package typings.atHapiHapi

import typings.atHapiHapi.atHapiHapiMod.SameSitePolicy
import typings.atHapiHapi.atHapiHapiStrings.base64
import typings.atHapiHapi.atHapiHapiStrings.base64json
import typings.atHapiHapi.atHapiHapiStrings.form
import typings.atHapiHapi.atHapiHapiStrings.iron
import typings.atHapiHapi.atHapiHapiStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var encoding: js.UndefOr[none_ | base64 | base64json | form | iron] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  var isSameSite: js.UndefOr[SameSitePolicy] = js.undefined
  var isSecure: js.UndefOr[Boolean] = js.undefined
  var strictHeader: js.UndefOr[Boolean] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(
    encoding: none_ | base64 | base64json | form | iron = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSameSite: SameSitePolicy = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    strictHeader: js.UndefOr[Boolean] = js.undefined
  ): Anon_Base64 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.asInstanceOf[js.Any])
    if (isSameSite != null) __obj.updateDynamic("isSameSite")(isSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.asInstanceOf[js.Any])
    if (!js.isUndefined(strictHeader)) __obj.updateDynamic("strictHeader")(strictHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64]
  }
}

