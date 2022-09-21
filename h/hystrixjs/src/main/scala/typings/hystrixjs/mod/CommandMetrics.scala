package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandMetrics extends StObject {
  
  def addExecutionTime(value: Double): Unit
  
  def decrementExecutionCount(): Unit
  
  def getCurrentExecutionCount(): Double
  
  def getExecutionTime(percentile: Any): Double
  
  def getHealthCounts(): HealthCounts
  
  def getRollingCount(`type`: Any): Double
  
  def incrementExecutionCount(): Unit
  
  def markFailure(): Unit
  
  def markRejected(): Unit
  
  def markShortCircuited(): Unit
  
  def markSuccess(): Unit
  
  def markTimeout(): Unit
  
  def reset(): Unit
}
object CommandMetrics {
  
  inline def apply(
    addExecutionTime: Double => Unit,
    decrementExecutionCount: () => Unit,
    getCurrentExecutionCount: () => Double,
    getExecutionTime: Any => Double,
    getHealthCounts: () => HealthCounts,
    getRollingCount: Any => Double,
    incrementExecutionCount: () => Unit,
    markFailure: () => Unit,
    markRejected: () => Unit,
    markShortCircuited: () => Unit,
    markSuccess: () => Unit,
    markTimeout: () => Unit,
    reset: () => Unit
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = js.Any.fromFunction1(addExecutionTime), decrementExecutionCount = js.Any.fromFunction0(decrementExecutionCount), getCurrentExecutionCount = js.Any.fromFunction0(getCurrentExecutionCount), getExecutionTime = js.Any.fromFunction1(getExecutionTime), getHealthCounts = js.Any.fromFunction0(getHealthCounts), getRollingCount = js.Any.fromFunction1(getRollingCount), incrementExecutionCount = js.Any.fromFunction0(incrementExecutionCount), markFailure = js.Any.fromFunction0(markFailure), markRejected = js.Any.fromFunction0(markRejected), markShortCircuited = js.Any.fromFunction0(markShortCircuited), markSuccess = js.Any.fromFunction0(markSuccess), markTimeout = js.Any.fromFunction0(markTimeout), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[CommandMetrics]
  }
  
  extension [Self <: CommandMetrics](x: Self) {
    
    inline def setAddExecutionTime(value: Double => Unit): Self = StObject.set(x, "addExecutionTime", js.Any.fromFunction1(value))
    
    inline def setDecrementExecutionCount(value: () => Unit): Self = StObject.set(x, "decrementExecutionCount", js.Any.fromFunction0(value))
    
    inline def setGetCurrentExecutionCount(value: () => Double): Self = StObject.set(x, "getCurrentExecutionCount", js.Any.fromFunction0(value))
    
    inline def setGetExecutionTime(value: Any => Double): Self = StObject.set(x, "getExecutionTime", js.Any.fromFunction1(value))
    
    inline def setGetHealthCounts(value: () => HealthCounts): Self = StObject.set(x, "getHealthCounts", js.Any.fromFunction0(value))
    
    inline def setGetRollingCount(value: Any => Double): Self = StObject.set(x, "getRollingCount", js.Any.fromFunction1(value))
    
    inline def setIncrementExecutionCount(value: () => Unit): Self = StObject.set(x, "incrementExecutionCount", js.Any.fromFunction0(value))
    
    inline def setMarkFailure(value: () => Unit): Self = StObject.set(x, "markFailure", js.Any.fromFunction0(value))
    
    inline def setMarkRejected(value: () => Unit): Self = StObject.set(x, "markRejected", js.Any.fromFunction0(value))
    
    inline def setMarkShortCircuited(value: () => Unit): Self = StObject.set(x, "markShortCircuited", js.Any.fromFunction0(value))
    
    inline def setMarkSuccess(value: () => Unit): Self = StObject.set(x, "markSuccess", js.Any.fromFunction0(value))
    
    inline def setMarkTimeout(value: () => Unit): Self = StObject.set(x, "markTimeout", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
