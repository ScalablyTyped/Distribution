package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridModalDialogMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmodaldialog#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridmodaldialog#options:language) or [locale](ui.iggridmodaldialog#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  def closeModalDialog(accepted: js.Object, e: js.Object): Unit = js.native
  def destroy(): Unit = js.native
  def getCaptionButtonContainer(): Unit = js.native
  def getContent(): Unit = js.native
  def getFooter(): Unit = js.native
  def openModalDialog(): Unit = js.native
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
  @scala.inline
  implicit class IgGridModalDialogMethodsOps[Self <: IgGridModalDialogMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = this.set("changeLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setCloseModalDialog(value: (js.Object, js.Object) => Unit): Self = this.set("closeModalDialog", js.Any.fromFunction2(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCaptionButtonContainer(value: () => Unit): Self = this.set("getCaptionButtonContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContent(value: () => Unit): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFooter(value: () => Unit): Self = this.set("getFooter", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenModalDialog(value: () => Unit): Self = this.set("openModalDialog", js.Any.fromFunction0(value))
  }
  
}

