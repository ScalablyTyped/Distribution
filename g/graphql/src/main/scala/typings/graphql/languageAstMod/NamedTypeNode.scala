package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.NamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypeNode
  extends ASTNode
     with TypeNode {
  val kind: NamedType
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object NamedTypeNode {
  @scala.inline
  def apply(kind: NamedType, name: NameNode, loc: Location = null): NamedTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NamedTypeNode]
  }
}

