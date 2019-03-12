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
  def apply(changeLocale: () => scala.Unit, destroy: () => scala.Unit): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
}

