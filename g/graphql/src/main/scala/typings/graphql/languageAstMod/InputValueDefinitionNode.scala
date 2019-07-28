package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.InputValueDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValueDefinitionNode extends ASTNode {
  val defaultValue: js.UndefOr[ValueNode] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: InputValueDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val `type`: TypeNode
}

object InputValueDefinitionNode {
  @scala.inline
  def apply(
    kind: InputValueDefinition,
    name: NameNode,
    `type`: TypeNode,
    defaultValue: ValueNode = null,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): InputValueDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InputValueDefinitionNode]
  }
}

