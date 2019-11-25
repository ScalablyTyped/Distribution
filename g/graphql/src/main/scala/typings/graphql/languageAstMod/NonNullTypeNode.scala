package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.NonNullType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullTypeNode
  extends ASTNode
     with TypeNode {
  val kind: NonNullType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: NamedTypeNode | ListTypeNode
}

object NonNullTypeNode {
  @scala.inline
  def apply(kind: NonNullType, `type`: NamedTypeNode | ListTypeNode, loc: Location = null): NonNullTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullTypeNode]
  }
}

