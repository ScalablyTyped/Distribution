package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  var messages: js.UndefOr[ConfirmMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  var title: js.UndefOr[String | Boolean] = js.undefined
}

object ConfirmOptions {
  @scala.inline
  def apply(
    content: String = null,
    initOpen: /* e */ DialogEvent => Unit = null,
    messages: ConfirmMessages = null,
    name: String = null,
    open: /* e */ DialogEvent => Unit = null,
    title: String | Boolean = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (initOpen != null) __obj.updateDynamic("initOpen")(js.Any.fromFunction1(initOpen))
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmOptions]
  }
}

