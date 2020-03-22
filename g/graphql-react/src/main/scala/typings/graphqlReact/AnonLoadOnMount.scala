package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLFetchOptions
import typings.graphqlReact.mod.GraphQLFetchOptionsOverride
import typings.graphqlReact.mod.GraphQLOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoadOnMount[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.undefined
  var loadOnMount: js.UndefOr[Boolean] = js.undefined
  var loadOnReload: js.UndefOr[Boolean] = js.undefined
  var loadOnReset: js.UndefOr[Boolean] = js.undefined
  var operation: GraphQLOperation[V]
  var reloadOnLoad: js.UndefOr[Boolean] = js.undefined
  var resetOnLoad: js.UndefOr[Boolean] = js.undefined
}

object AnonLoadOnMount {
  @scala.inline
  def apply[V](
    operation: GraphQLOperation[V],
    fetchOptionsOverride: /* options */ GraphQLFetchOptions => Unit = null,
    loadOnMount: js.UndefOr[Boolean] = js.undefined,
    loadOnReload: js.UndefOr[Boolean] = js.undefined,
    loadOnReset: js.UndefOr[Boolean] = js.undefined,
    reloadOnLoad: js.UndefOr[Boolean] = js.undefined,
    resetOnLoad: js.UndefOr[Boolean] = js.undefined
  ): AnonLoadOnMount[V] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (fetchOptionsOverride != null) __obj.updateDynamic("fetchOptionsOverride")(js.Any.fromFunction1(fetchOptionsOverride))
    if (!js.isUndefined(loadOnMount)) __obj.updateDynamic("loadOnMount")(loadOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnReload)) __obj.updateDynamic("loadOnReload")(loadOnReload.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnReset)) __obj.updateDynamic("loadOnReset")(loadOnReset.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnLoad)) __obj.updateDynamic("reloadOnLoad")(reloadOnLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnLoad)) __obj.updateDynamic("resetOnLoad")(resetOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoadOnMount[V]]
  }
}

