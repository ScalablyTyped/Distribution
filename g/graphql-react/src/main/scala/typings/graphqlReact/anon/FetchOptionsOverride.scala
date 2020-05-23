package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLFetchOptions
import typings.graphqlReact.mod.GraphQLFetchOptionsOverride
import typings.graphqlReact.mod.GraphQLOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptionsOverride[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.undefined
  var operation: GraphQLOperation[V]
  var reloadOnLoad: js.UndefOr[Boolean] = js.undefined
  var resetOnLoad: js.UndefOr[Boolean] = js.undefined
}

object FetchOptionsOverride {
  @scala.inline
  def apply[V](
    operation: GraphQLOperation[V],
    fetchOptionsOverride: /* options */ GraphQLFetchOptions => Unit = null,
    reloadOnLoad: js.UndefOr[Boolean] = js.undefined,
    resetOnLoad: js.UndefOr[Boolean] = js.undefined
  ): FetchOptionsOverride[V] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (fetchOptionsOverride != null) __obj.updateDynamic("fetchOptionsOverride")(js.Any.fromFunction1(fetchOptionsOverride))
    if (!js.isUndefined(reloadOnLoad)) __obj.updateDynamic("reloadOnLoad")(reloadOnLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnLoad)) __obj.updateDynamic("resetOnLoad")(resetOnLoad.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptionsOverride[V]]
  }
}

