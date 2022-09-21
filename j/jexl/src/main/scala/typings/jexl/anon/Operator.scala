package typings.jexl.anon

import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.UnaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator
  extends StObject
     with Ast {
  
  var operator: String
  
  var right: Ast
  
  var `type`: UnaryExpression
}
object Operator {
  
  inline def apply(operator: String, right: Ast): Operator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[Operator]
  }
  
  extension [Self <: Operator](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Ast): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
