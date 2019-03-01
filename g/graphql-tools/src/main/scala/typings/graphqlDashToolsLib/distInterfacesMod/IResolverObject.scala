package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverObject[TSource, TContext, TArgs]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs]) | (IResolverOptions[TSource, TContext, _]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.IResolverObject<TSource, TContext> */ js.Object)
    ]

object IResolverObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs]) | (IResolverOptions[TSource, TContext, _]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.IResolverObject<TSource, TContext> */ js.Object)
    ] = null
  ): IResolverObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IResolverObject[TSource, TContext, TArgs]]
  }
}

