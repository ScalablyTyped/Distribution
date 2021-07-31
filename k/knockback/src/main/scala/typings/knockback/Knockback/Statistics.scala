package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  def addModelEvent(event: String): js.Any
  
  def clear(): js.Any
  
  def modelEventsStatsString(): js.Any
  
  def register(key: String, obj: js.Any): js.Any
  
  def registeredCount(`type`: js.Any): Double
  
  def registeredStatsString(success_message: String): String
  
  def unregister(key: String, obj: js.Any): js.Any
}
object Statistics {
  
  @scala.inline
  def apply(
    addModelEvent: String => js.Any,
    clear: () => js.Any,
    modelEventsStatsString: () => js.Any,
    register: (String, js.Any) => js.Any,
    registeredCount: js.Any => Double,
    registeredStatsString: String => String,
    unregister: (String, js.Any) => js.Any
  ): Statistics = {
    val __obj = js.Dynamic.literal(addModelEvent = js.Any.fromFunction1(addModelEvent), clear = js.Any.fromFunction0(clear), modelEventsStatsString = js.Any.fromFunction0(modelEventsStatsString), register = js.Any.fromFunction2(register), registeredCount = js.Any.fromFunction1(registeredCount), registeredStatsString = js.Any.fromFunction1(registeredStatsString), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsMutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddModelEvent(value: String => js.Any): Self = StObject.set(x, "addModelEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => js.Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModelEventsStatsString(value: () => js.Any): Self = StObject.set(x, "modelEventsStatsString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: (String, js.Any) => js.Any): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisteredCount(value: js.Any => Double): Self = StObject.set(x, "registeredCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisteredStatsString(value: String => String): Self = StObject.set(x, "registeredStatsString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: (String, js.Any) => js.Any): Self = StObject.set(x, "unregister", js.Any.fromFunction2(value))
  }
}
