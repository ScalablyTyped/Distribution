package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLinkPropertiesDialogMethods extends StObject {
  
  def hide(): Unit
  
  def show(item: js.Object): Unit
}
object IgLinkPropertiesDialogMethods {
  
  @scala.inline
  def apply(hide: () => Unit, show: js.Object => Unit): IgLinkPropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IgLinkPropertiesDialogMethods]
  }
  
  @scala.inline
  implicit class IgLinkPropertiesDialogMethodsMutableBuilder[Self <: IgLinkPropertiesDialogMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: js.Object => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
