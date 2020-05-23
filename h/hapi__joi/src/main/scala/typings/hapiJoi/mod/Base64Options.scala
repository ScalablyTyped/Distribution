package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@hapi/joi.@hapi/joi.DataUriOptions, 'paddingRequired'> */
trait Base64Options extends js.Object {
  var paddingRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, uses the URI-safe base64 format which replaces `+` with `-` and `\` with `_`.
    *
    * @default false
    */
  var urlSafe: js.UndefOr[Boolean] = js.undefined
}

object Base64Options {
  @scala.inline
  def apply(paddingRequired: js.UndefOr[Boolean] = js.undefined, urlSafe: js.UndefOr[Boolean] = js.undefined): Base64Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paddingRequired)) __obj.updateDynamic("paddingRequired")(paddingRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(urlSafe)) __obj.updateDynamic("urlSafe")(urlSafe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64Options]
  }
}

