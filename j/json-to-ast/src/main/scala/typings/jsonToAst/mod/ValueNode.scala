package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Array
import typings.jsonToAst.jsonToAstStrings.Literal
import typings.jsonToAst.jsonToAstStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonToAst.mod.ObjectNode
  - typings.jsonToAst.mod.ArrayNode
  - typings.jsonToAst.mod.LiteralNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  def ObjectNode(children: js.Array[PropertyNode], `type`: Object): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ArrayNode(children: js.Array[ValueNode], `type`: Array): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def LiteralNode(raw: String, `type`: Literal): ValueNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

