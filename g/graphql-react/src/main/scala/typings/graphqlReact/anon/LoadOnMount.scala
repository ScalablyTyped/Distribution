package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLFetchOptions
import typings.graphqlReact.mod.GraphQLFetchOptionsOverride
import typings.graphqlReact.mod.GraphQLOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOnMount[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.native
  var loadOnMount: js.UndefOr[Boolean] = js.native
  var loadOnReload: js.UndefOr[Boolean] = js.native
  var loadOnReset: js.UndefOr[Boolean] = js.native
  var operation: GraphQLOperation[V] = js.native
  var reloadOnLoad: js.UndefOr[Boolean] = js.native
  var resetOnLoad: js.UndefOr[Boolean] = js.native
}

object LoadOnMount {
  @scala.inline
  def apply[V](operation: GraphQLOperation[V]): LoadOnMount[V] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOnMount[V]]
  }
  @scala.inline
  implicit class LoadOnMountOps[Self <: LoadOnMount[_], V] (val x: Self with LoadOnMount[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperation(value: GraphQLOperation[V]): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchOptionsOverride(value: /* options */ GraphQLFetchOptions => Unit): Self = this.set("fetchOptionsOverride", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFetchOptionsOverride: Self = this.set("fetchOptionsOverride", js.undefined)
    @scala.inline
    def setLoadOnMount(value: Boolean): Self = this.set("loadOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnMount: Self = this.set("loadOnMount", js.undefined)
    @scala.inline
    def setLoadOnReload(value: Boolean): Self = this.set("loadOnReload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnReload: Self = this.set("loadOnReload", js.undefined)
    @scala.inline
    def setLoadOnReset(value: Boolean): Self = this.set("loadOnReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnReset: Self = this.set("loadOnReset", js.undefined)
    @scala.inline
    def setReloadOnLoad(value: Boolean): Self = this.set("reloadOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReloadOnLoad: Self = this.set("reloadOnLoad", js.undefined)
    @scala.inline
    def setResetOnLoad(value: Boolean): Self = this.set("resetOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnLoad: Self = this.set("resetOnLoad", js.undefined)
  }
  
}

