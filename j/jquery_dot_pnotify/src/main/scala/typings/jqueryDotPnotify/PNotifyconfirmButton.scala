package typings.jqueryDotPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyconfirmButton extends js.Object {
  var addClass: js.UndefOr[String] = js.undefined
  /**
    *  Whether to trigger this button when the user hits enter in a single line prompt.
    */
  var promptTrigger: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  def click(notice: PNotify, value: js.Any): Unit
}

object PNotifyconfirmButton {
  @scala.inline
  def apply(
    click: (PNotify, js.Any) => Unit,
    addClass: String = null,
    promptTrigger: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): PNotifyconfirmButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click))
    if (addClass != null) __obj.updateDynamic("addClass")(addClass.asInstanceOf[js.Any])
    if (!js.isUndefined(promptTrigger)) __obj.updateDynamic("promptTrigger")(promptTrigger.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyconfirmButton]
  }
}

