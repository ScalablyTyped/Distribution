package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.NOT_EQUAL_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotEqualOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: NOT_EQUAL_OP
}
object NotEqualOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: NOT_EQUAL_OP): NotEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotEqualOpAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotEqualOpAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: NOT_EQUAL_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
