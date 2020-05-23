package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooserMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridfeaturechooser#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridfeaturechooser#options:language) or [locale](ui.iggridfeaturechooser#options:locale) option setter
    */
  def changeLocale(): Unit
  def destroy(e: js.Object, args: js.Object): Unit
  /**
    * Get jQuery representation of the div holding dropdown for the specified columnKey
    *
    * @param columnKey Key of the column
    */
  def getDropDownByColumnKey(columnKey: String): Unit
  /**
    * Hide feature chooser dialog by column key
    *
    * @param columnKey Key of the column that should be hidden.
    */
  def hideDropDown(columnKey: String): Unit
  def shouldShowFeatureIcon(key: js.Object): Unit
  /**
    * Show feature chooser dialog by the specified column key
    *
    * @param columnKey Key of the column that should be shown.
    */
  def showDropDown(columnKey: String): Unit
  /**
    * Show/hide feature chooser dialog by column key
    *
    * @param columnKey Key of the column that should be shown/hidden.
    */
  def toggleDropDown(columnKey: String): Unit
}

object IgGridFeatureChooserMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    destroy: (js.Object, js.Object) => Unit,
    getDropDownByColumnKey: String => Unit,
    hideDropDown: String => Unit,
    shouldShowFeatureIcon: js.Object => Unit,
    showDropDown: String => Unit,
    toggleDropDown: String => Unit
  ): IgGridFeatureChooserMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction2(destroy), getDropDownByColumnKey = js.Any.fromFunction1(getDropDownByColumnKey), hideDropDown = js.Any.fromFunction1(hideDropDown), shouldShowFeatureIcon = js.Any.fromFunction1(shouldShowFeatureIcon), showDropDown = js.Any.fromFunction1(showDropDown), toggleDropDown = js.Any.fromFunction1(toggleDropDown))
    __obj.asInstanceOf[IgGridFeatureChooserMethods]
  }
}

