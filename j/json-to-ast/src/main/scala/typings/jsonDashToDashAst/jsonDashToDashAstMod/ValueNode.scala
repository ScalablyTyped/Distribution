package typings.jsonDashToDashAst.jsonDashToDashAstMod

import typings.jsonDashToDashAst.jsonDashToDashAstStrings.Array
import typings.jsonDashToDashAst.jsonDashToDashAstStrings.Literal
import typings.jsonDashToDashAst.jsonDashToDashAstStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonDashToDashAst.jsonDashToDashAstMod.ObjectNode
  - typings.jsonDashToDashAst.jsonDashToDashAstMod.ArrayNode
  - typings.jsonDashToDashAst.jsonDashToDashAstMod.LiteralNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  def ObjectNode(children: js.Array[PropertyNode], `type`: Object, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ArrayNode(children: js.Array[ValueNode], `type`: Array, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def LiteralNode(raw: String, `type`: Literal, loc: Location = null, value: String | Double | Boolean = null): ValueNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

