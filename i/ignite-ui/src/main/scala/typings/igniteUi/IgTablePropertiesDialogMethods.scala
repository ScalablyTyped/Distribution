package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTablePropertiesDialogMethods extends StObject {
  
  def hide(): Unit
  
  def show(item: js.Object): Unit
}
object IgTablePropertiesDialogMethods {
  
  inline def apply(hide: () => Unit, show: js.Object => Unit): IgTablePropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IgTablePropertiesDialogMethods]
  }
  
  extension [Self <: IgTablePropertiesDialogMethods](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setShow(value: js.Object => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
