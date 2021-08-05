package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SSH public key information associated with a Google account.
  */
trait SchemaSshPublicKey extends StObject {
  
  /**
    * An expiration time in microseconds since epoch.
    */
  var expirationTimeUsec: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The SHA-256 fingerprint of the SSH public key.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Public key text in SSH format, defined by &lt;a
    * href=&quot;https://www.ietf.org/rfc/rfc4253.txt&quot;
    * target=&quot;_blank&quot;&gt;RFC4253&lt;/a&gt; section 6.6.
    */
  var key: js.UndefOr[String] = js.undefined
}
object SchemaSshPublicKey {
  
  inline def apply(): SchemaSshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSshPublicKey]
  }
  
  extension [Self <: SchemaSshPublicKey](x: Self) {
    
    inline def setExpirationTimeUsec(value: String): Self = StObject.set(x, "expirationTimeUsec", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUsecUndefined: Self = StObject.set(x, "expirationTimeUsec", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
