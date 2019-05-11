package typings
package graphqlDashComposeLib.esmObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] extends js.Object {
  var catchErrors: js.UndefOr[scala.Boolean] = js.undefined
  var deprecationReason: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var prepareArgs: js.UndefOr[RelationArgsMapper[TSource, TContext, TArgs]] = js.undefined
  var projection: js.UndefOr[stdLib.Partial[graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType]] = js.undefined
  var resolver: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[
    graphqlDashComposeLib.esmResolverMod.Resolver[TRelationSource, TContext, TArgs, _]
  ]
}

object RelationOptsWithResolver {
  @scala.inline
  def apply[TRelationSource, TSource, TContext, TArgs](
    resolver: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[
      graphqlDashComposeLib.esmResolverMod.Resolver[TRelationSource, TContext, TArgs, _]
    ],
    catchErrors: js.UndefOr[scala.Boolean] = js.undefined,
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null,
    prepareArgs: RelationArgsMapper[TSource, TContext, TArgs] = null,
    projection: stdLib.Partial[graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType] = null
  ): RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
    if (!js.isUndefined(catchErrors)) __obj.updateDynamic("catchErrors")(catchErrors)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (prepareArgs != null) __obj.updateDynamic("prepareArgs")(prepareArgs)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]]
  }
}

