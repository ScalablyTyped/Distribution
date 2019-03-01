package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridRowSelectorsMethods extends js.Object {
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridrowselectors#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridrowselectors#options:language) or [locale](ui.iggridrowselectors#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  def destroy(): scala.Unit
}

object IgGridRowSelectorsMethods {
  @scala.inline
  def apply(changeLocale: js.Function0[scala.Unit], destroy: js.Function0[scala.Unit]): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeLocale")(changeLocale)
    __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
}

