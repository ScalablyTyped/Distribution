package typings.jsonDashToDashAst.jsonDashToDashAstMod

import typings.jsonDashToDashAst.jsonDashToDashAstStrings.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierNode extends ASTNode {
  var raw: String
  @JSName("type")
  var type_IdentifierNode: Identifier
  var value: String
}

object IdentifierNode {
  @scala.inline
  def apply(raw: String, `type`: Identifier, value: String, loc: Location = null): IdentifierNode = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IdentifierNode]
  }
}

