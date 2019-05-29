package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory extends js.Object {
  def createCounter(name: java.lang.String, tags: js.Any): Counter
  def createGauge(name: java.lang.String, tags: js.Any): Gauge
  def createTimer(name: java.lang.String, tags: js.Any): Timer
}

object MetricsFactory {
  @scala.inline
  def apply(
    createCounter: (java.lang.String, js.Any) => Counter,
    createGauge: (java.lang.String, js.Any) => Gauge,
    createTimer: (java.lang.String, js.Any) => Timer
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal(createCounter = js.Any.fromFunction2(createCounter), createGauge = js.Any.fromFunction2(createGauge), createTimer = js.Any.fromFunction2(createTimer))
  
    __obj.asInstanceOf[MetricsFactory]
  }
}

