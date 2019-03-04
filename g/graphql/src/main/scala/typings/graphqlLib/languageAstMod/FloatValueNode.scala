package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.FloatValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: java.lang.String
}

object FloatValueNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.FloatValue, value: java.lang.String, loc: Location = null): FloatValueNode = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FloatValueNode]
  }
}

