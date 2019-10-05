package typings.jaegerDashClient.jaegerDashClientMod

import typings.opentracing.opentracingMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "initTracerFromEnv")
@js.native
object initTracerFromEnv extends js.Object {
  def apply(tracingConfig: TracingConfig, tracingOptions: TracingOptions): Tracer = js.native
}

