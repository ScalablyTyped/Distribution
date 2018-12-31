package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridModalDialogMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmodaldialog#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridmodaldialog#options:language) or [locale](ui.iggridmodaldialog#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  def closeModalDialog(accepted: js.Object, e: js.Object): scala.Unit
  def destroy(): scala.Unit
  def getCaptionButtonContainer(): scala.Unit
  def getContent(): scala.Unit
  def getFooter(): scala.Unit
  def openModalDialog(): scala.Unit
}

