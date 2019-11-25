package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.DirectiveDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveDefinitionNode
  extends TypeSystemDefinitionNode
     with ASTNode {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val kind: DirectiveDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val locations: js.Array[NameNode]
  val name: NameNode
  val repeatable: Boolean
}

object DirectiveDefinitionNode {
  @scala.inline
  def apply(
    kind: DirectiveDefinition,
    locations: js.Array[NameNode],
    name: NameNode,
    repeatable: Boolean,
    arguments: js.Array[InputValueDefinitionNode] = null,
    description: StringValueNode = null,
    loc: Location = null
  ): DirectiveDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveDefinitionNode]
  }
}

