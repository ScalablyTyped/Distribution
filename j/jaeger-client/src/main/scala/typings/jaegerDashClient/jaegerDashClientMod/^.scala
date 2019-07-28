package typings.jaegerDashClient.jaegerDashClientMod

import typings.opentracing.opentracingMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def initTracer(tracingConfig: TracingConfig, tracingOptions: TracingOptions): Tracer = js.native
  def initTracerFromEnv(tracingConfig: TracingConfig, tracingOptions: TracingOptions): Tracer = js.native
}

