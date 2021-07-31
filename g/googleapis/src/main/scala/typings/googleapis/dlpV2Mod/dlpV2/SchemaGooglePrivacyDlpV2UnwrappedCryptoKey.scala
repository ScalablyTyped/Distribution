package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Using raw keys is prone to security risks due to accidentally leaking the
  * key. Choose another type of key if possible.
  */
trait SchemaGooglePrivacyDlpV2UnwrappedCryptoKey extends StObject {
  
  /**
    * A 128/192/256 bit key. [required]
    */
  var key: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2UnwrappedCryptoKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UnwrappedCryptoKeyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
