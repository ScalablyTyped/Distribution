package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata extends StObject {
  
  /**
    * The metadata entries.
    */
  var entries: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry]] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadata](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
