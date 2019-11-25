package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatOptions extends js.Object {
  var actionClick: js.UndefOr[js.Function1[/* e */ ChatActionClickEvent, Unit]] = js.undefined
  var messages: js.UndefOr[ChatMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var post: js.UndefOr[js.Function1[/* e */ ChatPostEvent, Unit]] = js.undefined
  var sendMessage: js.UndefOr[js.Function1[/* e */ ChatSendMessageEvent, Unit]] = js.undefined
  var typingEnd: js.UndefOr[js.Function1[/* e */ ChatTypingEndEvent, Unit]] = js.undefined
  var typingStart: js.UndefOr[js.Function1[/* e */ ChatTypingStartEvent, Unit]] = js.undefined
  var user: js.UndefOr[ChatUser] = js.undefined
}

object ChatOptions {
  @scala.inline
  def apply(
    actionClick: /* e */ ChatActionClickEvent => Unit = null,
    messages: ChatMessages = null,
    name: String = null,
    post: /* e */ ChatPostEvent => Unit = null,
    sendMessage: /* e */ ChatSendMessageEvent => Unit = null,
    typingEnd: /* e */ ChatTypingEndEvent => Unit = null,
    typingStart: /* e */ ChatTypingStartEvent => Unit = null,
    user: ChatUser = null
  ): ChatOptions = {
    val __obj = js.Dynamic.literal()
    if (actionClick != null) __obj.updateDynamic("actionClick")(js.Any.fromFunction1(actionClick))
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction1(post))
    if (sendMessage != null) __obj.updateDynamic("sendMessage")(js.Any.fromFunction1(sendMessage))
    if (typingEnd != null) __obj.updateDynamic("typingEnd")(js.Any.fromFunction1(typingEnd))
    if (typingStart != null) __obj.updateDynamic("typingStart")(js.Any.fromFunction1(typingStart))
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatOptions]
  }
}

