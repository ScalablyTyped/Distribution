package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateErrorOptions extends js.Object {
  var flags: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[LanguageMessages] = js.undefined
}

object CreateErrorOptions {
  @scala.inline
  def apply(flags: js.UndefOr[Boolean] = js.undefined, messages: LanguageMessages = null): CreateErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateErrorOptions]
  }
}

