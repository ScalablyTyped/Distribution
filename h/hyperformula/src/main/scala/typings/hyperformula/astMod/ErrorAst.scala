package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.ERROR
import typings.hyperformula.cellMod.CellError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var error: CellError
  
  var `type`: ERROR
}
object ErrorAst {
  
  inline def apply(error: CellError, `type`: ERROR): ErrorAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorAst]
  }
  
  extension [Self <: ErrorAst](x: Self) {
    
    inline def setError(value: CellError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
