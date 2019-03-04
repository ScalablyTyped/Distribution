package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectTypeDefinitionNode
  extends TypeDefinitionNode
     with ASTNode {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InputObjectTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object InputObjectTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.InputObjectTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[InputValueDefinitionNode] = null,
    loc: Location = null
  ): InputObjectTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InputObjectTypeDefinitionNode]
  }
}

