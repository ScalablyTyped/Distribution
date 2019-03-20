package typings
package graphqlDashComposeLib.libTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationThunkMap[TSource, TContext]
  extends /* fieldName */ org.scalablytyped.runtime.StringDictionary[
      graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[RelationOpts[_, TSource, TContext, _]]
    ]

object RelationThunkMap {
  @scala.inline
  def apply[TSource, TContext](
    StringDictionary: /* fieldName */ org.scalablytyped.runtime.StringDictionary[
      graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[RelationOpts[_, TSource, TContext, _]]
    ] = null
  ): RelationThunkMap[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RelationThunkMap[TSource, TContext]]
  }
}

