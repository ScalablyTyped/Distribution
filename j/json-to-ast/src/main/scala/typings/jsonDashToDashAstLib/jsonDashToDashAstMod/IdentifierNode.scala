package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierNode extends ASTNode {
  var raw: java.lang.String
  @JSName("type")
  var type_IdentifierNode: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Identifier
  var value: java.lang.String
}

object IdentifierNode {
  @scala.inline
  def apply(
    raw: java.lang.String,
    `type`: jsonDashToDashAstLib.jsonDashToDashAstLibStrings.Identifier,
    value: java.lang.String,
    loc: Location = null
  ): IdentifierNode = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IdentifierNode]
  }
}

