package typings.luaparse.libAstMod

import typings.luaparse.luaparseStrings.Numbersign
import typings.luaparse.luaparseStrings.Tilde
import typings.luaparse.luaparseStrings.`-_`
import typings.luaparse.luaparseStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.UnaryExpression]
     with Expression {
  
  var argument: Expression
  
  var operator: not | `-_` | Tilde | Numbersign
}
object UnaryExpression {
  
  inline def apply(argument: Expression, operator: not | `-_` | Tilde | Numbersign): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnaryExpression] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: not | `-_` | Tilde | Numbersign): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
