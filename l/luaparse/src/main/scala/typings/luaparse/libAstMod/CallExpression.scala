package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.CallExpression]
     with Expression {
  
  var arguments: js.Array[Expression]
  
  var base: Expression
}
object CallExpression {
  
  inline def apply(arguments: js.Array[Expression], base: Expression): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[CallExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallExpression] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
