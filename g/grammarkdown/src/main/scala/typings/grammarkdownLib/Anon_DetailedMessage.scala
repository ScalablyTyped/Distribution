package typings
package grammarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetailedMessage extends js.Object {
  var detailedMessage: js.UndefOr[scala.Boolean] = js.undefined
  var formatMessage: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DetailedMessage {
  @scala.inline
  def apply(
    detailedMessage: js.UndefOr[scala.Boolean] = js.undefined,
    formatMessage: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DetailedMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailedMessage)) __obj.updateDynamic("detailedMessage")(detailedMessage)
    if (!js.isUndefined(formatMessage)) __obj.updateDynamic("formatMessage")(formatMessage)
    __obj.asInstanceOf[Anon_DetailedMessage]
  }
}

