package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubExpression extends Node {
  
  var hash: Hash = js.native
  
  var params: js.Array[Expression] = js.native
  
  var path: PathExpression = js.native
  
  @JSName("type")
  var type_SubExpression: typings.handlebars.handlebarsStrings.SubExpression = js.native
}
object SubExpression {
  
  @scala.inline
  def apply(
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression,
    `type`: typings.handlebars.handlebarsStrings.SubExpression
  ): SubExpression = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubExpression]
  }
  
  @scala.inline
  implicit class SubExpressionOps[Self <: SubExpression] (val x: Self) extends AnyVal {
    
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
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: PathExpression): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.SubExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
