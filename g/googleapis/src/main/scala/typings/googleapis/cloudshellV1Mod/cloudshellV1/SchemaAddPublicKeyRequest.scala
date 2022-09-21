package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddPublicKeyRequest extends StObject {
  
  /**
    * Key that should be added to the environment. Supported formats are `ssh-dss` (see RFC4253), `ssh-rsa` (see RFC4253), `ecdsa-sha2-nistp256` (see RFC5656), `ecdsa-sha2-nistp384` (see RFC5656) and `ecdsa-sha2-nistp521` (see RFC5656). It should be structured as <format\> <content\>, where <content\> part is encoded with Base64.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddPublicKeyRequest {
  
  inline def apply(): SchemaAddPublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddPublicKeyRequest]
  }
  
  extension [Self <: SchemaAddPublicKeyRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
