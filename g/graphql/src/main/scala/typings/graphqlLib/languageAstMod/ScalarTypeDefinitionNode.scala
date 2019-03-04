package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalarTypeDefinitionNode
  extends TypeDefinitionNode
     with ASTNode {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.ScalarTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object ScalarTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.ScalarTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): ScalarTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ScalarTypeDefinitionNode]
  }
}

