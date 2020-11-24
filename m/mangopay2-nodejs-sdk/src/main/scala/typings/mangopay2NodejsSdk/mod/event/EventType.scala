package typings.mangopay2NodejsSdk.mod.event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED
*/
trait EventType extends js.Object
object EventType {
  
  @scala.inline
  def DISPUTE_ACTION_REQUIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED = "DISPUTE_ACTION_REQUIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED]
  
  @scala.inline
  def DISPUTE_CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED = "DISPUTE_CLOSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED]
  
  @scala.inline
  def DISPUTE_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED = "DISPUTE_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED = "DISPUTE_DOCUMENT_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED = "DISPUTE_DOCUMENT_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED = "DISPUTE_DOCUMENT_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_VALIDATION_ASKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED = "DISPUTE_DOCUMENT_VALIDATION_ASKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED]
  
  @scala.inline
  def DISPUTE_FURTHER_ACTION_REQUIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED = "DISPUTE_FURTHER_ACTION_REQUIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED]
  
  @scala.inline
  def DISPUTE_SENT_TO_BANK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK = "DISPUTE_SENT_TO_BANK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK]
  
  @scala.inline
  def DISPUTE_SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED = "DISPUTE_SUBMITTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED]
  
  @scala.inline
  def KYC_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED = "KYC_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED]
  
  @scala.inline
  def KYC_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED = "KYC_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED]
  
  @scala.inline
  def KYC_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED = "KYC_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED]
  
  @scala.inline
  def KYC_VALIDATION_ASKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED = "KYC_VALIDATION_ASKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED]
  
  @scala.inline
  def MANDATE_ACTIVATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED = "MANDATE_ACTIVATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED]
  
  @scala.inline
  def MANDATE_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED = "MANDATE_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED]
  
  @scala.inline
  def MANDATE_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED = "MANDATE_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED]
  
  @scala.inline
  def MANDATE_SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED = "MANDATE_SUBMITTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED]
  
  @scala.inline
  def PAYIN_NORMAL_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED = "PAYIN_NORMAL_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED]
  
  @scala.inline
  def PAYIN_NORMAL_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED = "PAYIN_NORMAL_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED]
  
  @scala.inline
  def PAYIN_NORMAL_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED = "PAYIN_NORMAL_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED]
  
  @scala.inline
  def PAYIN_REFUND_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED = "PAYIN_REFUND_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED]
  
  @scala.inline
  def PAYIN_REFUND_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED = "PAYIN_REFUND_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED]
  
  @scala.inline
  def PAYIN_REFUND_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED = "PAYIN_REFUND_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED]
  
  @scala.inline
  def PAYIN_REPUDIATION_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED = "PAYIN_REPUDIATION_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED]
  
  @scala.inline
  def PAYIN_REPUDIATION_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED = "PAYIN_REPUDIATION_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED]
  
  @scala.inline
  def PAYIN_REPUDIATION_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED = "PAYIN_REPUDIATION_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED]
  
  @scala.inline
  def PAYOUT_NORMAL_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED = "PAYOUT_NORMAL_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED]
  
  @scala.inline
  def PAYOUT_NORMAL_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED = "PAYOUT_NORMAL_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED]
  
  @scala.inline
  def PAYOUT_NORMAL_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED = "PAYOUT_NORMAL_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED]
  
  @scala.inline
  def PAYOUT_REFUND_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED = "PAYOUT_REFUND_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED]
  
  @scala.inline
  def PAYOUT_REFUND_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED = "PAYOUT_REFUND_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED]
  
  @scala.inline
  def PAYOUT_REFUND_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED = "PAYOUT_REFUND_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_CANCELED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED = "PREAUTHORIZATION_PAYMENT_CANCELED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED = "PREAUTHORIZATION_PAYMENT_EXPIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED = "PREAUTHORIZATION_PAYMENT_VALIDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_WAITING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING = "PREAUTHORIZATION_PAYMENT_WAITING".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING]
  
  @scala.inline
  def TRANSFER_NORMAL_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED = "TRANSFER_NORMAL_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED]
  
  @scala.inline
  def TRANSFER_NORMAL_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED = "TRANSFER_NORMAL_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED]
  
  @scala.inline
  def TRANSFER_NORMAL_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED = "TRANSFER_NORMAL_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED]
  
  @scala.inline
  def TRANSFER_REFUND_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED = "TRANSFER_REFUND_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED]
  
  @scala.inline
  def TRANSFER_REFUND_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED = "TRANSFER_REFUND_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED]
  
  @scala.inline
  def TRANSFER_REFUND_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED = "TRANSFER_REFUND_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED]
  
  @scala.inline
  def TRANSFER_SETTLEMENT_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED = "TRANSFER_SETTLEMENT_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED]
  
  @scala.inline
  def TRANSFER_SETTLEMENT_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED = "TRANSFER_SETTLEMENT_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED]
  
  @scala.inline
  def TRANSFER_SETTLEMENT_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED = "TRANSFER_SETTLEMENT_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED]
  
  @scala.inline
  def UBO_DECLARATION_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED = "UBO_DECLARATION_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED]
  
  @scala.inline
  def UBO_DECLARATION_REFUSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED = "UBO_DECLARATION_REFUSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED]
  
  @scala.inline
  def UBO_DECLARATION_VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED = "UBO_DECLARATION_VALIDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED]
  
  @scala.inline
  def UBO_DECLARATION_VALIDATION_ASKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED = "UBO_DECLARATION_VALIDATION_ASKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED]
}
