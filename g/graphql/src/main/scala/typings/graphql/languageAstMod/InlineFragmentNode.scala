package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.InlineFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineFragmentNode
  extends ASTNode
     with SelectionNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: InlineFragment
  val loc: js.UndefOr[Location] = js.undefined
  val selectionSet: SelectionSetNode
  val typeCondition: js.UndefOr[NamedTypeNode] = js.undefined
}

object InlineFragmentNode {
  @scala.inline
  def apply(
    kind: InlineFragment,
    selectionSet: SelectionSetNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    typeCondition: NamedTypeNode = null
  ): InlineFragmentNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeCondition != null) __obj.updateDynamic("typeCondition")(typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineFragmentNode]
  }
}

