package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.astMod.InputObjectTypeDefinitionNode
import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputObjectTypeResolver extends js.Object {
  var __astNode: js.UndefOr[InputObjectTypeDefinitionNode] = js.undefined
  var __description: js.UndefOr[String] = js.undefined
  var __extensionASTNodes: js.UndefOr[js.Array[InputObjectTypeExtensionNode]] = js.undefined
  var __extensions: js.UndefOr[Record[String, _]] = js.undefined
  var __name: js.UndefOr[String] = js.undefined
}

object IInputObjectTypeResolver {
  @scala.inline
  def apply(
    __astNode: InputObjectTypeDefinitionNode = null,
    __description: String = null,
    __extensionASTNodes: js.Array[InputObjectTypeExtensionNode] = null,
    __extensions: Record[String, _] = null,
    __name: String = null
  ): IInputObjectTypeResolver = {
    val __obj = js.Dynamic.literal()
    if (__astNode != null) __obj.updateDynamic("__astNode")(__astNode.asInstanceOf[js.Any])
    if (__description != null) __obj.updateDynamic("__description")(__description.asInstanceOf[js.Any])
    if (__extensionASTNodes != null) __obj.updateDynamic("__extensionASTNodes")(__extensionASTNodes.asInstanceOf[js.Any])
    if (__extensions != null) __obj.updateDynamic("__extensions")(__extensions.asInstanceOf[js.Any])
    if (__name != null) __obj.updateDynamic("__name")(__name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputObjectTypeResolver]
  }
}

