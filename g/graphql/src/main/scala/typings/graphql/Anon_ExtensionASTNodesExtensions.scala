package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesExtensions extends js.Object {
  var extensionASTNodes: js.Array[InterfaceTypeExtensionNode]
  var extensions: Maybe[Record[String, _]]
  var fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]]
}

object Anon_ExtensionASTNodesExtensions {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[InterfaceTypeExtensionNode],
    fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]],
    extensions: Maybe[Record[String, _]] = null
  ): Anon_ExtensionASTNodesExtensions = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, fields = fields)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtensionASTNodesExtensions]
  }
}

