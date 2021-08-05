package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a Safe Browsing API update request. Clients can request updates
  * for multiple lists in a single request. NOTE: Field index 2 is unused.
  * NEXT: 5
  */
trait SchemaFetchThreatListUpdatesRequest extends StObject {
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.undefined
  
  /**
    * The requested threat list updates.
    */
  var listUpdateRequests: js.UndefOr[js.Array[SchemaListUpdateRequest]] = js.undefined
}
object SchemaFetchThreatListUpdatesRequest {
  
  inline def apply(): SchemaFetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchThreatListUpdatesRequest]
  }
  
  extension [Self <: SchemaFetchThreatListUpdatesRequest](x: Self) {
    
    inline def setClient(value: SchemaClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setListUpdateRequests(value: js.Array[SchemaListUpdateRequest]): Self = StObject.set(x, "listUpdateRequests", value.asInstanceOf[js.Any])
    
    inline def setListUpdateRequestsUndefined: Self = StObject.set(x, "listUpdateRequests", js.undefined)
    
    inline def setListUpdateRequestsVarargs(value: SchemaListUpdateRequest*): Self = StObject.set(x, "listUpdateRequests", js.Array(value :_*))
  }
}
