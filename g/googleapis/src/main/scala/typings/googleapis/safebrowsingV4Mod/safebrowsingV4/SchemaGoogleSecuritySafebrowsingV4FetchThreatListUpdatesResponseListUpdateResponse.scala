package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse extends StObject {
  
  /**
    * A set of entries to add to a local threat type's list. Repeated to allow for a combination of compressed and raw data to be sent in a single response.
    */
  var additions: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntrySet]] = js.undefined
  
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present in the database after applying the provided update. If the client state doesn't match the expected state, the client must disregard this update and retry later.
    */
  var checksum: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4Checksum] = js.undefined
  
  /**
    * The new client state, in encrypted format. Opaque to clients.
    */
  var newClientState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The platform type for which data is returned.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of entries to remove from a local threat type's list. In practice, this field is empty or contains exactly one ThreatEntrySet.
    */
  var removals: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntrySet]] = js.undefined
  
  /**
    * The type of response. This may indicate that an action is required by the client when the response is received.
    */
  var responseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The format of the threats.
    */
  var threatEntryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The threat type for which data is returned.
    */
  var threatType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse](x: Self) {
    
    inline def setAdditions(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntrySet]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setAdditionsVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntrySet*): Self = StObject.set(x, "additions", js.Array(value*))
    
    inline def setChecksum(value: SchemaGoogleSecuritySafebrowsingV4Checksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setNewClientState(value: String): Self = StObject.set(x, "newClientState", value.asInstanceOf[js.Any])
    
    inline def setNewClientStateNull: Self = StObject.set(x, "newClientState", null)
    
    inline def setNewClientStateUndefined: Self = StObject.set(x, "newClientState", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setRemovals(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntrySet]): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
    
    inline def setRemovalsUndefined: Self = StObject.set(x, "removals", js.undefined)
    
    inline def setRemovalsVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntrySet*): Self = StObject.set(x, "removals", js.Array(value*))
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeNull: Self = StObject.set(x, "threatEntryType", null)
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeNull: Self = StObject.set(x, "threatType", null)
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
