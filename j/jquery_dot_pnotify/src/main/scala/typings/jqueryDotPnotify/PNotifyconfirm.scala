package typings.jqueryDotPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyconfirm extends js.Object {
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[String] = js.undefined
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.undefined
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[Boolean] = js.undefined
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[String] = js.undefined
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[String] = js.undefined
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[Boolean] = js.undefined
}

object PNotifyconfirm {
  @scala.inline
  def apply(
    align: String = null,
    buttons: js.Array[PNotifyconfirmButton] = null,
    confirm: js.UndefOr[Boolean] = js.undefined,
    prompt: js.UndefOr[Boolean] = js.undefined,
    prompt_class: String = null,
    prompt_default: String = null,
    prompt_multi_line: js.UndefOr[Boolean] = js.undefined
  ): PNotifyconfirm = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    if (!js.isUndefined(prompt)) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (prompt_class != null) __obj.updateDynamic("prompt_class")(prompt_class.asInstanceOf[js.Any])
    if (prompt_default != null) __obj.updateDynamic("prompt_default")(prompt_default.asInstanceOf[js.Any])
    if (!js.isUndefined(prompt_multi_line)) __obj.updateDynamic("prompt_multi_line")(prompt_multi_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyconfirm]
  }
}

