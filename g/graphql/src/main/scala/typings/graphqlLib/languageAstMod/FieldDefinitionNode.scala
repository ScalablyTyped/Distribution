package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDefinitionNode extends ASTNode {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.FieldDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val `type`: TypeNode
}

object FieldDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.FieldDefinition,
    name: NameNode,
    `type`: TypeNode,
    arguments: js.Array[InputValueDefinitionNode] = null,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): FieldDefinitionNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FieldDefinitionNode]
  }
}

