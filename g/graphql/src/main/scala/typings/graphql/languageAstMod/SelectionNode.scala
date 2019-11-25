package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Field_
import typings.graphql.graphqlStrings.FragmentSpread
import typings.graphql.graphqlStrings.InlineFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.languageAstMod.FieldNode
  - typings.graphql.languageAstMod.FragmentSpreadNode
  - typings.graphql.languageAstMod.InlineFragmentNode
*/
trait SelectionNode extends js.Object

object SelectionNode {
  @scala.inline
  def FieldNode(
    kind: Field_,
    name: NameNode,
    alias: NameNode = null,
    arguments: js.Array[ArgumentNode] = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    selectionSet: SelectionSetNode = null
  ): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selectionSet != null) __obj.updateDynamic("selectionSet")(selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
  @scala.inline
  def FragmentSpreadNode(
    kind: FragmentSpread,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
  @scala.inline
  def InlineFragmentNode(
    kind: InlineFragment,
    selectionSet: SelectionSetNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    typeCondition: NamedTypeNode = null
  ): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeCondition != null) __obj.updateDynamic("typeCondition")(typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
}

