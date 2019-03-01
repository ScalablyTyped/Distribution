package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationTypeDefinitionNode extends ASTNode {
  val kind: graphqlLib.graphqlLibStrings.OperationTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val operation: OperationTypeNode
  val `type`: NamedTypeNode
}

object OperationTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.OperationTypeDefinition,
    operation: OperationTypeNode,
    `type`: NamedTypeNode,
    loc: Location = null
  ): OperationTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("operation")(operation)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[OperationTypeDefinitionNode]
  }
}

