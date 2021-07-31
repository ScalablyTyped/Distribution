package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jaeger-client", "ZipkinB3TextMapCodec")
@js.native
class ZipkinB3TextMapCodec protected ()
  extends StObject
     with Injector
     with Extractor {
  def this(options: ZipkinB3TextMapCodecOptions) = this()
  
  /* CompleteClass */
  override def extract(carrier: js.Any): SpanContext | Null = js.native
  
  /* CompleteClass */
  override def inject(spanContext: SpanContext, carrier: js.Any): Unit = js.native
}
