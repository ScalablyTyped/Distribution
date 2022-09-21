package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor extends StObject {
  
  /**
    * The platform type targeted by the list's entries.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The entry types contained in the list.
    */
  var threatEntryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The threat type posed by the list's entries.
    */
  var threatType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor](x: Self) {
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeNull: Self = StObject.set(x, "threatEntryType", null)
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeNull: Self = StObject.set(x, "threatType", null)
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
