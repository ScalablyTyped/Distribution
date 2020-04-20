package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait DirectTokenizationParameters extends js.Object {
  /**
    * The version of the encryption/signature protocol being used.
    *
    * This field is required when the payment method requires encryption.
    * Unless you were already using an older `protocolVersion`, you
    * should be using the latest version defined in
    * https://developers.google.com/pay/api/web/payment-data-cryptography.
    */
  var protocolVersion: String
  /**
    * Elliptic Curve public key suitable for using with the NIST P-126
    * curve. This public key will used to encrypt the sensitive payment
    * method information.
    *
    * This field is required when the payment method requires encryption.
    */
  var publicKey: String
}

object DirectTokenizationParameters {
  @scala.inline
  def apply(protocolVersion: String, publicKey: String): DirectTokenizationParameters = {
    val __obj = js.Dynamic.literal(protocolVersion = protocolVersion.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTokenizationParameters]
  }
}

