package typings.graphql.astMod

import typings.graphql.graphqlStrings.Field_
import typings.graphql.graphqlStrings.FragmentSpread
import typings.graphql.graphqlStrings.InlineFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.FieldNode
  - typings.graphql.astMod.FragmentSpreadNode
  - typings.graphql.astMod.InlineFragmentNode
*/
trait SelectionNode extends js.Object

object SelectionNode {
  @scala.inline
  def FieldNode(kind: Field_, name: NameNode): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
  @scala.inline
  def FragmentSpreadNode(kind: FragmentSpread, name: NameNode): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
  @scala.inline
  def InlineFragmentNode(kind: InlineFragment, selectionSet: SelectionSetNode): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
}

