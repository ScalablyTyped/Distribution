package typings
package jqueryDotPaymentLib.JQueryPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payment extends js.Object {
  /**
    * Array of objects that describe valid card types.
    */
  var cards: js.Array[CardInfo] = js.native
  /**
    * Parses a credit card expiry in the form of MM/YYYY, returning an object containing the month and
    * year. Shorthand years, such as 13 are also supported (and converted into the longhand, e.g. 2013).
    *
    * @param monthYear The value to parse.
    */
  def cardExpiryVal(monthYear: java.lang.String): ExpiryInfo = js.native
  /**
    * Returns a card type. The function will return null if the card type can't be determined.
    *
    * @param cardNumber The card number to parse.
    */
  def cardType(cardNumber: java.lang.String): java.lang.String = js.native
  /**
    * Validates a card CVC:
    * * Validates number
    * * Validates length to 4
    *
    * @param cvc The CVC value to validate.
    * @param type Optional card type.
    */
  def validateCardCVC(cvc: java.lang.String): scala.Boolean = js.native
  def validateCardCVC(cvc: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
  /**
    * Validates a card expiry:
    * * Validates numbers
    * * Validates in the future
    * * Supports year shorthand
    *
    * @param expiry An object with the year and month to validate.
    */
  def validateCardExpiry(expiry: ExpiryInfo): scala.Boolean = js.native
  /**
    * Validates a card expiry:
    * * Validates numbers
    * * Validates in the future
    * * Supports year shorthand
    *
    * @param year The year to validate.
    * @param month The months to validate.
    */
  def validateCardExpiry(year: java.lang.String, month: java.lang.String): scala.Boolean = js.native
  /**
    * Validates a card number:
    * * Validates numbers
    * * Validates Luhn algorithm
    * * Validates length
    *
    * @param cardNumber The card number to validate.
    */
  def validateCardNumber(cardNumber: java.lang.String): scala.Boolean = js.native
}

