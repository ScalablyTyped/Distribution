package typings.jsonToAst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode extends js.Object {
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: String
}

object ASTNode {
  @scala.inline
  def apply(`type`: String, loc: Location = null): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

