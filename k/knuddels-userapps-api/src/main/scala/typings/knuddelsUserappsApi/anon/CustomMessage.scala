package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMessage extends js.Object {
  var customMessage: js.UndefOr[String] = js.undefined
  var toAccount: js.UndefOr[Boolean] = js.undefined
  var transferReason: js.UndefOr[String] = js.undefined
}

object CustomMessage {
  @scala.inline
  def apply(
    customMessage: String = null,
    toAccount: js.UndefOr[Boolean] = js.undefined,
    transferReason: String = null
  ): CustomMessage = {
    val __obj = js.Dynamic.literal()
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(toAccount)) __obj.updateDynamic("toAccount")(toAccount.get.asInstanceOf[js.Any])
    if (transferReason != null) __obj.updateDynamic("transferReason")(transferReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMessage]
  }
}

