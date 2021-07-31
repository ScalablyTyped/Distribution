package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyVersionTemplate extends StObject {
  
  /**
    * Required. Algorithm to use when creating a CryptoKeyVersion based on this template. For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both this field is omitted
    * and CryptoKey.purpose is ENCRYPT_DECRYPT.
    */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /** ProtectionLevel to use when creating a CryptoKeyVersion based on this template. Immutable. Defaults to SOFTWARE. */
  var protectionLevel: js.UndefOr[String] = js.undefined
}
object CryptoKeyVersionTemplate {
  
  @scala.inline
  def apply(): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
  
  @scala.inline
  implicit class CryptoKeyVersionTemplateMutableBuilder[Self <: CryptoKeyVersionTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
  }
}
