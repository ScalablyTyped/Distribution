package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest extends StObject {
  
  /**
    * The constraints associated with this request.
    */
  var constraints: js.UndefOr[
    SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequestConstraints
  ] = js.undefined
  
  /**
    * The type of platform at risk by entries present in the list.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current state of the client for the requested list (the encrypted client state that was received from the last successful list update).
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The types of entries present in the list.
    */
  var threatEntryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of threat posed by entries present in the list.
    */
  var threatType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest](x: Self) {
    
    inline def setConstraints(value: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequestConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeNull: Self = StObject.set(x, "threatEntryType", null)
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeNull: Self = StObject.set(x, "threatType", null)
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
