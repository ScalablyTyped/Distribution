package typings.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryOpAst
  extends StObject
     with AstWithWhitespace {
  
  var left: Ast
  
  var right: Ast
}
object BinaryOpAst {
  
  inline def apply(left: Ast, right: Ast): BinaryOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryOpAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryOpAst] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Ast): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Ast): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
