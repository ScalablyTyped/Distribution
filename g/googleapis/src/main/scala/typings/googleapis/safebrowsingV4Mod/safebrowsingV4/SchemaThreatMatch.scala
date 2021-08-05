package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A match when checking a threat entry in the Safe Browsing threat lists.
  */
trait SchemaThreatMatch extends StObject {
  
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String] = js.undefined
  
  /**
    * The platform type matching this threat.
    */
  var platformType: js.UndefOr[String] = js.undefined
  
  /**
    * The threat matching this threat.
    */
  var threat: js.UndefOr[SchemaThreatEntry] = js.undefined
  
  /**
    * Optional metadata associated with this threat.
    */
  var threatEntryMetadata: js.UndefOr[SchemaThreatEntryMetadata] = js.undefined
  
  /**
    * The threat entry type matching this threat.
    */
  var threatEntryType: js.UndefOr[String] = js.undefined
  
  /**
    * The threat type matching this threat.
    */
  var threatType: js.UndefOr[String] = js.undefined
}
object SchemaThreatMatch {
  
  inline def apply(): SchemaThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatMatch]
  }
  
  extension [Self <: SchemaThreatMatch](x: Self) {
    
    inline def setCacheDuration(value: String): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
    
    inline def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setThreat(value: SchemaThreatEntry): Self = StObject.set(x, "threat", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryMetadata(value: SchemaThreatEntryMetadata): Self = StObject.set(x, "threatEntryMetadata", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryMetadataUndefined: Self = StObject.set(x, "threatEntryMetadata", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setThreatUndefined: Self = StObject.set(x, "threat", js.undefined)
  }
}
