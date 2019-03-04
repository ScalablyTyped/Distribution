package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSetNode extends ASTNode {
  var kind: graphqlLib.graphqlLibStrings.SelectionSet
  var loc: js.UndefOr[Location] = js.undefined
  var selections: js.Array[SelectionNode]
}

object SelectionSetNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.SelectionSet,
    selections: js.Array[SelectionNode],
    loc: Location = null
  ): SelectionSetNode = {
    val __obj = js.Dynamic.literal(kind = kind, selections = selections)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SelectionSetNode]
  }
}

