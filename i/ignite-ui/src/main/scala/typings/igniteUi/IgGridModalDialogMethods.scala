package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridModalDialogMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmodaldialog#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridmodaldialog#options:language) or [locale](ui.iggridmodaldialog#options:locale) option setter
    */
  def changeLocale(): Unit
  def closeModalDialog(accepted: js.Object, e: js.Object): Unit
  def destroy(): Unit
  def getCaptionButtonContainer(): Unit
  def getContent(): Unit
  def getFooter(): Unit
  def openModalDialog(): Unit
}

object IgGridModalDialogMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    closeModalDialog: (js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getCaptionButtonContainer: () => Unit,
    getContent: () => Unit,
    getFooter: () => Unit,
    openModalDialog: () => Unit
  ): IgGridModalDialogMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), closeModalDialog = js.Any.fromFunction2(closeModalDialog), destroy = js.Any.fromFunction0(destroy), getCaptionButtonContainer = js.Any.fromFunction0(getCaptionButtonContainer), getContent = js.Any.fromFunction0(getContent), getFooter = js.Any.fromFunction0(getFooter), openModalDialog = js.Any.fromFunction0(openModalDialog))
    __obj.asInstanceOf[IgGridModalDialogMethods]
  }
}

