package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AstNode extends js.Object {
  var __astNode: js.UndefOr[EnumTypeDefinitionNode] = js.undefined
  var __description: js.UndefOr[String] = js.undefined
  var __extensionASTNodes: js.UndefOr[js.Array[EnumTypeExtensionNode]] = js.undefined
  var __extensions: js.UndefOr[Record[String, _]] = js.undefined
  var __name: js.UndefOr[String] = js.undefined
}

object AstNode {
  @scala.inline
  def apply(
    __astNode: EnumTypeDefinitionNode = null,
    __description: String = null,
    __extensionASTNodes: js.Array[EnumTypeExtensionNode] = null,
    __extensions: Record[String, _] = null,
    __name: String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal()
    if (__astNode != null) __obj.updateDynamic("__astNode")(__astNode.asInstanceOf[js.Any])
    if (__description != null) __obj.updateDynamic("__description")(__description.asInstanceOf[js.Any])
    if (__extensionASTNodes != null) __obj.updateDynamic("__extensionASTNodes")(__extensionASTNodes.asInstanceOf[js.Any])
    if (__extensions != null) __obj.updateDynamic("__extensions")(__extensions.asInstanceOf[js.Any])
    if (__name != null) __obj.updateDynamic("__name")(__name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
}

