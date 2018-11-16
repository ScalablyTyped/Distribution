package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationTypeDefinitionNode extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.OperationTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val operation: OperationTypeNode
  val `type`: NamedTypeNode
}

