package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxRadioOptions extends js.Object {
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object CheckboxRadioOptions {
  @scala.inline
  def apply(mini: js.UndefOr[scala.Boolean] = js.undefined, theme: java.lang.String = null): CheckboxRadioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CheckboxRadioOptions]
  }
}

