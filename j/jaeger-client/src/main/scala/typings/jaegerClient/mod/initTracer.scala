package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "initTracer")
@js.native
object initTracer extends js.Object {
  def apply(tracingConfig: TracingConfig, tracingOptions: TracingOptions): JaegerTracer = js.native
}

