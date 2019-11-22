package typings.jaegerDashClient.jaegerDashClientMod

import typings.opentracing.libTracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "JaegerTracer")
@js.native
class JaegerTracer () extends Tracer {
  def registerExtractor(format: String, extractor: Extractor): Unit = js.native
  def registerInjector(format: String, injector: Injector): Unit = js.native
}

