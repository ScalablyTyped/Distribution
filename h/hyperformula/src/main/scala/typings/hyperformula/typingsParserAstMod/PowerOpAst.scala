package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.POWER_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: POWER_OP
}
object PowerOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: POWER_OP): PowerOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerOpAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PowerOpAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: POWER_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
