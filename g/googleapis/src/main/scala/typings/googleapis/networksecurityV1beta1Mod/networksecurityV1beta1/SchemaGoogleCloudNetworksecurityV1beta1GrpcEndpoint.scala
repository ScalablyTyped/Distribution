package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudNetworksecurityV1beta1GrpcEndpoint extends StObject {
  
  /**
    * Required. The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
    */
  var targetUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudNetworksecurityV1beta1GrpcEndpoint {
  
  inline def apply(): SchemaGoogleCloudNetworksecurityV1beta1GrpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudNetworksecurityV1beta1GrpcEndpoint]
  }
  
  extension [Self <: SchemaGoogleCloudNetworksecurityV1beta1GrpcEndpoint](x: Self) {
    
    inline def setTargetUri(value: String): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
    
    inline def setTargetUriNull: Self = StObject.set(x, "targetUri", null)
    
    inline def setTargetUriUndefined: Self = StObject.set(x, "targetUri", js.undefined)
  }
}
