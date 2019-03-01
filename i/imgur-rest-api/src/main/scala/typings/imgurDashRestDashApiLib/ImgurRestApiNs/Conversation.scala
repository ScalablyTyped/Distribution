package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversation extends js.Object {
  var datetime: scala.Double
  var done: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double
  var last_message_preview: java.lang.String
  var message_count: scala.Double
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var with_account: java.lang.String
  var with_account_id: scala.Double
}

object Conversation {
  @scala.inline
  def apply(
    datetime: scala.Double,
    id: scala.Double,
    last_message_preview: java.lang.String,
    message_count: scala.Double,
    with_account: java.lang.String,
    with_account_id: scala.Double,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    messages: js.Array[Message] = null,
    page: scala.Int | scala.Double = null
  ): Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last_message_preview")(last_message_preview)
    __obj.updateDynamic("message_count")(message_count)
    __obj.updateDynamic("with_account")(with_account)
    __obj.updateDynamic("with_account_id")(with_account_id)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
}

