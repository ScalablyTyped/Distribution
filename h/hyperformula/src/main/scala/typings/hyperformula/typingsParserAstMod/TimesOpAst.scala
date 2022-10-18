package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.TIMES_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimesOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: TIMES_OP
}
object TimesOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: TIMES_OP): TimesOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimesOpAst]
  }
  
  extension [Self <: TimesOpAst](x: Self) {
    
    inline def setType(value: TIMES_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
