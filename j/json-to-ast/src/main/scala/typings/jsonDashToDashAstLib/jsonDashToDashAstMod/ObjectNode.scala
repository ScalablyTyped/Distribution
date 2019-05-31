package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectNode
  extends ASTNode
     with ValueNode {
  var children: js.Array[PropertyNode]
  @JSName("type")
  var type_ObjectNode: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Object
}

object ObjectNode {
  @scala.inline
  def apply(
    children: js.Array[PropertyNode],
    `type`: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Object,
    loc: Location = null
  ): ObjectNode = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectNode]
  }
}

