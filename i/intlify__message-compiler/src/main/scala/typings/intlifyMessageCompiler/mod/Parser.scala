package typings.intlifyMessageCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parser extends StObject {
  
  def parse(source: String): ResourceNode
}
object Parser {
  
  inline def apply(parse: String => ResourceNode): Parser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
    
    inline def setParse(value: String => ResourceNode): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
