package typings.jsonDashToDashAst.jsonDashToDashAstMod

import typings.jsonDashToDashAst.jsonDashToDashAstStrings.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyNode extends ASTNode {
  var key: IdentifierNode
  @JSName("type")
  var type_PropertyNode: Property
  var value: ValueNode
}

object PropertyNode {
  @scala.inline
  def apply(key: IdentifierNode, `type`: Property, value: ValueNode, loc: Location = null): PropertyNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNode]
  }
}

