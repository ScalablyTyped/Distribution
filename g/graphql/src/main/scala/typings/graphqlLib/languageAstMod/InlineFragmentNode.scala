package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineFragmentNode
  extends ASTNode
     with SelectionNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InlineFragment
  val loc: js.UndefOr[Location] = js.undefined
  val selectionSet: SelectionSetNode
  val typeCondition: js.UndefOr[NamedTypeNode] = js.undefined
}

object InlineFragmentNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.InlineFragment,
    selectionSet: SelectionSetNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    typeCondition: NamedTypeNode = null
  ): InlineFragmentNode = {
    val __obj = js.Dynamic.literal(kind = kind, selectionSet = selectionSet)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeCondition != null) __obj.updateDynamic("typeCondition")(typeCondition)
    __obj.asInstanceOf[InlineFragmentNode]
  }
}

