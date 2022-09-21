package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFile extends StObject {
  
  /**
    * Prefix of the file contents as a JSON encoded string. (Currently only populated for Malicious Script Executed findings.)
    */
  var contents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The length in bytes of the file prefix that was hashed. If hashed_size == size, any hashes reported represent the entire file.
    */
  var hashedSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True when the hash covers only a prefix of the file.
    */
  var partiallyHashed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Absolute path of the file as a JSON encoded string.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SHA256 hash of the first hashed_size bytes of the file encoded as a hex string. If hashed_size == size, sha256 represents the SHA256 hash of the entire file.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Size of the file in bytes.
    */
  var size: js.UndefOr[String | Null] = js.undefined
}
object SchemaFile {
  
  inline def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  extension [Self <: SchemaFile](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setHashedSize(value: String): Self = StObject.set(x, "hashedSize", value.asInstanceOf[js.Any])
    
    inline def setHashedSizeNull: Self = StObject.set(x, "hashedSize", null)
    
    inline def setHashedSizeUndefined: Self = StObject.set(x, "hashedSize", js.undefined)
    
    inline def setPartiallyHashed(value: Boolean): Self = StObject.set(x, "partiallyHashed", value.asInstanceOf[js.Any])
    
    inline def setPartiallyHashedNull: Self = StObject.set(x, "partiallyHashed", null)
    
    inline def setPartiallyHashedUndefined: Self = StObject.set(x, "partiallyHashed", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
