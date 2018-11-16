package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InputObjectTypeDefinitionNode extends js.Object {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InputObjectTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

