package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridModalDialogMethods extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IgGridModalDialogMethods] (val x: Self) extends AnyVal {
    
    inline def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    inline def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    inline def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    inline def setCloseModalDialog(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "closeModalDialog", js.Any.fromFunction2(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetCaptionButtonContainer(value: () => Unit): Self = StObject.set(x, "getCaptionButtonContainer", js.Any.fromFunction0(value))
    
    inline def setGetContent(value: () => Unit): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setGetFooter(value: () => Unit): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
    
    inline def setOpenModalDialog(value: () => Unit): Self = StObject.set(x, "openModalDialog", js.Any.fromFunction0(value))
  }
}
