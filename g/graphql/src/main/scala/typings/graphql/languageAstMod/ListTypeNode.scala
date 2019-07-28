package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypeNode
  extends ASTNode
     with TypeNode {
  val kind: ListType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: TypeNode
}

object ListTypeNode {
  @scala.inline
  def apply(kind: ListType, `type`: TypeNode, loc: Location = null): ListTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListTypeNode]
  }
}

