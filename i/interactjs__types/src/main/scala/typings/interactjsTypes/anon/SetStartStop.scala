package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesState
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStartStop extends StObject {
  
  def beforeEnd(arg: ModifierArg[RestrictEdgesState]): Unit | Point
  
  def set(arg: ModifierArg[RestrictEdgesState]): Unit
  
  def start(arg: ModifierArg[RestrictEdgesState]): Unit
  
  def stop(arg: ModifierArg[RestrictEdgesState]): Unit
}
object SetStartStop {
  
  inline def apply(
    beforeEnd: ModifierArg[RestrictEdgesState] => Unit | Point,
    set: ModifierArg[RestrictEdgesState] => Unit,
    start: ModifierArg[RestrictEdgesState] => Unit,
    stop: ModifierArg[RestrictEdgesState] => Unit
  ): SetStartStop = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[SetStartStop]
  }
  
  extension [Self <: SetStartStop](x: Self) {
    
    inline def setBeforeEnd(value: ModifierArg[RestrictEdgesState] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[RestrictEdgesState] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[RestrictEdgesState] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: ModifierArg[RestrictEdgesState] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
