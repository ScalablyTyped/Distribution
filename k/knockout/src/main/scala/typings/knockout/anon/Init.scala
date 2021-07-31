package typings.knockout.anon

import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.MaybeSubscribable
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init extends StObject {
  
  def init(): BindingHandlerControlsDescendant
  
  def update(element: Node, valueAccessor: js.Function0[MaybeSubscribable[String]]): Unit
}
object Init {
  
  @scala.inline
  def apply(
    init: () => BindingHandlerControlsDescendant,
    update: (Node, js.Function0[MaybeSubscribable[String]]) => Unit
  ): Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Init]
  }
  
  @scala.inline
  implicit class InitMutableBuilder[Self <: Init] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => BindingHandlerControlsDescendant): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (Node, js.Function0[MaybeSubscribable[String]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
