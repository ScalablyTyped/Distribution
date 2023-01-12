package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extractor extends StObject {
  
  def extract(carrier: Any): SpanContext | Null
}
object Extractor {
  
  inline def apply(extract: Any => SpanContext | Null): Extractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
    __obj.asInstanceOf[Extractor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extractor] (val x: Self) extends AnyVal {
    
    inline def setExtract(value: Any => SpanContext | Null): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
  }
}
