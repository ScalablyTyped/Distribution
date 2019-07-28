package typings.iban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBANStatic extends js.Object {
  /**
    * @summary Returns the IBAN in a electronic format.
    * @param {string} iban The IBAN to convert.
    * @param {string} The IBAN in electronic format.
    */
  def electronicFormat(iban: String): String = js.native
  /** 
    * @summary Convert the passed BBAN to an IBAN for this country specification.
    * @param {string} countryCode The country of the BBAN.
    * @param {string} bban The BBAN to convert to IBAN.
    * @returns {string} The IBAN.
    */ 
  def fromBBAN(countryCode: String, bban: String): String = js.native
  /**
    * @summary Check if the passed iban is valid according to this specification.
    * @param {string} iban The iban to validate.
    * @returns {boolean} True if valid, false otherwise.
    */
  def isValid(iban: String): Boolean = js.native
  /**
    * @summary Check of the passed BBAN is valid.
    * @param {string} countryCode The country of the BBAN.
    * @param {string} bban The BBAN to validate.
    * @returns {boolean} True if valid, false otherwise.
    */
  def isValidBBAN(countryCode: String, bban: String): Boolean = js.native
  /** 
    * @summary Returns the IBAN in a print format.
    * @param {string} iban The IBAN to convert.
    * @param {string} separator The separator to use between IBAN blocks, defaults to ' '.
    */
  def printFormat(iban: String): String = js.native
  def printFormat(iban: String, separator: String): String = js.native
  /**
    * @summary Convert the passed IBAN to a country-specific BBAN.
    * @param {string} iban The IBAN to convert.
    * @param {string} separator The separator to use between BBAN blocks, defaults to ' '.
    * @returns {string} The BBAN
    */
  def toBBAN(iban: String): String = js.native
  def toBBAN(iban: String, separator: String): String = js.native
}

