package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldNode
  extends ASTNode
     with SelectionNode {
  val alias: js.UndefOr[NameNode] = js.undefined
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.Field
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val selectionSet: js.UndefOr[SelectionSetNode] = js.undefined
}

object FieldNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.Field,
    name: NameNode,
    alias: NameNode = null,
    arguments: js.Array[ArgumentNode] = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    selectionSet: SelectionSetNode = null
  ): FieldNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (selectionSet != null) __obj.updateDynamic("selectionSet")(selectionSet)
    __obj.asInstanceOf[FieldNode]
  }
}

