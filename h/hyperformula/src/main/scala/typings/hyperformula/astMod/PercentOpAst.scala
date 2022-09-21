package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.PERCENT_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentOpAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var `type`: PERCENT_OP
  
  var value: Ast
}
object PercentOpAst {
  
  inline def apply(`type`: PERCENT_OP, value: Ast): PercentOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentOpAst]
  }
  
  extension [Self <: PercentOpAst](x: Self) {
    
    inline def setType(value: PERCENT_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Ast): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
