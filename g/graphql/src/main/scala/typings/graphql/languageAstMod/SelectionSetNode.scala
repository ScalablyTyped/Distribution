package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.SelectionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSetNode extends ASTNode {
  var kind: SelectionSet
  var loc: js.UndefOr[Location] = js.undefined
  var selections: js.Array[SelectionNode]
}

object SelectionSetNode {
  @scala.inline
  def apply(kind: SelectionSet, selections: js.Array[SelectionNode], loc: Location = null): SelectionSetNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSetNode]
  }
}

