package typings.jsonDashToDashAst.jsonDashToDashAstMod

import typings.jsonDashToDashAst.jsonDashToDashAstStrings.Literal
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
    val __obj = js.Dynamic.literal(raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralNode]
  }
}

