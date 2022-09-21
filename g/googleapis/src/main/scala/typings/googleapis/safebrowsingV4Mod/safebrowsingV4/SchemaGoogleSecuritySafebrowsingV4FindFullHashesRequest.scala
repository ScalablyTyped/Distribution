package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest extends StObject {
  
  /**
    * Client metadata associated with callers of higher-level APIs built on top of the client's implementation.
    */
  var apiClient: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /**
    * The current client states for each of the client's local threat lists.
    */
  var clientStates: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The lists and hashes to be checked.
    */
  var threatInfo: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ThreatInfo] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FindFullHashesRequest](x: Self) {
    
    inline def setApiClient(value: SchemaGoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "apiClient", value.asInstanceOf[js.Any])
    
    inline def setApiClientUndefined: Self = StObject.set(x, "apiClient", js.undefined)
    
    inline def setClient(value: SchemaGoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientStates(value: js.Array[String]): Self = StObject.set(x, "clientStates", value.asInstanceOf[js.Any])
    
    inline def setClientStatesNull: Self = StObject.set(x, "clientStates", null)
    
    inline def setClientStatesUndefined: Self = StObject.set(x, "clientStates", js.undefined)
    
    inline def setClientStatesVarargs(value: String*): Self = StObject.set(x, "clientStates", js.Array(value*))
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: SchemaGoogleSecuritySafebrowsingV4ThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
