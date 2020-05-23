package typings.imgurRestApi.ImgurRestApi

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
    page: js.UndefOr[Double] = js.undefined
  ): Conversation = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_message_preview = last_message_preview.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], with_account = with_account.asInstanceOf[js.Any], with_account_id = with_account_id.asInstanceOf[js.Any])
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
}

