package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyconfirm extends js.Object {
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.undefined
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[scala.Boolean] = js.undefined
}

object PNotifyconfirm {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    buttons: js.Array[PNotifyconfirmButton] = null,
    confirm: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: js.UndefOr[scala.Boolean] = js.undefined,
    prompt_class: java.lang.String = null,
    prompt_default: java.lang.String = null,
    prompt_multi_line: js.UndefOr[scala.Boolean] = js.undefined
  ): PNotifyconfirm = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm)
    if (!js.isUndefined(prompt)) __obj.updateDynamic("prompt")(prompt)
    if (prompt_class != null) __obj.updateDynamic("prompt_class")(prompt_class)
    if (prompt_default != null) __obj.updateDynamic("prompt_default")(prompt_default)
    if (!js.isUndefined(prompt_multi_line)) __obj.updateDynamic("prompt_multi_line")(prompt_multi_line)
    __obj.asInstanceOf[PNotifyconfirm]
  }
}

