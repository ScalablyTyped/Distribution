package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgImagePropertiesDialogMethods extends StObject {
  
  def hide(): Unit
  
  def show(item: js.Object): Unit
}
object IgImagePropertiesDialogMethods {
  
  inline def apply(hide: () => Unit, show: js.Object => Unit): IgImagePropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IgImagePropertiesDialogMethods]
  }
  
  extension [Self <: IgImagePropertiesDialogMethods](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setShow(value: js.Object => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
