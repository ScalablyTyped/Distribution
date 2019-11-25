package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentStatement extends Node {
  var strip: StripFlags
  @JSName("type")
  var type_CommentStatement: typings.handlebars.handlebarsStrings.CommentStatement
  var value: String
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
}

