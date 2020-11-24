package typings.jaegerClient.mod

import typings.jaegerClient.anon.Typeofprometheus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jaeger-client", "PrometheusMetricsFactory")
@js.native
class PrometheusMetricsFactory protected () extends js.Object {
  def this(client: Typeofprometheus, serviceName: String) = this()
  
  def createCounter(name: String, tags: js.Object): Counter = js.native
  
  def createGauge(name: String, tags: js.Object): Gauge = js.native
}
