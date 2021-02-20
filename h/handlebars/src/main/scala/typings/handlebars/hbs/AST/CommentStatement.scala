package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
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
  implicit class CommentStatementMutableBuilder[Self <: CommentStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrip(value: StripFlags): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.CommentStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
