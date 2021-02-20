package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a POSIX account entry.
  */
@js.native
trait SchemaUserSshPublicKey extends StObject {
  
  /**
    * An expiration time in microseconds since epoch.
    */
  var expirationTimeUsec: js.UndefOr[String] = js.native
  
  /**
    * A SHA-256 fingerprint of the SSH public key. (Read-only)
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * An SSH public key.
    */
  var key: js.UndefOr[String] = js.native
}
object SchemaUserSshPublicKey {
  
  @scala.inline
  def apply(): SchemaUserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserSshPublicKey]
  }
  
  @scala.inline
  implicit class SchemaUserSshPublicKeyMutableBuilder[Self <: SchemaUserSshPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationTimeUsec(value: String): Self = StObject.set(x, "expirationTimeUsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUsecUndefined: Self = StObject.set(x, "expirationTimeUsec", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
