package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVirtualClusterConfig extends StObject {
  
  /**
    * Optional. Configuration of auxiliary services used by this cluster.
    */
  var auxiliaryServicesConfig: js.UndefOr[SchemaAuxiliaryServicesConfig] = js.undefined
  
  /**
    * Required. The configuration for running the Dataproc cluster on Kubernetes.
    */
  var kubernetesClusterConfig: js.UndefOr[SchemaKubernetesClusterConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
    */
  var stagingBucket: js.UndefOr[String | Null] = js.undefined
}
object SchemaVirtualClusterConfig {
  
  inline def apply(): SchemaVirtualClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVirtualClusterConfig]
  }
  
  extension [Self <: SchemaVirtualClusterConfig](x: Self) {
    
    inline def setAuxiliaryServicesConfig(value: SchemaAuxiliaryServicesConfig): Self = StObject.set(x, "auxiliaryServicesConfig", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryServicesConfigUndefined: Self = StObject.set(x, "auxiliaryServicesConfig", js.undefined)
    
    inline def setKubernetesClusterConfig(value: SchemaKubernetesClusterConfig): Self = StObject.set(x, "kubernetesClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setKubernetesClusterConfigUndefined: Self = StObject.set(x, "kubernetesClusterConfig", js.undefined)
    
    inline def setStagingBucket(value: String): Self = StObject.set(x, "stagingBucket", value.asInstanceOf[js.Any])
    
    inline def setStagingBucketNull: Self = StObject.set(x, "stagingBucket", null)
    
    inline def setStagingBucketUndefined: Self = StObject.set(x, "stagingBucket", js.undefined)
  }
}
