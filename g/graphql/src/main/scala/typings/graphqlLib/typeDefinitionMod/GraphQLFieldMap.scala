package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldMap[TSource, TContext, TArgs]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[GraphQLField[TSource, TContext, TArgs]]

object GraphQLFieldMap {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[GraphQLField[TSource, TContext, TArgs]] = null
  ): GraphQLFieldMap[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GraphQLFieldMap[TSource, TContext, TArgs]]
  }
}

