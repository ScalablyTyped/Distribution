package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Field_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldNode
  extends ASTNode
     with SelectionNode {
  val alias: js.UndefOr[NameNode] = js.undefined
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: Field_
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val selectionSet: js.UndefOr[SelectionSetNode] = js.undefined
}

object FieldNode {
  @scala.inline
  def apply(
    kind: Field_,
    name: NameNode,
    alias: NameNode = null,
    arguments: js.Array[ArgumentNode] = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    selectionSet: SelectionSetNode = null
  ): FieldNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selectionSet != null) __obj.updateDynamic("selectionSet")(selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldNode]
  }
}

