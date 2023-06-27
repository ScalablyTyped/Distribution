package typings.lezerMarkdown.distMarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineParser extends StObject {
  
  var after: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var name: String
  
  def parse(cx: InlineContext, next: Double, pos: Double): Double
}
object InlineParser {
  
  inline def apply(name: String, parse: (InlineContext, Double, Double) => Double): InlineParser = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction3(parse))
    __obj.asInstanceOf[InlineParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineParser] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: (InlineContext, Double, Double) => Double): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
  }
}
