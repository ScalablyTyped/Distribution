package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igpivotdataselector#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igpivotdataselector#options:language) or [locale](ui.igpivotdataselector#options:locale) option setter
  	 */
  def changeLocale(): Unit
  /**
  	 * Destroy is part of the jQuery UI widget API and does the following:
  	 * 1. Remove custom CSS classes that were added.
  	 * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
  	 * 3. Unbind all events that were bound.
  	 */
  def destroy(): Unit
  /**
  	 * Updates the data source.
  	 */
  def update(): Unit
}

object IgPivotDataSelectorMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    destroy: () => Unit,
    update: () => Unit
  ): IgPivotDataSelectorMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[IgPivotDataSelectorMethods]
  }
}

