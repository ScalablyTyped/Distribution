package typings.mapboxGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControl extends StObject {
  
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.undefined
  
  def onAdd(map: Map): HTMLElement
  
  def onRemove(map: Map): Unit
}
object IControl {
  
  inline def apply(onAdd: Map => HTMLElement, onRemove: Map => Unit): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[IControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IControl] (val x: Self) extends AnyVal {
    
    inline def setGetDefaultPosition(value: () => String): Self = StObject.set(x, "getDefaultPosition", js.Any.fromFunction0(value))
    
    inline def setGetDefaultPositionUndefined: Self = StObject.set(x, "getDefaultPosition", js.undefined)
    
    inline def setOnAdd(value: Map => HTMLElement): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnRemove(value: Map => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
  }
}
