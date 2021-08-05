package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a POSIX account entry.
  */
trait SchemaUserSshPublicKey extends StObject {
  
  /**
    * An expiration time in microseconds since epoch.
    */
  var expirationTimeUsec: js.UndefOr[String] = js.undefined
  
  /**
    * A SHA-256 fingerprint of the SSH public key. (Read-only)
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * An SSH public key.
    */
  var key: js.UndefOr[String] = js.undefined
}
object SchemaUserSshPublicKey {
  
  inline def apply(): SchemaUserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserSshPublicKey]
  }
  
  extension [Self <: SchemaUserSshPublicKey](x: Self) {
    
    inline def setExpirationTimeUsec(value: String): Self = StObject.set(x, "expirationTimeUsec", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUsecUndefined: Self = StObject.set(x, "expirationTimeUsec", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
