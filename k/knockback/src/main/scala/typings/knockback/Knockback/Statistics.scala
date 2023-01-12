package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  def addModelEvent(event: String): Any
  
  def clear(): Any
  
  def modelEventsStatsString(): Any
  
  def register(key: String, obj: Any): Any
  
  def registeredCount(`type`: Any): Double
  
  def registeredStatsString(success_message: String): String
  
  def unregister(key: String, obj: Any): Any
}
object Statistics {
  
  inline def apply(
    addModelEvent: String => Any,
    clear: () => Any,
    modelEventsStatsString: () => Any,
    register: (String, Any) => Any,
    registeredCount: Any => Double,
    registeredStatsString: String => String,
    unregister: (String, Any) => Any
  ): Statistics = {
    val __obj = js.Dynamic.literal(addModelEvent = js.Any.fromFunction1(addModelEvent), clear = js.Any.fromFunction0(clear), modelEventsStatsString = js.Any.fromFunction0(modelEventsStatsString), register = js.Any.fromFunction2(register), registeredCount = js.Any.fromFunction1(registeredCount), registeredStatsString = js.Any.fromFunction1(registeredStatsString), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    inline def setAddModelEvent(value: String => Any): Self = StObject.set(x, "addModelEvent", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setModelEventsStatsString(value: () => Any): Self = StObject.set(x, "modelEventsStatsString", js.Any.fromFunction0(value))
    
    inline def setRegister(value: (String, Any) => Any): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    inline def setRegisteredCount(value: Any => Double): Self = StObject.set(x, "registeredCount", js.Any.fromFunction1(value))
    
    inline def setRegisteredStatsString(value: String => String): Self = StObject.set(x, "registeredStatsString", js.Any.fromFunction1(value))
    
    inline def setUnregister(value: (String, Any) => Any): Self = StObject.set(x, "unregister", js.Any.fromFunction2(value))
  }
}
