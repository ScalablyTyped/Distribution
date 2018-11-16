package typings
package googlepayLib.googleNs.paymentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiNs {
  type Address = AddressMin | AddressFull
  type AllowedAuthMethod = googlepayLib.googlepayLibStrings.PAN_ONLY | googlepayLib.googlepayLibStrings.CRYPTOGRAM_3DS
  type AllowedCardNetwork = googlepayLib.googlepayLibStrings.AMEX | googlepayLib.googlepayLibStrings.DISCOVER | googlepayLib.googlepayLibStrings.JCB | googlepayLib.googlepayLibStrings.MASTERCARD | googlepayLib.googlepayLibStrings.VISA
  type AllowedPaymentMethodType = googlepayLib.googlepayLibStrings.CARD
  type BillingAddressFormat = googlepayLib.googlepayLibStrings.FULL | googlepayLib.googlepayLibStrings.MIN
  type ButtonColor = googlepayLib.googlepayLibStrings.default | googlepayLib.googlepayLibStrings.black | googlepayLib.googlepayLibStrings.white
  type ButtonType = googlepayLib.googlepayLibStrings.long | googlepayLib.googlepayLibStrings.short
  type EnvironmentType = googlepayLib.googlepayLibStrings.PRODUCTION | googlepayLib.googlepayLibStrings.TEST
  type ErrorStatusCode = googlepayLib.googlepayLibStrings.BUYER_ACCOUNT_ERROR | googlepayLib.googlepayLibStrings.CANCELED | googlepayLib.googlepayLibStrings.DEVELOPER_ERROR | googlepayLib.googlepayLibStrings.INTERNAL_ERROR
  type PaymentMethod = CardPaymentMethod
  type PaymentMethodData = CardPaymentMethodData
  type PaymentMethodTokenizationSpecification = PaymentGatewayTokenizationSpecification | DirectTokenizationSpecification
  type TokenizationType = googlepayLib.googlepayLibStrings.DIRECT | googlepayLib.googlepayLibStrings.PAYMENT_GATEWAY
  type TotalPriceStatus = googlepayLib.googlepayLibStrings.ESTIMATED | googlepayLib.googlepayLibStrings.FINAL | googlepayLib.googlepayLibStrings.NOT_CURRENTLY_KNOWN
  type TransactionInfo = UnknownPriceTransactionInfo | KnownPriceTransactionInfo
}
