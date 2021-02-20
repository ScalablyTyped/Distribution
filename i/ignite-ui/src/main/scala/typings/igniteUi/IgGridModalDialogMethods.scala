package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridModalDialogMethods extends StObject {
  
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
  implicit class IgGridModalDialogMethodsMutableBuilder[Self <: IgGridModalDialogMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseModalDialog(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "closeModalDialog", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCaptionButtonContainer(value: () => Unit): Self = StObject.set(x, "getCaptionButtonContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContent(value: () => Unit): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFooter(value: () => Unit): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenModalDialog(value: () => Unit): Self = StObject.set(x, "openModalDialog", js.Any.fromFunction0(value))
  }
}
