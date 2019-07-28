package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory extends js.Object {
  def createCounter(name: String, tags: js.Any): Counter
  def createGauge(name: String, tags: js.Any): Gauge
  def createTimer(name: String, tags: js.Any): Timer
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
}

