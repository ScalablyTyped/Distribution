package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.modifiersRestrictPointerMod.RestrictState
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeEndSetStart extends StObject {
  
  def beforeEnd(arg: ModifierArg[RestrictState]): Unit | Point
  
  def set(arg: ModifierArg[RestrictState]): Any
  
  def start(arg: ModifierArg[RestrictState]): Unit
  
  def stop(arg: ModifierArg[RestrictState]): Unit
}
object BeforeEndSetStart {
  
  inline def apply(
    beforeEnd: ModifierArg[RestrictState] => Unit | Point,
    set: ModifierArg[RestrictState] => Any,
    start: ModifierArg[RestrictState] => Unit,
    stop: ModifierArg[RestrictState] => Unit
  ): BeforeEndSetStart = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[BeforeEndSetStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeforeEndSetStart] (val x: Self) extends AnyVal {
    
    inline def setBeforeEnd(value: ModifierArg[RestrictState] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[RestrictState] => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[RestrictState] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: ModifierArg[RestrictState] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
