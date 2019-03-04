package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumTypeDefinitionNode
  extends TypeDefinitionNode
     with ASTNode {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.EnumTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val values: js.UndefOr[js.Array[EnumValueDefinitionNode]] = js.undefined
}

object EnumTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.EnumTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    values: js.Array[EnumValueDefinitionNode] = null
  ): EnumTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[EnumTypeDefinitionNode]
  }
}

