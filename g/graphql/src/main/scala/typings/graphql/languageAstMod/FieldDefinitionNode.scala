package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.FieldDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDefinitionNode extends ASTNode {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: FieldDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val `type`: TypeNode
}

object FieldDefinitionNode {
  @scala.inline
  def apply(
    kind: FieldDefinition,
    name: NameNode,
    `type`: TypeNode,
    arguments: js.Array[InputValueDefinitionNode] = null,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): FieldDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FieldDefinitionNode]
  }
}

