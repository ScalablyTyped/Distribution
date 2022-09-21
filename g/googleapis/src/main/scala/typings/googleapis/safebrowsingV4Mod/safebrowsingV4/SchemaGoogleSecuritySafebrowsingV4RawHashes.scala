package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4RawHashes extends StObject {
  
  /**
    * The number of bytes for each prefix encoded below. This field can be anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
    */
  var prefixSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes are sorted in lexicographic order. For JSON API users, hashes are base64-encoded.
    */
  var rawHashes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4RawHashes {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4RawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4RawHashes]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4RawHashes](x: Self) {
    
    inline def setPrefixSize(value: Double): Self = StObject.set(x, "prefixSize", value.asInstanceOf[js.Any])
    
    inline def setPrefixSizeNull: Self = StObject.set(x, "prefixSize", null)
    
    inline def setPrefixSizeUndefined: Self = StObject.set(x, "prefixSize", js.undefined)
    
    inline def setRawHashes(value: String): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    inline def setRawHashesNull: Self = StObject.set(x, "rawHashes", null)
    
    inline def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
  }
}
