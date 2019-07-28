package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ObjectTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[FieldDefinitionNode]] = js.undefined
  val interfaces: js.UndefOr[js.Array[NamedTypeNode]] = js.undefined
  val kind: ObjectTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object ObjectTypeExtensionNode {
  @scala.inline
  def apply(
    kind: ObjectTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    interfaces: js.Array[NamedTypeNode] = null,
    loc: Location = null
  ): ObjectTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectTypeExtensionNode]
  }
}

