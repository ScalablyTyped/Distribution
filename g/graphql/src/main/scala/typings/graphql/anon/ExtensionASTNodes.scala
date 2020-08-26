package typings.graphql.anon

import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLObjectTypeExtensions
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionASTNodes[TSource, TContext] extends js.Object {
  var extensionASTNodes: js.Array[ObjectTypeExtensionNode] = js.native
  var extensions: Maybe[GraphQLObjectTypeExtensions[TSource, TContext]] = js.native
  var fields: GraphQLFieldConfigMap[_, _] = js.native
  var interfaces: js.Array[GraphQLInterfaceType] = js.native
}

object ExtensionASTNodes {
  @scala.inline
  def apply[TSource, TContext](
    extensionASTNodes: js.Array[ObjectTypeExtensionNode],
    fields: GraphQLFieldConfigMap[_, _],
    interfaces: js.Array[GraphQLInterfaceType]
  ): ExtensionASTNodes[TSource, TContext] = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionASTNodes[TSource, TContext]]
  }
  @scala.inline
  implicit class ExtensionASTNodesOps[Self <: ExtensionASTNodes[_, _], TSource, TContext] (val x: Self with (ExtensionASTNodes[TSource, TContext])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensionASTNodesVarargs(value: ObjectTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: js.Array[ObjectTypeExtensionNode]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: GraphQLFieldConfigMap[_, _]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfacesVarargs(value: GraphQLInterfaceType*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[GraphQLInterfaceType]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: Maybe[GraphQLObjectTypeExtensions[TSource, TContext]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
  }
  
}

