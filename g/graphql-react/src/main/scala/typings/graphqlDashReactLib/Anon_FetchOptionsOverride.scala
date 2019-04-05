package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchOptionsOverride[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[graphqlDashReactLib.graphqlDashReactMod.GraphQLFetchOptionsOverride] = js.undefined
  var operation: graphqlDashReactLib.graphqlDashReactMod.GraphQLOperation[V]
  var reloadOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  var resetOnLoad: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FetchOptionsOverride {
  @scala.inline
  def apply[V](
    operation: graphqlDashReactLib.graphqlDashReactMod.GraphQLOperation[V],
    fetchOptionsOverride: graphqlDashReactLib.graphqlDashReactMod.GraphQLFetchOptionsOverride = null,
    reloadOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    resetOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FetchOptionsOverride[V] = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (fetchOptionsOverride != null) __obj.updateDynamic("fetchOptionsOverride")(fetchOptionsOverride)
    if (!js.isUndefined(reloadOnLoad)) __obj.updateDynamic("reloadOnLoad")(reloadOnLoad)
    if (!js.isUndefined(resetOnLoad)) __obj.updateDynamic("resetOnLoad")(resetOnLoad)
    __obj.asInstanceOf[Anon_FetchOptionsOverride[V]]
  }
}

