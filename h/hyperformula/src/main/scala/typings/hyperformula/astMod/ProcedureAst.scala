package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.FUNCTION_CALL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedureAst
  extends StObject
     with AstWithInternalWhitespace
     with Ast {
  
  var args: js.Array[Ast]
  
  var procedureName: String
  
  var `type`: FUNCTION_CALL
}
object ProcedureAst {
  
  inline def apply(args: js.Array[Ast], procedureName: String, `type`: FUNCTION_CALL): ProcedureAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], procedureName = procedureName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureAst]
  }
  
  extension [Self <: ProcedureAst](x: Self) {
    
    inline def setArgs(value: js.Array[Ast]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Ast*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setProcedureName(value: String): Self = StObject.set(x, "procedureName", value.asInstanceOf[js.Any])
    
    inline def setType(value: FUNCTION_CALL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
