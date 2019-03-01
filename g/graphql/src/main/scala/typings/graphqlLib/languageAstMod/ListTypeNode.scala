package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypeNode
  extends ASTNode
     with TypeNode {
  val kind: graphqlLib.graphqlLibStrings.ListType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: TypeNode
}

object ListTypeNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.ListType, `type`: TypeNode, loc: Location = null): ListTypeNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kind")(kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListTypeNode]
  }
}

