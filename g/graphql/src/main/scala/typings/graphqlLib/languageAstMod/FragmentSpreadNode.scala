package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpreadNode
  extends ASTNode
     with SelectionNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.FragmentSpread
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object FragmentSpreadNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.FragmentSpread,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): FragmentSpreadNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FragmentSpreadNode]
  }
}

