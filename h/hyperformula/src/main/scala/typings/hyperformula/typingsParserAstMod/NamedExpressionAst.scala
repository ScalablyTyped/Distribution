package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.NAMED_EXPRESSION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedExpressionAst
  extends StObject
     with AstWithInternalWhitespace
     with Ast {
  
  var expressionName: String
  
  var `type`: NAMED_EXPRESSION
}
object NamedExpressionAst {
  
  inline def apply(expressionName: String, `type`: NAMED_EXPRESSION): NamedExpressionAst = {
    val __obj = js.Dynamic.literal(expressionName = expressionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedExpressionAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedExpressionAst] (val x: Self) extends AnyVal {
    
    inline def setExpressionName(value: String): Self = StObject.set(x, "expressionName", value.asInstanceOf[js.Any])
    
    inline def setType(value: NAMED_EXPRESSION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
