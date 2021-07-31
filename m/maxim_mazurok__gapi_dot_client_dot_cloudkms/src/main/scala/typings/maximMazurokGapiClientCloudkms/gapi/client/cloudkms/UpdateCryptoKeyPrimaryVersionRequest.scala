package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCryptoKeyPrimaryVersionRequest extends StObject {
  
  /** Required. The id of the child CryptoKeyVersion to use as primary. */
  var cryptoKeyVersionId: js.UndefOr[String] = js.undefined
}
object UpdateCryptoKeyPrimaryVersionRequest {
  
  @scala.inline
  def apply(): UpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCryptoKeyPrimaryVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateCryptoKeyPrimaryVersionRequestMutableBuilder[Self <: UpdateCryptoKeyPrimaryVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKeyVersionId(value: String): Self = StObject.set(x, "cryptoKeyVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyVersionIdUndefined: Self = StObject.set(x, "cryptoKeyVersionId", js.undefined)
  }
}
