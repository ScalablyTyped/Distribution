package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudNetworksecurityV1CertificateProvider extends StObject {
  
  /**
    * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
    */
  var certificateProviderInstance: js.UndefOr[SchemaCertificateProviderInstance] = js.undefined
  
  /**
    * gRPC specific configuration to access the gRPC server to obtain the cert and private key.
    */
  var grpcEndpoint: js.UndefOr[SchemaGoogleCloudNetworksecurityV1GrpcEndpoint] = js.undefined
}
object SchemaGoogleCloudNetworksecurityV1CertificateProvider {
  
  inline def apply(): SchemaGoogleCloudNetworksecurityV1CertificateProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudNetworksecurityV1CertificateProvider]
  }
  
  extension [Self <: SchemaGoogleCloudNetworksecurityV1CertificateProvider](x: Self) {
    
    inline def setCertificateProviderInstance(value: SchemaCertificateProviderInstance): Self = StObject.set(x, "certificateProviderInstance", value.asInstanceOf[js.Any])
    
    inline def setCertificateProviderInstanceUndefined: Self = StObject.set(x, "certificateProviderInstance", js.undefined)
    
    inline def setGrpcEndpoint(value: SchemaGoogleCloudNetworksecurityV1GrpcEndpoint): Self = StObject.set(x, "grpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setGrpcEndpointUndefined: Self = StObject.set(x, "grpcEndpoint", js.undefined)
  }
}
