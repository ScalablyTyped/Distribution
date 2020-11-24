package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extractor extends js.Object {
  
  def extract(carrier: js.Any): SpanContext | Null = js.native
}
object Extractor {
  
  @scala.inline
  def apply(extract: js.Any => SpanContext | Null): Extractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
    __obj.asInstanceOf[Extractor]
  }
  
  @scala.inline
  implicit class ExtractorOps[Self <: Extractor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtract(value: js.Any => SpanContext | Null): Self = this.set("extract", js.Any.fromFunction1(value))
  }
}
