package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayNode
  extends ASTNode
     with ValueNode {
  var children: js.Array[ValueNode]
  @JSName("type")
  var type_ArrayNode: Array
}

object ArrayNode {
  @scala.inline
  def apply(children: js.Array[ValueNode], `type`: Array, loc: Location = null): ArrayNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayNode]
  }
}

