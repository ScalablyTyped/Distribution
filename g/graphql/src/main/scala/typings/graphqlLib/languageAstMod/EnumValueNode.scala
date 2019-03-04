package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.EnumValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: java.lang.String
}

object EnumValueNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.EnumValue, value: java.lang.String, loc: Location = null): EnumValueNode = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[EnumValueNode]
  }
}

