package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MustacheStatement extends Node {
  
  var escaped: Boolean = js.native
  
  var hash: Hash = js.native
  
  var params: js.Array[Expression] = js.native
  
  var path: PathExpression | Literal = js.native
  
  var strip: StripFlags = js.native
  
  @JSName("type")
  var type_MustacheStatement: typings.handlebars.handlebarsStrings.MustacheStatement = js.native
}
object MustacheStatement {
  
  @scala.inline
  def apply(
    escaped: Boolean,
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression | Literal,
    strip: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.MustacheStatement
  ): MustacheStatement = {
    val __obj = js.Dynamic.literal(escaped = escaped.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheStatement]
  }
  
  @scala.inline
  implicit class MustacheStatementOps[Self <: MustacheStatement] (val x: Self) extends AnyVal {
    
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
    def setEscaped(value: Boolean): Self = this.set("escaped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: PathExpression | Literal): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrip(value: StripFlags): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.MustacheStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
