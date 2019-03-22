package typings
package graphqlDashComposeLib.libObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationThunkMap[TSource, TContext]
  extends /* fieldName */ org.scalablytyped.runtime.StringDictionary[
      graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[RelationOpts[TSource, TContext, ArgsMap, ArgsMap]]
    ]

object RelationThunkMap {
  @scala.inline
  def apply[TSource, TContext](
    StringDictionary: /* fieldName */ org.scalablytyped.runtime.StringDictionary[
      graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[RelationOpts[TSource, TContext, ArgsMap, ArgsMap]]
    ] = null
  ): RelationThunkMap[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RelationThunkMap[TSource, TContext]]
  }
}

