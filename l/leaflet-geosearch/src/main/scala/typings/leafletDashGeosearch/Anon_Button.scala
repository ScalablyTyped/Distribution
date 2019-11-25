package typings.leafletDashGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var msgbox: js.UndefOr[String] = js.undefined
  var resetButton: js.UndefOr[String] = js.undefined
}

object Anon_Button {
  @scala.inline
  def apply(
    button: String = null,
    container: String = null,
    form: String = null,
    input: String = null,
    msgbox: String = null,
    resetButton: String = null
  ): Anon_Button = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (msgbox != null) __obj.updateDynamic("msgbox")(msgbox.asInstanceOf[js.Any])
    if (resetButton != null) __obj.updateDynamic("resetButton")(resetButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Button]
  }
}

