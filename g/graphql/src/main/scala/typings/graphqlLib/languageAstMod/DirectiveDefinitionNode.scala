package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveDefinitionNode extends js.Object {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.DirectiveDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val locations: js.Array[NameNode]
  val name: NameNode
}

