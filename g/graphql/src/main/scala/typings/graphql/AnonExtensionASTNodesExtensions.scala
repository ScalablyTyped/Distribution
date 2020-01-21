package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionASTNodesExtensions extends js.Object {
  var extensionASTNodes: js.Array[InterfaceTypeExtensionNode]
  var extensions: Maybe[Record[String, _]]
  var fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]]
}

object AnonExtensionASTNodesExtensions {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[InterfaceTypeExtensionNode],
    fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]],
    extensions: Maybe[Record[String, _]] = null
  ): AnonExtensionASTNodesExtensions = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensionASTNodesExtensions]
  }
}

