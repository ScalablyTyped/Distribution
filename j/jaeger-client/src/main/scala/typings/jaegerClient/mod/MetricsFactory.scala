package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsFactory extends js.Object {
  
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
  implicit class MetricsFactoryOps[Self <: MetricsFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateCounter(value: (String, js.Any) => Counter): Self = this.set("createCounter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateGauge(value: (String, js.Any) => Gauge): Self = this.set("createGauge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTimer(value: (String, js.Any) => Timer): Self = this.set("createTimer", js.Any.fromFunction2(value))
  }
}
