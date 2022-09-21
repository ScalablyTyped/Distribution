package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceFileRemote extends StObject {
  
  /**
    * SHA256 checksum of the remote file.
    */
  var sha256Checksum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol\}://{location\}`.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceFileRemote {
  
  inline def apply(): SchemaOSPolicyResourceFileRemote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceFileRemote]
  }
  
  extension [Self <: SchemaOSPolicyResourceFileRemote](x: Self) {
    
    inline def setSha256Checksum(value: String): Self = StObject.set(x, "sha256Checksum", value.asInstanceOf[js.Any])
    
    inline def setSha256ChecksumNull: Self = StObject.set(x, "sha256Checksum", null)
    
    inline def setSha256ChecksumUndefined: Self = StObject.set(x, "sha256Checksum", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
