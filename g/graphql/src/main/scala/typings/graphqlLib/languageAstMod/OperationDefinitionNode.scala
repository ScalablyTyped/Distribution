package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDefinitionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.OperationDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: js.UndefOr[NameNode] = js.undefined
  val operation: OperationTypeNode
  val selectionSet: SelectionSetNode
  val variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.undefined
}

