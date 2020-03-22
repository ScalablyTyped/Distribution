package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Card network enum string.
  *
  * Options:
  *
  * - `AMEX`:
  *   American Express card network.
  *
  * - `DISCOVER`:
  *   Discover card network.
  *
  * - `ELECTRON`:
  *   Visa's Electron card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`VISA`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the Electron debit network.
  *
  * - `ELO`:
  *   Elo card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`.
  *
  * - `ELO_DEBIT`:
  *   Elo's debit network rail.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to
  *   `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`ELO`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the ELO debit network.
  *
  * - `INTERAC`:
  *   Interac card network.
  *
  * - `JCB`:
  *   JCB card network.
  *
  * - `MAESTRO`:
  *   Maestro card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`MASTERCARD`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the Maestro debit network.
  *
  * - `MASTERCARD`:
  *   Mastercard card network.
  *
  * - `VISA`:
  *   Visa card network.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.AMEX
  - typings.googlepay.googlepayStrings.DISCOVER
  - typings.googlepay.googlepayStrings.ELECTRON
  - typings.googlepay.googlepayStrings.ELO
  - typings.googlepay.googlepayStrings.ELO_DEBIT
  - typings.googlepay.googlepayStrings.INTERAC
  - typings.googlepay.googlepayStrings.JCB
  - typings.googlepay.googlepayStrings.MAESTRO
  - typings.googlepay.googlepayStrings.MASTERCARD
  - typings.googlepay.googlepayStrings.VISA
*/
trait CardNetwork extends js.Object

object CardNetwork {
  @scala.inline
  def AMEX: typings.googlepay.googlepayStrings.AMEX = this.cast("AMEX")
  @scala.inline
  def DISCOVER: typings.googlepay.googlepayStrings.DISCOVER = this.cast("DISCOVER")
  @scala.inline
  def ELECTRON: typings.googlepay.googlepayStrings.ELECTRON = this.cast("ELECTRON")
  @scala.inline
  def ELO: typings.googlepay.googlepayStrings.ELO = this.cast("ELO")
  @scala.inline
  def ELO_DEBIT: typings.googlepay.googlepayStrings.ELO_DEBIT = this.cast("ELO_DEBIT")
  @scala.inline
  def INTERAC: typings.googlepay.googlepayStrings.INTERAC = this.cast("INTERAC")
  @scala.inline
  def JCB: typings.googlepay.googlepayStrings.JCB = this.cast("JCB")
  @scala.inline
  def MAESTRO: typings.googlepay.googlepayStrings.MAESTRO = this.cast("MAESTRO")
  @scala.inline
  def MASTERCARD: typings.googlepay.googlepayStrings.MASTERCARD = this.cast("MASTERCARD")
  @scala.inline
  def VISA: typings.googlepay.googlepayStrings.VISA = this.cast("VISA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

