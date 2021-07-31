package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAddonsConfigRequest extends StObject {
  
  /** Required. The desired configurations for the various addons available to run in the cluster. */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.undefined
  
  /** Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /** The name (project, location, cluster) of the cluster to set addons. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
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
object SetAddonsConfigRequest {
  
  @scala.inline
  def apply(): SetAddonsConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetAddonsConfigRequest]
  }
  
  @scala.inline
  implicit class SetAddonsConfigRequestMutableBuilder[Self <: SetAddonsConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddonsConfig(value: AddonsConfig): Self = StObject.set(x, "addonsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonsConfigUndefined: Self = StObject.set(x, "addonsConfig", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
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
