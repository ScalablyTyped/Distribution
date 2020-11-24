package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentStatement extends Node {
  
  var strip: StripFlags = js.native
  
  @JSName("type")
  var type_CommentStatement: typings.handlebars.handlebarsStrings.CommentStatement = js.native
  
  var value: String = js.native
}
object CommentStatement {
  
  @scala.inline
  def apply(
    loc: SourceLocation,
    strip: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.CommentStatement,
    value: String
  ): CommentStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentStatement]
  }
  
  @scala.inline
  implicit class CommentStatementOps[Self <: CommentStatement] (val x: Self) extends AnyVal {
    
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
    def setStrip(value: StripFlags): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.CommentStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
