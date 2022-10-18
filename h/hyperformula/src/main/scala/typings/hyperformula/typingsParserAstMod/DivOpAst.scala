package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.DIV_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: DIV_OP
}
object DivOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: DIV_OP): DivOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivOpAst]
  }
  
  extension [Self <: DivOpAst](x: Self) {
    
    inline def setType(value: DIV_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
