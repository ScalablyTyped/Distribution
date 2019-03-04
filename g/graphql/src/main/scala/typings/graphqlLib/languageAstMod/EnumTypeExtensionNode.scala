package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.EnumTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val values: js.UndefOr[js.Array[EnumValueDefinitionNode]] = js.undefined
}

object EnumTypeExtensionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.EnumTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    values: js.Array[EnumValueDefinitionNode] = null
  ): EnumTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[EnumTypeExtensionNode]
  }
}

