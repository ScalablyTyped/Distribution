package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaExtensionNode
  extends TypeSystemExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.SchemaExtension
  val loc: js.UndefOr[Location] = js.undefined
  val operationTypes: js.UndefOr[js.Array[OperationTypeDefinitionNode]] = js.undefined
}

object SchemaExtensionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.SchemaExtension,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    operationTypes: js.Array[OperationTypeDefinitionNode] = null
  ): SchemaExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (operationTypes != null) __obj.updateDynamic("operationTypes")(operationTypes)
    __obj.asInstanceOf[SchemaExtensionNode]
  }
}

