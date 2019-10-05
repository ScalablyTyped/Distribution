package typings.jaegerDashClient.jaegerDashClientMod

import typings.opentracing.opentracingMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "initTracer")
@js.native
object initTracer extends js.Object {
  def apply(tracingConfig: TracingConfig, tracingOptions: TracingOptions): Tracer = js.native
}

