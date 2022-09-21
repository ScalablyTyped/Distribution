package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1RawHashes extends StObject {
  
  /**
    * The number of bytes for each prefix encoded below. This field can be anywhere from 4 (shortest prefix) to 32 (full SHA256 hash). In practice this is almost always 4, except in exceptional circumstances.
    */
  var prefixSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes are sorted in lexicographic order. For JSON API users, hashes are base64-encoded.
    */
  var rawHashes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudWebriskV1RawHashes {
  
  inline def apply(): SchemaGoogleCloudWebriskV1RawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1RawHashes]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1RawHashes](x: Self) {
    
    inline def setPrefixSize(value: Double): Self = StObject.set(x, "prefixSize", value.asInstanceOf[js.Any])
    
    inline def setPrefixSizeNull: Self = StObject.set(x, "prefixSize", null)
    
    inline def setPrefixSizeUndefined: Self = StObject.set(x, "prefixSize", js.undefined)
    
    inline def setRawHashes(value: String): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    inline def setRawHashesNull: Self = StObject.set(x, "rawHashes", null)
    
    inline def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
  }
}
