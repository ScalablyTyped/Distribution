package typings.graphql.astMod

import typings.graphql.graphqlStrings.SchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDefinitionNode
  extends TypeSystemDefinitionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: SchemaDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val operationTypes: js.Array[OperationTypeDefinitionNode]
}

object SchemaDefinitionNode {
  @scala.inline
  def apply(
    kind: SchemaDefinition,
    operationTypes: js.Array[OperationTypeDefinitionNode],
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): SchemaDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinitionNode]
  }
}

