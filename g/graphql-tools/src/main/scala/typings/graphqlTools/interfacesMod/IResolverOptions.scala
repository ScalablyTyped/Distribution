package typings.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlTools.GraphQLResolveInfomergeIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var __isTypeOf: js.UndefOr[GraphQLIsTypeOfFn[TSource, TContext]] = js.undefined
  var __resolveType: js.UndefOr[GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]] = js.undefined
  var fragment: js.UndefOr[String] = js.undefined
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.undefined
}

object IResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    __isTypeOf: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean] = null,
    __resolveType: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, StringDictionary[_]]) | String]] = null,
    fragment: String = null,
    resolve: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfomergeIn) => js.Any = null,
    subscribe: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfomergeIn) => js.Any = null
  ): IResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (__isTypeOf != null) __obj.updateDynamic("__isTypeOf")(js.Any.fromFunction3(__isTypeOf))
    if (__resolveType != null) __obj.updateDynamic("__resolveType")(js.Any.fromFunction4(__resolveType))
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4(resolve))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4(subscribe))
    __obj.asInstanceOf[IResolverOptions[TSource, TContext, TArgs]]
  }
}

