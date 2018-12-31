package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDefinitionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.SchemaDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val operationTypes: js.Array[OperationTypeDefinitionNode]
}

