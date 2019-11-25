package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentStatement extends Node {
  var original: StripFlags
  @JSName("type")
  var type_ContentStatement: typings.handlebars.handlebarsStrings.ContentStatement
  var value: String
}

object ContentStatement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    original: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.ContentStatement,
    value: String
  ): ContentStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStatement]
  }
}

