package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest extends StObject {
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /**
    * The requested threat list updates.
    */
  var listUpdateRequests: js.UndefOr[
    js.Array[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest]
  ] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest](x: Self) {
    
    inline def setClient(value: SchemaGoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setListUpdateRequests(value: js.Array[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest]): Self = StObject.set(x, "listUpdateRequests", value.asInstanceOf[js.Any])
    
    inline def setListUpdateRequestsUndefined: Self = StObject.set(x, "listUpdateRequests", js.undefined)
    
    inline def setListUpdateRequestsVarargs(value: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest*): Self = StObject.set(x, "listUpdateRequests", js.Array(value*))
  }
}
