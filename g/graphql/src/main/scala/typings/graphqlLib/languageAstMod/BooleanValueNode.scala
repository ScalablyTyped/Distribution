package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.BooleanValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: scala.Boolean
}

object BooleanValueNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.BooleanValue, value: scala.Boolean, loc: Location = null): BooleanValueNode = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[BooleanValueNode]
  }
}

