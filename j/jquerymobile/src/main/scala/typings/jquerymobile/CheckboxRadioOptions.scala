package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxRadioOptions extends js.Object {
  var mini: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object CheckboxRadioOptions {
  @scala.inline
  def apply(mini: js.UndefOr[Boolean] = js.undefined, theme: String = null): CheckboxRadioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxRadioOptions]
  }
}

