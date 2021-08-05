package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The uncompressed threat entries in hash format of a particular prefix
  * length. Hashes can be anywhere from 4 to 32 bytes in size. A large majority
  * are 4 bytes, but some hashes are lengthened if they collide with the hash
  * of a popular URL.  Used for sending ThreatEntrySet to clients that do not
  * support compression, or when sending non-4-byte hashes to clients that do
  * support compression.
  */
trait SchemaRawHashes extends StObject {
  
  /**
    * The number of bytes for each prefix encoded below.  This field can be
    * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
    */
  var prefixSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes
    * are sorted in lexicographic order. For JSON API users, hashes are
    * base64-encoded.
    */
  var rawHashes: js.UndefOr[String] = js.undefined
}
object SchemaRawHashes {
  
  inline def apply(): SchemaRawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRawHashes]
  }
  
  extension [Self <: SchemaRawHashes](x: Self) {
    
    inline def setPrefixSize(value: Double): Self = StObject.set(x, "prefixSize", value.asInstanceOf[js.Any])
    
    inline def setPrefixSizeUndefined: Self = StObject.set(x, "prefixSize", js.undefined)
    
    inline def setRawHashes(value: String): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    inline def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
  }
}
