package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsParserAstMod.AstNodeType.ERROR_WITH_RAW_INPUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorWithRawInputAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var error: CellError
  
  var rawInput: String
  
  var `type`: ERROR_WITH_RAW_INPUT
}
object ErrorWithRawInputAst {
  
  inline def apply(error: CellError, rawInput: String, `type`: ERROR_WITH_RAW_INPUT): ErrorWithRawInputAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithRawInputAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorWithRawInputAst] (val x: Self) extends AnyVal {
    
    inline def setError(value: CellError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setRawInput(value: String): Self = StObject.set(x, "rawInput", value.asInstanceOf[js.Any])
    
    inline def setType(value: ERROR_WITH_RAW_INPUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
