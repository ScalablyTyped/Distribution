package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMasterRequest extends StObject {
  
  /** Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Kubernetes version to change the master to. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following
    * behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch
    * in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default Kubernetes version
    */
  var masterVersion: js.UndefOr[String] = js.undefined
  
  /** The name (project, location, cluster) of the cluster to update. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name
    * field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object UpdateMasterRequest {
  
  @scala.inline
  def apply(): UpdateMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMasterRequest]
  }
  
  @scala.inline
  implicit class UpdateMasterRequestMutableBuilder[Self <: UpdateMasterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setMasterVersion(value: String): Self = StObject.set(x, "masterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterVersionUndefined: Self = StObject.set(x, "masterVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
