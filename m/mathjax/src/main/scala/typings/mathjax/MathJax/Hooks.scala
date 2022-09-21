package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hooks extends StObject {
  
  def Add(hook: Any, priority: Double): CallbackObject
  
  def Execute(): CallbackObject
  
  def Remove(hook: CallbackObject): Unit
}
object Hooks {
  
  inline def apply(
    Add: (Any, Double) => CallbackObject,
    Execute: () => CallbackObject,
    Remove: CallbackObject => Unit
  ): Hooks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Execute = js.Any.fromFunction0(Execute), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[Hooks]
  }
  
  extension [Self <: Hooks](x: Self) {
    
    inline def setAdd(value: (Any, Double) => CallbackObject): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setExecute(value: () => CallbackObject): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    inline def setRemove(value: CallbackObject => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
