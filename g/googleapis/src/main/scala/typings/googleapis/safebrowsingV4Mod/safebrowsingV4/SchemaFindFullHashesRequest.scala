package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to return full hashes matched by the provided hash prefixes.
  */
trait SchemaFindFullHashesRequest extends StObject {
  
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client&#39;s implementation.
    */
  var apiClient: js.UndefOr[SchemaClientInfo] = js.undefined
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.undefined
  
  /**
    * The current client states for each of the client&#39;s local threat
    * lists.
    */
  var clientStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The lists and hashes to be checked.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.undefined
}
object SchemaFindFullHashesRequest {
  
  inline def apply(): SchemaFindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindFullHashesRequest]
  }
  
  extension [Self <: SchemaFindFullHashesRequest](x: Self) {
    
    inline def setApiClient(value: SchemaClientInfo): Self = StObject.set(x, "apiClient", value.asInstanceOf[js.Any])
    
    inline def setApiClientUndefined: Self = StObject.set(x, "apiClient", js.undefined)
    
    inline def setClient(value: SchemaClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientStates(value: js.Array[String]): Self = StObject.set(x, "clientStates", value.asInstanceOf[js.Any])
    
    inline def setClientStatesUndefined: Self = StObject.set(x, "clientStates", js.undefined)
    
    inline def setClientStatesVarargs(value: String*): Self = StObject.set(x, "clientStates", js.Array(value :_*))
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: SchemaThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
