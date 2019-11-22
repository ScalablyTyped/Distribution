package typings.jaegerDashClient.jaegerDashClientMod

import typings.opentracing.opentracingMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "ZipkinB3TextMapCodec")
@js.native
class ZipkinB3TextMapCodec protected ()
  extends Injector
     with Extractor {
  def this(options: ZipkinB3TextMapCodecOptions) = this()
  /* CompleteClass */
  override def extract(carrier: js.Any): SpanContext | Null = js.native
  /* CompleteClass */
  override def inject(spanContext: SpanContext, carrier: js.Any): Unit = js.native
}

