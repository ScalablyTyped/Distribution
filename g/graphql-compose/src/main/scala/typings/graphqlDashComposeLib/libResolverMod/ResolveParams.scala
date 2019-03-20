package typings
package graphqlDashComposeLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveParams[TSource, TContext, TArgs]
  extends /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var args: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: TArgs[argName]}
    */ graphqlDashComposeLib.graphqlDashComposeLibStrings.ResolveParams with TArgs
  var context: TContext
  var info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  var projection: stdLib.Partial[graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[TSource]]
  var source: TSource
}

object ResolveParams {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: TArgs[argName]}
    */ graphqlDashComposeLib.graphqlDashComposeLibStrings.ResolveParams with TArgs,
    context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    projection: stdLib.Partial[graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[TSource]],
    source: TSource,
    StringDictionary: /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ResolveParams[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args, context = context.asInstanceOf[js.Any], info = info, projection = projection, source = source.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolveParams[TSource, TContext, TArgs]]
  }
}

