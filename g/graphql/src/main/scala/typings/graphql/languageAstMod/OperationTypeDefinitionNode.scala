package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.OperationTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationTypeDefinitionNode extends ASTNode {
  val kind: OperationTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val operation: OperationTypeNode
  val `type`: NamedTypeNode
}

object OperationTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: OperationTypeDefinition,
    operation: OperationTypeNode,
    `type`: NamedTypeNode,
    loc: Location = null
  ): OperationTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationTypeDefinitionNode]
  }
}

