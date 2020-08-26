package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierNode extends ASTNode {
  var raw: String = js.native
  @JSName("type")
  var type_IdentifierNode: Identifier = js.native
  var value: String = js.native
}

object IdentifierNode {
  @scala.inline
  def apply(raw: String, `type`: Identifier, value: String): IdentifierNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierNode]
  }
  @scala.inline
  implicit class IdentifierNodeOps[Self <: IdentifierNode] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Identifier): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

