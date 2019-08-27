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
    if (button != null) __obj.updateDynamic("button")(button)
    if (container != null) __obj.updateDynamic("container")(container)
    if (form != null) __obj.updateDynamic("form")(form)
    if (input != null) __obj.updateDynamic("input")(input)
    if (msgbox != null) __obj.updateDynamic("msgbox")(msgbox)
    if (resetButton != null) __obj.updateDynamic("resetButton")(resetButton)
    __obj.asInstanceOf[Anon_Button]
  }
}

