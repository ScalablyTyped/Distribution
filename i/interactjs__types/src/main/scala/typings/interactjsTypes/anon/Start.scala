package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var beforeEnd: js.UndefOr[js.Function1[/* arg */ ModifierArg[Any], Point | Unit]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* arg */ ModifierArg[Any], Any]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* arg */ ModifierArg[Any], Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function1[/* arg */ ModifierArg[Any], Unit]] = js.undefined
}
object Start {
  
  inline def apply(): Start = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    inline def setBeforeEnd(value: /* arg */ ModifierArg[Any] => Point | Unit): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setBeforeEndUndefined: Self = StObject.set(x, "beforeEnd", js.undefined)
    
    inline def setSet(value: /* arg */ ModifierArg[Any] => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setStart(value: /* arg */ ModifierArg[Any] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: /* arg */ ModifierArg[Any] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
