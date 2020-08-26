package typings.graphqlCompose.unionTypeComposerMod

import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeUnionTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var name: String = js.native
  var resolveType: js.UndefOr[(GraphQLTypeResolver[TSource, TContext]) | Null] = js.native
  var types: js.UndefOr[Thunk[js.Array[ComposeObjectType]]] = js.native
}

object ComposeUnionTypeConfig {
  @scala.inline
  def apply[TSource, TContext](name: String): ComposeUnionTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeUnionTypeConfig[TSource, TContext]]
  }
  @scala.inline
  implicit class ComposeUnionTypeConfigOps[Self <: ComposeUnionTypeConfig[_, _], TSource, TContext] (val x: Self with (ComposeUnionTypeConfig[TSource, TContext])) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setResolveType(
      value: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext]) | String]]
    ): Self = this.set("resolveType", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
    @scala.inline
    def setResolveTypeNull: Self = this.set("resolveType", null)
    @scala.inline
    def setTypesVarargs(value: ComposeObjectType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypesFunction0(value: () => js.Array[ComposeObjectType]): Self = this.set("types", js.Any.fromFunction0(value))
    @scala.inline
    def setTypes(value: Thunk[js.Array[ComposeObjectType]]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

