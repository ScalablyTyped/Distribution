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
    val __obj = js.Dynamic.literal(data = data, depth = depth, loc = loc, original = original, parts = parts)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PathExpression]
  }
}

