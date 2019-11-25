package typings.graphqlDashCompose.libObjectTypeComposerMod

import typings.graphqlDashCompose.libResolverMod.Resolver
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk
import typings.graphqlDashCompose.libUtilsProjectionMod.ProjectionType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] extends js.Object {
  var catchErrors: js.UndefOr[Boolean] = js.undefined
  var deprecationReason: js.UndefOr[String | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var prepareArgs: js.UndefOr[RelationArgsMapper[TSource, TContext, TArgs]] = js.undefined
  var projection: js.UndefOr[Partial[ProjectionType]] = js.undefined
  var resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]]
}

object RelationOptsWithResolver {
  @scala.inline
  def apply[TRelationSource, TSource, TContext, TArgs](
    resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]],
    catchErrors: js.UndefOr[Boolean] = js.undefined,
    deprecationReason: String = null,
    description: String = null,
    prepareArgs: RelationArgsMapper[TSource, TContext, TArgs] = null,
    projection: Partial[ProjectionType] = null
  ): RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
    if (!js.isUndefined(catchErrors)) __obj.updateDynamic("catchErrors")(catchErrors.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (prepareArgs != null) __obj.updateDynamic("prepareArgs")(prepareArgs.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]]
  }
}

