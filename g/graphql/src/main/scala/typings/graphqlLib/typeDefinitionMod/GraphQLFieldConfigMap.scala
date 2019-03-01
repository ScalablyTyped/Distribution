package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldConfigMap[TSource, TContext, TArgs]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[GraphQLFieldConfig[TSource, TContext, TArgs]]

object GraphQLFieldConfigMap {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[GraphQLFieldConfig[TSource, TContext, TArgs]] = null
  ): GraphQLFieldConfigMap[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GraphQLFieldConfigMap[TSource, TContext, TArgs]]
  }
}

