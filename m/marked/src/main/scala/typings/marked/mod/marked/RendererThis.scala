package typings.marked.mod.marked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererThis extends StObject {
  
  var parser: Parser_
}
object RendererThis {
  
  inline def apply(parser: Parser_): RendererThis = {
    val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererThis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererThis] (val x: Self) extends AnyVal {
    
    inline def setParser(value: Parser_): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
  }
}
