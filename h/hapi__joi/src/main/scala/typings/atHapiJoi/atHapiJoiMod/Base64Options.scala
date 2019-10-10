package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'paddingRequired' ]: @hapi/joi.@hapi/joi.DataUriOptions[P]} */ trait Base64Options extends js.Object {
  /**
    * if true, uses the URI-safe base64 format which replaces `+` with `-` and `\` with `_`.
    *
    * @default false
    */
  var urlSafe: js.UndefOr[Boolean] = js.undefined
}

object Base64Options {
  @scala.inline
  def apply(urlSafe: js.UndefOr[Boolean] = js.undefined): Base64Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(urlSafe)) __obj.updateDynamic("urlSafe")(urlSafe)
    __obj.asInstanceOf[Base64Options]
  }
}

