package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullTypeNode
  extends ASTNode
     with TypeNode {
  val kind: graphqlLib.graphqlLibStrings.NonNullType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: NamedTypeNode | ListTypeNode
}

object NonNullTypeNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.NonNullType,
    `type`: NamedTypeNode | ListTypeNode,
    loc: Location = null
  ): NonNullTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NonNullTypeNode]
  }
}

