package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CardNetwork extends StObject
object CardNetwork {
  
  @scala.inline
  def AMEX: typings.googlepay.googlepayStrings.AMEX = "AMEX".asInstanceOf[typings.googlepay.googlepayStrings.AMEX]
  
  @scala.inline
  def DISCOVER: typings.googlepay.googlepayStrings.DISCOVER = "DISCOVER".asInstanceOf[typings.googlepay.googlepayStrings.DISCOVER]
  
  @scala.inline
  def ELECTRON: typings.googlepay.googlepayStrings.ELECTRON = "ELECTRON".asInstanceOf[typings.googlepay.googlepayStrings.ELECTRON]
  
  @scala.inline
  def ELO: typings.googlepay.googlepayStrings.ELO = "ELO".asInstanceOf[typings.googlepay.googlepayStrings.ELO]
  
  @scala.inline
  def ELO_DEBIT: typings.googlepay.googlepayStrings.ELO_DEBIT = "ELO_DEBIT".asInstanceOf[typings.googlepay.googlepayStrings.ELO_DEBIT]
  
  @scala.inline
  def INTERAC: typings.googlepay.googlepayStrings.INTERAC = "INTERAC".asInstanceOf[typings.googlepay.googlepayStrings.INTERAC]
  
  @scala.inline
  def JCB: typings.googlepay.googlepayStrings.JCB = "JCB".asInstanceOf[typings.googlepay.googlepayStrings.JCB]
  
  @scala.inline
  def MAESTRO: typings.googlepay.googlepayStrings.MAESTRO = "MAESTRO".asInstanceOf[typings.googlepay.googlepayStrings.MAESTRO]
  
  @scala.inline
  def MASTERCARD: typings.googlepay.googlepayStrings.MASTERCARD = "MASTERCARD".asInstanceOf[typings.googlepay.googlepayStrings.MASTERCARD]
  
  @scala.inline
  def VISA: typings.googlepay.googlepayStrings.VISA = "VISA".asInstanceOf[typings.googlepay.googlepayStrings.VISA]
}
