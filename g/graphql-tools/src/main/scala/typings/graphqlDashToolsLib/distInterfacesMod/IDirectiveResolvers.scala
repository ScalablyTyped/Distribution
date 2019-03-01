package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectiveResolvers[TSource, TContext]
  extends /* directiveName */ org.scalablytyped.runtime.StringDictionary[DirectiveResolverFn[TSource, TContext]]

object IDirectiveResolvers {
  @scala.inline
  def apply[TSource, TContext](
    StringDictionary: /* directiveName */ org.scalablytyped.runtime.StringDictionary[DirectiveResolverFn[TSource, TContext]] = null
  ): IDirectiveResolvers[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IDirectiveResolvers[TSource, TContext]]
  }
}

