package typings.materialUiCore.anon

import typings.react.mod.ChangeEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisible extends StObject {
  
  def isFocusVisible(event: ChangeEvent[Element]): Boolean
  
  def onBlurVisible(): Unit
  
  var ref: typings.react.mod.Ref[Any]
}
object IsFocusVisible {
  
  inline def apply(isFocusVisible: ChangeEvent[Element] => Boolean, onBlurVisible: () => Unit): IsFocusVisible = {
    val __obj = js.Dynamic.literal(isFocusVisible = js.Any.fromFunction1(isFocusVisible), onBlurVisible = js.Any.fromFunction0(onBlurVisible), ref = null)
    __obj.asInstanceOf[IsFocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsFocusVisible] (val x: Self) extends AnyVal {
    
    inline def setIsFocusVisible(value: ChangeEvent[Element] => Boolean): Self = StObject.set(x, "isFocusVisible", js.Any.fromFunction1(value))
    
    inline def setOnBlurVisible(value: () => Unit): Self = StObject.set(x, "onBlurVisible", js.Any.fromFunction0(value))
    
    inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
