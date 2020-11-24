package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends js.Object {
  
  /** Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden. */
  var defaultStorageType: js.UndefOr[String] = js.native
  
  /**
    * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are
    * supported, so values should be of the form `projects/{project}/locations/{zone}`.
    */
  var location: js.UndefOr[String] = js.native
  
  /** The unique name of the cluster. Values are of the form `projects/{project}/instances/{instance}/clusters/a-z*`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance. */
  var serveNodes: js.UndefOr[Double] = js.native
  
  /** Output only. The current state of the cluster. */
  var state: js.UndefOr[String] = js.native
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    
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
    def setDefaultStorageType(value: String): Self = this.set("defaultStorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStorageType: Self = this.set("defaultStorageType", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServeNodes(value: Double): Self = this.set("serveNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeNodes: Self = this.set("serveNodes", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
