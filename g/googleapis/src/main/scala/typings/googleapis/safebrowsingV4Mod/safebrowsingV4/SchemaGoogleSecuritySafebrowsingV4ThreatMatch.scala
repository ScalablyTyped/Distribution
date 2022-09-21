package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatMatch extends StObject {
  
  /**
    * The cache lifetime for the returned match. Clients must not cache this response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The platform type matching this threat.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The threat matching this threat.
    */
  var threat: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ThreatEntry] = js.undefined
  
  /**
    * Optional metadata associated with this threat.
    */
  var threatEntryMetadata: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata] = js.undefined
  
  /**
    * The threat entry type matching this threat.
    */
  var threatEntryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The threat type matching this threat.
    */
  var threatType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatMatch {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatMatch]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatMatch](x: Self) {
    
    inline def setCacheDuration(value: String): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
    
    inline def setCacheDurationNull: Self = StObject.set(x, "cacheDuration", null)
    
    inline def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setThreat(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntry): Self = StObject.set(x, "threat", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryMetadata(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata): Self = StObject.set(x, "threatEntryMetadata", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryMetadataUndefined: Self = StObject.set(x, "threatEntryMetadata", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeNull: Self = StObject.set(x, "threatEntryType", null)
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeNull: Self = StObject.set(x, "threatType", null)
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setThreatUndefined: Self = StObject.set(x, "threat", js.undefined)
  }
}
