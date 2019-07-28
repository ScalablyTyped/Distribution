package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ObjectTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeDefinitionNode
  extends TypeDefinitionNode
     with ASTNode {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[FieldDefinitionNode]] = js.undefined
  val interfaces: js.UndefOr[js.Array[NamedTypeNode]] = js.undefined
  val kind: ObjectTypeDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object ObjectTypeDefinitionNode {
  @scala.inline
  def apply(
    kind: ObjectTypeDefinition,
    name: NameNode,
    description: StringValueNode = null,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    interfaces: js.Array[NamedTypeNode] = null,
    loc: Location = null
  ): ObjectTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectTypeDefinitionNode]
  }
}

