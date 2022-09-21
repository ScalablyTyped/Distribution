package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyUsageOptions extends StObject {
  
  /**
    * The key may be used to sign certificates.
    */
  var certSign: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
    */
  var contentCommitment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used sign certificate revocation lists.
    */
  var crlSign: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used to encipher data.
    */
  var dataEncipherment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used to decipher only.
    */
  var decipherOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used for digital signatures.
    */
  var digitalSignature: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used to encipher only.
    */
  var encipherOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used in a key agreement protocol.
    */
  var keyAgreement: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key may be used to encipher other keys.
    */
  var keyEncipherment: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaKeyUsageOptions {
  
  inline def apply(): SchemaKeyUsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyUsageOptions]
  }
  
  extension [Self <: SchemaKeyUsageOptions](x: Self) {
    
    inline def setCertSign(value: Boolean): Self = StObject.set(x, "certSign", value.asInstanceOf[js.Any])
    
    inline def setCertSignNull: Self = StObject.set(x, "certSign", null)
    
    inline def setCertSignUndefined: Self = StObject.set(x, "certSign", js.undefined)
    
    inline def setContentCommitment(value: Boolean): Self = StObject.set(x, "contentCommitment", value.asInstanceOf[js.Any])
    
    inline def setContentCommitmentNull: Self = StObject.set(x, "contentCommitment", null)
    
    inline def setContentCommitmentUndefined: Self = StObject.set(x, "contentCommitment", js.undefined)
    
    inline def setCrlSign(value: Boolean): Self = StObject.set(x, "crlSign", value.asInstanceOf[js.Any])
    
    inline def setCrlSignNull: Self = StObject.set(x, "crlSign", null)
    
    inline def setCrlSignUndefined: Self = StObject.set(x, "crlSign", js.undefined)
    
    inline def setDataEncipherment(value: Boolean): Self = StObject.set(x, "dataEncipherment", value.asInstanceOf[js.Any])
    
    inline def setDataEnciphermentNull: Self = StObject.set(x, "dataEncipherment", null)
    
    inline def setDataEnciphermentUndefined: Self = StObject.set(x, "dataEncipherment", js.undefined)
    
    inline def setDecipherOnly(value: Boolean): Self = StObject.set(x, "decipherOnly", value.asInstanceOf[js.Any])
    
    inline def setDecipherOnlyNull: Self = StObject.set(x, "decipherOnly", null)
    
    inline def setDecipherOnlyUndefined: Self = StObject.set(x, "decipherOnly", js.undefined)
    
    inline def setDigitalSignature(value: Boolean): Self = StObject.set(x, "digitalSignature", value.asInstanceOf[js.Any])
    
    inline def setDigitalSignatureNull: Self = StObject.set(x, "digitalSignature", null)
    
    inline def setDigitalSignatureUndefined: Self = StObject.set(x, "digitalSignature", js.undefined)
    
    inline def setEncipherOnly(value: Boolean): Self = StObject.set(x, "encipherOnly", value.asInstanceOf[js.Any])
    
    inline def setEncipherOnlyNull: Self = StObject.set(x, "encipherOnly", null)
    
    inline def setEncipherOnlyUndefined: Self = StObject.set(x, "encipherOnly", js.undefined)
    
    inline def setKeyAgreement(value: Boolean): Self = StObject.set(x, "keyAgreement", value.asInstanceOf[js.Any])
    
    inline def setKeyAgreementNull: Self = StObject.set(x, "keyAgreement", null)
    
    inline def setKeyAgreementUndefined: Self = StObject.set(x, "keyAgreement", js.undefined)
    
    inline def setKeyEncipherment(value: Boolean): Self = StObject.set(x, "keyEncipherment", value.asInstanceOf[js.Any])
    
    inline def setKeyEnciphermentNull: Self = StObject.set(x, "keyEncipherment", null)
    
    inline def setKeyEnciphermentUndefined: Self = StObject.set(x, "keyEncipherment", js.undefined)
  }
}
