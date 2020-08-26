package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathExpression extends Node {
  var data: Boolean = js.native
  var depth: Double = js.native
  var original: String = js.native
  var parts: js.Array[String] = js.native
  @JSName("type")
  var type_PathExpression: typings.handlebars.handlebarsStrings.PathExpression = js.native
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
  @scala.inline
  implicit class PathExpressionOps[Self <: PathExpression] (val x: Self) extends AnyVal {
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
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartsVarargs(value: String*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[String]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.PathExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

