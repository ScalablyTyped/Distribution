package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathExpression extends Node {
  var data: Boolean
  var depth: Double
  var original: String
  var parts: js.Array[String]
  @JSName("type")
  var type_PathExpression: typings.handlebars.handlebarsStrings.PathExpression
}

object PathExpression {
  @scala.inline
  def apply(
    data: Boolean,
    depth: Double,
    loc: SourceLocation,
    original: String,
    parts: js.Array[String],
    `type`: typings.handlebars.handlebarsStrings.PathExpression
  ): PathExpression = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathExpression]
  }
}

