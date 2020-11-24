package typings.jqueryPayment.JQueryPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payment extends js.Object {
  
  /**
    * Parses a credit card expiry in the form of MM/YYYY, returning an object containing the month and
    * year. Shorthand years, such as 13 are also supported (and converted into the longhand, e.g. 2013).
    *
    * @param monthYear The value to parse.
    */
  def cardExpiryVal(monthYear: String): ExpiryInfo = js.native
  
  /**
    * Returns a card type. The function will return null if the card type can't be determined.
    *
    * @param cardNumber The card number to parse.
    */
  def cardType(cardNumber: String): String = js.native
  
  /**
    * Array of objects that describe valid card types.
    */
  var cards: js.Array[CardInfo] = js.native
  
  /**
    * Validates a card CVC:
    * * Validates number
    * * Validates length to 4
    *
    * @param cvc The CVC value to validate.
    * @param type Optional card type.
    */
  def validateCardCVC(cvc: String): Boolean = js.native
  def validateCardCVC(cvc: String, `type`: String): Boolean = js.native
  
  /**
    * Validates a card expiry:
    * * Validates numbers
    * * Validates in the future
    * * Supports year shorthand
    *
    * @param expiry An object with the year and month to validate.
    */
  def validateCardExpiry(expiry: ExpiryInfo): Boolean = js.native
  /**
    * Validates a card expiry:
    * * Validates numbers
    * * Validates in the future
    * * Supports year shorthand
    *
    * @param year The year to validate.
    * @param month The months to validate.
    */
  def validateCardExpiry(year: String, month: String): Boolean = js.native
  
  /**
    * Validates a card number:
    * * Validates numbers
    * * Validates Luhn algorithm
    * * Validates length
    *
    * @param cardNumber The card number to validate.
    */
  def validateCardNumber(cardNumber: String): Boolean = js.native
}
