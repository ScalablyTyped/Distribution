package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.CONCATENATE_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenateOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: CONCATENATE_OP
}
object ConcatenateOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: CONCATENATE_OP): ConcatenateOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenateOpAst]
  }
  
  extension [Self <: ConcatenateOpAst](x: Self) {
    
    inline def setType(value: CONCATENATE_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
