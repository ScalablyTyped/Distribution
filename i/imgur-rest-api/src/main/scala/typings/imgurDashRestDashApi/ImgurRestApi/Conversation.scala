package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversation extends js.Object {
  var datetime: Double
  var done: js.UndefOr[Boolean] = js.undefined
  var id: Double
  var last_message_preview: String
  var message_count: Double
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var with_account: String
  var with_account_id: Double
}

object Conversation {
  @scala.inline
  def apply(
    datetime: Double,
    id: Double,
    last_message_preview: String,
    message_count: Double,
    with_account: String,
    with_account_id: Double,
    done: js.UndefOr[Boolean] = js.undefined,
    messages: js.Array[Message] = null,
    page: Int | Double = null
  ): Conversation = {
    val __obj = js.Dynamic.literal(datetime = datetime, id = id, last_message_preview = last_message_preview, message_count = message_count, with_account = with_account, with_account_id = with_account_id)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
}

