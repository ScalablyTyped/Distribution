package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.IntValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: java.lang.String
}

object IntValueNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.IntValue, value: java.lang.String, loc: Location = null): IntValueNode = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IntValueNode]
  }
}

