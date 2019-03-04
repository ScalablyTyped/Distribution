package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialMenuMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Exports visual data from the radial menu to aid in unit testing
  	 */
  def exportVisualData(): scala.Unit
  /**
  	 * Forces any pending deferred work to render on the radial menu before continuing
  	 */
  def flush(): scala.Unit
  /**
  	 * Gets or sets the value of a property for the item created with the specified key
  	 *
  	 * @param itemKey The name of the item
  	 * @param key The name of the property/option
  	 * @param value The new value for the property or undefined to obtain the current value
  	 */
  def itemOption(itemKey: java.lang.String, key: java.lang.String, value: js.Object): js.Object
  /**
  	 * Notify the radial menu that style information used for rendering the menu may have been updated.
  	 */
  def styleUpdated(): scala.Unit
}

object IgRadialMenuMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function1[js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    exportVisualData: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    itemOption: js.Function3[java.lang.String, java.lang.String, js.Object, js.Object],
    styleUpdated: js.Function0[scala.Unit]
  ): IgRadialMenuMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, destroy = destroy, exportVisualData = exportVisualData, flush = flush, itemOption = itemOption, styleUpdated = styleUpdated)
  
    __obj.asInstanceOf[IgRadialMenuMethods]
  }
}

