package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatEntry extends StObject {
  
  /**
    * The digest of an executable in SHA256 format. The API supports both binary and hex digests. For JSON requests, digests are base64-encoded.
    */
  var digest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256 hash. This field is in binary format. For JSON requests, hashes are base64-encoded.
    */
  var hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A URL.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatEntry {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatEntry]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatEntry](x: Self) {
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
