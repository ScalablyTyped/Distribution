package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.native
  var astNode: js.UndefOr[FieldDefinitionNode] = js.native
  var deprecationReason: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var isDeprecated: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, TArgs, _]] = js.native
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, TArgs, _]] = js.native
  var `type`: js.UndefOr[GraphQLOutputType] = js.native
}

object IFieldResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](): IFieldResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldResolverOptions[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class IFieldResolverOptionsOps[Self <: IFieldResolverOptions[_, _, _], TSource, TContext, TArgs] (val x: Self with (IFieldResolverOptions[TSource, TContext, TArgs])) extends AnyVal {
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
    def setArgsVarargs(value: GraphQLArgument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[GraphQLArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setAstNode(value: FieldDefinitionNode): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setIsDeprecated(value: Boolean): Self = this.set("isDeprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeprecated: Self = this.set("isDeprecated", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResolve(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => _): Self = this.set("resolve", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setSubscribe(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => _): Self = this.set("subscribe", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    @scala.inline
    def setType(value: GraphQLOutputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

