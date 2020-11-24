package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLFetchOptions
import typings.graphqlReact.mod.GraphQLFetchOptionsOverride
import typings.graphqlReact.mod.GraphQLOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptionsOverride[V] extends js.Object {
  
  var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.native
  
  var operation: GraphQLOperation[V] = js.native
  
  var reloadOnLoad: js.UndefOr[Boolean] = js.native
  
  var resetOnLoad: js.UndefOr[Boolean] = js.native
}
object FetchOptionsOverride {
  
  @scala.inline
  def apply[V](operation: GraphQLOperation[V]): FetchOptionsOverride[V] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptionsOverride[V]]
  }
  
  @scala.inline
  implicit class FetchOptionsOverrideOps[Self <: FetchOptionsOverride[_], V] (val x: Self with FetchOptionsOverride[V]) extends AnyVal {
    
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
    def setReloadOnLoad(value: Boolean): Self = this.set("reloadOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadOnLoad: Self = this.set("reloadOnLoad", js.undefined)
    
    @scala.inline
    def setResetOnLoad(value: Boolean): Self = this.set("resetOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetOnLoad: Self = this.set("resetOnLoad", js.undefined)
  }
}
