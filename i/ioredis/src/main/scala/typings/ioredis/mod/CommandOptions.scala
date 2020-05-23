package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  var errorStack: js.UndefOr[String] = js.undefined
  var keyPrefix: js.UndefOr[String] = js.undefined
  var replyEncoding: js.UndefOr[String | Null] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(
    errorStack: String = null,
    keyPrefix: String = null,
    replyEncoding: js.UndefOr[Null | String] = js.undefined
  ): CommandOptions = {
    val __obj = js.Dynamic.literal()
    if (errorStack != null) __obj.updateDynamic("errorStack")(errorStack.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(replyEncoding)) __obj.updateDynamic("replyEncoding")(replyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
}

