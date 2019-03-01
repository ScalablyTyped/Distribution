package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.UnionTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val types: js.UndefOr[js.Array[NamedTypeNode]] = js.undefined
}

object UnionTypeExtensionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.UnionTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    types: js.Array[NamedTypeNode] = null
  ): UnionTypeExtensionNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[UnionTypeExtensionNode]
  }
}

