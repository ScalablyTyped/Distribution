package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode extends js.Object {
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: java.lang.String
}

object ASTNode {
  @scala.inline
  def apply(`type`: java.lang.String, loc: Location = null): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ASTNode]
  }
}

