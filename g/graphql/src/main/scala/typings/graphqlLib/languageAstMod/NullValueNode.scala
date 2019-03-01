package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullValueNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.NullValue
  val loc: js.UndefOr[Location] = js.undefined
}

object NullValueNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.NullValue, loc: Location = null): NullValueNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NullValueNode]
  }
}

