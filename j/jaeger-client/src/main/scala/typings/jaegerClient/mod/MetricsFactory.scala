package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsFactory extends StObject {
  
  def createCounter(name: String, tags: Any): Counter
  
  def createGauge(name: String, tags: Any): Gauge
  
  def createTimer(name: String, tags: Any): Timer
}
object MetricsFactory {
  
  inline def apply(
    createCounter: (String, Any) => Counter,
    createGauge: (String, Any) => Gauge,
    createTimer: (String, Any) => Timer
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal(createCounter = js.Any.fromFunction2(createCounter), createGauge = js.Any.fromFunction2(createGauge), createTimer = js.Any.fromFunction2(createTimer))
    __obj.asInstanceOf[MetricsFactory]
  }
  
  extension [Self <: MetricsFactory](x: Self) {
    
    inline def setCreateCounter(value: (String, Any) => Counter): Self = StObject.set(x, "createCounter", js.Any.fromFunction2(value))
    
    inline def setCreateGauge(value: (String, Any) => Gauge): Self = StObject.set(x, "createGauge", js.Any.fromFunction2(value))
    
    inline def setCreateTimer(value: (String, Any) => Timer): Self = StObject.set(x, "createTimer", js.Any.fromFunction2(value))
  }
}
