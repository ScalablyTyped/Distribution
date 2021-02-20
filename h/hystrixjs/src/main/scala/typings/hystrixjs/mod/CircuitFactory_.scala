package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircuitFactory_ extends StObject {
  
  def getCache(): js.Array[CircuitBreaker] = js.native
  
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker = js.native
  
  def resetCache(): Unit = js.native
}
object CircuitFactory_ {
  
  @scala.inline
  def apply(
    getCache: () => js.Array[CircuitBreaker],
    getOrCreate: CirctuiBreakerConfig => CircuitBreaker,
    resetCache: () => Unit
  ): CircuitFactory_ = {
    val __obj = js.Dynamic.literal(getCache = js.Any.fromFunction0(getCache), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
    __obj.asInstanceOf[CircuitFactory_]
  }
  
  @scala.inline
  implicit class CircuitFactory_MutableBuilder[Self <: CircuitFactory_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCache(value: () => js.Array[CircuitBreaker]): Self = StObject.set(x, "getCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrCreate(value: CirctuiBreakerConfig => CircuitBreaker): Self = StObject.set(x, "getOrCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCache(value: () => Unit): Self = StObject.set(x, "resetCache", js.Any.fromFunction0(value))
  }
}
