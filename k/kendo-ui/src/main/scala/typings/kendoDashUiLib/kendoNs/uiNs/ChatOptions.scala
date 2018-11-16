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

