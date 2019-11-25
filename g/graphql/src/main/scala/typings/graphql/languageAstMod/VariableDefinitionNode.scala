package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.VariableDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDefinitionNode extends ASTNode {
  val defaultValue: js.UndefOr[ValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: VariableDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: TypeNode
  val variable: VariableNode
}

object VariableDefinitionNode {
  @scala.inline
  def apply(
    kind: VariableDefinition,
    `type`: TypeNode,
    variable: VariableNode,
    defaultValue: ValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): VariableDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDefinitionNode]
  }
}

