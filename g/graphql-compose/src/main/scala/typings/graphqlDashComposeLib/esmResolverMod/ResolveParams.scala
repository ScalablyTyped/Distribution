package typings
package graphqlDashComposeLib.esmResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveParams[TSource, TContext, TArgs]
  extends /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var args: TArgs
  var context: TContext
  var info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  var projection: stdLib.Partial[graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType]
  var source: TSource
}

object ResolveParams {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: TArgs,
    context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    projection: stdLib.Partial[graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType],
    source: TSource,
    StringDictionary: /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ResolveParams[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], info = info, projection = projection, source = source.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolveParams[TSource, TContext, TArgs]]
  }
}

