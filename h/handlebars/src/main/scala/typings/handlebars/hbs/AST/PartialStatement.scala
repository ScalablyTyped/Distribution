package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialStatement extends Node {
  
  var hash: Hash = js.native
  
  var indent: String = js.native
  
  var name: PathExpression | SubExpression = js.native
  
  var params: js.Array[Expression] = js.native
  
  var strip: StripFlags = js.native
  
  @JSName("type")
  var type_PartialStatement: typings.handlebars.handlebarsStrings.PartialStatement = js.native
}
object PartialStatement {
  
  @scala.inline
  def apply(
    hash: Hash,
    indent: String,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    params: js.Array[Expression],
    strip: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.PartialStatement
  ): PartialStatement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatement]
  }
  
  @scala.inline
  implicit class PartialStatementOps[Self <: PartialStatement] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PathExpression | SubExpression): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrip(value: StripFlags): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.PartialStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
