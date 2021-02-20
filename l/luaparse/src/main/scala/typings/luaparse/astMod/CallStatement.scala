package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.CallStatement] {
  
  var expression: CallExpression | StringCallExpression | TableCallExpression = js.native
}
object CallStatement {
  
  @scala.inline
  def apply(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typings.luaparse.luaparseStrings.CallStatement
  ): CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStatement]
  }
  
  @scala.inline
  implicit class CallStatementMutableBuilder[Self <: CallStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: CallExpression | StringCallExpression | TableCallExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
