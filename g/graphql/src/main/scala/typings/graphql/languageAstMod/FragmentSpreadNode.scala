package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.FragmentSpread
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpreadNode
  extends ASTNode
     with SelectionNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: FragmentSpread
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object FragmentSpreadNode {
  @scala.inline
  def apply(
    kind: FragmentSpread,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): FragmentSpreadNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FragmentSpreadNode]
  }
}

