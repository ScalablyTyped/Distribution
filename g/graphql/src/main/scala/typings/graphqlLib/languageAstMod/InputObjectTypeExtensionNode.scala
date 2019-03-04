package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InputObjectTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object InputObjectTypeExtensionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.InputObjectTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[InputValueDefinitionNode] = null,
    loc: Location = null
  ): InputObjectTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InputObjectTypeExtensionNode]
  }
}

