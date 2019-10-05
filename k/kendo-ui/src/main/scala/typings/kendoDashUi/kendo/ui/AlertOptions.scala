package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var messages: js.UndefOr[AlertMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(messages: AlertMessages = null, name: String = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AlertOptions]
  }
}

