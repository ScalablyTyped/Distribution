package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralNode
  extends ASTNode
     with ValueNode {
  var raw: String
  @JSName("type")
  var type_LiteralNode: Literal
  var value: String | Double | Boolean | Null
}

object LiteralNode {
  @scala.inline
  def apply(raw: String, `type`: Literal, loc: Location = null, value: String | Double | Boolean = null): LiteralNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralNode]
  }
}

