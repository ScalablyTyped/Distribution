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
  
  extension [Self <: RendererThis](x: Self) {
    
    inline def setParser(value: Parser_): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
  }
}
