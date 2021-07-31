package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringCallExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.StringCallExpression]
     with Expression {
  
  var argument: Expression
  
  var base: Expression
}
object StringCallExpression {
  
  @scala.inline
  def apply(argument: Expression, base: Expression): StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringCallExpression")
    __obj.asInstanceOf[StringCallExpression]
  }
  
  @scala.inline
  implicit class StringCallExpressionMutableBuilder[Self <: StringCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
