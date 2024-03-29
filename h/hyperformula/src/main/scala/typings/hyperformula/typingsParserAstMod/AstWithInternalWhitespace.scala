package typings.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstWithInternalWhitespace
  extends StObject
     with AstWithWhitespace {
  
  var internalWhitespace: js.UndefOr[String] = js.undefined
}
object AstWithInternalWhitespace {
  
  inline def apply(): AstWithInternalWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AstWithInternalWhitespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AstWithInternalWhitespace] (val x: Self) extends AnyVal {
    
    inline def setInternalWhitespace(value: String): Self = StObject.set(x, "internalWhitespace", value.asInstanceOf[js.Any])
    
    inline def setInternalWhitespaceUndefined: Self = StObject.set(x, "internalWhitespace", js.undefined)
  }
}
