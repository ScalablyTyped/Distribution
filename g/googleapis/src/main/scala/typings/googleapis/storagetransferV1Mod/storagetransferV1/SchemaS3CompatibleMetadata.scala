package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaS3CompatibleMetadata extends StObject {
  
  /**
    * Specifies the authentication and authorization method used by the storage service. When not specified, Transfer Service will attempt to determine right auth method to use.
    */
  var authMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Listing API to use for discovering objects. When not specified, Transfer Service will attempt to determine the right API to use.
    */
  var listApi: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the network protocol of the agent. When not specified, the default value of NetworkProtocol NETWORK_PROTOCOL_HTTPS is used.
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the API request model used to call the storage service. When not specified, the default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used.
    */
  var requestModel: js.UndefOr[String | Null] = js.undefined
}
object SchemaS3CompatibleMetadata {
  
  inline def apply(): SchemaS3CompatibleMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaS3CompatibleMetadata]
  }
  
  extension [Self <: SchemaS3CompatibleMetadata](x: Self) {
    
    inline def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthMethodNull: Self = StObject.set(x, "authMethod", null)
    
    inline def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
    
    inline def setListApi(value: String): Self = StObject.set(x, "listApi", value.asInstanceOf[js.Any])
    
    inline def setListApiNull: Self = StObject.set(x, "listApi", null)
    
    inline def setListApiUndefined: Self = StObject.set(x, "listApi", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRequestModel(value: String): Self = StObject.set(x, "requestModel", value.asInstanceOf[js.Any])
    
    inline def setRequestModelNull: Self = StObject.set(x, "requestModel", null)
    
    inline def setRequestModelUndefined: Self = StObject.set(x, "requestModel", js.undefined)
  }
}
