package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCallExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.TableCallExpression]
     with Expression {
  
  var arguments: Expression
  
  var base: Expression
}
object TableCallExpression {
  
  @scala.inline
  def apply(arguments: Expression, base: Expression): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableCallExpression")
    __obj.asInstanceOf[TableCallExpression]
  }
  
  @scala.inline
  implicit class TableCallExpressionMutableBuilder[Self <: TableCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: Expression): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
