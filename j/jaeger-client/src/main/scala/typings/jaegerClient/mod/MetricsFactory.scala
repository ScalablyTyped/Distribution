package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsFactory extends StObject {
  
  def createCounter(name: String, tags: js.Any): Counter = js.native
  
  def createGauge(name: String, tags: js.Any): Gauge = js.native
  
  def createTimer(name: String, tags: js.Any): Timer = js.native
}
object MetricsFactory {
  
  @scala.inline
  def apply(
    createCounter: (String, js.Any) => Counter,
    createGauge: (String, js.Any) => Gauge,
    createTimer: (String, js.Any) => Timer
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal(createCounter = js.Any.fromFunction2(createCounter), createGauge = js.Any.fromFunction2(createGauge), createTimer = js.Any.fromFunction2(createTimer))
    __obj.asInstanceOf[MetricsFactory]
  }
  
  @scala.inline
  implicit class MetricsFactoryMutableBuilder[Self <: MetricsFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateCounter(value: (String, js.Any) => Counter): Self = StObject.set(x, "createCounter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateGauge(value: (String, js.Any) => Gauge): Self = StObject.set(x, "createGauge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTimer(value: (String, js.Any) => Timer): Self = StObject.set(x, "createTimer", js.Any.fromFunction2(value))
  }
}
