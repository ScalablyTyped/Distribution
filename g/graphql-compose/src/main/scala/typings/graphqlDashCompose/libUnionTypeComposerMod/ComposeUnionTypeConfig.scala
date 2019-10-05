package typings.graphqlDashCompose.libUnionTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLAbstractType
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeObjectType
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeUnionTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var name: String
  var resolveType: js.UndefOr[(GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]) | Null] = js.undefined
  var types: js.UndefOr[Thunk[js.Array[ComposeObjectType]]] = js.undefined
}

object ComposeUnionTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: String,
    description: String = null,
    extensions: Extensions = null,
    resolveType: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, StringDictionary[_]]) | String]] = null,
    types: Thunk[js.Array[ComposeObjectType]] = null
  ): ComposeUnionTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4(resolveType))
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeUnionTypeConfig[TSource, TContext]]
  }
}

