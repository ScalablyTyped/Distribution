package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extractor extends StObject {
  
  def extract(carrier: js.Any): SpanContext | Null
}
object Extractor {
  
  @scala.inline
  def apply(extract: js.Any => SpanContext | Null): Extractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
    __obj.asInstanceOf[Extractor]
  }
  
  @scala.inline
  implicit class ExtractorMutableBuilder[Self <: Extractor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtract(value: js.Any => SpanContext | Null): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
  }
}
