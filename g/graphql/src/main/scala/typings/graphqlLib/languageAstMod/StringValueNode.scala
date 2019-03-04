package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringValueNode
  extends ASTNode
     with ValueNode {
  val block: js.UndefOr[scala.Boolean] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.StringValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: java.lang.String
}

object StringValueNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.StringValue,
    value: java.lang.String,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    loc: Location = null
  ): StringValueNode = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[StringValueNode]
  }
}

