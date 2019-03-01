package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igpivotdataselector#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igpivotdataselector#options:language) or [locale](ui.igpivotdataselector#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  /**
  	 * Destroy is part of the jQuery UI widget API and does the following:
  	 * 1. Remove custom CSS classes that were added.
  	 * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
  	 * 3. Unbind all events that were bound.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Updates the data source.
  	 */
  def update(): scala.Unit
}

object IgPivotDataSelectorMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): IgPivotDataSelectorMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional)
    __obj.updateDynamic("changeLocale")(changeLocale)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[IgPivotDataSelectorMethods]
  }
}

