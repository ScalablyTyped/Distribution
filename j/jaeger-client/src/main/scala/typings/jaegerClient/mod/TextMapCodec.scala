package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jaeger-client", "TextMapCodec")
@js.native
open class TextMapCodec protected ()
  extends StObject
     with Injector
     with Extractor {
  def this(options: TextMapCodecOptions) = this()
  
  /* CompleteClass */
  override def extract(carrier: Any): SpanContext | Null = js.native
  
  /* CompleteClass */
  override def inject(spanContext: SpanContext, carrier: Any): Unit = js.native
}
