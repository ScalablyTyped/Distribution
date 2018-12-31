package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDefinitionNode extends js.Object {
  val defaultValue: js.UndefOr[ValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.VariableDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: TypeNode
  val variable: VariableNode
}

