package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullLiteral extends Node {
  @JSName("type")
  var type_NullLiteral: typings.handlebars.handlebarsStrings.NullLiteral = js.native
}

object NullLiteral {
  @scala.inline
  def apply(loc: SourceLocation, `type`: typings.handlebars.handlebarsStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
  @scala.inline
  implicit class NullLiteralOps[Self <: NullLiteral] (val x: Self) extends AnyVal {
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
    def setType(value: typings.handlebars.handlebarsStrings.NullLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

