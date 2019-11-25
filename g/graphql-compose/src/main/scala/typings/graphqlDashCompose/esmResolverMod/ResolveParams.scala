package typings.graphqlDashCompose.esmResolverMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashCompose.esmUtilsProjectionMod.ProjectionType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveParams[TSource, TContext, TArgs]
  extends /* opt */ StringDictionary[js.Any] {
  var args: TArgs
  var context: TContext
  var info: GraphQLResolveInfo
  var projection: Partial[ProjectionType]
  var source: TSource
}

object ResolveParams {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: TArgs,
    context: TContext,
    info: GraphQLResolveInfo,
    projection: Partial[ProjectionType],
    source: TSource,
    StringDictionary: /* opt */ StringDictionary[js.Any] = null
  ): ResolveParams[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolveParams[TSource, TContext, TArgs]]
  }
}

