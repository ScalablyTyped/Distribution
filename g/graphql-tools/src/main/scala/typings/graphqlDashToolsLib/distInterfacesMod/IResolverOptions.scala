package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var __isTypeOf: js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext]] = js.undefined
  var __resolveType: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.undefined
}

object IResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    __isTypeOf: graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext] = null,
    __resolveType: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = null,
    fragment: java.lang.String = null,
    resolve: IFieldResolver[TSource, TContext, TArgs] = null,
    subscribe: IFieldResolver[TSource, TContext, TArgs] = null
  ): IResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (__isTypeOf != null) __obj.updateDynamic("__isTypeOf")(__isTypeOf)
    if (__resolveType != null) __obj.updateDynamic("__resolveType")(__resolveType)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[IResolverOptions[TSource, TContext, TArgs]]
  }
}

