package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsFactory extends StObject {
  
  def createCounter(name: String, tags: js.Any): Counter
  
  def createGauge(name: String, tags: js.Any): Gauge
  
  def createTimer(name: String, tags: js.Any): Timer
}
object MetricsFactory {
  
  inline def apply(
    createCounter: (String, js.Any) => Counter,
    createGauge: (String, js.Any) => Gauge,
    createTimer: (String, js.Any) => Timer
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal(createCounter = js.Any.fromFunction2(createCounter), createGauge = js.Any.fromFunction2(createGauge), createTimer = js.Any.fromFunction2(createTimer))
    __obj.asInstanceOf[MetricsFactory]
  }
  
  extension [Self <: MetricsFactory](x: Self) {
    
    inline def setCreateCounter(value: (String, js.Any) => Counter): Self = StObject.set(x, "createCounter", js.Any.fromFunction2(value))
    
    inline def setCreateGauge(value: (String, js.Any) => Gauge): Self = StObject.set(x, "createGauge", js.Any.fromFunction2(value))
    
    inline def setCreateTimer(value: (String, js.Any) => Timer): Self = StObject.set(x, "createTimer", js.Any.fromFunction2(value))
  }
}
