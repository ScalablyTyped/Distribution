package typings.jexl.anon

import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.BinaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left
  extends StObject
     with Ast {
  
  var left: Ast
  
  var operator: String
  
  var right: Ast
  
  var `type`: BinaryExpression
}
object Left {
  
  inline def apply(left: Ast, operator: String, right: Ast): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Ast): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Ast): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
