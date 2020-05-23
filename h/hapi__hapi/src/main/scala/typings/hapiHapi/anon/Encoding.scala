package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiStrings.base64
import typings.hapiHapi.hapiHapiStrings.base64json
import typings.hapiHapi.hapiHapiStrings.form
import typings.hapiHapi.hapiHapiStrings.iron
import typings.hapiHapi.hapiHapiStrings.none_
import typings.hapiHapi.mod.SameSitePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: js.UndefOr[none_ | base64 | base64json | form | iron] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  var isSameSite: js.UndefOr[SameSitePolicy] = js.undefined
  var isSecure: js.UndefOr[Boolean] = js.undefined
  var strictHeader: js.UndefOr[Boolean] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(
    encoding: none_ | base64 | base64json | form | iron = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSameSite: SameSitePolicy = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    strictHeader: js.UndefOr[Boolean] = js.undefined
  ): Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.get.asInstanceOf[js.Any])
    if (isSameSite != null) __obj.updateDynamic("isSameSite")(isSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictHeader)) __obj.updateDynamic("strictHeader")(strictHeader.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

