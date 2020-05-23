package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgScrollMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  /**
    * This method overrides the base method and does nothing, because the scoll container shouldn't change the container locales
    * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
    */
  def changeLocale(): Unit
  def destroy(): Unit
  def option(optionName: js.Object, value: js.Object): Unit
  def refresh(): Unit
}

object IgScrollMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    destroy: () => Unit,
    option: (js.Object, js.Object) => Unit,
    refresh: () => Unit
  ): IgScrollMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), option = js.Any.fromFunction2(option), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[IgScrollMethods]
  }
}

