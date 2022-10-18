package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.PLUS_UNARY_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlusUnaryOpAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var `type`: PLUS_UNARY_OP
  
  var value: Ast
}
object PlusUnaryOpAst {
  
  inline def apply(`type`: PLUS_UNARY_OP, value: Ast): PlusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusUnaryOpAst]
  }
  
  extension [Self <: PlusUnaryOpAst](x: Self) {
    
    inline def setType(value: PLUS_UNARY_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Ast): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
