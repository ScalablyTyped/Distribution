package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircuitFactory_ extends StObject {
  
  def getCache(): js.Array[CircuitBreaker]
  
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker
  
  def resetCache(): Unit
}
object CircuitFactory_ {
  
  inline def apply(
    getCache: () => js.Array[CircuitBreaker],
    getOrCreate: CirctuiBreakerConfig => CircuitBreaker,
    resetCache: () => Unit
  ): CircuitFactory_ = {
    val __obj = js.Dynamic.literal(getCache = js.Any.fromFunction0(getCache), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
    __obj.asInstanceOf[CircuitFactory_]
  }
  
  extension [Self <: CircuitFactory_](x: Self) {
    
    inline def setGetCache(value: () => js.Array[CircuitBreaker]): Self = StObject.set(x, "getCache", js.Any.fromFunction0(value))
    
    inline def setGetOrCreate(value: CirctuiBreakerConfig => CircuitBreaker): Self = StObject.set(x, "getOrCreate", js.Any.fromFunction1(value))
    
    inline def setResetCache(value: () => Unit): Self = StObject.set(x, "resetCache", js.Any.fromFunction0(value))
  }
}
