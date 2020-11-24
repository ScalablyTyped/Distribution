package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleClusterRouting extends js.Object {
  
  /**
    * Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are allowed by this app profile. It is unsafe to send these requests to the same table/row/column in multiple
    * clusters.
    */
  var allowTransactionalWrites: js.UndefOr[Boolean] = js.native
  
  /** The cluster to which read/write requests should be routed. */
  var clusterId: js.UndefOr[String] = js.native
}
object SingleClusterRouting {
  
  @scala.inline
  def apply(): SingleClusterRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleClusterRouting]
  }
  
  @scala.inline
  implicit class SingleClusterRoutingOps[Self <: SingleClusterRouting] (val x: Self) extends AnyVal {
    
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
    def setAllowTransactionalWrites(value: Boolean): Self = this.set("allowTransactionalWrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTransactionalWrites: Self = this.set("allowTransactionalWrites", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
  }
}
