package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCryptoKeyPrimaryVersionRequest extends StObject {
  
  /** Required. The id of the child CryptoKeyVersion to use as primary. */
  var cryptoKeyVersionId: js.UndefOr[String] = js.undefined
}
object UpdateCryptoKeyPrimaryVersionRequest {
  
  inline def apply(): UpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCryptoKeyPrimaryVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCryptoKeyPrimaryVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setCryptoKeyVersionId(value: String): Self = StObject.set(x, "cryptoKeyVersionId", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyVersionIdUndefined: Self = StObject.set(x, "cryptoKeyVersionId", js.undefined)
  }
}
