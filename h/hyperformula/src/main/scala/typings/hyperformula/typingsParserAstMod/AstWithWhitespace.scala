package typings.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstWithWhitespace extends StObject {
  
  var leadingWhitespace: js.UndefOr[String] = js.undefined
}
object AstWithWhitespace {
  
  inline def apply(): AstWithWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AstWithWhitespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AstWithWhitespace] (val x: Self) extends AnyVal {
    
    inline def setLeadingWhitespace(value: String): Self = StObject.set(x, "leadingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setLeadingWhitespaceUndefined: Self = StObject.set(x, "leadingWhitespace", js.undefined)
  }
}
