package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "PrometheusMetricsFactory")
@js.native
class PrometheusMetricsFactory protected () extends js.Object {
  def this(client: jaegerDashClientLib.Typeofprometheus, serviceName: java.lang.String) = this()
  def createCounter(name: java.lang.String, tags: js.Object): Counter = js.native
  def createGauge(name: java.lang.String, tags: js.Object): Gauge = js.native
}

