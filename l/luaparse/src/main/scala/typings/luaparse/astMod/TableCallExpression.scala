package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCallExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.TableCallExpression] {
  
  var arguments: Expression = js.native
  
  var base: Expression = js.native
}
object TableCallExpression {
  
  @scala.inline
  def apply(
    arguments: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.TableCallExpression
  ): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCallExpression]
  }
  
  @scala.inline
  implicit class TableCallExpressionOps[Self <: TableCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArguments(value: Expression): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Expression): Self = this.set("base", value.asInstanceOf[js.Any])
  }
}
