package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCertificates extends StObject {
  
  /**
    * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which
    * can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
    */
  var enableCertificates: js.UndefOr[Boolean] = js.undefined
}
object MeshCertificates {
  
  inline def apply(): MeshCertificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCertificates]
  }
  
  extension [Self <: MeshCertificates](x: Self) {
    
    inline def setEnableCertificates(value: Boolean): Self = StObject.set(x, "enableCertificates", value.asInstanceOf[js.Any])
    
    inline def setEnableCertificatesUndefined: Self = StObject.set(x, "enableCertificates", js.undefined)
  }
}
