package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specific tokenization parameters used for
  * [[PaymentMethodTokenizationType|`DIRECT`]].
  *
  * Depending on the payment method you may be required to receive the
  * sensitive data in an encrypted and signed format.
  *
  * Currently the following payment methods require encryption:
  *
  * - [[PaymentMethodType|`CARD`]]
  *
  * See [Payment data
  * cryptography](https://developers.google.com/pay/api/payment-data-cryptography")
  * for more information on how to perform signature
  * verification and decryption of a payment response.
  */
@js.native
trait DirectTokenizationParameters extends StObject {
  
  /**
    * The version of the encryption/signature protocol being used.
    *
    * This field is required when the payment method requires encryption.
    * Unless you were already using an older `protocolVersion`, you
    * should be using the latest version defined in
    * https://developers.google.com/pay/api/web/payment-data-cryptography.
    */
  var protocolVersion: String = js.native
  
  /**
    * Elliptic Curve public key suitable for using with the NIST P-126
    * curve. This public key will used to encrypt the sensitive payment
    * method information.
    *
    * This field is required when the payment method requires encryption.
    */
  var publicKey: String = js.native
}
object DirectTokenizationParameters {
  
  @scala.inline
  def apply(protocolVersion: String, publicKey: String): DirectTokenizationParameters = {
    val __obj = js.Dynamic.literal(protocolVersion = protocolVersion.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTokenizationParameters]
  }
  
  @scala.inline
  implicit class DirectTokenizationParametersMutableBuilder[Self <: DirectTokenizationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
