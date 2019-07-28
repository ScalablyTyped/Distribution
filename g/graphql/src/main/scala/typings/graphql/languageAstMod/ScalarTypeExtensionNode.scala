package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ScalarTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalarTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: ScalarTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object ScalarTypeExtensionNode {
  @scala.inline
  def apply(
    kind: ScalarTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): ScalarTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ScalarTypeExtensionNode]
  }
}

