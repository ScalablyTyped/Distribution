package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.UnionTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeDefinitionNode
  extends TypeDefinitionNode
     with ASTNode {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: UnionTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val types: js.UndefOr[js.Array[NamedTypeNode]] = js.undefined
}

object UnionTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: UnionTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    types: js.Array[NamedTypeNode] = null
  ): UnionTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[UnionTypeDefinitionNode]
  }
}

