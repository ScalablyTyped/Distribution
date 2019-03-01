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

object IgGridModalDialogMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function0[scala.Unit],
    closeModalDialog: js.Function2[js.Object, js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    getCaptionButtonContainer: js.Function0[scala.Unit],
    getContent: js.Function0[scala.Unit],
    getFooter: js.Function0[scala.Unit],
    openModalDialog: js.Function0[scala.Unit]
  ): IgGridModalDialogMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional)
    __obj.updateDynamic("changeLocale")(changeLocale)
    __obj.updateDynamic("closeModalDialog")(closeModalDialog)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getCaptionButtonContainer")(getCaptionButtonContainer)
    __obj.updateDynamic("getContent")(getContent)
    __obj.updateDynamic("getFooter")(getFooter)
    __obj.updateDynamic("openModalDialog")(openModalDialog)
    __obj.asInstanceOf[IgGridModalDialogMethods]
  }
}

