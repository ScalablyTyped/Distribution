package typings.jaegerClient.mod

import typings.opentracing.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "JaegerTracer")
@js.native
class JaegerTracer () extends Tracer {
  def registerExtractor(format: String, extractor: Extractor): Unit = js.native
  def registerInjector(format: String, injector: Injector): Unit = js.native
}

