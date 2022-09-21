package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.EQUALS_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqualsOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: EQUALS_OP
}
object EqualsOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: EQUALS_OP): EqualsOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualsOpAst]
  }
  
  extension [Self <: EqualsOpAst](x: Self) {
    
    inline def setType(value: EQUALS_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
