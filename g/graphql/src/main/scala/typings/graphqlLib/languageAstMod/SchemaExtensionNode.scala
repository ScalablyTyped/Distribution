package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SchemaExtensionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.SchemaExtension
  val loc: js.UndefOr[Location] = js.undefined
  val operationTypes: js.UndefOr[js.Array[OperationTypeDefinitionNode]] = js.undefined
}

