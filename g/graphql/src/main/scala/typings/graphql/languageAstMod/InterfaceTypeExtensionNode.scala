package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.InterfaceTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[FieldDefinitionNode]] = js.undefined
  val kind: InterfaceTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object InterfaceTypeExtensionNode {
  @scala.inline
  def apply(
    kind: InterfaceTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    loc: Location = null
  ): InterfaceTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InterfaceTypeExtensionNode]
  }
}

