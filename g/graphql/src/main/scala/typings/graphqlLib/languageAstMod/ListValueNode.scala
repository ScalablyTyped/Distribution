package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.ListValue
  val loc: js.UndefOr[Location] = js.undefined
  val values: js.Array[ValueNode]
}

object ListValueNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.ListValue, values: js.Array[ValueNode], loc: Location = null): ListValueNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("values")(values)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListValueNode]
  }
}

