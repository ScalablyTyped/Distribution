package typings.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverObject[TSource, TContext, TArgs] extends /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs]) | (IResolverOptions[TSource, TContext, _]) | (IResolverObject[TSource, TContext, _])
    ]

object IResolverObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs]) | (IResolverOptions[TSource, TContext, _]) | (IResolverObject[TSource, TContext, _])
    ] = null
  ): IResolverObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IResolverObject[TSource, TContext, TArgs]]
  }
}

