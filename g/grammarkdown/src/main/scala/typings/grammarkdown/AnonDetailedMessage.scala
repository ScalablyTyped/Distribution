package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetailedMessage extends js.Object {
  var detailedMessage: js.UndefOr[Boolean] = js.undefined
  var formatMessage: js.UndefOr[Boolean] = js.undefined
}

object AnonDetailedMessage {
  @scala.inline
  def apply(
    detailedMessage: js.UndefOr[Boolean] = js.undefined,
    formatMessage: js.UndefOr[Boolean] = js.undefined
  ): AnonDetailedMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailedMessage)) __obj.updateDynamic("detailedMessage")(detailedMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(formatMessage)) __obj.updateDynamic("formatMessage")(formatMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetailedMessage]
  }
}

