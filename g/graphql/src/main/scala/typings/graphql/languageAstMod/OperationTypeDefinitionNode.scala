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
    val __obj = js.Dynamic.literal(kind = kind, operation = operation)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[OperationTypeDefinitionNode]
  }
}

