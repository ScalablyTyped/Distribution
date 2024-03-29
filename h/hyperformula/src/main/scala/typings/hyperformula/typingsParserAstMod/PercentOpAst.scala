package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.PERCENT_OP
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PercentOpAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: PERCENT_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Ast): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
