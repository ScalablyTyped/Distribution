package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooserMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridfeaturechooser#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridfeaturechooser#options:language) or [locale](ui.iggridfeaturechooser#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  def destroy(e: js.Object, args: js.Object): scala.Unit
  /**
  	 * Get jQuery representation of the div holding dropdown for the specified columnKey
  	 *
  	 * @param columnKey Key of the column
  	 */
  def getDropDownByColumnKey(columnKey: java.lang.String): scala.Unit
  /**
  	 * Hide feature chooser dialog by column key
  	 *
  	 * @param columnKey Key of the column that should be hidden.
  	 */
  def hideDropDown(columnKey: java.lang.String): scala.Unit
  def shouldShowFeatureIcon(key: js.Object): scala.Unit
  /**
  	 * Show feature chooser dialog by the specified column key
  	 *
  	 * @param columnKey Key of the column that should be shown.
  	 */
  def showDropDown(columnKey: java.lang.String): scala.Unit
  /**
  	 * Show/hide feature chooser dialog by column key
  	 *
  	 * @param columnKey Key of the column that should be shown/hidden.
  	 */
  def toggleDropDown(columnKey: java.lang.String): scala.Unit
}

object IgGridFeatureChooserMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function0[scala.Unit],
    destroy: js.Function2[js.Object, js.Object, scala.Unit],
    getDropDownByColumnKey: js.Function1[java.lang.String, scala.Unit],
    hideDropDown: js.Function1[java.lang.String, scala.Unit],
    shouldShowFeatureIcon: js.Function1[js.Object, scala.Unit],
    showDropDown: js.Function1[java.lang.String, scala.Unit],
    toggleDropDown: js.Function1[java.lang.String, scala.Unit]
  ): IgGridFeatureChooserMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional)
    __obj.updateDynamic("changeLocale")(changeLocale)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getDropDownByColumnKey")(getDropDownByColumnKey)
    __obj.updateDynamic("hideDropDown")(hideDropDown)
    __obj.updateDynamic("shouldShowFeatureIcon")(shouldShowFeatureIcon)
    __obj.updateDynamic("showDropDown")(showDropDown)
    __obj.updateDynamic("toggleDropDown")(toggleDropDown)
    __obj.asInstanceOf[IgGridFeatureChooserMethods]
  }
}

