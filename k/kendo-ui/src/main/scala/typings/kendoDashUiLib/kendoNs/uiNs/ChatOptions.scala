package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatOptions extends js.Object {
  var actionClick: js.UndefOr[js.Function1[/* e */ ChatActionClickEvent, scala.Unit]] = js.undefined
  var messages: js.UndefOr[ChatMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var post: js.UndefOr[js.Function1[/* e */ ChatPostEvent, scala.Unit]] = js.undefined
  var sendMessage: js.UndefOr[js.Function1[/* e */ ChatSendMessageEvent, scala.Unit]] = js.undefined
  var typingEnd: js.UndefOr[js.Function1[/* e */ ChatTypingEndEvent, scala.Unit]] = js.undefined
  var typingStart: js.UndefOr[js.Function1[/* e */ ChatTypingStartEvent, scala.Unit]] = js.undefined
  var user: js.UndefOr[ChatUser] = js.undefined
}

object ChatOptions {
  @scala.inline
  def apply(
    actionClick: js.Function1[/* e */ ChatActionClickEvent, scala.Unit] = null,
    messages: ChatMessages = null,
    name: java.lang.String = null,
    post: js.Function1[/* e */ ChatPostEvent, scala.Unit] = null,
    sendMessage: js.Function1[/* e */ ChatSendMessageEvent, scala.Unit] = null,
    typingEnd: js.Function1[/* e */ ChatTypingEndEvent, scala.Unit] = null,
    typingStart: js.Function1[/* e */ ChatTypingStartEvent, scala.Unit] = null,
    user: ChatUser = null
  ): ChatOptions = {
    val __obj = js.Dynamic.literal()
    if (actionClick != null) __obj.updateDynamic("actionClick")(actionClick)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (post != null) __obj.updateDynamic("post")(post)
    if (sendMessage != null) __obj.updateDynamic("sendMessage")(sendMessage)
    if (typingEnd != null) __obj.updateDynamic("typingEnd")(typingEnd)
    if (typingStart != null) __obj.updateDynamic("typingStart")(typingStart)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ChatOptions]
  }
}

