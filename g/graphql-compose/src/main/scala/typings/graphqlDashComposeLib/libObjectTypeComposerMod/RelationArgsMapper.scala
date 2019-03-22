package typings
package graphqlDashComposeLib.libObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationArgsMapper[TSource, TContext, TArgs]
  extends /* argName */ org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[js.Any] | (RelationArgsMapperFn[TSource, TContext, TArgs]) | scala.Null | scala.Unit | java.lang.String | scala.Double | js.Array[_]
    ]

object RelationArgsMapper {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* argName */ org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[js.Any] | (RelationArgsMapperFn[TSource, TContext, TArgs]) | scala.Null | scala.Unit | java.lang.String | scala.Double | js.Array[_]
    ] = null
  ): RelationArgsMapper[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RelationArgsMapper[TSource, TContext, TArgs]]
  }
}

