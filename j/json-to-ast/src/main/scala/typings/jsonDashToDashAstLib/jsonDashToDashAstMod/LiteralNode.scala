package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralNode
  extends ASTNode
     with ValueNode {
  var raw: java.lang.String
  @JSName("type")
  var type_LiteralNode: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Literal
  var value: java.lang.String | scala.Double | scala.Boolean | scala.Null
}

object LiteralNode {
  @scala.inline
  def apply(
    raw: java.lang.String,
    `type`: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Literal,
    loc: Location = null,
    value: java.lang.String | scala.Double | scala.Boolean = null
  ): LiteralNode = {
    val __obj = js.Dynamic.literal(raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralNode]
  }
}

