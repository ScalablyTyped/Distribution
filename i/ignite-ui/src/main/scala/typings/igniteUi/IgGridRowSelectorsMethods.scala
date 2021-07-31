package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridRowSelectorsMethods extends StObject {
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridrowselectors#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridrowselectors#options:language) or [locale](ui.iggridrowselectors#options:locale) option setter
    */
  def changeLocale(): Unit
  
  def destroy(): Unit
  
  def rsRenderColgroup(): Unit
}
object IgGridRowSelectorsMethods {
  
  @scala.inline
  def apply(changeLocale: () => Unit, destroy: () => Unit, rsRenderColgroup: () => Unit): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), rsRenderColgroup = js.Any.fromFunction0(rsRenderColgroup))
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
  
  @scala.inline
  implicit class IgGridRowSelectorsMethodsMutableBuilder[Self <: IgGridRowSelectorsMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRsRenderColgroup(value: () => Unit): Self = StObject.set(x, "rsRenderColgroup", js.Any.fromFunction0(value))
  }
}
