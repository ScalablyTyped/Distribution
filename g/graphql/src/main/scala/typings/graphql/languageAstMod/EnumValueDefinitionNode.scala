package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.EnumValueDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValueDefinitionNode extends ASTNode {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: EnumValueDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object EnumValueDefinitionNode {
  @scala.inline
  def apply(
    kind: EnumValueDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): EnumValueDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[EnumValueDefinitionNode]
  }
}

