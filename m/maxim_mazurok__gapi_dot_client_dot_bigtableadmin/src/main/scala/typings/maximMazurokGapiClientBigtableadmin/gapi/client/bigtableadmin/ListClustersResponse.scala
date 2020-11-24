package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClustersResponse extends js.Object {
  
  /** The list of requested clusters. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.native
  
  /**
    * Locations from which Cluster information could not be retrieved, due to an outage or some other transient condition. Clusters from these locations may be missing from `clusters`, or
    * may only have partial information returned. Values are of the form `projects//locations/`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  
  /** DEPRECATED: This field is unused and ignored. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListClustersResponse {
  
  @scala.inline
  def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  @scala.inline
  implicit class ListClustersResponseOps[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    
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
    def setClustersVarargs(value: Cluster*): Self = this.set("clusters", js.Array(value :_*))
    
    @scala.inline
    def setClusters(value: js.Array[Cluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    
    @scala.inline
    def setFailedLocationsVarargs(value: String*): Self = this.set("failedLocations", js.Array(value :_*))
    
    @scala.inline
    def setFailedLocations(value: js.Array[String]): Self = this.set("failedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedLocations: Self = this.set("failedLocations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
