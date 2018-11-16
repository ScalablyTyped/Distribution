package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InputValueDefinitionNode extends js.Object {
  val defaultValue: js.UndefOr[ValueNode] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InputValueDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val `type`: TypeNode
}

