package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathExpression extends Node {
  var data: scala.Boolean
  var depth: scala.Double
  var original: java.lang.String
  var parts: js.Array[java.lang.String]
}

object PathExpression {
  @scala.inline
  def apply(
    data: scala.Boolean,
    depth: scala.Double,
    loc: SourceLocation,
    original: java.lang.String,
    parts: js.Array[java.lang.String],
    `type`: java.lang.String
  ): PathExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("parts")(parts)
    __obj.asInstanceOf[PathExpression]
  }
}

