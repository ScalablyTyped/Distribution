package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidationCA extends StObject {
  
  /**
    * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
    */
  var certificateProviderInstance: js.UndefOr[SchemaCertificateProviderInstance] = js.undefined
  
  /**
    * gRPC specific configuration to access the gRPC server to obtain the CA certificate.
    */
  var grpcEndpoint: js.UndefOr[SchemaGoogleCloudNetworksecurityV1GrpcEndpoint] = js.undefined
}
object SchemaValidationCA {
  
  inline def apply(): SchemaValidationCA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationCA]
  }
  
  extension [Self <: SchemaValidationCA](x: Self) {
    
    inline def setCertificateProviderInstance(value: SchemaCertificateProviderInstance): Self = StObject.set(x, "certificateProviderInstance", value.asInstanceOf[js.Any])
    
    inline def setCertificateProviderInstanceUndefined: Self = StObject.set(x, "certificateProviderInstance", js.undefined)
    
    inline def setGrpcEndpoint(value: SchemaGoogleCloudNetworksecurityV1GrpcEndpoint): Self = StObject.set(x, "grpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setGrpcEndpointUndefined: Self = StObject.set(x, "grpcEndpoint", js.undefined)
  }
}
