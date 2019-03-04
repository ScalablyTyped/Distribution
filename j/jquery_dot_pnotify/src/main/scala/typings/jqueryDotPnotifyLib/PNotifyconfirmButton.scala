package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyconfirmButton extends js.Object {
  var addClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Whether to trigger this button when the user hits enter in a single line prompt.
    */
  var promptTrigger: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  def click(notice: PNotify, value: js.Any): scala.Unit
}

object PNotifyconfirmButton {
  @scala.inline
  def apply(
    click: js.Function2[PNotify, js.Any, scala.Unit],
    addClass: java.lang.String = null,
    promptTrigger: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
  ): PNotifyconfirmButton = {
    val __obj = js.Dynamic.literal(click = click)
    if (addClass != null) __obj.updateDynamic("addClass")(addClass)
    if (!js.isUndefined(promptTrigger)) __obj.updateDynamic("promptTrigger")(promptTrigger)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PNotifyconfirmButton]
  }
}

