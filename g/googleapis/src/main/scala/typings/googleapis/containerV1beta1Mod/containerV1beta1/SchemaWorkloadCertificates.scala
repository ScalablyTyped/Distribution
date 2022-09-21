package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadCertificates extends StObject {
  
  /**
    * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
    */
  var enableCertificates: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaWorkloadCertificates {
  
  inline def apply(): SchemaWorkloadCertificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadCertificates]
  }
  
  extension [Self <: SchemaWorkloadCertificates](x: Self) {
    
    inline def setEnableCertificates(value: Boolean): Self = StObject.set(x, "enableCertificates", value.asInstanceOf[js.Any])
    
    inline def setEnableCertificatesNull: Self = StObject.set(x, "enableCertificates", null)
    
    inline def setEnableCertificatesUndefined: Self = StObject.set(x, "enableCertificates", js.undefined)
  }
}
