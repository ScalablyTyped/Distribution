package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualClusterConfig extends StObject {
  
  /** Optional. Configuration of auxiliary services used by this cluster. */
  var auxiliaryServicesConfig: js.UndefOr[AuxiliaryServicesConfig] = js.undefined
  
  /** Required. The configuration for running the Dataproc cluster on Kubernetes. */
  var kubernetesClusterConfig: js.UndefOr[KubernetesClusterConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a
    * Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this
    * project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires
    * a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
    */
  var stagingBucket: js.UndefOr[String] = js.undefined
}
object VirtualClusterConfig {
  
  inline def apply(): VirtualClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualClusterConfig]
  }
  
  extension [Self <: VirtualClusterConfig](x: Self) {
    
    inline def setAuxiliaryServicesConfig(value: AuxiliaryServicesConfig): Self = StObject.set(x, "auxiliaryServicesConfig", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryServicesConfigUndefined: Self = StObject.set(x, "auxiliaryServicesConfig", js.undefined)
    
    inline def setKubernetesClusterConfig(value: KubernetesClusterConfig): Self = StObject.set(x, "kubernetesClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setKubernetesClusterConfigUndefined: Self = StObject.set(x, "kubernetesClusterConfig", js.undefined)
    
    inline def setStagingBucket(value: String): Self = StObject.set(x, "stagingBucket", value.asInstanceOf[js.Any])
    
    inline def setStagingBucketUndefined: Self = StObject.set(x, "stagingBucket", js.undefined)
  }
}
