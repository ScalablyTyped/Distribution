package typings.graphqlCompose.objectTypeComposerMod

import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.resolverMod.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] extends RelationOpts[TRelationSource, TSource, TContext, TArgs] {
  var catchErrors: js.UndefOr[Boolean] = js.undefined
  var deprecationReason: js.UndefOr[String | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var prepareArgs: js.UndefOr[RelationArgsMapper[TSource, TContext, TArgs]] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]]
}

object RelationOptsWithResolver {
  @scala.inline
  def apply[TRelationSource, TSource, TContext, TArgs](
    resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]],
    catchErrors: js.UndefOr[Boolean] = js.undefined,
    deprecationReason: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    prepareArgs: RelationArgsMapper[TSource, TContext, TArgs] = null,
    projection: js.Object = null
  ): RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
    if (!js.isUndefined(catchErrors)) __obj.updateDynamic("catchErrors")(catchErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (prepareArgs != null) __obj.updateDynamic("prepareArgs")(prepareArgs.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]]
  }
}

