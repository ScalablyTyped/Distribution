package typings.grammarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedMessage extends js.Object {
  var detailedMessage: js.UndefOr[Boolean] = js.undefined
  var formatMessage: js.UndefOr[Boolean] = js.undefined
}

object DetailedMessage {
  @scala.inline
  def apply(
    detailedMessage: js.UndefOr[Boolean] = js.undefined,
    formatMessage: js.UndefOr[Boolean] = js.undefined
  ): DetailedMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailedMessage)) __obj.updateDynamic("detailedMessage")(detailedMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatMessage)) __obj.updateDynamic("formatMessage")(formatMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMessage]
  }
}

