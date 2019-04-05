package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchOptionsOverrideLoadOnMount[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[graphqlDashReactLib.graphqlDashReactMod.GraphQLFetchOptionsOverride] = js.undefined
  var loadOnMount: js.UndefOr[scala.Boolean] = js.undefined
  var loadOnReload: js.UndefOr[scala.Boolean] = js.undefined
  var loadOnReset: js.UndefOr[scala.Boolean] = js.undefined
  var operation: graphqlDashReactLib.graphqlDashReactMod.GraphQLOperation[V]
  var reloadOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  var resetOnLoad: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FetchOptionsOverrideLoadOnMount {
  @scala.inline
  def apply[V](
    operation: graphqlDashReactLib.graphqlDashReactMod.GraphQLOperation[V],
    fetchOptionsOverride: graphqlDashReactLib.graphqlDashReactMod.GraphQLFetchOptionsOverride = null,
    loadOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    loadOnReload: js.UndefOr[scala.Boolean] = js.undefined,
    loadOnReset: js.UndefOr[scala.Boolean] = js.undefined,
    reloadOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    resetOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FetchOptionsOverrideLoadOnMount[V] = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (fetchOptionsOverride != null) __obj.updateDynamic("fetchOptionsOverride")(fetchOptionsOverride)
    if (!js.isUndefined(loadOnMount)) __obj.updateDynamic("loadOnMount")(loadOnMount)
    if (!js.isUndefined(loadOnReload)) __obj.updateDynamic("loadOnReload")(loadOnReload)
    if (!js.isUndefined(loadOnReset)) __obj.updateDynamic("loadOnReset")(loadOnReset)
    if (!js.isUndefined(reloadOnLoad)) __obj.updateDynamic("reloadOnLoad")(reloadOnLoad)
    if (!js.isUndefined(resetOnLoad)) __obj.updateDynamic("resetOnLoad")(resetOnLoad)
    __obj.asInstanceOf[Anon_FetchOptionsOverrideLoadOnMount[V]]
  }
}

