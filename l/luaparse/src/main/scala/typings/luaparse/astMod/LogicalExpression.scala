package typings.luaparse.astMod

import typings.luaparse.luaparseStrings.and
import typings.luaparse.luaparseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.LogicalExpression]
     with Expression {
  
  var left: Expression
  
  var operator: or | and
  
  var right: Expression
}
object LogicalExpression {
  
  @scala.inline
  def apply(left: Expression, operator: or | and, right: Expression): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[LogicalExpression]
  }
  
  @scala.inline
  implicit class LogicalExpressionMutableBuilder[Self <: LogicalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: or | and): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
