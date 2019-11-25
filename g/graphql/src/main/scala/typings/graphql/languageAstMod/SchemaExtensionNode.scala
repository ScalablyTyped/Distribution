package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.SchemaExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaExtensionNode
  extends TypeSystemExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: SchemaExtension
  val loc: js.UndefOr[Location] = js.undefined
  val operationTypes: js.UndefOr[js.Array[OperationTypeDefinitionNode]] = js.undefined
}

object SchemaExtensionNode {
  @scala.inline
  def apply(
    kind: SchemaExtension,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    operationTypes: js.Array[OperationTypeDefinitionNode] = null
  ): SchemaExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (operationTypes != null) __obj.updateDynamic("operationTypes")(operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtensionNode]
  }
}

