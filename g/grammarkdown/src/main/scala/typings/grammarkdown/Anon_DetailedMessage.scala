package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetailedMessage extends js.Object {
  var detailedMessage: js.UndefOr[Boolean] = js.undefined
  var formatMessage: js.UndefOr[Boolean] = js.undefined
}

object Anon_DetailedMessage {
  @scala.inline
  def apply(
    detailedMessage: js.UndefOr[Boolean] = js.undefined,
    formatMessage: js.UndefOr[Boolean] = js.undefined
  ): Anon_DetailedMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailedMessage)) __obj.updateDynamic("detailedMessage")(detailedMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(formatMessage)) __obj.updateDynamic("formatMessage")(formatMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetailedMessage]
  }
}

