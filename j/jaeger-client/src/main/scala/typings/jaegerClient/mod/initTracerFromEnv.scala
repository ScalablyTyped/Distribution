package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "initTracerFromEnv")
@js.native
object initTracerFromEnv extends js.Object {
  def apply(tracingConfig: TracingConfig, tracingOptions: TracingOptions): JaegerTracer = js.native
}

