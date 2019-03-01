package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolvers[TSource, TContext]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.Function0[_] | (IResolverObject[TSource, TContext, _]) | (IResolverOptions[TSource, TContext, _]) | graphqlLib.graphqlMod.GraphQLScalarType | IEnumResolver
    ]

object IResolvers {
  @scala.inline
  def apply[TSource, TContext](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.Function0[_] | (IResolverObject[TSource, TContext, _]) | (IResolverOptions[TSource, TContext, _]) | graphqlLib.graphqlMod.GraphQLScalarType | IEnumResolver
    ] = null
  ): IResolvers[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IResolvers[TSource, TContext]]
  }
}

