package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomMessage extends js.Object {
  var customMessage: js.UndefOr[java.lang.String] = js.undefined
  var toAccount: js.UndefOr[scala.Boolean] = js.undefined
  var transferReason: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CustomMessage {
  @scala.inline
  def apply(
    customMessage: java.lang.String = null,
    toAccount: js.UndefOr[scala.Boolean] = js.undefined,
    transferReason: java.lang.String = null
  ): Anon_CustomMessage = {
    val __obj = js.Dynamic.literal()
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (!js.isUndefined(toAccount)) __obj.updateDynamic("toAccount")(toAccount)
    if (transferReason != null) __obj.updateDynamic("transferReason")(transferReason)
    __obj.asInstanceOf[Anon_CustomMessage]
  }
}

