package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hooks extends StObject {
  
  def Add(hook: js.Any, priority: Double): CallbackObject = js.native
  
  def Execute(): CallbackObject = js.native
  
  def Remove(hook: CallbackObject): Unit = js.native
}
object Hooks {
  
  @scala.inline
  def apply(
    Add: (js.Any, Double) => CallbackObject,
    Execute: () => CallbackObject,
    Remove: CallbackObject => Unit
  ): Hooks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Execute = js.Any.fromFunction0(Execute), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[Hooks]
  }
  
  @scala.inline
  implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (js.Any, Double) => CallbackObject): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExecute(value: () => CallbackObject): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: CallbackObject => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
