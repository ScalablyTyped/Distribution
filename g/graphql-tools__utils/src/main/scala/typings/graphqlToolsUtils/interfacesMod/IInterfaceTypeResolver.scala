package typings.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInterfaceTypeResolver[TSource, TContext, TArgs] extends /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs, _]) | (IFieldResolverOptions[TSource, TContext, _])
    ] {
  var __astNode: js.UndefOr[InterfaceTypeDefinitionNode] = js.native
  var __description: js.UndefOr[String] = js.native
  var __extensionASTNodes: js.UndefOr[js.Array[InterfaceTypeExtensionNode]] = js.native
  var __extensions: js.UndefOr[Record[String, _]] = js.native
  var __name: js.UndefOr[String] = js.native
  var __resolveType: js.UndefOr[GraphQLTypeResolver[_, _]] = js.native
}

object IInterfaceTypeResolver {
  @scala.inline
  def apply[TSource, TContext, TArgs](): IInterfaceTypeResolver[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInterfaceTypeResolver[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class IInterfaceTypeResolverOps[Self <: IInterfaceTypeResolver[_, _, _], TSource, TContext, TArgs] (val x: Self with (IInterfaceTypeResolver[TSource, TContext, TArgs])) extends AnyVal {
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
    def set__astNode(value: InterfaceTypeDefinitionNode): Self = this.set("__astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__astNode: Self = this.set("__astNode", js.undefined)
    @scala.inline
    def set__description(value: String): Self = this.set("__description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__description: Self = this.set("__description", js.undefined)
    @scala.inline
    def set__extensionASTNodesVarargs(value: InterfaceTypeExtensionNode*): Self = this.set("__extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def set__extensionASTNodes(value: js.Array[InterfaceTypeExtensionNode]): Self = this.set("__extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__extensionASTNodes: Self = this.set("__extensionASTNodes", js.undefined)
    @scala.inline
    def set__extensions(value: Record[String, _]): Self = this.set("__extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__extensions: Self = this.set("__extensions", js.undefined)
    @scala.inline
    def set__name(value: String): Self = this.set("__name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__name: Self = this.set("__name", js.undefined)
    @scala.inline
    def set__resolveType(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("__resolveType", js.Any.fromFunction4(value))
    @scala.inline
    def delete__resolveType: Self = this.set("__resolveType", js.undefined)
  }
  
}

