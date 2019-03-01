package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveDefinitionNode
  extends TypeSystemDefinitionNode
     with ASTNode {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.DirectiveDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val locations: js.Array[NameNode]
  val name: NameNode
}

object DirectiveDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.DirectiveDefinition,
    locations: js.Array[NameNode],
    name: NameNode,
    arguments: js.Array[InputValueDefinitionNode] = null,
    description: StringValueNode = null,
    loc: Location = null
  ): DirectiveDefinitionNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("name")(name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (description != null) __obj.updateDynamic("description")(description)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DirectiveDefinitionNode]
  }
}

