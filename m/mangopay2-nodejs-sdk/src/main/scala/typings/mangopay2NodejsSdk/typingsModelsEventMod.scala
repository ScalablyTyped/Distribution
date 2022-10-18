package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsEventMod {
  
  object event {
    
    trait EventData extends StObject {
      
      /**
        * When the event happened
        */
      var Date: Timestamp
      
      /**
        * The event type
        */
      var EventType: typings.mangopay2NodejsSdk.typingsModelsEventMod.event.EventType
      
      /**
        * The ID of whatever the event is
        */
      var ResourceId: String
    }
    object EventData {
      
      inline def apply(Date: Timestamp, EventType: EventType, ResourceId: String): EventData = {
        val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventData]
      }
      
      extension [Self <: EventData](x: Self) {
        
        inline def setDate(value: Timestamp): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
        
        inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
        
        inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
      }
    }
    
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
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYOUT_SUCCEEDED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYOUT_FALLBACKED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_OUTDATED
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
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_EXPIRED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_INCOMPLETE
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_KYC_REGULAR
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_KYC_LIGHT
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_INFLOWS_BLOCKED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_INFLOWS_UNBLOCKED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_OUTFLOWS_BLOCKED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_OUTFLOWS_UNBLOCKED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_CREATED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_SUCCEEDED
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_FAILED
    */
    trait EventType extends StObject
    object EventType {
      
      inline def DISPUTE_ACTION_REQUIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED = "DISPUTE_ACTION_REQUIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED]
      
      inline def DISPUTE_CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED = "DISPUTE_CLOSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED]
      
      inline def DISPUTE_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED = "DISPUTE_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED]
      
      inline def DISPUTE_DOCUMENT_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED = "DISPUTE_DOCUMENT_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED]
      
      inline def DISPUTE_DOCUMENT_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED = "DISPUTE_DOCUMENT_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED]
      
      inline def DISPUTE_DOCUMENT_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED = "DISPUTE_DOCUMENT_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED]
      
      inline def DISPUTE_DOCUMENT_VALIDATION_ASKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED = "DISPUTE_DOCUMENT_VALIDATION_ASKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED]
      
      inline def DISPUTE_FURTHER_ACTION_REQUIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED = "DISPUTE_FURTHER_ACTION_REQUIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED]
      
      inline def DISPUTE_SENT_TO_BANK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK = "DISPUTE_SENT_TO_BANK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK]
      
      inline def DISPUTE_SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED = "DISPUTE_SUBMITTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED]
      
      inline def INSTANT_PAYOUT_FALLBACKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYOUT_FALLBACKED = "INSTANT_PAYOUT_FALLBACKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYOUT_FALLBACKED]
      
      inline def INSTANT_PAYOUT_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYOUT_SUCCEEDED = "INSTANT_PAYOUT_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INSTANT_PAYOUT_SUCCEEDED]
      
      inline def KYC_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED = "KYC_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED]
      
      inline def KYC_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED = "KYC_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED]
      
      inline def KYC_OUTDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_OUTDATED = "KYC_OUTDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_OUTDATED]
      
      inline def KYC_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED = "KYC_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED]
      
      inline def KYC_VALIDATION_ASKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED = "KYC_VALIDATION_ASKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED]
      
      inline def MANDATE_ACTIVATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED = "MANDATE_ACTIVATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED]
      
      inline def MANDATE_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED = "MANDATE_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED]
      
      inline def MANDATE_EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_EXPIRED = "MANDATE_EXPIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_EXPIRED]
      
      inline def MANDATE_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED = "MANDATE_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED]
      
      inline def MANDATE_SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED = "MANDATE_SUBMITTED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED]
      
      inline def PAYIN_NORMAL_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED = "PAYIN_NORMAL_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED]
      
      inline def PAYIN_NORMAL_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED = "PAYIN_NORMAL_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED]
      
      inline def PAYIN_NORMAL_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED = "PAYIN_NORMAL_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED]
      
      inline def PAYIN_REFUND_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED = "PAYIN_REFUND_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED]
      
      inline def PAYIN_REFUND_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED = "PAYIN_REFUND_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED]
      
      inline def PAYIN_REFUND_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED = "PAYIN_REFUND_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED]
      
      inline def PAYIN_REPUDIATION_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED = "PAYIN_REPUDIATION_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED]
      
      inline def PAYIN_REPUDIATION_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED = "PAYIN_REPUDIATION_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED]
      
      inline def PAYIN_REPUDIATION_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED = "PAYIN_REPUDIATION_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED]
      
      inline def PAYOUT_NORMAL_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED = "PAYOUT_NORMAL_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED]
      
      inline def PAYOUT_NORMAL_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED = "PAYOUT_NORMAL_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED]
      
      inline def PAYOUT_NORMAL_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED = "PAYOUT_NORMAL_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED]
      
      inline def PAYOUT_REFUND_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED = "PAYOUT_REFUND_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED]
      
      inline def PAYOUT_REFUND_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED = "PAYOUT_REFUND_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED]
      
      inline def PAYOUT_REFUND_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED = "PAYOUT_REFUND_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED]
      
      inline def PREAUTHORIZATION_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_CREATED = "PREAUTHORIZATION_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_CREATED]
      
      inline def PREAUTHORIZATION_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_FAILED = "PREAUTHORIZATION_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_FAILED]
      
      inline def PREAUTHORIZATION_PAYMENT_CANCELED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED = "PREAUTHORIZATION_PAYMENT_CANCELED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED]
      
      inline def PREAUTHORIZATION_PAYMENT_EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED = "PREAUTHORIZATION_PAYMENT_EXPIRED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED]
      
      inline def PREAUTHORIZATION_PAYMENT_VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED = "PREAUTHORIZATION_PAYMENT_VALIDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED]
      
      inline def PREAUTHORIZATION_PAYMENT_WAITING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING = "PREAUTHORIZATION_PAYMENT_WAITING".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING]
      
      inline def PREAUTHORIZATION_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_SUCCEEDED = "PREAUTHORIZATION_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_SUCCEEDED]
      
      inline def TRANSFER_NORMAL_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED = "TRANSFER_NORMAL_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED]
      
      inline def TRANSFER_NORMAL_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED = "TRANSFER_NORMAL_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED]
      
      inline def TRANSFER_NORMAL_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED = "TRANSFER_NORMAL_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED]
      
      inline def TRANSFER_REFUND_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED = "TRANSFER_REFUND_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED]
      
      inline def TRANSFER_REFUND_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED = "TRANSFER_REFUND_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED]
      
      inline def TRANSFER_REFUND_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED = "TRANSFER_REFUND_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED]
      
      inline def TRANSFER_SETTLEMENT_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED = "TRANSFER_SETTLEMENT_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED]
      
      inline def TRANSFER_SETTLEMENT_FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED = "TRANSFER_SETTLEMENT_FAILED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED]
      
      inline def TRANSFER_SETTLEMENT_SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED = "TRANSFER_SETTLEMENT_SUCCEEDED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED]
      
      inline def UBO_DECLARATION_CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED = "UBO_DECLARATION_CREATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED]
      
      inline def UBO_DECLARATION_INCOMPLETE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_INCOMPLETE = "UBO_DECLARATION_INCOMPLETE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_INCOMPLETE]
      
      inline def UBO_DECLARATION_REFUSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED = "UBO_DECLARATION_REFUSED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED]
      
      inline def UBO_DECLARATION_VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED = "UBO_DECLARATION_VALIDATED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED]
      
      inline def UBO_DECLARATION_VALIDATION_ASKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED = "UBO_DECLARATION_VALIDATION_ASKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED]
      
      inline def USER_INFLOWS_BLOCKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_INFLOWS_BLOCKED = "USER_INFLOWS_BLOCKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_INFLOWS_BLOCKED]
      
      inline def USER_INFLOWS_UNBLOCKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_INFLOWS_UNBLOCKED = "USER_INFLOWS_UNBLOCKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_INFLOWS_UNBLOCKED]
      
      inline def USER_KYC_LIGHT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_KYC_LIGHT = "USER_KYC_LIGHT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_KYC_LIGHT]
      
      inline def USER_KYC_REGULAR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_KYC_REGULAR = "USER_KYC_REGULAR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_KYC_REGULAR]
      
      inline def USER_OUTFLOWS_BLOCKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_OUTFLOWS_BLOCKED = "USER_OUTFLOWS_BLOCKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_OUTFLOWS_BLOCKED]
      
      inline def USER_OUTFLOWS_UNBLOCKED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_OUTFLOWS_UNBLOCKED = "USER_OUTFLOWS_UNBLOCKED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_OUTFLOWS_UNBLOCKED]
    }
  }
}
