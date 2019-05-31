package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayNode
  extends ASTNode
     with ValueNode {
  var children: js.Array[ValueNode]
  @JSName("type")
  var type_ArrayNode: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Array
}

object ArrayNode {
  @scala.inline
  def apply(
    children: js.Array[ValueNode],
    `type`: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Array,
    loc: Location = null
  ): ArrayNode = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ArrayNode]
  }
}

