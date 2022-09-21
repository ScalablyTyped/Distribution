package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatInfo extends StObject {
  
  /**
    * The platform types to be checked.
    */
  var platformTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The threat entries to be checked.
    */
  var threatEntries: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntry]] = js.undefined
  
  /**
    * The entry types to be checked.
    */
  var threatEntryTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The threat types to be checked.
    */
  var threatTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatInfo {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatInfo]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatInfo](x: Self) {
    
    inline def setPlatformTypes(value: js.Array[String]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesNull: Self = StObject.set(x, "platformTypes", null)
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: String*): Self = StObject.set(x, "platformTypes", js.Array(value*))
    
    inline def setThreatEntries(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntry]): Self = StObject.set(x, "threatEntries", value.asInstanceOf[js.Any])
    
    inline def setThreatEntriesUndefined: Self = StObject.set(x, "threatEntries", js.undefined)
    
    inline def setThreatEntriesVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntry*): Self = StObject.set(x, "threatEntries", js.Array(value*))
    
    inline def setThreatEntryTypes(value: js.Array[String]): Self = StObject.set(x, "threatEntryTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypesNull: Self = StObject.set(x, "threatEntryTypes", null)
    
    inline def setThreatEntryTypesUndefined: Self = StObject.set(x, "threatEntryTypes", js.undefined)
    
    inline def setThreatEntryTypesVarargs(value: String*): Self = StObject.set(x, "threatEntryTypes", js.Array(value*))
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesNull: Self = StObject.set(x, "threatTypes", null)
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
  }
}
