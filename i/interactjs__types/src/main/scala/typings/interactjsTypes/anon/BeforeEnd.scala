package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeEnd[State /* <: ModifierState[Any, Any, Any] */, Result] extends StObject {
  
  var beforeEnd: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Point | Unit]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Result]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Unit]] = js.undefined
}
object BeforeEnd {
  
  inline def apply[State /* <: ModifierState[Any, Any, Any] */, Result](): BeforeEnd[State, Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeEnd[State, Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeforeEnd[?, ?], State /* <: ModifierState[Any, Any, Any] */, Result] (val x: Self & (BeforeEnd[State, Result])) extends AnyVal {
    
    inline def setBeforeEnd(value: /* arg */ ModifierArg[State] => Point | Unit): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setBeforeEndUndefined: Self = StObject.set(x, "beforeEnd", js.undefined)
    
    inline def setSet(value: /* arg */ ModifierArg[State] => Result): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setStart(value: /* arg */ ModifierArg[State] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: /* arg */ ModifierArg[State] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
