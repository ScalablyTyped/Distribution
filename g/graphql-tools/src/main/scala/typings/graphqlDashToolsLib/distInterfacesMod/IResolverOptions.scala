package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IResolverOptions[TSource, TContext] extends js.Object {
  var __isTypeOf: js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext]] = js.undefined
  var __resolveType: js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext]] = js.undefined
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

