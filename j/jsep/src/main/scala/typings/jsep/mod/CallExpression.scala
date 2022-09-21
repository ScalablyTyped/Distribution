package typings.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression
  extends StObject
     with Expression
     with CoreExpression {
  
  var arguments: js.Array[Expression]
  
  var callee: Expression
  
  @JSName("type")
  var type_CallExpression: typings.jsep.jsepStrings.CallExpression
}
object CallExpression {
  
  inline def apply(arguments: js.Array[Expression], callee: Expression): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[CallExpression]
  }
  
  extension [Self <: CallExpression](x: Self) {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.jsep.jsepStrings.CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
