package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeEndSet[State /* <: ModifierState[Any, Any, Any] */, Result] extends StObject {
  
  def beforeEnd(arg: ModifierArg[State]): Unit | Point
  
  def set(arg: ModifierArg[State]): Result
  
  def start(arg: ModifierArg[State]): Unit
  
  def stop(arg: ModifierArg[State]): Unit
}
object BeforeEndSet {
  
  inline def apply[State /* <: ModifierState[Any, Any, Any] */, Result](
    beforeEnd: ModifierArg[State] => Unit | Point,
    set: ModifierArg[State] => Result,
    start: ModifierArg[State] => Unit,
    stop: ModifierArg[State] => Unit
  ): BeforeEndSet[State, Result] = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[BeforeEndSet[State, Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeforeEndSet[?, ?], State /* <: ModifierState[Any, Any, Any] */, Result] (val x: Self & (BeforeEndSet[State, Result])) extends AnyVal {
    
    inline def setBeforeEnd(value: ModifierArg[State] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[State] => Result): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[State] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: ModifierArg[State] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
