package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.AVSResult
import typings.mangopay2NodejsSdk.mod.ColumnAndDirection
import typings.mangopay2NodejsSdk.mod.PaymentStatus
import typings.mangopay2NodejsSdk.mod.PreAuthorizationStatus
import typings.mangopay2NodejsSdk.mod.SecureMode
import typings.mangopay2NodejsSdk.mod.bankAccount.BankAccountType
import typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType
import typings.mangopay2NodejsSdk.mod.card.CardStatus
import typings.mangopay2NodejsSdk.mod.card.CardValidity
import typings.mangopay2NodejsSdk.mod.client.BusinessType
import typings.mangopay2NodejsSdk.mod.client.Sector
import typings.mangopay2NodejsSdk.mod.dispute.DisputeReasonType
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.dispute.DisputeType
import typings.mangopay2NodejsSdk.mod.disputeDocument.DisputeDocumentType
import typings.mangopay2NodejsSdk.mod.disputeDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType
import typings.mangopay2NodejsSdk.mod.event.EventType
import typings.mangopay2NodejsSdk.mod.hook.HookStatus
import typings.mangopay2NodejsSdk.mod.hook.HookValidity
import typings.mangopay2NodejsSdk.mod.kycDocument.KYCDocumentRefusedReasonType
import typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentType
import typings.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typings.mangopay2NodejsSdk.mod.mandate.MandateScheme
import typings.mangopay2NodejsSdk.mod.refund.RefundReasonType
import typings.mangopay2NodejsSdk.mod.report.Column
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.mod.user.RequiredUserLegalData
import typings.mangopay2NodejsSdk.mod.user.RequiredUserNaturalData
import typings.mangopay2NodejsSdk.mod.user.StaticKeys
import typings.mangopay2NodejsSdk.mod.wallet.ClientFundsType
import typings.mangopay2NodejsSdk.mod.wallet.FundsType
import typings.mangopay2NodejsSdk.typesMod.ApiMethod
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mangopay2NodejsSdkStrings {
  @js.native
  sealed trait ACTIVE extends js.Object
  
  @js.native
  sealed trait AD extends CountryISO
  
  @js.native
  sealed trait ADDRESS_MATCH_ONLY extends AVSResult
  
  @js.native
  sealed trait ADDRESS_PROOF extends KycDocumentType
  
  @js.native
  sealed trait AE extends CountryISO
  
  @js.native
  sealed trait AED extends CurrencyISO
  
  @js.native
  sealed trait AF extends CountryISO
  
  @js.native
  sealed trait AFN extends CurrencyISO
  
  @js.native
  sealed trait AG extends CountryISO
  
  @js.native
  sealed trait AI extends CountryISO
  
  @js.native
  sealed trait AL extends CountryISO
  
  @js.native
  sealed trait ALL extends CurrencyISO
  
  @js.native
  sealed trait AM extends CountryISO
  
  @js.native
  sealed trait AMD extends CurrencyISO
  
  @js.native
  sealed trait ANG extends CurrencyISO
  
  @js.native
  sealed trait AO extends CountryISO
  
  @js.native
  sealed trait AOA extends CurrencyISO
  
  @js.native
  sealed trait AQ extends CountryISO
  
  @js.native
  sealed trait AR extends CountryISO
  
  @js.native
  sealed trait ARS extends CurrencyISO
  
  @js.native
  sealed trait ARTICLES_OF_ASSOCIATION extends KycDocumentType
  
  @js.native
  sealed trait ART_MUSIC_ENTERTAINMENT extends Sector
  
  @js.native
  sealed trait AS extends CountryISO
  
  @js.native
  sealed trait ASC extends ColumnAndDirection
  
  @js.native
  sealed trait AT extends CountryISO
  
  @js.native
  sealed trait AU extends CountryISO
  
  @js.native
  sealed trait AUD extends CurrencyISO
  
  @js.native
  sealed trait AUTHORISATION_DISPUTED extends DisputeReasonType
  
  @js.native
  sealed trait AW extends CountryISO
  
  @js.native
  sealed trait AWG extends CurrencyISO
  
  @js.native
  sealed trait AX extends CountryISO
  
  @js.native
  sealed trait AZ extends CountryISO
  
  @js.native
  sealed trait AZN extends CurrencyISO
  
  @js.native
  sealed trait Alias extends Column
  
  @js.native
  sealed trait AuthorId extends Column
  
  @js.native
  sealed trait BA extends CountryISO
  
  @js.native
  sealed trait BACS extends MandateScheme
  
  @js.native
  sealed trait BAM extends CurrencyISO
  
  @js.native
  sealed trait BANKACCOUNT_HAS_BEEN_CLOSED extends RefundReasonType
  
  @js.native
  sealed trait BANKACCOUNT_INCORRECT extends RefundReasonType
  
  @js.native
  sealed trait BANK_WIRE extends js.Object
  
  @js.native
  sealed trait BB extends CountryISO
  
  @js.native
  sealed trait BBD extends CurrencyISO
  
  @js.native
  sealed trait BCMC
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait BD extends CountryISO
  
  @js.native
  sealed trait BDT extends CurrencyISO
  
  @js.native
  sealed trait BE extends CountryISO
  
  @js.native
  sealed trait BEAUTY_COSMETICS_HEALTH extends Sector
  
  @js.native
  sealed trait BF extends CountryISO
  
  @js.native
  sealed trait BG extends CountryISO
  
  @js.native
  sealed trait BGN extends CurrencyISO
  
  @js.native
  sealed trait BH extends CountryISO
  
  @js.native
  sealed trait BHD extends CurrencyISO
  
  @js.native
  sealed trait BI extends CountryISO
  
  @js.native
  sealed trait BIF extends CurrencyISO
  
  @js.native
  sealed trait BJ extends CountryISO
  
  @js.native
  sealed trait BL extends CountryISO
  
  @js.native
  sealed trait BM extends CountryISO
  
  @js.native
  sealed trait BMD extends CurrencyISO
  
  @js.native
  sealed trait BN extends CountryISO
  
  @js.native
  sealed trait BND extends CurrencyISO
  
  @js.native
  sealed trait BO extends CountryISO
  
  @js.native
  sealed trait BOB extends CurrencyISO
  
  @js.native
  sealed trait BQ extends CountryISO
  
  @js.native
  sealed trait BR extends CountryISO
  
  @js.native
  sealed trait BRL extends CurrencyISO
  
  @js.native
  sealed trait BS extends CountryISO
  
  @js.native
  sealed trait BSD extends CurrencyISO
  
  @js.native
  sealed trait BT extends CountryISO
  
  @js.native
  sealed trait BTN extends CurrencyISO
  
  @js.native
  sealed trait BUSINESS
    extends typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  
  @js.native
  sealed trait BV extends CountryISO
  
  @js.native
  sealed trait BW extends CountryISO
  
  @js.native
  sealed trait BWP extends CurrencyISO
  
  @js.native
  sealed trait BY extends CountryISO
  
  @js.native
  sealed trait BYN extends CurrencyISO
  
  @js.native
  sealed trait BZ extends CountryISO
  
  @js.native
  sealed trait BZD extends CurrencyISO
  
  @js.native
  sealed trait BankAccountId extends Column
  
  @js.native
  sealed trait BankWireRef extends Column
  
  @js.native
  sealed trait Birthday extends RequiredUserNaturalData
  
  @js.native
  sealed trait CA
    extends BankAccountType
       with CountryISO
  
  @js.native
  sealed trait CAD extends CurrencyISO
  
  @js.native
  sealed trait CANCELED extends PaymentStatus
  
  @js.native
  sealed trait CANCELED_REOCCURING_TRANSACTION extends DisputeReasonType
  
  @js.native
  sealed trait CARD extends js.Object
  
  @js.native
  sealed trait CB_VISA_MASTERCARD
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait CC extends CountryISO
  
  @js.native
  sealed trait CD extends CountryISO
  
  @js.native
  sealed trait CDF extends CurrencyISO
  
  @js.native
  sealed trait CF extends CountryISO
  
  @js.native
  sealed trait CG extends CountryISO
  
  @js.native
  sealed trait CH extends CountryISO
  
  @js.native
  sealed trait CHECKING extends DepositAccountType
  
  @js.native
  sealed trait CHF extends CurrencyISO
  
  @js.native
  sealed trait CI extends CountryISO
  
  @js.native
  sealed trait CK extends CountryISO
  
  @js.native
  sealed trait CL extends CountryISO
  
  @js.native
  sealed trait CLOSED extends DisputeStatus
  
  @js.native
  sealed trait CLP extends CurrencyISO
  
  @js.native
  sealed trait CM extends CountryISO
  
  @js.native
  sealed trait CN extends CountryISO
  
  @js.native
  sealed trait CNY extends CurrencyISO
  
  @js.native
  sealed trait CO extends CountryISO
  
  @js.native
  sealed trait CONTESTABLE extends DisputeType
  
  @js.native
  sealed trait COP extends CurrencyISO
  
  @js.native
  sealed trait CR extends CountryISO
  
  @js.native
  sealed trait CRC extends CurrencyISO
  
  @js.native
  sealed trait CREATED
    extends CardStatus
       with DisputeStatus
       with DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
       with PreAuthorizationStatus
       with TransactionStatus
  
  @js.native
  sealed trait CREDIT
    extends ClientFundsType
       with FundsType
  
  @js.native
  sealed trait CROWDFUNDING extends BusinessType
  
  @js.native
  sealed trait CROWDFUNDING_DONATION extends js.Object
  
  @js.native
  sealed trait CROWDFUNDING_EQUITY extends js.Object
  
  @js.native
  sealed trait CROWDFUNDING_LOAN extends js.Object
  
  @js.native
  sealed trait CROWDFUNDING_REWARD extends js.Object
  
  @js.native
  sealed trait CSV extends js.Object
  
  @js.native
  sealed trait CU extends CountryISO
  
  @js.native
  sealed trait CUC extends CurrencyISO
  
  @js.native
  sealed trait CUP extends CurrencyISO
  
  @js.native
  sealed trait CV extends CountryISO
  
  @js.native
  sealed trait CVE extends CurrencyISO
  
  @js.native
  sealed trait CW extends CountryISO
  
  @js.native
  sealed trait CX extends CountryISO
  
  @js.native
  sealed trait CY extends CountryISO
  
  @js.native
  sealed trait CZ extends CountryISO
  
  @js.native
  sealed trait CZK extends CurrencyISO
  
  @js.native
  sealed trait CardId extends Column
  
  @js.native
  sealed trait CardType extends Column
  
  @js.native
  sealed trait Country extends Column
  
  @js.native
  sealed trait CountryOfResidence extends RequiredUserNaturalData
  
  @js.native
  sealed trait CreationDate
    extends Column
       with StaticKeys
  
  @js.native
  sealed trait CreditedFundsAmount extends Column
  
  @js.native
  sealed trait CreditedFundsCurrency extends Column
  
  @js.native
  sealed trait CreditedUserId extends Column
  
  @js.native
  sealed trait CreditedWalletId extends Column
  
  @js.native
  sealed trait Culture extends Column
  
  @js.native
  sealed trait DE
    extends CountryISO
       with MandateCultureCode
  
  @js.native
  sealed trait DECLARATIVE extends js.Object
  
  @js.native
  sealed trait DEFAULT
    extends FundsType
       with SecureMode
  
  @js.native
  sealed trait DELIVERY_PROOF extends DisputeDocumentType
  
  @js.native
  sealed trait DESC extends ColumnAndDirection
  
  @js.native
  sealed trait DINERS
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait DIRECT extends js.Object
  
  @js.native
  sealed trait DIRECT_DEBIT extends js.Object
  
  @js.native
  sealed trait DISABLED extends HookStatus
  
  @js.native
  sealed trait DISPUTE_ACTION_REQUIRED extends EventType
  
  @js.native
  sealed trait DISPUTE_CLOSED extends EventType
  
  @js.native
  sealed trait DISPUTE_CREATED extends EventType
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_CREATED extends EventType
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_FAILED extends EventType
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_SUCCEEDED extends EventType
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_VALIDATION_ASKED extends EventType
  
  @js.native
  sealed trait DISPUTE_FURTHER_ACTION_REQUIRED extends EventType
  
  @js.native
  sealed trait DISPUTE_SENT_TO_BANK extends EventType
  
  @js.native
  sealed trait DISPUTE_SUBMITTED extends EventType
  
  @js.native
  sealed trait DJ extends CountryISO
  
  @js.native
  sealed trait DJF extends CurrencyISO
  
  @js.native
  sealed trait DK extends CountryISO
  
  @js.native
  sealed trait DKK extends CurrencyISO
  
  @js.native
  sealed trait DM extends CountryISO
  
  @js.native
  sealed trait DO extends CountryISO
  
  @js.native
  sealed trait DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA extends KYCDocumentRefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_DO_NOT_MATCH_USER_DATA extends KYCDocumentRefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_FALSIFIED
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_HAS_EXPIRED
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_INCOMPLETE
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_MISSING
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_NOT_ACCEPTED
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait DOCUMENT_UNREADABLE
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait DOP extends CurrencyISO
  
  @js.native
  sealed trait DUPLICATE extends DisputeReasonType
  
  @js.native
  sealed trait DZ extends CountryISO
  
  @js.native
  sealed trait DZD extends CurrencyISO
  
  @js.native
  sealed trait DebitedFundsAmount extends Column
  
  @js.native
  sealed trait DebitedFundsCurrency extends Column
  
  @js.native
  sealed trait DebitedWalletId extends Column
  
  @js.native
  sealed trait DeclaredDebitedFundsAmount extends Column
  
  @js.native
  sealed trait DeclaredDebitedFundsCurrency extends Column
  
  @js.native
  sealed trait DeclaredFeesAmount extends Column
  
  @js.native
  sealed trait DeclaredFeesCurrency extends Column
  
  @js.native
  sealed trait DeepPartial extends js.Object
  
  @js.native
  sealed trait EC extends CountryISO
  
  @js.native
  sealed trait EE extends CountryISO
  
  @js.native
  sealed trait EG extends CountryISO
  
  @js.native
  sealed trait EGP extends CurrencyISO
  
  @js.native
  sealed trait EH extends CountryISO
  
  @js.native
  sealed trait EN extends MandateCultureCode
  
  @js.native
  sealed trait ENABLED extends HookStatus
  
  @js.native
  sealed trait ER extends CountryISO
  
  @js.native
  sealed trait ERN extends CurrencyISO
  
  @js.native
  sealed trait ERROR extends CardStatus
  
  @js.native
  sealed trait ES
    extends CountryISO
       with MandateCultureCode
  
  @js.native
  sealed trait ET extends CountryISO
  
  @js.native
  sealed trait ETB extends CurrencyISO
  
  @js.native
  sealed trait EUR extends CurrencyISO
  
  @js.native
  sealed trait EXPIRED extends PaymentStatus
  
  @js.native
  sealed trait EXTERNAL_INSTRUCTION extends js.Object
  
  @js.native
  sealed trait Email
    extends RequiredUserLegalData
       with RequiredUserNaturalData
  
  @js.native
  sealed trait ExecutionDate extends Column
  
  @js.native
  sealed trait ExecutionType extends Column
  
  @js.native
  sealed trait ExpirationDate extends Column
  
  @js.native
  sealed trait FAILED
    extends PreAuthorizationStatus
       with TransactionStatus
  
  @js.native
  sealed trait FEES
    extends ClientFundsType
       with FundsType
  
  @js.native
  sealed trait FI extends CountryISO
  
  @js.native
  sealed trait FJ extends CountryISO
  
  @js.native
  sealed trait FJD extends CurrencyISO
  
  @js.native
  sealed trait FK extends CountryISO
  
  @js.native
  sealed trait FKP extends CurrencyISO
  
  @js.native
  sealed trait FM extends CountryISO
  
  @js.native
  sealed trait FO extends CountryISO
  
  @js.native
  sealed trait FOOD_WINE_RESTAURANTS extends Sector
  
  @js.native
  sealed trait FORCE extends SecureMode
  
  @js.native
  sealed trait FR
    extends CountryISO
       with MandateCultureCode
  
  @js.native
  sealed trait FRANCHISE extends BusinessType
  
  @js.native
  sealed trait FRAUD extends DisputeReasonType
  
  @js.native
  sealed trait FULL_MATCH extends AVSResult
  
  @js.native
  sealed trait FURNITURE_GARDEN extends Sector
  
  @js.native
  sealed trait FeesAmount extends Column
  
  @js.native
  sealed trait FeesCurrency extends Column
  
  @js.native
  sealed trait FirstName extends RequiredUserNaturalData
  
  @js.native
  sealed trait GA extends CountryISO
  
  @js.native
  sealed trait GB
    extends BankAccountType
       with CountryISO
  
  @js.native
  sealed trait GBP extends CurrencyISO
  
  @js.native
  sealed trait GD extends CountryISO
  
  @js.native
  sealed trait GE extends CountryISO
  
  @js.native
  sealed trait GEL extends CurrencyISO
  
  @js.native
  sealed trait GF extends CountryISO
  
  @js.native
  sealed trait GG extends CountryISO
  
  @js.native
  sealed trait GGP extends CurrencyISO
  
  @js.native
  sealed trait GH extends CountryISO
  
  @js.native
  sealed trait GHS extends CurrencyISO
  
  @js.native
  sealed trait GI extends CountryISO
  
  @js.native
  sealed trait GIP extends CurrencyISO
  
  @js.native
  sealed trait GL extends CountryISO
  
  @js.native
  sealed trait GM extends CountryISO
  
  @js.native
  sealed trait GMD extends CurrencyISO
  
  @js.native
  sealed trait GN extends CountryISO
  
  @js.native
  sealed trait GNF extends CurrencyISO
  
  @js.native
  sealed trait GP extends CountryISO
  
  @js.native
  sealed trait GQ extends CountryISO
  
  @js.native
  sealed trait GR extends CountryISO
  
  @js.native
  sealed trait GS extends CountryISO
  
  @js.native
  sealed trait GT extends CountryISO
  
  @js.native
  sealed trait GTQ extends CurrencyISO
  
  @js.native
  sealed trait GU extends CountryISO
  
  @js.native
  sealed trait GW extends CountryISO
  
  @js.native
  sealed trait GY extends CountryISO
  
  @js.native
  sealed trait GYD extends CurrencyISO
  
  @js.native
  sealed trait HK extends CountryISO
  
  @js.native
  sealed trait HKD extends CurrencyISO
  
  @js.native
  sealed trait HM extends CountryISO
  
  @js.native
  sealed trait HN extends CountryISO
  
  @js.native
  sealed trait HNL extends CurrencyISO
  
  @js.native
  sealed trait HOSPITALITY_TRAVEL_CORIDING extends Sector
  
  @js.native
  sealed trait HR extends CountryISO
  
  @js.native
  sealed trait HRK extends CurrencyISO
  
  @js.native
  sealed trait HT extends CountryISO
  
  @js.native
  sealed trait HTG extends CurrencyISO
  
  @js.native
  sealed trait HU extends CountryISO
  
  @js.native
  sealed trait HUF extends CurrencyISO
  
  @js.native
  sealed trait IBAN extends BankAccountType
  
  @js.native
  sealed trait ID extends CountryISO
  
  @js.native
  sealed trait IDEAL
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait IDENTITY_PROOF extends KycDocumentType
  
  @js.native
  sealed trait IDR extends CurrencyISO
  
  @js.native
  sealed trait IE extends CountryISO
  
  @js.native
  sealed trait IL extends CountryISO
  
  @js.native
  sealed trait ILS extends CurrencyISO
  
  @js.native
  sealed trait IM extends CountryISO
  
  @js.native
  sealed trait IMP extends CurrencyISO
  
  @js.native
  sealed trait IN extends CountryISO
  
  @js.native
  sealed trait INITIALIZED_BY_CLIENT extends RefundReasonType
  
  @js.native
  sealed trait INR extends CurrencyISO
  
  @js.native
  sealed trait INVALID
    extends CardValidity
       with HookValidity
  
  @js.native
  sealed trait INVALID_DECLARED_UBO extends js.Object
  
  @js.native
  sealed trait INVALID_UBO_DETAILS extends js.Object
  
  @js.native
  sealed trait INVOICE extends DisputeDocumentType
  
  @js.native
  sealed trait IO extends CountryISO
  
  @js.native
  sealed trait IQ extends CountryISO
  
  @js.native
  sealed trait IQD extends CurrencyISO
  
  @js.native
  sealed trait IR extends CountryISO
  
  @js.native
  sealed trait IRR extends CurrencyISO
  
  @js.native
  sealed trait IS extends CountryISO
  
  @js.native
  sealed trait ISK extends CurrencyISO
  
  @js.native
  sealed trait IT
    extends CountryISO
       with MandateCultureCode
  
  @js.native
  sealed trait Id_
    extends Column
       with StaticKeys
  
  @js.native
  sealed trait JE extends CountryISO
  
  @js.native
  sealed trait JEP extends CurrencyISO
  
  @js.native
  sealed trait JM extends CountryISO
  
  @js.native
  sealed trait JMD extends CurrencyISO
  
  @js.native
  sealed trait JO extends CountryISO
  
  @js.native
  sealed trait JOD extends CurrencyISO
  
  @js.native
  sealed trait JP extends CountryISO
  
  @js.native
  sealed trait JPY extends CurrencyISO
  
  @js.native
  sealed trait KE extends CountryISO
  
  @js.native
  sealed trait KES extends CurrencyISO
  
  @js.native
  sealed trait KG extends CountryISO
  
  @js.native
  sealed trait KGS extends CurrencyISO
  
  @js.native
  sealed trait KH extends CountryISO
  
  @js.native
  sealed trait KHR extends CurrencyISO
  
  @js.native
  sealed trait KI extends CountryISO
  
  @js.native
  sealed trait KM extends CountryISO
  
  @js.native
  sealed trait KMF extends CurrencyISO
  
  @js.native
  sealed trait KN extends CountryISO
  
  @js.native
  sealed trait KP extends CountryISO
  
  @js.native
  sealed trait KPW extends CurrencyISO
  
  @js.native
  sealed trait KR extends CountryISO
  
  @js.native
  sealed trait KRW extends CurrencyISO
  
  @js.native
  sealed trait KW extends CountryISO
  
  @js.native
  sealed trait KWD extends CurrencyISO
  
  @js.native
  sealed trait KY extends CountryISO
  
  @js.native
  sealed trait KYCLevel extends StaticKeys
  
  @js.native
  sealed trait KYC_CREATED extends EventType
  
  @js.native
  sealed trait KYC_FAILED extends EventType
  
  @js.native
  sealed trait KYC_SUCCEEDED extends EventType
  
  @js.native
  sealed trait KYC_VALIDATION_ASKED extends EventType
  
  @js.native
  sealed trait KYD extends CurrencyISO
  
  @js.native
  sealed trait KZ extends CountryISO
  
  @js.native
  sealed trait KZT extends CurrencyISO
  
  @js.native
  sealed trait LA extends CountryISO
  
  @js.native
  sealed trait LAK extends CurrencyISO
  
  @js.native
  sealed trait LATE_FAILURE_BANKACCOUNT_CLOSED extends DisputeReasonType
  
  @js.native
  sealed trait LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE extends DisputeReasonType
  
  @js.native
  sealed trait LATE_FAILURE_BANKACCOUNT_INCORRECT extends DisputeReasonType
  
  @js.native
  sealed trait LATE_FAILURE_CONTACT_USER extends DisputeReasonType
  
  @js.native
  sealed trait LATE_FAILURE_INSUFFICIENT_FUNDS extends DisputeReasonType
  
  @js.native
  sealed trait LB extends CountryISO
  
  @js.native
  sealed trait LBP extends CurrencyISO
  
  @js.native
  sealed trait LC extends CountryISO
  
  @js.native
  sealed trait LEGAL
    extends typings.mangopay2NodejsSdk.mod.user.PersonType
  
  @js.native
  sealed trait LI extends CountryISO
  
  @js.native
  sealed trait LIGHT
    extends typings.mangopay2NodejsSdk.mod.user.KYCLevel
  
  @js.native
  sealed trait LK extends CountryISO
  
  @js.native
  sealed trait LKR extends CurrencyISO
  
  @js.native
  sealed trait LR extends CountryISO
  
  @js.native
  sealed trait LRD extends CurrencyISO
  
  @js.native
  sealed trait LS extends CountryISO
  
  @js.native
  sealed trait LSL extends CurrencyISO
  
  @js.native
  sealed trait LT extends CountryISO
  
  @js.native
  sealed trait LU extends CountryISO
  
  @js.native
  sealed trait LV extends CountryISO
  
  @js.native
  sealed trait LY extends CountryISO
  
  @js.native
  sealed trait LYD extends CurrencyISO
  
  @js.native
  sealed trait LastName extends RequiredUserNaturalData
  
  @js.native
  sealed trait LegalPersonType extends RequiredUserLegalData
  
  @js.native
  sealed trait LegalRepresentativeBirthday extends RequiredUserLegalData
  
  @js.native
  sealed trait LegalRepresentativeCountryOfResidence extends RequiredUserLegalData
  
  @js.native
  sealed trait LegalRepresentativeFirstName extends RequiredUserLegalData
  
  @js.native
  sealed trait LegalRepresentativeLastName extends RequiredUserLegalData
  
  @js.native
  sealed trait LegalRepresentativeNationality extends RequiredUserLegalData
  
  @js.native
  sealed trait LegalRepresentativeProofOfIdentity extends StaticKeys
  
  @js.native
  sealed trait MA extends CountryISO
  
  @js.native
  sealed trait MAD extends CurrencyISO
  
  @js.native
  sealed trait MAESTRO
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait MANDATE_ACTIVATED extends EventType
  
  @js.native
  sealed trait MANDATE_CREATED extends EventType
  
  @js.native
  sealed trait MANDATE_FAILED extends EventType
  
  @js.native
  sealed trait MANDATE_SUBMITTED extends EventType
  
  @js.native
  sealed trait MARKETPLACE extends BusinessType
  
  @js.native
  sealed trait MASTERPASS
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait MC extends CountryISO
  
  @js.native
  sealed trait MD extends CountryISO
  
  @js.native
  sealed trait MDL extends CurrencyISO
  
  @js.native
  sealed trait ME extends CountryISO
  
  @js.native
  sealed trait MF extends CountryISO
  
  @js.native
  sealed trait MG extends CountryISO
  
  @js.native
  sealed trait MGA extends CurrencyISO
  
  @js.native
  sealed trait MH extends CountryISO
  
  @js.native
  sealed trait MISSING_UBO extends js.Object
  
  @js.native
  sealed trait MK extends CountryISO
  
  @js.native
  sealed trait MKD extends CurrencyISO
  
  @js.native
  sealed trait ML extends CountryISO
  
  @js.native
  sealed trait MM extends CountryISO
  
  @js.native
  sealed trait MMK extends CurrencyISO
  
  @js.native
  sealed trait MN extends CountryISO
  
  @js.native
  sealed trait MNT extends CurrencyISO
  
  @js.native
  sealed trait MO extends CountryISO
  
  @js.native
  sealed trait MOP extends CurrencyISO
  
  @js.native
  sealed trait MP extends CountryISO
  
  @js.native
  sealed trait MQ extends CountryISO
  
  @js.native
  sealed trait MR extends CountryISO
  
  @js.native
  sealed trait MRU extends CurrencyISO
  
  @js.native
  sealed trait MS extends CountryISO
  
  @js.native
  sealed trait MT extends CountryISO
  
  @js.native
  sealed trait MU extends CountryISO
  
  @js.native
  sealed trait MUR extends CurrencyISO
  
  @js.native
  sealed trait MV extends CountryISO
  
  @js.native
  sealed trait MVR extends CurrencyISO
  
  @js.native
  sealed trait MW extends CountryISO
  
  @js.native
  sealed trait MWK extends CurrencyISO
  
  @js.native
  sealed trait MX extends CountryISO
  
  @js.native
  sealed trait MXN extends CurrencyISO
  
  @js.native
  sealed trait MY extends CountryISO
  
  @js.native
  sealed trait MYR extends CurrencyISO
  
  @js.native
  sealed trait MZ extends CountryISO
  
  @js.native
  sealed trait MZN extends CurrencyISO
  
  @js.native
  sealed trait MakeKeysNullable extends js.Object
  
  @js.native
  sealed trait NA extends CountryISO
  
  @js.native
  sealed trait NAD extends CurrencyISO
  
  @js.native
  sealed trait NATURAL
    extends typings.mangopay2NodejsSdk.mod.user.PersonType
  
  @js.native
  sealed trait NC extends CountryISO
  
  @js.native
  sealed trait NE extends CountryISO
  
  @js.native
  sealed trait NF extends CountryISO
  
  @js.native
  sealed trait NG extends CountryISO
  
  @js.native
  sealed trait NGN extends CurrencyISO
  
  @js.native
  sealed trait NI extends CountryISO
  
  @js.native
  sealed trait NIO extends CurrencyISO
  
  @js.native
  sealed trait NL
    extends CountryISO
       with MandateCultureCode
  
  @js.native
  sealed trait NO extends CountryISO
  
  @js.native
  sealed trait NOK extends CurrencyISO
  
  @js.native
  sealed trait NORMAL extends js.Object
  
  @js.native
  sealed trait NOT_CONTESTABLE extends DisputeType
  
  @js.native
  sealed trait NO_CHECK extends AVSResult
  
  @js.native
  sealed trait NO_MATCH extends AVSResult
  
  @js.native
  sealed trait NP extends CountryISO
  
  @js.native
  sealed trait NPR extends CurrencyISO
  
  @js.native
  sealed trait NR extends CountryISO
  
  @js.native
  sealed trait NU extends CountryISO
  
  @js.native
  sealed trait NZ extends CountryISO
  
  @js.native
  sealed trait NZD extends CurrencyISO
  
  @js.native
  sealed trait Name extends RequiredUserLegalData
  
  @js.native
  sealed trait Nationality extends RequiredUserNaturalData
  
  @js.native
  sealed trait Nature extends Column
  
  @js.native
  sealed trait NotSpecified extends js.Object
  
  @js.native
  sealed trait OM extends CountryISO
  
  @js.native
  sealed trait OMR extends CurrencyISO
  
  @js.native
  sealed trait ORGANIZATION
    extends typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  
  @js.native
  sealed trait OTHER
    extends BankAccountType
       with BusinessType
       with DisputeDocumentType
       with DisputeReasonType
       with RefundReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait OWNER_DO_NOT_MATCH_BANKACCOUNT extends RefundReasonType
  
  @js.native
  sealed trait P24
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait P2P_PAYMENT extends js.Object
  
  @js.native
  sealed trait PA extends CountryISO
  
  @js.native
  sealed trait PAB extends CurrencyISO
  
  @js.native
  sealed trait PAYIN extends TransactionType
  
  @js.native
  sealed trait PAYIN_NORMAL_CREATED extends EventType
  
  @js.native
  sealed trait PAYIN_NORMAL_FAILED extends EventType
  
  @js.native
  sealed trait PAYIN_NORMAL_SUCCEEDED extends EventType
  
  @js.native
  sealed trait PAYIN_REFUND_CREATED extends EventType
  
  @js.native
  sealed trait PAYIN_REFUND_FAILED extends EventType
  
  @js.native
  sealed trait PAYIN_REFUND_SUCCEEDED extends EventType
  
  @js.native
  sealed trait PAYIN_REPUDIATION_CREATED extends EventType
  
  @js.native
  sealed trait PAYIN_REPUDIATION_FAILED extends EventType
  
  @js.native
  sealed trait PAYIN_REPUDIATION_SUCCEEDED extends EventType
  
  @js.native
  sealed trait PAYLIB
    extends typings.mangopay2NodejsSdk.mod.card.CardType
  
  @js.native
  sealed trait PAYOUT extends TransactionType
  
  @js.native
  sealed trait PAYOUT_NORMAL_CREATED extends EventType
  
  @js.native
  sealed trait PAYOUT_NORMAL_FAILED extends EventType
  
  @js.native
  sealed trait PAYOUT_NORMAL_SUCCEEDED extends EventType
  
  @js.native
  sealed trait PAYOUT_REFUND_CREATED extends EventType
  
  @js.native
  sealed trait PAYOUT_REFUND_FAILED extends EventType
  
  @js.native
  sealed trait PAYOUT_REFUND_SUCCEEDED extends EventType
  
  @js.native
  sealed trait PAYPAL extends js.Object
  
  @js.native
  sealed trait PE extends CountryISO
  
  @js.native
  sealed trait PEN extends CurrencyISO
  
  @js.native
  sealed trait PENDING_BANK_ACTION extends DisputeStatus
  
  @js.native
  sealed trait PENDING_CLIENT_ACTION extends DisputeStatus
  
  @js.native
  sealed trait PF extends CountryISO
  
  @js.native
  sealed trait PG extends CountryISO
  
  @js.native
  sealed trait PGK extends CurrencyISO
  
  @js.native
  sealed trait PH extends CountryISO
  
  @js.native
  sealed trait PHP extends CurrencyISO
  
  @js.native
  sealed trait PK extends CountryISO
  
  @js.native
  sealed trait PKR extends CurrencyISO
  
  @js.native
  sealed trait PL
    extends CountryISO
       with MandateCultureCode
  
  @js.native
  sealed trait PLN extends CurrencyISO
  
  @js.native
  sealed trait PM extends CountryISO
  
  @js.native
  sealed trait PN extends CountryISO
  
  @js.native
  sealed trait POSTAL_CODE_MATCH_ONLY extends AVSResult
  
  @js.native
  sealed trait PR extends CountryISO
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_CANCELED extends EventType
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_EXPIRED extends EventType
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_VALIDATED extends EventType
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_WAITING extends EventType
  
  @js.native
  sealed trait PREAUTHORIZED extends js.Object
  
  @js.native
  sealed trait PRODUCT_NOT_PROVIDED extends DisputeReasonType
  
  @js.native
  sealed trait PRODUCT_REPLACEMENT_PROOF extends DisputeDocumentType
  
  @js.native
  sealed trait PRODUCT_UNACCEPTABLE extends DisputeReasonType
  
  @js.native
  sealed trait PS extends CountryISO
  
  @js.native
  sealed trait PT extends CountryISO
  
  @js.native
  sealed trait PW extends CountryISO
  
  @js.native
  sealed trait PY extends CountryISO
  
  @js.native
  sealed trait PYG extends CurrencyISO
  
  @js.native
  sealed trait PaymentType extends Column
  
  @js.native
  sealed trait PersonType extends StaticKeys
  
  @js.native
  sealed trait PreauthorizationId extends Column
  
  @js.native
  sealed trait ProofOfAddress extends StaticKeys
  
  @js.native
  sealed trait ProofOfIdentity extends StaticKeys
  
  @js.native
  sealed trait ProofOfRegistration extends StaticKeys
  
  @js.native
  sealed trait QA extends CountryISO
  
  @js.native
  sealed trait QAR extends CurrencyISO
  
  @js.native
  sealed trait RE extends CountryISO
  
  @js.native
  sealed trait REFUND extends TransactionNature
  
  @js.native
  sealed trait REFUND_CONVERSION_RATE extends DisputeReasonType
  
  @js.native
  sealed trait REFUND_NOT_PROCESSED extends DisputeReasonType
  
  @js.native
  sealed trait REFUND_PROOF extends DisputeDocumentType
  
  @js.native
  sealed trait REFUSED
    extends DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
  
  @js.native
  sealed trait REGISTRATION_PROOF extends KycDocumentType
  
  @js.native
  sealed trait REGULAR
    extends typings.mangopay2NodejsSdk.mod.user.KYCLevel
       with TransactionNature
  
  @js.native
  sealed trait RENTALS extends Sector
  
  @js.native
  sealed trait REOPENED_PENDING_CLIENT_ACTION extends DisputeStatus
  
  @js.native
  sealed trait REPUDIATION extends TransactionNature
  
  @js.native
  sealed trait RETRIEVAL extends DisputeType
  
  @js.native
  sealed trait RO extends CountryISO
  
  @js.native
  sealed trait RON extends CurrencyISO
  
  @js.native
  sealed trait RS extends CountryISO
  
  @js.native
  sealed trait RSD extends CurrencyISO
  
  @js.native
  sealed trait RU extends CountryISO
  
  @js.native
  sealed trait RUB extends CurrencyISO
  
  @js.native
  sealed trait RW extends CountryISO
  
  @js.native
  sealed trait RWF extends CurrencyISO
  
  @js.native
  sealed trait ResultCode extends Column
  
  @js.native
  sealed trait ResultMessage extends Column
  
  @js.native
  sealed trait SA extends CountryISO
  
  @js.native
  sealed trait SAR extends CurrencyISO
  
  @js.native
  sealed trait SAVINGS extends DepositAccountType
  
  @js.native
  sealed trait SB extends CountryISO
  
  @js.native
  sealed trait SBD extends CurrencyISO
  
  @js.native
  sealed trait SC extends CountryISO
  
  @js.native
  sealed trait SCR extends CurrencyISO
  
  @js.native
  sealed trait SD extends CountryISO
  
  @js.native
  sealed trait SDG extends CurrencyISO
  
  @js.native
  sealed trait SE extends CountryISO
  
  @js.native
  sealed trait SEK extends CurrencyISO
  
  @js.native
  sealed trait SEPA extends MandateScheme
  
  @js.native
  sealed trait SERVICES_JOBBING_EDUCATION extends Sector
  
  @js.native
  sealed trait SETTLEMENT extends TransactionNature
  
  @js.native
  sealed trait SG extends CountryISO
  
  @js.native
  sealed trait SGD extends CurrencyISO
  
  @js.native
  sealed trait SH extends CountryISO
  
  @js.native
  sealed trait SHAREHOLDER_DECLARATION extends KycDocumentType
  
  @js.native
  sealed trait SHP extends CurrencyISO
  
  @js.native
  sealed trait SI extends CountryISO
  
  @js.native
  sealed trait SJ extends CountryISO
  
  @js.native
  sealed trait SK extends CountryISO
  
  @js.native
  sealed trait SL extends CountryISO
  
  @js.native
  sealed trait SLL extends CurrencyISO
  
  @js.native
  sealed trait SM extends CountryISO
  
  @js.native
  sealed trait SN extends CountryISO
  
  @js.native
  sealed trait SO extends CountryISO
  
  @js.native
  sealed trait SOLETRADER
    extends typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  
  @js.native
  sealed trait SOS extends CurrencyISO
  
  @js.native
  sealed trait SPECIFIC_CASE
    extends KYCDocumentRefusedReasonType
       with RefusedReasonType
  
  @js.native
  sealed trait SPL extends CurrencyISO
  
  @js.native
  sealed trait SPORT_RECREATION_ACTIVITIES extends Sector
  
  @js.native
  sealed trait SR extends CountryISO
  
  @js.native
  sealed trait SRD extends CurrencyISO
  
  @js.native
  sealed trait SS extends CountryISO
  
  @js.native
  sealed trait ST extends CountryISO
  
  @js.native
  sealed trait STN extends CurrencyISO
  
  @js.native
  sealed trait STORES_FASHION_ACCESSORIES_OBJECTS extends Sector
  
  @js.native
  sealed trait SUBMITTED extends DisputeStatus
  
  @js.native
  sealed trait SUCCEEDED
    extends PreAuthorizationStatus
       with TransactionStatus
  
  @js.native
  sealed trait SV extends CountryISO
  
  @js.native
  sealed trait SVC extends CurrencyISO
  
  @js.native
  sealed trait SX extends CountryISO
  
  @js.native
  sealed trait SY extends CountryISO
  
  @js.native
  sealed trait SYP extends CurrencyISO
  
  @js.native
  sealed trait SZ extends CountryISO
  
  @js.native
  sealed trait SZL extends CurrencyISO
  
  @js.native
  sealed trait ShareholderDeclaration extends StaticKeys
  
  @js.native
  sealed trait Status extends Column
  
  @js.native
  sealed trait Statute extends StaticKeys
  
  @js.native
  sealed trait TC extends CountryISO
  
  @js.native
  sealed trait TD extends CountryISO
  
  @js.native
  sealed trait TF extends CountryISO
  
  @js.native
  sealed trait TG extends CountryISO
  
  @js.native
  sealed trait TH extends CountryISO
  
  @js.native
  sealed trait THB extends CurrencyISO
  
  @js.native
  sealed trait TICKETING extends Sector
  
  @js.native
  sealed trait TJ extends CountryISO
  
  @js.native
  sealed trait TJS extends CurrencyISO
  
  @js.native
  sealed trait TK extends CountryISO
  
  @js.native
  sealed trait TL extends CountryISO
  
  @js.native
  sealed trait TM extends CountryISO
  
  @js.native
  sealed trait TMT extends CurrencyISO
  
  @js.native
  sealed trait TN extends CountryISO
  
  @js.native
  sealed trait TND extends CurrencyISO
  
  @js.native
  sealed trait TO extends CountryISO
  
  @js.native
  sealed trait TOP extends CurrencyISO
  
  @js.native
  sealed trait TR extends CountryISO
  
  @js.native
  sealed trait TRANSACTIONS extends js.Object
  
  @js.native
  sealed trait TRANSACTION_NOT_RECOGNIZED extends DisputeReasonType
  
  @js.native
  sealed trait TRANSFER extends TransactionType
  
  @js.native
  sealed trait TRANSFER_NORMAL_CREATED extends EventType
  
  @js.native
  sealed trait TRANSFER_NORMAL_FAILED extends EventType
  
  @js.native
  sealed trait TRANSFER_NORMAL_SUCCEEDED extends EventType
  
  @js.native
  sealed trait TRANSFER_REFUND_CREATED extends EventType
  
  @js.native
  sealed trait TRANSFER_REFUND_FAILED extends EventType
  
  @js.native
  sealed trait TRANSFER_REFUND_SUCCEEDED extends EventType
  
  @js.native
  sealed trait TRANSFER_SETTLEMENT_CREATED extends EventType
  
  @js.native
  sealed trait TRANSFER_SETTLEMENT_FAILED extends EventType
  
  @js.native
  sealed trait TRANSFER_SETTLEMENT_SUCCEEDED extends EventType
  
  @js.native
  sealed trait TRY extends CurrencyISO
  
  @js.native
  sealed trait TT extends CountryISO
  
  @js.native
  sealed trait TTD extends CurrencyISO
  
  @js.native
  sealed trait TV extends CountryISO
  
  @js.native
  sealed trait TVD extends CurrencyISO
  
  @js.native
  sealed trait TW extends CountryISO
  
  @js.native
  sealed trait TWD extends CurrencyISO
  
  @js.native
  sealed trait TZ extends CountryISO
  
  @js.native
  sealed trait TZS extends CurrencyISO
  
  @js.native
  sealed trait Tag extends Column
  
  @js.native
  sealed trait Type extends Column
  
  @js.native
  sealed trait UA extends CountryISO
  
  @js.native
  sealed trait UAH extends CurrencyISO
  
  @js.native
  sealed trait UBO_DECLARATION_CREATED extends EventType
  
  @js.native
  sealed trait UBO_DECLARATION_REFUSED extends EventType
  
  @js.native
  sealed trait UBO_DECLARATION_VALIDATED extends EventType
  
  @js.native
  sealed trait UBO_DECLARATION_VALIDATION_ASKED extends EventType
  
  @js.native
  sealed trait UG extends CountryISO
  
  @js.native
  sealed trait UGX extends CurrencyISO
  
  @js.native
  sealed trait UM extends CountryISO
  
  @js.native
  sealed trait UNDERAGE_PERSON extends KYCDocumentRefusedReasonType
  
  @js.native
  sealed trait UNKNOWN
    extends CardValidity
       with DisputeReasonType
       with HookValidity
  
  @js.native
  sealed trait US
    extends BankAccountType
       with CountryISO
  
  @js.native
  sealed trait USD extends CurrencyISO
  
  @js.native
  sealed trait USER_ACCEPTANCE_PROOF extends DisputeDocumentType
  
  @js.native
  sealed trait USER_CORRESPONDANCE extends DisputeDocumentType
  
  @js.native
  sealed trait UY extends CountryISO
  
  @js.native
  sealed trait UYU extends CurrencyISO
  
  @js.native
  sealed trait UZ extends CountryISO
  
  @js.native
  sealed trait UZS extends CurrencyISO
  
  @js.native
  sealed trait VA extends CountryISO
  
  @js.native
  sealed trait VALID
    extends CardValidity
       with HookValidity
  
  @js.native
  sealed trait VALIDATED
    extends CardStatus
       with DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
       with PaymentStatus
  
  @js.native
  sealed trait VALIDATION_ASKED
    extends DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
  
  @js.native
  sealed trait VC extends CountryISO
  
  @js.native
  sealed trait VE extends CountryISO
  
  @js.native
  sealed trait VEF extends CurrencyISO
  
  @js.native
  sealed trait VG extends CountryISO
  
  @js.native
  sealed trait VI extends CountryISO
  
  @js.native
  sealed trait VN extends CountryISO
  
  @js.native
  sealed trait VND extends CurrencyISO
  
  @js.native
  sealed trait VU extends CountryISO
  
  @js.native
  sealed trait VUV extends CurrencyISO
  
  @js.native
  sealed trait WAITING extends PaymentStatus
  
  @js.native
  sealed trait WEB extends js.Object
  
  @js.native
  sealed trait WF extends CountryISO
  
  @js.native
  sealed trait WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS extends RefundReasonType
  
  @js.native
  sealed trait WS extends CountryISO
  
  @js.native
  sealed trait WST extends CurrencyISO
  
  @js.native
  sealed trait WireReference extends Column
  
  @js.native
  sealed trait XAF extends CurrencyISO
  
  @js.native
  sealed trait XCD extends CurrencyISO
  
  @js.native
  sealed trait XDR extends CurrencyISO
  
  @js.native
  sealed trait XOF extends CurrencyISO
  
  @js.native
  sealed trait XPF extends CurrencyISO
  
  @js.native
  sealed trait YE extends CountryISO
  
  @js.native
  sealed trait YER extends CurrencyISO
  
  @js.native
  sealed trait YT extends CountryISO
  
  @js.native
  sealed trait ZA extends CountryISO
  
  @js.native
  sealed trait ZAR extends CurrencyISO
  
  @js.native
  sealed trait ZM extends CountryISO
  
  @js.native
  sealed trait ZMW extends CurrencyISO
  
  @js.native
  sealed trait ZW extends CountryISO
  
  @js.native
  sealed trait ZWD extends CurrencyISO
  
  @js.native
  sealed trait authentication_oauth extends ApiMethod
  
  @js.native
  sealed trait banking_aliases_all extends ApiMethod
  
  @js.native
  sealed trait banking_aliases_get extends ApiMethod
  
  @js.native
  sealed trait banking_aliases_iban_create extends ApiMethod
  
  @js.native
  sealed trait banking_aliases_update extends ApiMethod
  
  @js.native
  sealed trait card_get extends ApiMethod
  
  @js.native
  sealed trait card_get_preauthorizations extends ApiMethod
  
  @js.native
  sealed trait card_save extends ApiMethod
  
  @js.native
  sealed trait cardregistration_create extends ApiMethod
  
  @js.native
  sealed trait cardregistration_get extends ApiMethod
  
  @js.native
  sealed trait cardregistration_save extends ApiMethod
  
  @js.native
  sealed trait cards_get_by_fingerprint extends ApiMethod
  
  @js.native
  sealed trait client_wallets_all extends ApiMethod
  
  @js.native
  sealed trait client_wallets_by_fundsType extends ApiMethod
  
  @js.native
  sealed trait client_wallets_get extends ApiMethod
  
  @js.native
  sealed trait client_wallets_transactions extends ApiMethod
  
  @js.native
  sealed trait clients_get extends ApiMethod
  
  @js.native
  sealed trait clients_update extends ApiMethod
  
  @js.native
  sealed trait clients_upload_logo extends ApiMethod
  
  @js.native
  sealed trait dispute_save_close extends ApiMethod
  
  @js.native
  sealed trait disputes_all extends ApiMethod
  
  @js.native
  sealed trait disputes_document_all extends ApiMethod
  
  @js.native
  sealed trait disputes_document_create extends ApiMethod
  
  @js.native
  sealed trait disputes_document_create_consult extends ApiMethod
  
  @js.native
  sealed trait disputes_document_get extends ApiMethod
  
  @js.native
  sealed trait disputes_document_get_for_dispute extends ApiMethod
  
  @js.native
  sealed trait disputes_document_page_create extends ApiMethod
  
  @js.native
  sealed trait disputes_document_save extends ApiMethod
  
  @js.native
  sealed trait disputes_get extends ApiMethod
  
  @js.native
  sealed trait disputes_get_for_user extends ApiMethod
  
  @js.native
  sealed trait disputes_get_for_wallet extends ApiMethod
  
  @js.native
  sealed trait disputes_get_transactions extends ApiMethod
  
  @js.native
  sealed trait disputes_pending_settlement extends ApiMethod
  
  @js.native
  sealed trait disputes_repudiation_create_settlement extends ApiMethod
  
  @js.native
  sealed trait disputes_repudiation_get extends ApiMethod
  
  @js.native
  sealed trait disputes_repudiation_get_settlement extends ApiMethod
  
  @js.native
  sealed trait disputes_save_contest_funds extends ApiMethod
  
  @js.native
  sealed trait disputes_save_tag extends ApiMethod
  
  @js.native
  sealed trait events_all extends ApiMethod
  
  @js.native
  sealed trait hooks_all extends ApiMethod
  
  @js.native
  sealed trait hooks_create extends ApiMethod
  
  @js.native
  sealed trait hooks_get extends ApiMethod
  
  @js.native
  sealed trait hooks_save extends ApiMethod
  
  @js.native
  sealed trait kyc_documents_all extends ApiMethod
  
  @js.native
  sealed trait kyc_documents_create extends ApiMethod
  
  @js.native
  sealed trait kyc_documents_create_consult extends ApiMethod
  
  @js.native
  sealed trait kyc_documents_get extends ApiMethod
  
  @js.native
  sealed trait kyc_documents_get_alt extends ApiMethod
  
  @js.native
  sealed trait kyc_documents_save extends ApiMethod
  
  @js.native
  sealed trait kyc_page_create extends ApiMethod
  
  @js.native
  sealed trait mandates_all extends ApiMethod
  
  @js.native
  sealed trait mandates_cancel extends ApiMethod
  
  @js.native
  sealed trait `mandates_directdebit-web_create` extends ApiMethod
  
  @js.native
  sealed trait mandates_get extends ApiMethod
  
  @js.native
  sealed trait mandates_get_for_bank_account extends ApiMethod
  
  @js.native
  sealed trait mandates_get_for_user extends ApiMethod
  
  @js.native
  sealed trait `payins_bankwire-direct_create` extends ApiMethod
  
  @js.native
  sealed trait `payins_card-direct_create` extends ApiMethod
  
  @js.native
  sealed trait `payins_card-web_create` extends ApiMethod
  
  @js.native
  sealed trait payins_createrefunds extends ApiMethod
  
  @js.native
  sealed trait `payins_directdebit-direct_create` extends ApiMethod
  
  @js.native
  sealed trait `payins_directdebit-web_create` extends ApiMethod
  
  @js.native
  sealed trait payins_get extends ApiMethod
  
  @js.native
  sealed trait `payins_paypal-web_create` extends ApiMethod
  
  @js.native
  sealed trait `payins_preauthorized-direct_create` extends ApiMethod
  
  @js.native
  sealed trait payouts_bankwire_create extends ApiMethod
  
  @js.native
  sealed trait payouts_get extends ApiMethod
  
  @js.native
  sealed trait preauthorization_create extends ApiMethod
  
  @js.native
  sealed trait preauthorization_get extends ApiMethod
  
  @js.native
  sealed trait preauthorization_save extends ApiMethod
  
  @js.native
  sealed trait preauthorizations_get_for_user extends ApiMethod
  
  @js.native
  sealed trait refunds_get extends ApiMethod
  
  @js.native
  sealed trait refunds_get_for_payin extends ApiMethod
  
  @js.native
  sealed trait refunds_get_for_payout extends ApiMethod
  
  @js.native
  sealed trait refunds_get_for_repudiation extends ApiMethod
  
  @js.native
  sealed trait refunds_get_for_transfer extends ApiMethod
  
  @js.native
  sealed trait reports_all extends ApiMethod
  
  @js.native
  sealed trait reports_get extends ApiMethod
  
  @js.native
  sealed trait reports_transaction_create extends ApiMethod
  
  @js.native
  sealed trait reports_wallet_create extends ApiMethod
  
  @js.native
  sealed trait responses_get extends ApiMethod
  
  @js.native
  sealed trait transactions_get_for_bank_account extends ApiMethod
  
  @js.native
  sealed trait transactions_get_for_card extends ApiMethod
  
  @js.native
  sealed trait transactions_get_for_mandate extends ApiMethod
  
  @js.native
  sealed trait transfers_create extends ApiMethod
  
  @js.native
  sealed trait transfers_createrefunds extends ApiMethod
  
  @js.native
  sealed trait transfers_get extends ApiMethod
  
  @js.native
  sealed trait ubo_declaration_create extends ApiMethod
  
  @js.native
  sealed trait ubo_declaration_get extends ApiMethod
  
  @js.native
  sealed trait ubo_declaration_update extends ApiMethod
  
  @js.native
  sealed trait users_all extends ApiMethod
  
  @js.native
  sealed trait users_allbankaccount extends ApiMethod
  
  @js.native
  sealed trait users_allcards extends ApiMethod
  
  @js.native
  sealed trait users_allkycdocuments extends ApiMethod
  
  @js.native
  sealed trait users_alltransactions extends ApiMethod
  
  @js.native
  sealed trait users_allwallets extends ApiMethod
  
  @js.native
  sealed trait users_createbankaccounts_ca extends ApiMethod
  
  @js.native
  sealed trait users_createbankaccounts_gb extends ApiMethod
  
  @js.native
  sealed trait users_createbankaccounts_iban extends ApiMethod
  
  @js.native
  sealed trait users_createbankaccounts_other extends ApiMethod
  
  @js.native
  sealed trait users_createbankaccounts_us extends ApiMethod
  
  @js.native
  sealed trait users_createlegals extends ApiMethod
  
  @js.native
  sealed trait users_createnaturals extends ApiMethod
  
  @js.native
  sealed trait users_deactivate_bankaccount extends ApiMethod
  
  @js.native
  sealed trait users_get extends ApiMethod
  
  @js.native
  sealed trait users_getbankaccount extends ApiMethod
  
  @js.native
  sealed trait users_getemoney extends ApiMethod
  
  @js.native
  sealed trait users_getlegals extends ApiMethod
  
  @js.native
  sealed trait users_getnaturals extends ApiMethod
  
  @js.native
  sealed trait users_savelegals extends ApiMethod
  
  @js.native
  sealed trait users_savenaturals extends ApiMethod
  
  @js.native
  sealed trait wallets_alltransactions extends ApiMethod
  
  @js.native
  sealed trait wallets_create extends ApiMethod
  
  @js.native
  sealed trait wallets_get extends ApiMethod
  
  @js.native
  sealed trait wallets_save extends ApiMethod
  
  @scala.inline
  def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  @scala.inline
  def AD: AD = "AD".asInstanceOf[AD]
  @scala.inline
  def ADDRESS_MATCH_ONLY: ADDRESS_MATCH_ONLY = "ADDRESS_MATCH_ONLY".asInstanceOf[ADDRESS_MATCH_ONLY]
  @scala.inline
  def ADDRESS_PROOF: ADDRESS_PROOF = "ADDRESS_PROOF".asInstanceOf[ADDRESS_PROOF]
  @scala.inline
  def AE: AE = "AE".asInstanceOf[AE]
  @scala.inline
  def AED: AED = "AED".asInstanceOf[AED]
  @scala.inline
  def AF: AF = "AF".asInstanceOf[AF]
  @scala.inline
  def AFN: AFN = "AFN".asInstanceOf[AFN]
  @scala.inline
  def AG: AG = "AG".asInstanceOf[AG]
  @scala.inline
  def AI: AI = "AI".asInstanceOf[AI]
  @scala.inline
  def AL: AL = "AL".asInstanceOf[AL]
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def AM: AM = "AM".asInstanceOf[AM]
  @scala.inline
  def AMD: AMD = "AMD".asInstanceOf[AMD]
  @scala.inline
  def ANG: ANG = "ANG".asInstanceOf[ANG]
  @scala.inline
  def AO: AO = "AO".asInstanceOf[AO]
  @scala.inline
  def AOA: AOA = "AOA".asInstanceOf[AOA]
  @scala.inline
  def AQ: AQ = "AQ".asInstanceOf[AQ]
  @scala.inline
  def AR: AR = "AR".asInstanceOf[AR]
  @scala.inline
  def ARS: ARS = "ARS".asInstanceOf[ARS]
  @scala.inline
  def ARTICLES_OF_ASSOCIATION: ARTICLES_OF_ASSOCIATION = "ARTICLES_OF_ASSOCIATION".asInstanceOf[ARTICLES_OF_ASSOCIATION]
  @scala.inline
  def ART_MUSIC_ENTERTAINMENT: ART_MUSIC_ENTERTAINMENT = "ART_MUSIC_ENTERTAINMENT".asInstanceOf[ART_MUSIC_ENTERTAINMENT]
  @scala.inline
  def AS: AS = "AS".asInstanceOf[AS]
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def AT: AT = "AT".asInstanceOf[AT]
  @scala.inline
  def AU: AU = "AU".asInstanceOf[AU]
  @scala.inline
  def AUD: AUD = "AUD".asInstanceOf[AUD]
  @scala.inline
  def AUTHORISATION_DISPUTED: AUTHORISATION_DISPUTED = "AUTHORISATION_DISPUTED".asInstanceOf[AUTHORISATION_DISPUTED]
  @scala.inline
  def AW: AW = "AW".asInstanceOf[AW]
  @scala.inline
  def AWG: AWG = "AWG".asInstanceOf[AWG]
  @scala.inline
  def AX: AX = "AX".asInstanceOf[AX]
  @scala.inline
  def AZ: AZ = "AZ".asInstanceOf[AZ]
  @scala.inline
  def AZN: AZN = "AZN".asInstanceOf[AZN]
  @scala.inline
  def Alias: Alias = "Alias".asInstanceOf[Alias]
  @scala.inline
  def AuthorId: AuthorId = "AuthorId".asInstanceOf[AuthorId]
  @scala.inline
  def BA: BA = "BA".asInstanceOf[BA]
  @scala.inline
  def BACS: BACS = "BACS".asInstanceOf[BACS]
  @scala.inline
  def BAM: BAM = "BAM".asInstanceOf[BAM]
  @scala.inline
  def BANKACCOUNT_HAS_BEEN_CLOSED: BANKACCOUNT_HAS_BEEN_CLOSED = "BANKACCOUNT_HAS_BEEN_CLOSED".asInstanceOf[BANKACCOUNT_HAS_BEEN_CLOSED]
  @scala.inline
  def BANKACCOUNT_INCORRECT: BANKACCOUNT_INCORRECT = "BANKACCOUNT_INCORRECT".asInstanceOf[BANKACCOUNT_INCORRECT]
  @scala.inline
  def BANK_WIRE: BANK_WIRE = "BANK_WIRE".asInstanceOf[BANK_WIRE]
  @scala.inline
  def BB: BB = "BB".asInstanceOf[BB]
  @scala.inline
  def BBD: BBD = "BBD".asInstanceOf[BBD]
  @scala.inline
  def BCMC: BCMC = "BCMC".asInstanceOf[BCMC]
  @scala.inline
  def BD: BD = "BD".asInstanceOf[BD]
  @scala.inline
  def BDT: BDT = "BDT".asInstanceOf[BDT]
  @scala.inline
  def BE: BE = "BE".asInstanceOf[BE]
  @scala.inline
  def BEAUTY_COSMETICS_HEALTH: BEAUTY_COSMETICS_HEALTH = "BEAUTY_COSMETICS_HEALTH".asInstanceOf[BEAUTY_COSMETICS_HEALTH]
  @scala.inline
  def BF: BF = "BF".asInstanceOf[BF]
  @scala.inline
  def BG: BG = "BG".asInstanceOf[BG]
  @scala.inline
  def BGN: BGN = "BGN".asInstanceOf[BGN]
  @scala.inline
  def BH: BH = "BH".asInstanceOf[BH]
  @scala.inline
  def BHD: BHD = "BHD".asInstanceOf[BHD]
  @scala.inline
  def BI: BI = "BI".asInstanceOf[BI]
  @scala.inline
  def BIF: BIF = "BIF".asInstanceOf[BIF]
  @scala.inline
  def BJ: BJ = "BJ".asInstanceOf[BJ]
  @scala.inline
  def BL: BL = "BL".asInstanceOf[BL]
  @scala.inline
  def BM: BM = "BM".asInstanceOf[BM]
  @scala.inline
  def BMD: BMD = "BMD".asInstanceOf[BMD]
  @scala.inline
  def BN: BN = "BN".asInstanceOf[BN]
  @scala.inline
  def BND: BND = "BND".asInstanceOf[BND]
  @scala.inline
  def BO: BO = "BO".asInstanceOf[BO]
  @scala.inline
  def BOB: BOB = "BOB".asInstanceOf[BOB]
  @scala.inline
  def BQ: BQ = "BQ".asInstanceOf[BQ]
  @scala.inline
  def BR: BR = "BR".asInstanceOf[BR]
  @scala.inline
  def BRL: BRL = "BRL".asInstanceOf[BRL]
  @scala.inline
  def BS: BS = "BS".asInstanceOf[BS]
  @scala.inline
  def BSD: BSD = "BSD".asInstanceOf[BSD]
  @scala.inline
  def BT: BT = "BT".asInstanceOf[BT]
  @scala.inline
  def BTN: BTN = "BTN".asInstanceOf[BTN]
  @scala.inline
  def BUSINESS: BUSINESS = "BUSINESS".asInstanceOf[BUSINESS]
  @scala.inline
  def BV: BV = "BV".asInstanceOf[BV]
  @scala.inline
  def BW: BW = "BW".asInstanceOf[BW]
  @scala.inline
  def BWP: BWP = "BWP".asInstanceOf[BWP]
  @scala.inline
  def BY: BY = "BY".asInstanceOf[BY]
  @scala.inline
  def BYN: BYN = "BYN".asInstanceOf[BYN]
  @scala.inline
  def BZ: BZ = "BZ".asInstanceOf[BZ]
  @scala.inline
  def BZD: BZD = "BZD".asInstanceOf[BZD]
  @scala.inline
  def BankAccountId: BankAccountId = "BankAccountId".asInstanceOf[BankAccountId]
  @scala.inline
  def BankWireRef: BankWireRef = "BankWireRef".asInstanceOf[BankWireRef]
  @scala.inline
  def Birthday: Birthday = "Birthday".asInstanceOf[Birthday]
  @scala.inline
  def CA: CA = "CA".asInstanceOf[CA]
  @scala.inline
  def CAD: CAD = "CAD".asInstanceOf[CAD]
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  @scala.inline
  def CANCELED_REOCCURING_TRANSACTION: CANCELED_REOCCURING_TRANSACTION = "CANCELED_REOCCURING_TRANSACTION".asInstanceOf[CANCELED_REOCCURING_TRANSACTION]
  @scala.inline
  def CARD: CARD = "CARD".asInstanceOf[CARD]
  @scala.inline
  def CB_VISA_MASTERCARD: CB_VISA_MASTERCARD = "CB_VISA_MASTERCARD".asInstanceOf[CB_VISA_MASTERCARD]
  @scala.inline
  def CC: CC = "CC".asInstanceOf[CC]
  @scala.inline
  def CD: CD = "CD".asInstanceOf[CD]
  @scala.inline
  def CDF: CDF = "CDF".asInstanceOf[CDF]
  @scala.inline
  def CF: CF = "CF".asInstanceOf[CF]
  @scala.inline
  def CG: CG = "CG".asInstanceOf[CG]
  @scala.inline
  def CH: CH = "CH".asInstanceOf[CH]
  @scala.inline
  def CHECKING: CHECKING = "CHECKING".asInstanceOf[CHECKING]
  @scala.inline
  def CHF: CHF = "CHF".asInstanceOf[CHF]
  @scala.inline
  def CI: CI = "CI".asInstanceOf[CI]
  @scala.inline
  def CK: CK = "CK".asInstanceOf[CK]
  @scala.inline
  def CL: CL = "CL".asInstanceOf[CL]
  @scala.inline
  def CLOSED: CLOSED = "CLOSED".asInstanceOf[CLOSED]
  @scala.inline
  def CLP: CLP = "CLP".asInstanceOf[CLP]
  @scala.inline
  def CM: CM = "CM".asInstanceOf[CM]
  @scala.inline
  def CN: CN = "CN".asInstanceOf[CN]
  @scala.inline
  def CNY: CNY = "CNY".asInstanceOf[CNY]
  @scala.inline
  def CO: CO = "CO".asInstanceOf[CO]
  @scala.inline
  def CONTESTABLE: CONTESTABLE = "CONTESTABLE".asInstanceOf[CONTESTABLE]
  @scala.inline
  def COP: COP = "COP".asInstanceOf[COP]
  @scala.inline
  def CR: CR = "CR".asInstanceOf[CR]
  @scala.inline
  def CRC: CRC = "CRC".asInstanceOf[CRC]
  @scala.inline
  def CREATED: CREATED = "CREATED".asInstanceOf[CREATED]
  @scala.inline
  def CREDIT: CREDIT = "CREDIT".asInstanceOf[CREDIT]
  @scala.inline
  def CROWDFUNDING: CROWDFUNDING = "CROWDFUNDING".asInstanceOf[CROWDFUNDING]
  @scala.inline
  def CROWDFUNDING_DONATION: CROWDFUNDING_DONATION = "CROWDFUNDING_DONATION".asInstanceOf[CROWDFUNDING_DONATION]
  @scala.inline
  def CROWDFUNDING_EQUITY: CROWDFUNDING_EQUITY = "CROWDFUNDING_EQUITY".asInstanceOf[CROWDFUNDING_EQUITY]
  @scala.inline
  def CROWDFUNDING_LOAN: CROWDFUNDING_LOAN = "CROWDFUNDING_LOAN".asInstanceOf[CROWDFUNDING_LOAN]
  @scala.inline
  def CROWDFUNDING_REWARD: CROWDFUNDING_REWARD = "CROWDFUNDING_REWARD".asInstanceOf[CROWDFUNDING_REWARD]
  @scala.inline
  def CSV: CSV = "CSV".asInstanceOf[CSV]
  @scala.inline
  def CU: CU = "CU".asInstanceOf[CU]
  @scala.inline
  def CUC: CUC = "CUC".asInstanceOf[CUC]
  @scala.inline
  def CUP: CUP = "CUP".asInstanceOf[CUP]
  @scala.inline
  def CV: CV = "CV".asInstanceOf[CV]
  @scala.inline
  def CVE: CVE = "CVE".asInstanceOf[CVE]
  @scala.inline
  def CW: CW = "CW".asInstanceOf[CW]
  @scala.inline
  def CX: CX = "CX".asInstanceOf[CX]
  @scala.inline
  def CY: CY = "CY".asInstanceOf[CY]
  @scala.inline
  def CZ: CZ = "CZ".asInstanceOf[CZ]
  @scala.inline
  def CZK: CZK = "CZK".asInstanceOf[CZK]
  @scala.inline
  def CardId: CardId = "CardId".asInstanceOf[CardId]
  @scala.inline
  def CardType: CardType = "CardType".asInstanceOf[CardType]
  @scala.inline
  def Country: Country = "Country".asInstanceOf[Country]
  @scala.inline
  def CountryOfResidence: CountryOfResidence = "CountryOfResidence".asInstanceOf[CountryOfResidence]
  @scala.inline
  def CreationDate: CreationDate = "CreationDate".asInstanceOf[CreationDate]
  @scala.inline
  def CreditedFundsAmount: CreditedFundsAmount = "CreditedFundsAmount".asInstanceOf[CreditedFundsAmount]
  @scala.inline
  def CreditedFundsCurrency: CreditedFundsCurrency = "CreditedFundsCurrency".asInstanceOf[CreditedFundsCurrency]
  @scala.inline
  def CreditedUserId: CreditedUserId = "CreditedUserId".asInstanceOf[CreditedUserId]
  @scala.inline
  def CreditedWalletId: CreditedWalletId = "CreditedWalletId".asInstanceOf[CreditedWalletId]
  @scala.inline
  def Culture: Culture = "Culture".asInstanceOf[Culture]
  @scala.inline
  def DE: DE = "DE".asInstanceOf[DE]
  @scala.inline
  def DECLARATIVE: DECLARATIVE = "DECLARATIVE".asInstanceOf[DECLARATIVE]
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  @scala.inline
  def DELIVERY_PROOF: DELIVERY_PROOF = "DELIVERY_PROOF".asInstanceOf[DELIVERY_PROOF]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def DINERS: DINERS = "DINERS".asInstanceOf[DINERS]
  @scala.inline
  def DIRECT: DIRECT = "DIRECT".asInstanceOf[DIRECT]
  @scala.inline
  def DIRECT_DEBIT: DIRECT_DEBIT = "DIRECT_DEBIT".asInstanceOf[DIRECT_DEBIT]
  @scala.inline
  def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  @scala.inline
  def DISPUTE_ACTION_REQUIRED: DISPUTE_ACTION_REQUIRED = "DISPUTE_ACTION_REQUIRED".asInstanceOf[DISPUTE_ACTION_REQUIRED]
  @scala.inline
  def DISPUTE_CLOSED: DISPUTE_CLOSED = "DISPUTE_CLOSED".asInstanceOf[DISPUTE_CLOSED]
  @scala.inline
  def DISPUTE_CREATED: DISPUTE_CREATED = "DISPUTE_CREATED".asInstanceOf[DISPUTE_CREATED]
  @scala.inline
  def DISPUTE_DOCUMENT_CREATED: DISPUTE_DOCUMENT_CREATED = "DISPUTE_DOCUMENT_CREATED".asInstanceOf[DISPUTE_DOCUMENT_CREATED]
  @scala.inline
  def DISPUTE_DOCUMENT_FAILED: DISPUTE_DOCUMENT_FAILED = "DISPUTE_DOCUMENT_FAILED".asInstanceOf[DISPUTE_DOCUMENT_FAILED]
  @scala.inline
  def DISPUTE_DOCUMENT_SUCCEEDED: DISPUTE_DOCUMENT_SUCCEEDED = "DISPUTE_DOCUMENT_SUCCEEDED".asInstanceOf[DISPUTE_DOCUMENT_SUCCEEDED]
  @scala.inline
  def DISPUTE_DOCUMENT_VALIDATION_ASKED: DISPUTE_DOCUMENT_VALIDATION_ASKED = "DISPUTE_DOCUMENT_VALIDATION_ASKED".asInstanceOf[DISPUTE_DOCUMENT_VALIDATION_ASKED]
  @scala.inline
  def DISPUTE_FURTHER_ACTION_REQUIRED: DISPUTE_FURTHER_ACTION_REQUIRED = "DISPUTE_FURTHER_ACTION_REQUIRED".asInstanceOf[DISPUTE_FURTHER_ACTION_REQUIRED]
  @scala.inline
  def DISPUTE_SENT_TO_BANK: DISPUTE_SENT_TO_BANK = "DISPUTE_SENT_TO_BANK".asInstanceOf[DISPUTE_SENT_TO_BANK]
  @scala.inline
  def DISPUTE_SUBMITTED: DISPUTE_SUBMITTED = "DISPUTE_SUBMITTED".asInstanceOf[DISPUTE_SUBMITTED]
  @scala.inline
  def DJ: DJ = "DJ".asInstanceOf[DJ]
  @scala.inline
  def DJF: DJF = "DJF".asInstanceOf[DJF]
  @scala.inline
  def DK: DK = "DK".asInstanceOf[DK]
  @scala.inline
  def DKK: DKK = "DKK".asInstanceOf[DKK]
  @scala.inline
  def DM: DM = "DM".asInstanceOf[DM]
  @scala.inline
  def DO: DO = "DO".asInstanceOf[DO]
  @scala.inline
  def DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA: DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA = "DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA".asInstanceOf[DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA]
  @scala.inline
  def DOCUMENT_DO_NOT_MATCH_USER_DATA: DOCUMENT_DO_NOT_MATCH_USER_DATA = "DOCUMENT_DO_NOT_MATCH_USER_DATA".asInstanceOf[DOCUMENT_DO_NOT_MATCH_USER_DATA]
  @scala.inline
  def DOCUMENT_FALSIFIED: DOCUMENT_FALSIFIED = "DOCUMENT_FALSIFIED".asInstanceOf[DOCUMENT_FALSIFIED]
  @scala.inline
  def DOCUMENT_HAS_EXPIRED: DOCUMENT_HAS_EXPIRED = "DOCUMENT_HAS_EXPIRED".asInstanceOf[DOCUMENT_HAS_EXPIRED]
  @scala.inline
  def DOCUMENT_INCOMPLETE: DOCUMENT_INCOMPLETE = "DOCUMENT_INCOMPLETE".asInstanceOf[DOCUMENT_INCOMPLETE]
  @scala.inline
  def DOCUMENT_MISSING: DOCUMENT_MISSING = "DOCUMENT_MISSING".asInstanceOf[DOCUMENT_MISSING]
  @scala.inline
  def DOCUMENT_NOT_ACCEPTED: DOCUMENT_NOT_ACCEPTED = "DOCUMENT_NOT_ACCEPTED".asInstanceOf[DOCUMENT_NOT_ACCEPTED]
  @scala.inline
  def DOCUMENT_UNREADABLE: DOCUMENT_UNREADABLE = "DOCUMENT_UNREADABLE".asInstanceOf[DOCUMENT_UNREADABLE]
  @scala.inline
  def DOP: DOP = "DOP".asInstanceOf[DOP]
  @scala.inline
  def DUPLICATE: DUPLICATE = "DUPLICATE".asInstanceOf[DUPLICATE]
  @scala.inline
  def DZ: DZ = "DZ".asInstanceOf[DZ]
  @scala.inline
  def DZD: DZD = "DZD".asInstanceOf[DZD]
  @scala.inline
  def DebitedFundsAmount: DebitedFundsAmount = "DebitedFundsAmount".asInstanceOf[DebitedFundsAmount]
  @scala.inline
  def DebitedFundsCurrency: DebitedFundsCurrency = "DebitedFundsCurrency".asInstanceOf[DebitedFundsCurrency]
  @scala.inline
  def DebitedWalletId: DebitedWalletId = "DebitedWalletId".asInstanceOf[DebitedWalletId]
  @scala.inline
  def DeclaredDebitedFundsAmount: DeclaredDebitedFundsAmount = "DeclaredDebitedFundsAmount".asInstanceOf[DeclaredDebitedFundsAmount]
  @scala.inline
  def DeclaredDebitedFundsCurrency: DeclaredDebitedFundsCurrency = "DeclaredDebitedFundsCurrency".asInstanceOf[DeclaredDebitedFundsCurrency]
  @scala.inline
  def DeclaredFeesAmount: DeclaredFeesAmount = "DeclaredFeesAmount".asInstanceOf[DeclaredFeesAmount]
  @scala.inline
  def DeclaredFeesCurrency: DeclaredFeesCurrency = "DeclaredFeesCurrency".asInstanceOf[DeclaredFeesCurrency]
  @scala.inline
  def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  @scala.inline
  def EC: EC = "EC".asInstanceOf[EC]
  @scala.inline
  def EE: EE = "EE".asInstanceOf[EE]
  @scala.inline
  def EG: EG = "EG".asInstanceOf[EG]
  @scala.inline
  def EGP: EGP = "EGP".asInstanceOf[EGP]
  @scala.inline
  def EH: EH = "EH".asInstanceOf[EH]
  @scala.inline
  def EN: EN = "EN".asInstanceOf[EN]
  @scala.inline
  def ENABLED: ENABLED = "ENABLED".asInstanceOf[ENABLED]
  @scala.inline
  def ER: ER = "ER".asInstanceOf[ER]
  @scala.inline
  def ERN: ERN = "ERN".asInstanceOf[ERN]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def ES: ES = "ES".asInstanceOf[ES]
  @scala.inline
  def ET: ET = "ET".asInstanceOf[ET]
  @scala.inline
  def ETB: ETB = "ETB".asInstanceOf[ETB]
  @scala.inline
  def EUR: EUR = "EUR".asInstanceOf[EUR]
  @scala.inline
  def EXPIRED: EXPIRED = "EXPIRED".asInstanceOf[EXPIRED]
  @scala.inline
  def EXTERNAL_INSTRUCTION: EXTERNAL_INSTRUCTION = "EXTERNAL_INSTRUCTION".asInstanceOf[EXTERNAL_INSTRUCTION]
  @scala.inline
  def Email: Email = "Email".asInstanceOf[Email]
  @scala.inline
  def ExecutionDate: ExecutionDate = "ExecutionDate".asInstanceOf[ExecutionDate]
  @scala.inline
  def ExecutionType: ExecutionType = "ExecutionType".asInstanceOf[ExecutionType]
  @scala.inline
  def ExpirationDate: ExpirationDate = "ExpirationDate".asInstanceOf[ExpirationDate]
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def FEES: FEES = "FEES".asInstanceOf[FEES]
  @scala.inline
  def FI: FI = "FI".asInstanceOf[FI]
  @scala.inline
  def FJ: FJ = "FJ".asInstanceOf[FJ]
  @scala.inline
  def FJD: FJD = "FJD".asInstanceOf[FJD]
  @scala.inline
  def FK: FK = "FK".asInstanceOf[FK]
  @scala.inline
  def FKP: FKP = "FKP".asInstanceOf[FKP]
  @scala.inline
  def FM: FM = "FM".asInstanceOf[FM]
  @scala.inline
  def FO: FO = "FO".asInstanceOf[FO]
  @scala.inline
  def FOOD_WINE_RESTAURANTS: FOOD_WINE_RESTAURANTS = "FOOD_WINE_RESTAURANTS".asInstanceOf[FOOD_WINE_RESTAURANTS]
  @scala.inline
  def FORCE: FORCE = "FORCE".asInstanceOf[FORCE]
  @scala.inline
  def FR: FR = "FR".asInstanceOf[FR]
  @scala.inline
  def FRANCHISE: FRANCHISE = "FRANCHISE".asInstanceOf[FRANCHISE]
  @scala.inline
  def FRAUD: FRAUD = "FRAUD".asInstanceOf[FRAUD]
  @scala.inline
  def FULL_MATCH: FULL_MATCH = "FULL_MATCH".asInstanceOf[FULL_MATCH]
  @scala.inline
  def FURNITURE_GARDEN: FURNITURE_GARDEN = "FURNITURE_GARDEN".asInstanceOf[FURNITURE_GARDEN]
  @scala.inline
  def FeesAmount: FeesAmount = "FeesAmount".asInstanceOf[FeesAmount]
  @scala.inline
  def FeesCurrency: FeesCurrency = "FeesCurrency".asInstanceOf[FeesCurrency]
  @scala.inline
  def FirstName: FirstName = "FirstName".asInstanceOf[FirstName]
  @scala.inline
  def GA: GA = "GA".asInstanceOf[GA]
  @scala.inline
  def GB: GB = "GB".asInstanceOf[GB]
  @scala.inline
  def GBP: GBP = "GBP".asInstanceOf[GBP]
  @scala.inline
  def GD: GD = "GD".asInstanceOf[GD]
  @scala.inline
  def GE: GE = "GE".asInstanceOf[GE]
  @scala.inline
  def GEL: GEL = "GEL".asInstanceOf[GEL]
  @scala.inline
  def GF: GF = "GF".asInstanceOf[GF]
  @scala.inline
  def GG: GG = "GG".asInstanceOf[GG]
  @scala.inline
  def GGP: GGP = "GGP".asInstanceOf[GGP]
  @scala.inline
  def GH: GH = "GH".asInstanceOf[GH]
  @scala.inline
  def GHS: GHS = "GHS".asInstanceOf[GHS]
  @scala.inline
  def GI: GI = "GI".asInstanceOf[GI]
  @scala.inline
  def GIP: GIP = "GIP".asInstanceOf[GIP]
  @scala.inline
  def GL: GL = "GL".asInstanceOf[GL]
  @scala.inline
  def GM: GM = "GM".asInstanceOf[GM]
  @scala.inline
  def GMD: GMD = "GMD".asInstanceOf[GMD]
  @scala.inline
  def GN: GN = "GN".asInstanceOf[GN]
  @scala.inline
  def GNF: GNF = "GNF".asInstanceOf[GNF]
  @scala.inline
  def GP: GP = "GP".asInstanceOf[GP]
  @scala.inline
  def GQ: GQ = "GQ".asInstanceOf[GQ]
  @scala.inline
  def GR: GR = "GR".asInstanceOf[GR]
  @scala.inline
  def GS: GS = "GS".asInstanceOf[GS]
  @scala.inline
  def GT: GT = "GT".asInstanceOf[GT]
  @scala.inline
  def GTQ: GTQ = "GTQ".asInstanceOf[GTQ]
  @scala.inline
  def GU: GU = "GU".asInstanceOf[GU]
  @scala.inline
  def GW: GW = "GW".asInstanceOf[GW]
  @scala.inline
  def GY: GY = "GY".asInstanceOf[GY]
  @scala.inline
  def GYD: GYD = "GYD".asInstanceOf[GYD]
  @scala.inline
  def HK: HK = "HK".asInstanceOf[HK]
  @scala.inline
  def HKD: HKD = "HKD".asInstanceOf[HKD]
  @scala.inline
  def HM: HM = "HM".asInstanceOf[HM]
  @scala.inline
  def HN: HN = "HN".asInstanceOf[HN]
  @scala.inline
  def HNL: HNL = "HNL".asInstanceOf[HNL]
  @scala.inline
  def HOSPITALITY_TRAVEL_CORIDING: HOSPITALITY_TRAVEL_CORIDING = "HOSPITALITY_TRAVEL_CORIDING".asInstanceOf[HOSPITALITY_TRAVEL_CORIDING]
  @scala.inline
  def HR: HR = "HR".asInstanceOf[HR]
  @scala.inline
  def HRK: HRK = "HRK".asInstanceOf[HRK]
  @scala.inline
  def HT: HT = "HT".asInstanceOf[HT]
  @scala.inline
  def HTG: HTG = "HTG".asInstanceOf[HTG]
  @scala.inline
  def HU: HU = "HU".asInstanceOf[HU]
  @scala.inline
  def HUF: HUF = "HUF".asInstanceOf[HUF]
  @scala.inline
  def IBAN: IBAN = "IBAN".asInstanceOf[IBAN]
  @scala.inline
  def ID: ID = "ID".asInstanceOf[ID]
  @scala.inline
  def IDEAL: IDEAL = "IDEAL".asInstanceOf[IDEAL]
  @scala.inline
  def IDENTITY_PROOF: IDENTITY_PROOF = "IDENTITY_PROOF".asInstanceOf[IDENTITY_PROOF]
  @scala.inline
  def IDR: IDR = "IDR".asInstanceOf[IDR]
  @scala.inline
  def IE: IE = "IE".asInstanceOf[IE]
  @scala.inline
  def IL: IL = "IL".asInstanceOf[IL]
  @scala.inline
  def ILS: ILS = "ILS".asInstanceOf[ILS]
  @scala.inline
  def IM: IM = "IM".asInstanceOf[IM]
  @scala.inline
  def IMP: IMP = "IMP".asInstanceOf[IMP]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def INITIALIZED_BY_CLIENT: INITIALIZED_BY_CLIENT = "INITIALIZED_BY_CLIENT".asInstanceOf[INITIALIZED_BY_CLIENT]
  @scala.inline
  def INR: INR = "INR".asInstanceOf[INR]
  @scala.inline
  def INVALID: INVALID = "INVALID".asInstanceOf[INVALID]
  @scala.inline
  def INVALID_DECLARED_UBO: INVALID_DECLARED_UBO = "INVALID_DECLARED_UBO".asInstanceOf[INVALID_DECLARED_UBO]
  @scala.inline
  def INVALID_UBO_DETAILS: INVALID_UBO_DETAILS = "INVALID_UBO_DETAILS".asInstanceOf[INVALID_UBO_DETAILS]
  @scala.inline
  def INVOICE: INVOICE = "INVOICE".asInstanceOf[INVOICE]
  @scala.inline
  def IO: IO = "IO".asInstanceOf[IO]
  @scala.inline
  def IQ: IQ = "IQ".asInstanceOf[IQ]
  @scala.inline
  def IQD: IQD = "IQD".asInstanceOf[IQD]
  @scala.inline
  def IR: IR = "IR".asInstanceOf[IR]
  @scala.inline
  def IRR: IRR = "IRR".asInstanceOf[IRR]
  @scala.inline
  def IS: IS = "IS".asInstanceOf[IS]
  @scala.inline
  def ISK: ISK = "ISK".asInstanceOf[ISK]
  @scala.inline
  def IT: IT = "IT".asInstanceOf[IT]
  @scala.inline
  def Id_ : Id_ = "Id".asInstanceOf[Id_]
  @scala.inline
  def JE: JE = "JE".asInstanceOf[JE]
  @scala.inline
  def JEP: JEP = "JEP".asInstanceOf[JEP]
  @scala.inline
  def JM: JM = "JM".asInstanceOf[JM]
  @scala.inline
  def JMD: JMD = "JMD".asInstanceOf[JMD]
  @scala.inline
  def JO: JO = "JO".asInstanceOf[JO]
  @scala.inline
  def JOD: JOD = "JOD".asInstanceOf[JOD]
  @scala.inline
  def JP: JP = "JP".asInstanceOf[JP]
  @scala.inline
  def JPY: JPY = "JPY".asInstanceOf[JPY]
  @scala.inline
  def KE: KE = "KE".asInstanceOf[KE]
  @scala.inline
  def KES: KES = "KES".asInstanceOf[KES]
  @scala.inline
  def KG: KG = "KG".asInstanceOf[KG]
  @scala.inline
  def KGS: KGS = "KGS".asInstanceOf[KGS]
  @scala.inline
  def KH: KH = "KH".asInstanceOf[KH]
  @scala.inline
  def KHR: KHR = "KHR".asInstanceOf[KHR]
  @scala.inline
  def KI: KI = "KI".asInstanceOf[KI]
  @scala.inline
  def KM: KM = "KM".asInstanceOf[KM]
  @scala.inline
  def KMF: KMF = "KMF".asInstanceOf[KMF]
  @scala.inline
  def KN: KN = "KN".asInstanceOf[KN]
  @scala.inline
  def KP: KP = "KP".asInstanceOf[KP]
  @scala.inline
  def KPW: KPW = "KPW".asInstanceOf[KPW]
  @scala.inline
  def KR: KR = "KR".asInstanceOf[KR]
  @scala.inline
  def KRW: KRW = "KRW".asInstanceOf[KRW]
  @scala.inline
  def KW: KW = "KW".asInstanceOf[KW]
  @scala.inline
  def KWD: KWD = "KWD".asInstanceOf[KWD]
  @scala.inline
  def KY: KY = "KY".asInstanceOf[KY]
  @scala.inline
  def KYCLevel: KYCLevel = "KYCLevel".asInstanceOf[KYCLevel]
  @scala.inline
  def KYC_CREATED: KYC_CREATED = "KYC_CREATED".asInstanceOf[KYC_CREATED]
  @scala.inline
  def KYC_FAILED: KYC_FAILED = "KYC_FAILED".asInstanceOf[KYC_FAILED]
  @scala.inline
  def KYC_SUCCEEDED: KYC_SUCCEEDED = "KYC_SUCCEEDED".asInstanceOf[KYC_SUCCEEDED]
  @scala.inline
  def KYC_VALIDATION_ASKED: KYC_VALIDATION_ASKED = "KYC_VALIDATION_ASKED".asInstanceOf[KYC_VALIDATION_ASKED]
  @scala.inline
  def KYD: KYD = "KYD".asInstanceOf[KYD]
  @scala.inline
  def KZ: KZ = "KZ".asInstanceOf[KZ]
  @scala.inline
  def KZT: KZT = "KZT".asInstanceOf[KZT]
  @scala.inline
  def LA: LA = "LA".asInstanceOf[LA]
  @scala.inline
  def LAK: LAK = "LAK".asInstanceOf[LAK]
  @scala.inline
  def LATE_FAILURE_BANKACCOUNT_CLOSED: LATE_FAILURE_BANKACCOUNT_CLOSED = "LATE_FAILURE_BANKACCOUNT_CLOSED".asInstanceOf[LATE_FAILURE_BANKACCOUNT_CLOSED]
  @scala.inline
  def LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE: LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE = "LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE".asInstanceOf[LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE]
  @scala.inline
  def LATE_FAILURE_BANKACCOUNT_INCORRECT: LATE_FAILURE_BANKACCOUNT_INCORRECT = "LATE_FAILURE_BANKACCOUNT_INCORRECT".asInstanceOf[LATE_FAILURE_BANKACCOUNT_INCORRECT]
  @scala.inline
  def LATE_FAILURE_CONTACT_USER: LATE_FAILURE_CONTACT_USER = "LATE_FAILURE_CONTACT_USER".asInstanceOf[LATE_FAILURE_CONTACT_USER]
  @scala.inline
  def LATE_FAILURE_INSUFFICIENT_FUNDS: LATE_FAILURE_INSUFFICIENT_FUNDS = "LATE_FAILURE_INSUFFICIENT_FUNDS".asInstanceOf[LATE_FAILURE_INSUFFICIENT_FUNDS]
  @scala.inline
  def LB: LB = "LB".asInstanceOf[LB]
  @scala.inline
  def LBP: LBP = "LBP".asInstanceOf[LBP]
  @scala.inline
  def LC: LC = "LC".asInstanceOf[LC]
  @scala.inline
  def LEGAL: LEGAL = "LEGAL".asInstanceOf[LEGAL]
  @scala.inline
  def LI: LI = "LI".asInstanceOf[LI]
  @scala.inline
  def LIGHT: LIGHT = "LIGHT".asInstanceOf[LIGHT]
  @scala.inline
  def LK: LK = "LK".asInstanceOf[LK]
  @scala.inline
  def LKR: LKR = "LKR".asInstanceOf[LKR]
  @scala.inline
  def LR: LR = "LR".asInstanceOf[LR]
  @scala.inline
  def LRD: LRD = "LRD".asInstanceOf[LRD]
  @scala.inline
  def LS: LS = "LS".asInstanceOf[LS]
  @scala.inline
  def LSL: LSL = "LSL".asInstanceOf[LSL]
  @scala.inline
  def LT: LT = "LT".asInstanceOf[LT]
  @scala.inline
  def LU: LU = "LU".asInstanceOf[LU]
  @scala.inline
  def LV: LV = "LV".asInstanceOf[LV]
  @scala.inline
  def LY: LY = "LY".asInstanceOf[LY]
  @scala.inline
  def LYD: LYD = "LYD".asInstanceOf[LYD]
  @scala.inline
  def LastName: LastName = "LastName".asInstanceOf[LastName]
  @scala.inline
  def LegalPersonType: LegalPersonType = "LegalPersonType".asInstanceOf[LegalPersonType]
  @scala.inline
  def LegalRepresentativeBirthday: LegalRepresentativeBirthday = "LegalRepresentativeBirthday".asInstanceOf[LegalRepresentativeBirthday]
  @scala.inline
  def LegalRepresentativeCountryOfResidence: LegalRepresentativeCountryOfResidence = "LegalRepresentativeCountryOfResidence".asInstanceOf[LegalRepresentativeCountryOfResidence]
  @scala.inline
  def LegalRepresentativeFirstName: LegalRepresentativeFirstName = "LegalRepresentativeFirstName".asInstanceOf[LegalRepresentativeFirstName]
  @scala.inline
  def LegalRepresentativeLastName: LegalRepresentativeLastName = "LegalRepresentativeLastName".asInstanceOf[LegalRepresentativeLastName]
  @scala.inline
  def LegalRepresentativeNationality: LegalRepresentativeNationality = "LegalRepresentativeNationality".asInstanceOf[LegalRepresentativeNationality]
  @scala.inline
  def LegalRepresentativeProofOfIdentity: LegalRepresentativeProofOfIdentity = "LegalRepresentativeProofOfIdentity".asInstanceOf[LegalRepresentativeProofOfIdentity]
  @scala.inline
  def MA: MA = "MA".asInstanceOf[MA]
  @scala.inline
  def MAD: MAD = "MAD".asInstanceOf[MAD]
  @scala.inline
  def MAESTRO: MAESTRO = "MAESTRO".asInstanceOf[MAESTRO]
  @scala.inline
  def MANDATE_ACTIVATED: MANDATE_ACTIVATED = "MANDATE_ACTIVATED".asInstanceOf[MANDATE_ACTIVATED]
  @scala.inline
  def MANDATE_CREATED: MANDATE_CREATED = "MANDATE_CREATED".asInstanceOf[MANDATE_CREATED]
  @scala.inline
  def MANDATE_FAILED: MANDATE_FAILED = "MANDATE_FAILED".asInstanceOf[MANDATE_FAILED]
  @scala.inline
  def MANDATE_SUBMITTED: MANDATE_SUBMITTED = "MANDATE_SUBMITTED".asInstanceOf[MANDATE_SUBMITTED]
  @scala.inline
  def MARKETPLACE: MARKETPLACE = "MARKETPLACE".asInstanceOf[MARKETPLACE]
  @scala.inline
  def MASTERPASS: MASTERPASS = "MASTERPASS".asInstanceOf[MASTERPASS]
  @scala.inline
  def MC: MC = "MC".asInstanceOf[MC]
  @scala.inline
  def MD: MD = "MD".asInstanceOf[MD]
  @scala.inline
  def MDL: MDL = "MDL".asInstanceOf[MDL]
  @scala.inline
  def ME: ME = "ME".asInstanceOf[ME]
  @scala.inline
  def MF: MF = "MF".asInstanceOf[MF]
  @scala.inline
  def MG: MG = "MG".asInstanceOf[MG]
  @scala.inline
  def MGA: MGA = "MGA".asInstanceOf[MGA]
  @scala.inline
  def MH: MH = "MH".asInstanceOf[MH]
  @scala.inline
  def MISSING_UBO: MISSING_UBO = "MISSING_UBO".asInstanceOf[MISSING_UBO]
  @scala.inline
  def MK: MK = "MK".asInstanceOf[MK]
  @scala.inline
  def MKD: MKD = "MKD".asInstanceOf[MKD]
  @scala.inline
  def ML: ML = "ML".asInstanceOf[ML]
  @scala.inline
  def MM: MM = "MM".asInstanceOf[MM]
  @scala.inline
  def MMK: MMK = "MMK".asInstanceOf[MMK]
  @scala.inline
  def MN: MN = "MN".asInstanceOf[MN]
  @scala.inline
  def MNT: MNT = "MNT".asInstanceOf[MNT]
  @scala.inline
  def MO: MO = "MO".asInstanceOf[MO]
  @scala.inline
  def MOP: MOP = "MOP".asInstanceOf[MOP]
  @scala.inline
  def MP: MP = "MP".asInstanceOf[MP]
  @scala.inline
  def MQ: MQ = "MQ".asInstanceOf[MQ]
  @scala.inline
  def MR: MR = "MR".asInstanceOf[MR]
  @scala.inline
  def MRU: MRU = "MRU".asInstanceOf[MRU]
  @scala.inline
  def MS: MS = "MS".asInstanceOf[MS]
  @scala.inline
  def MT: MT = "MT".asInstanceOf[MT]
  @scala.inline
  def MU: MU = "MU".asInstanceOf[MU]
  @scala.inline
  def MUR: MUR = "MUR".asInstanceOf[MUR]
  @scala.inline
  def MV: MV = "MV".asInstanceOf[MV]
  @scala.inline
  def MVR: MVR = "MVR".asInstanceOf[MVR]
  @scala.inline
  def MW: MW = "MW".asInstanceOf[MW]
  @scala.inline
  def MWK: MWK = "MWK".asInstanceOf[MWK]
  @scala.inline
  def MX: MX = "MX".asInstanceOf[MX]
  @scala.inline
  def MXN: MXN = "MXN".asInstanceOf[MXN]
  @scala.inline
  def MY: MY = "MY".asInstanceOf[MY]
  @scala.inline
  def MYR: MYR = "MYR".asInstanceOf[MYR]
  @scala.inline
  def MZ: MZ = "MZ".asInstanceOf[MZ]
  @scala.inline
  def MZN: MZN = "MZN".asInstanceOf[MZN]
  @scala.inline
  def MakeKeysNullable: MakeKeysNullable = "MakeKeysNullable".asInstanceOf[MakeKeysNullable]
  @scala.inline
  def NA: NA = "NA".asInstanceOf[NA]
  @scala.inline
  def NAD: NAD = "NAD".asInstanceOf[NAD]
  @scala.inline
  def NATURAL: NATURAL = "NATURAL".asInstanceOf[NATURAL]
  @scala.inline
  def NC: NC = "NC".asInstanceOf[NC]
  @scala.inline
  def NE: NE = "NE".asInstanceOf[NE]
  @scala.inline
  def NF: NF = "NF".asInstanceOf[NF]
  @scala.inline
  def NG: NG = "NG".asInstanceOf[NG]
  @scala.inline
  def NGN: NGN = "NGN".asInstanceOf[NGN]
  @scala.inline
  def NI: NI = "NI".asInstanceOf[NI]
  @scala.inline
  def NIO: NIO = "NIO".asInstanceOf[NIO]
  @scala.inline
  def NL: NL = "NL".asInstanceOf[NL]
  @scala.inline
  def NO: NO = "NO".asInstanceOf[NO]
  @scala.inline
  def NOK: NOK = "NOK".asInstanceOf[NOK]
  @scala.inline
  def NORMAL: NORMAL = "NORMAL".asInstanceOf[NORMAL]
  @scala.inline
  def NOT_CONTESTABLE: NOT_CONTESTABLE = "NOT_CONTESTABLE".asInstanceOf[NOT_CONTESTABLE]
  @scala.inline
  def NO_CHECK: NO_CHECK = "NO_CHECK".asInstanceOf[NO_CHECK]
  @scala.inline
  def NO_MATCH: NO_MATCH = "NO_MATCH".asInstanceOf[NO_MATCH]
  @scala.inline
  def NP: NP = "NP".asInstanceOf[NP]
  @scala.inline
  def NPR: NPR = "NPR".asInstanceOf[NPR]
  @scala.inline
  def NR: NR = "NR".asInstanceOf[NR]
  @scala.inline
  def NU: NU = "NU".asInstanceOf[NU]
  @scala.inline
  def NZ: NZ = "NZ".asInstanceOf[NZ]
  @scala.inline
  def NZD: NZD = "NZD".asInstanceOf[NZD]
  @scala.inline
  def Name: Name = "Name".asInstanceOf[Name]
  @scala.inline
  def Nationality: Nationality = "Nationality".asInstanceOf[Nationality]
  @scala.inline
  def Nature: Nature = "Nature".asInstanceOf[Nature]
  @scala.inline
  def NotSpecified: NotSpecified = "NotSpecified".asInstanceOf[NotSpecified]
  @scala.inline
  def OM: OM = "OM".asInstanceOf[OM]
  @scala.inline
  def OMR: OMR = "OMR".asInstanceOf[OMR]
  @scala.inline
  def ORGANIZATION: ORGANIZATION = "ORGANIZATION".asInstanceOf[ORGANIZATION]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def OWNER_DO_NOT_MATCH_BANKACCOUNT: OWNER_DO_NOT_MATCH_BANKACCOUNT = "OWNER_DO_NOT_MATCH_BANKACCOUNT".asInstanceOf[OWNER_DO_NOT_MATCH_BANKACCOUNT]
  @scala.inline
  def P24: P24 = "P24".asInstanceOf[P24]
  @scala.inline
  def P2P_PAYMENT: P2P_PAYMENT = "P2P_PAYMENT".asInstanceOf[P2P_PAYMENT]
  @scala.inline
  def PA: PA = "PA".asInstanceOf[PA]
  @scala.inline
  def PAB: PAB = "PAB".asInstanceOf[PAB]
  @scala.inline
  def PAYIN: PAYIN = "PAYIN".asInstanceOf[PAYIN]
  @scala.inline
  def PAYIN_NORMAL_CREATED: PAYIN_NORMAL_CREATED = "PAYIN_NORMAL_CREATED".asInstanceOf[PAYIN_NORMAL_CREATED]
  @scala.inline
  def PAYIN_NORMAL_FAILED: PAYIN_NORMAL_FAILED = "PAYIN_NORMAL_FAILED".asInstanceOf[PAYIN_NORMAL_FAILED]
  @scala.inline
  def PAYIN_NORMAL_SUCCEEDED: PAYIN_NORMAL_SUCCEEDED = "PAYIN_NORMAL_SUCCEEDED".asInstanceOf[PAYIN_NORMAL_SUCCEEDED]
  @scala.inline
  def PAYIN_REFUND_CREATED: PAYIN_REFUND_CREATED = "PAYIN_REFUND_CREATED".asInstanceOf[PAYIN_REFUND_CREATED]
  @scala.inline
  def PAYIN_REFUND_FAILED: PAYIN_REFUND_FAILED = "PAYIN_REFUND_FAILED".asInstanceOf[PAYIN_REFUND_FAILED]
  @scala.inline
  def PAYIN_REFUND_SUCCEEDED: PAYIN_REFUND_SUCCEEDED = "PAYIN_REFUND_SUCCEEDED".asInstanceOf[PAYIN_REFUND_SUCCEEDED]
  @scala.inline
  def PAYIN_REPUDIATION_CREATED: PAYIN_REPUDIATION_CREATED = "PAYIN_REPUDIATION_CREATED".asInstanceOf[PAYIN_REPUDIATION_CREATED]
  @scala.inline
  def PAYIN_REPUDIATION_FAILED: PAYIN_REPUDIATION_FAILED = "PAYIN_REPUDIATION_FAILED".asInstanceOf[PAYIN_REPUDIATION_FAILED]
  @scala.inline
  def PAYIN_REPUDIATION_SUCCEEDED: PAYIN_REPUDIATION_SUCCEEDED = "PAYIN_REPUDIATION_SUCCEEDED".asInstanceOf[PAYIN_REPUDIATION_SUCCEEDED]
  @scala.inline
  def PAYLIB: PAYLIB = "PAYLIB".asInstanceOf[PAYLIB]
  @scala.inline
  def PAYOUT: PAYOUT = "PAYOUT".asInstanceOf[PAYOUT]
  @scala.inline
  def PAYOUT_NORMAL_CREATED: PAYOUT_NORMAL_CREATED = "PAYOUT_NORMAL_CREATED".asInstanceOf[PAYOUT_NORMAL_CREATED]
  @scala.inline
  def PAYOUT_NORMAL_FAILED: PAYOUT_NORMAL_FAILED = "PAYOUT_NORMAL_FAILED".asInstanceOf[PAYOUT_NORMAL_FAILED]
  @scala.inline
  def PAYOUT_NORMAL_SUCCEEDED: PAYOUT_NORMAL_SUCCEEDED = "PAYOUT_NORMAL_SUCCEEDED".asInstanceOf[PAYOUT_NORMAL_SUCCEEDED]
  @scala.inline
  def PAYOUT_REFUND_CREATED: PAYOUT_REFUND_CREATED = "PAYOUT_REFUND_CREATED".asInstanceOf[PAYOUT_REFUND_CREATED]
  @scala.inline
  def PAYOUT_REFUND_FAILED: PAYOUT_REFUND_FAILED = "PAYOUT_REFUND_FAILED".asInstanceOf[PAYOUT_REFUND_FAILED]
  @scala.inline
  def PAYOUT_REFUND_SUCCEEDED: PAYOUT_REFUND_SUCCEEDED = "PAYOUT_REFUND_SUCCEEDED".asInstanceOf[PAYOUT_REFUND_SUCCEEDED]
  @scala.inline
  def PAYPAL: PAYPAL = "PAYPAL".asInstanceOf[PAYPAL]
  @scala.inline
  def PE: PE = "PE".asInstanceOf[PE]
  @scala.inline
  def PEN: PEN = "PEN".asInstanceOf[PEN]
  @scala.inline
  def PENDING_BANK_ACTION: PENDING_BANK_ACTION = "PENDING_BANK_ACTION".asInstanceOf[PENDING_BANK_ACTION]
  @scala.inline
  def PENDING_CLIENT_ACTION: PENDING_CLIENT_ACTION = "PENDING_CLIENT_ACTION".asInstanceOf[PENDING_CLIENT_ACTION]
  @scala.inline
  def PF: PF = "PF".asInstanceOf[PF]
  @scala.inline
  def PG: PG = "PG".asInstanceOf[PG]
  @scala.inline
  def PGK: PGK = "PGK".asInstanceOf[PGK]
  @scala.inline
  def PH: PH = "PH".asInstanceOf[PH]
  @scala.inline
  def PHP: PHP = "PHP".asInstanceOf[PHP]
  @scala.inline
  def PK: PK = "PK".asInstanceOf[PK]
  @scala.inline
  def PKR: PKR = "PKR".asInstanceOf[PKR]
  @scala.inline
  def PL: PL = "PL".asInstanceOf[PL]
  @scala.inline
  def PLN: PLN = "PLN".asInstanceOf[PLN]
  @scala.inline
  def PM: PM = "PM".asInstanceOf[PM]
  @scala.inline
  def PN: PN = "PN".asInstanceOf[PN]
  @scala.inline
  def POSTAL_CODE_MATCH_ONLY: POSTAL_CODE_MATCH_ONLY = "POSTAL_CODE_MATCH_ONLY".asInstanceOf[POSTAL_CODE_MATCH_ONLY]
  @scala.inline
  def PR: PR = "PR".asInstanceOf[PR]
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_CANCELED: PREAUTHORIZATION_PAYMENT_CANCELED = "PREAUTHORIZATION_PAYMENT_CANCELED".asInstanceOf[PREAUTHORIZATION_PAYMENT_CANCELED]
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_EXPIRED: PREAUTHORIZATION_PAYMENT_EXPIRED = "PREAUTHORIZATION_PAYMENT_EXPIRED".asInstanceOf[PREAUTHORIZATION_PAYMENT_EXPIRED]
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_VALIDATED: PREAUTHORIZATION_PAYMENT_VALIDATED = "PREAUTHORIZATION_PAYMENT_VALIDATED".asInstanceOf[PREAUTHORIZATION_PAYMENT_VALIDATED]
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_WAITING: PREAUTHORIZATION_PAYMENT_WAITING = "PREAUTHORIZATION_PAYMENT_WAITING".asInstanceOf[PREAUTHORIZATION_PAYMENT_WAITING]
  @scala.inline
  def PREAUTHORIZED: PREAUTHORIZED = "PREAUTHORIZED".asInstanceOf[PREAUTHORIZED]
  @scala.inline
  def PRODUCT_NOT_PROVIDED: PRODUCT_NOT_PROVIDED = "PRODUCT_NOT_PROVIDED".asInstanceOf[PRODUCT_NOT_PROVIDED]
  @scala.inline
  def PRODUCT_REPLACEMENT_PROOF: PRODUCT_REPLACEMENT_PROOF = "PRODUCT_REPLACEMENT_PROOF".asInstanceOf[PRODUCT_REPLACEMENT_PROOF]
  @scala.inline
  def PRODUCT_UNACCEPTABLE: PRODUCT_UNACCEPTABLE = "PRODUCT_UNACCEPTABLE".asInstanceOf[PRODUCT_UNACCEPTABLE]
  @scala.inline
  def PS: PS = "PS".asInstanceOf[PS]
  @scala.inline
  def PT: PT = "PT".asInstanceOf[PT]
  @scala.inline
  def PW: PW = "PW".asInstanceOf[PW]
  @scala.inline
  def PY: PY = "PY".asInstanceOf[PY]
  @scala.inline
  def PYG: PYG = "PYG".asInstanceOf[PYG]
  @scala.inline
  def PaymentType: PaymentType = "PaymentType".asInstanceOf[PaymentType]
  @scala.inline
  def PersonType: PersonType = "PersonType".asInstanceOf[PersonType]
  @scala.inline
  def PreauthorizationId: PreauthorizationId = "PreauthorizationId".asInstanceOf[PreauthorizationId]
  @scala.inline
  def ProofOfAddress: ProofOfAddress = "ProofOfAddress".asInstanceOf[ProofOfAddress]
  @scala.inline
  def ProofOfIdentity: ProofOfIdentity = "ProofOfIdentity".asInstanceOf[ProofOfIdentity]
  @scala.inline
  def ProofOfRegistration: ProofOfRegistration = "ProofOfRegistration".asInstanceOf[ProofOfRegistration]
  @scala.inline
  def QA: QA = "QA".asInstanceOf[QA]
  @scala.inline
  def QAR: QAR = "QAR".asInstanceOf[QAR]
  @scala.inline
  def RE: RE = "RE".asInstanceOf[RE]
  @scala.inline
  def REFUND: REFUND = "REFUND".asInstanceOf[REFUND]
  @scala.inline
  def REFUND_CONVERSION_RATE: REFUND_CONVERSION_RATE = "REFUND_CONVERSION_RATE".asInstanceOf[REFUND_CONVERSION_RATE]
  @scala.inline
  def REFUND_NOT_PROCESSED: REFUND_NOT_PROCESSED = "REFUND_NOT_PROCESSED".asInstanceOf[REFUND_NOT_PROCESSED]
  @scala.inline
  def REFUND_PROOF: REFUND_PROOF = "REFUND_PROOF".asInstanceOf[REFUND_PROOF]
  @scala.inline
  def REFUSED: REFUSED = "REFUSED".asInstanceOf[REFUSED]
  @scala.inline
  def REGISTRATION_PROOF: REGISTRATION_PROOF = "REGISTRATION_PROOF".asInstanceOf[REGISTRATION_PROOF]
  @scala.inline
  def REGULAR: REGULAR = "REGULAR".asInstanceOf[REGULAR]
  @scala.inline
  def RENTALS: RENTALS = "RENTALS".asInstanceOf[RENTALS]
  @scala.inline
  def REOPENED_PENDING_CLIENT_ACTION: REOPENED_PENDING_CLIENT_ACTION = "REOPENED_PENDING_CLIENT_ACTION".asInstanceOf[REOPENED_PENDING_CLIENT_ACTION]
  @scala.inline
  def REPUDIATION: REPUDIATION = "REPUDIATION".asInstanceOf[REPUDIATION]
  @scala.inline
  def RETRIEVAL: RETRIEVAL = "RETRIEVAL".asInstanceOf[RETRIEVAL]
  @scala.inline
  def RO: RO = "RO".asInstanceOf[RO]
  @scala.inline
  def RON: RON = "RON".asInstanceOf[RON]
  @scala.inline
  def RS: RS = "RS".asInstanceOf[RS]
  @scala.inline
  def RSD: RSD = "RSD".asInstanceOf[RSD]
  @scala.inline
  def RU: RU = "RU".asInstanceOf[RU]
  @scala.inline
  def RUB: RUB = "RUB".asInstanceOf[RUB]
  @scala.inline
  def RW: RW = "RW".asInstanceOf[RW]
  @scala.inline
  def RWF: RWF = "RWF".asInstanceOf[RWF]
  @scala.inline
  def ResultCode: ResultCode = "ResultCode".asInstanceOf[ResultCode]
  @scala.inline
  def ResultMessage: ResultMessage = "ResultMessage".asInstanceOf[ResultMessage]
  @scala.inline
  def SA: SA = "SA".asInstanceOf[SA]
  @scala.inline
  def SAR: SAR = "SAR".asInstanceOf[SAR]
  @scala.inline
  def SAVINGS: SAVINGS = "SAVINGS".asInstanceOf[SAVINGS]
  @scala.inline
  def SB: SB = "SB".asInstanceOf[SB]
  @scala.inline
  def SBD: SBD = "SBD".asInstanceOf[SBD]
  @scala.inline
  def SC: SC = "SC".asInstanceOf[SC]
  @scala.inline
  def SCR: SCR = "SCR".asInstanceOf[SCR]
  @scala.inline
  def SD: SD = "SD".asInstanceOf[SD]
  @scala.inline
  def SDG: SDG = "SDG".asInstanceOf[SDG]
  @scala.inline
  def SE: SE = "SE".asInstanceOf[SE]
  @scala.inline
  def SEK: SEK = "SEK".asInstanceOf[SEK]
  @scala.inline
  def SEPA: SEPA = "SEPA".asInstanceOf[SEPA]
  @scala.inline
  def SERVICES_JOBBING_EDUCATION: SERVICES_JOBBING_EDUCATION = "SERVICES_JOBBING_EDUCATION".asInstanceOf[SERVICES_JOBBING_EDUCATION]
  @scala.inline
  def SETTLEMENT: SETTLEMENT = "SETTLEMENT".asInstanceOf[SETTLEMENT]
  @scala.inline
  def SG: SG = "SG".asInstanceOf[SG]
  @scala.inline
  def SGD: SGD = "SGD".asInstanceOf[SGD]
  @scala.inline
  def SH: SH = "SH".asInstanceOf[SH]
  @scala.inline
  def SHAREHOLDER_DECLARATION: SHAREHOLDER_DECLARATION = "SHAREHOLDER_DECLARATION".asInstanceOf[SHAREHOLDER_DECLARATION]
  @scala.inline
  def SHP: SHP = "SHP".asInstanceOf[SHP]
  @scala.inline
  def SI: SI = "SI".asInstanceOf[SI]
  @scala.inline
  def SJ: SJ = "SJ".asInstanceOf[SJ]
  @scala.inline
  def SK: SK = "SK".asInstanceOf[SK]
  @scala.inline
  def SL: SL = "SL".asInstanceOf[SL]
  @scala.inline
  def SLL: SLL = "SLL".asInstanceOf[SLL]
  @scala.inline
  def SM: SM = "SM".asInstanceOf[SM]
  @scala.inline
  def SN: SN = "SN".asInstanceOf[SN]
  @scala.inline
  def SO: SO = "SO".asInstanceOf[SO]
  @scala.inline
  def SOLETRADER: SOLETRADER = "SOLETRADER".asInstanceOf[SOLETRADER]
  @scala.inline
  def SOS: SOS = "SOS".asInstanceOf[SOS]
  @scala.inline
  def SPECIFIC_CASE: SPECIFIC_CASE = "SPECIFIC_CASE".asInstanceOf[SPECIFIC_CASE]
  @scala.inline
  def SPL: SPL = "SPL".asInstanceOf[SPL]
  @scala.inline
  def SPORT_RECREATION_ACTIVITIES: SPORT_RECREATION_ACTIVITIES = "SPORT_RECREATION_ACTIVITIES".asInstanceOf[SPORT_RECREATION_ACTIVITIES]
  @scala.inline
  def SR: SR = "SR".asInstanceOf[SR]
  @scala.inline
  def SRD: SRD = "SRD".asInstanceOf[SRD]
  @scala.inline
  def SS: SS = "SS".asInstanceOf[SS]
  @scala.inline
  def ST: ST = "ST".asInstanceOf[ST]
  @scala.inline
  def STN: STN = "STN".asInstanceOf[STN]
  @scala.inline
  def STORES_FASHION_ACCESSORIES_OBJECTS: STORES_FASHION_ACCESSORIES_OBJECTS = "STORES_FASHION_ACCESSORIES_OBJECTS".asInstanceOf[STORES_FASHION_ACCESSORIES_OBJECTS]
  @scala.inline
  def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  @scala.inline
  def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  @scala.inline
  def SV: SV = "SV".asInstanceOf[SV]
  @scala.inline
  def SVC: SVC = "SVC".asInstanceOf[SVC]
  @scala.inline
  def SX: SX = "SX".asInstanceOf[SX]
  @scala.inline
  def SY: SY = "SY".asInstanceOf[SY]
  @scala.inline
  def SYP: SYP = "SYP".asInstanceOf[SYP]
  @scala.inline
  def SZ: SZ = "SZ".asInstanceOf[SZ]
  @scala.inline
  def SZL: SZL = "SZL".asInstanceOf[SZL]
  @scala.inline
  def ShareholderDeclaration: ShareholderDeclaration = "ShareholderDeclaration".asInstanceOf[ShareholderDeclaration]
  @scala.inline
  def Status: Status = "Status".asInstanceOf[Status]
  @scala.inline
  def Statute: Statute = "Statute".asInstanceOf[Statute]
  @scala.inline
  def TC: TC = "TC".asInstanceOf[TC]
  @scala.inline
  def TD: TD = "TD".asInstanceOf[TD]
  @scala.inline
  def TF: TF = "TF".asInstanceOf[TF]
  @scala.inline
  def TG: TG = "TG".asInstanceOf[TG]
  @scala.inline
  def TH: TH = "TH".asInstanceOf[TH]
  @scala.inline
  def THB: THB = "THB".asInstanceOf[THB]
  @scala.inline
  def TICKETING: TICKETING = "TICKETING".asInstanceOf[TICKETING]
  @scala.inline
  def TJ: TJ = "TJ".asInstanceOf[TJ]
  @scala.inline
  def TJS: TJS = "TJS".asInstanceOf[TJS]
  @scala.inline
  def TK: TK = "TK".asInstanceOf[TK]
  @scala.inline
  def TL: TL = "TL".asInstanceOf[TL]
  @scala.inline
  def TM: TM = "TM".asInstanceOf[TM]
  @scala.inline
  def TMT: TMT = "TMT".asInstanceOf[TMT]
  @scala.inline
  def TN: TN = "TN".asInstanceOf[TN]
  @scala.inline
  def TND: TND = "TND".asInstanceOf[TND]
  @scala.inline
  def TO: TO = "TO".asInstanceOf[TO]
  @scala.inline
  def TOP: TOP = "TOP".asInstanceOf[TOP]
  @scala.inline
  def TR: TR = "TR".asInstanceOf[TR]
  @scala.inline
  def TRANSACTIONS: TRANSACTIONS = "TRANSACTIONS".asInstanceOf[TRANSACTIONS]
  @scala.inline
  def TRANSACTION_NOT_RECOGNIZED: TRANSACTION_NOT_RECOGNIZED = "TRANSACTION_NOT_RECOGNIZED".asInstanceOf[TRANSACTION_NOT_RECOGNIZED]
  @scala.inline
  def TRANSFER: TRANSFER = "TRANSFER".asInstanceOf[TRANSFER]
  @scala.inline
  def TRANSFER_NORMAL_CREATED: TRANSFER_NORMAL_CREATED = "TRANSFER_NORMAL_CREATED".asInstanceOf[TRANSFER_NORMAL_CREATED]
  @scala.inline
  def TRANSFER_NORMAL_FAILED: TRANSFER_NORMAL_FAILED = "TRANSFER_NORMAL_FAILED".asInstanceOf[TRANSFER_NORMAL_FAILED]
  @scala.inline
  def TRANSFER_NORMAL_SUCCEEDED: TRANSFER_NORMAL_SUCCEEDED = "TRANSFER_NORMAL_SUCCEEDED".asInstanceOf[TRANSFER_NORMAL_SUCCEEDED]
  @scala.inline
  def TRANSFER_REFUND_CREATED: TRANSFER_REFUND_CREATED = "TRANSFER_REFUND_CREATED".asInstanceOf[TRANSFER_REFUND_CREATED]
  @scala.inline
  def TRANSFER_REFUND_FAILED: TRANSFER_REFUND_FAILED = "TRANSFER_REFUND_FAILED".asInstanceOf[TRANSFER_REFUND_FAILED]
  @scala.inline
  def TRANSFER_REFUND_SUCCEEDED: TRANSFER_REFUND_SUCCEEDED = "TRANSFER_REFUND_SUCCEEDED".asInstanceOf[TRANSFER_REFUND_SUCCEEDED]
  @scala.inline
  def TRANSFER_SETTLEMENT_CREATED: TRANSFER_SETTLEMENT_CREATED = "TRANSFER_SETTLEMENT_CREATED".asInstanceOf[TRANSFER_SETTLEMENT_CREATED]
  @scala.inline
  def TRANSFER_SETTLEMENT_FAILED: TRANSFER_SETTLEMENT_FAILED = "TRANSFER_SETTLEMENT_FAILED".asInstanceOf[TRANSFER_SETTLEMENT_FAILED]
  @scala.inline
  def TRANSFER_SETTLEMENT_SUCCEEDED: TRANSFER_SETTLEMENT_SUCCEEDED = "TRANSFER_SETTLEMENT_SUCCEEDED".asInstanceOf[TRANSFER_SETTLEMENT_SUCCEEDED]
  @scala.inline
  def TRY: TRY = "TRY".asInstanceOf[TRY]
  @scala.inline
  def TT: TT = "TT".asInstanceOf[TT]
  @scala.inline
  def TTD: TTD = "TTD".asInstanceOf[TTD]
  @scala.inline
  def TV: TV = "TV".asInstanceOf[TV]
  @scala.inline
  def TVD: TVD = "TVD".asInstanceOf[TVD]
  @scala.inline
  def TW: TW = "TW".asInstanceOf[TW]
  @scala.inline
  def TWD: TWD = "TWD".asInstanceOf[TWD]
  @scala.inline
  def TZ: TZ = "TZ".asInstanceOf[TZ]
  @scala.inline
  def TZS: TZS = "TZS".asInstanceOf[TZS]
  @scala.inline
  def Tag: Tag = "Tag".asInstanceOf[Tag]
  @scala.inline
  def Type: Type = "Type".asInstanceOf[Type]
  @scala.inline
  def UA: UA = "UA".asInstanceOf[UA]
  @scala.inline
  def UAH: UAH = "UAH".asInstanceOf[UAH]
  @scala.inline
  def UBO_DECLARATION_CREATED: UBO_DECLARATION_CREATED = "UBO_DECLARATION_CREATED".asInstanceOf[UBO_DECLARATION_CREATED]
  @scala.inline
  def UBO_DECLARATION_REFUSED: UBO_DECLARATION_REFUSED = "UBO_DECLARATION_REFUSED".asInstanceOf[UBO_DECLARATION_REFUSED]
  @scala.inline
  def UBO_DECLARATION_VALIDATED: UBO_DECLARATION_VALIDATED = "UBO_DECLARATION_VALIDATED".asInstanceOf[UBO_DECLARATION_VALIDATED]
  @scala.inline
  def UBO_DECLARATION_VALIDATION_ASKED: UBO_DECLARATION_VALIDATION_ASKED = "UBO_DECLARATION_VALIDATION_ASKED".asInstanceOf[UBO_DECLARATION_VALIDATION_ASKED]
  @scala.inline
  def UG: UG = "UG".asInstanceOf[UG]
  @scala.inline
  def UGX: UGX = "UGX".asInstanceOf[UGX]
  @scala.inline
  def UM: UM = "UM".asInstanceOf[UM]
  @scala.inline
  def UNDERAGE_PERSON: UNDERAGE_PERSON = "UNDERAGE_PERSON".asInstanceOf[UNDERAGE_PERSON]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  @scala.inline
  def USD: USD = "USD".asInstanceOf[USD]
  @scala.inline
  def USER_ACCEPTANCE_PROOF: USER_ACCEPTANCE_PROOF = "USER_ACCEPTANCE_PROOF".asInstanceOf[USER_ACCEPTANCE_PROOF]
  @scala.inline
  def USER_CORRESPONDANCE: USER_CORRESPONDANCE = "USER_CORRESPONDANCE".asInstanceOf[USER_CORRESPONDANCE]
  @scala.inline
  def UY: UY = "UY".asInstanceOf[UY]
  @scala.inline
  def UYU: UYU = "UYU".asInstanceOf[UYU]
  @scala.inline
  def UZ: UZ = "UZ".asInstanceOf[UZ]
  @scala.inline
  def UZS: UZS = "UZS".asInstanceOf[UZS]
  @scala.inline
  def VA: VA = "VA".asInstanceOf[VA]
  @scala.inline
  def VALID: VALID = "VALID".asInstanceOf[VALID]
  @scala.inline
  def VALIDATED: VALIDATED = "VALIDATED".asInstanceOf[VALIDATED]
  @scala.inline
  def VALIDATION_ASKED: VALIDATION_ASKED = "VALIDATION_ASKED".asInstanceOf[VALIDATION_ASKED]
  @scala.inline
  def VC: VC = "VC".asInstanceOf[VC]
  @scala.inline
  def VE: VE = "VE".asInstanceOf[VE]
  @scala.inline
  def VEF: VEF = "VEF".asInstanceOf[VEF]
  @scala.inline
  def VG: VG = "VG".asInstanceOf[VG]
  @scala.inline
  def VI: VI = "VI".asInstanceOf[VI]
  @scala.inline
  def VN: VN = "VN".asInstanceOf[VN]
  @scala.inline
  def VND: VND = "VND".asInstanceOf[VND]
  @scala.inline
  def VU: VU = "VU".asInstanceOf[VU]
  @scala.inline
  def VUV: VUV = "VUV".asInstanceOf[VUV]
  @scala.inline
  def WAITING: WAITING = "WAITING".asInstanceOf[WAITING]
  @scala.inline
  def WEB: WEB = "WEB".asInstanceOf[WEB]
  @scala.inline
  def WF: WF = "WF".asInstanceOf[WF]
  @scala.inline
  def WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS: WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS = "WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS".asInstanceOf[WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS]
  @scala.inline
  def WS: WS = "WS".asInstanceOf[WS]
  @scala.inline
  def WST: WST = "WST".asInstanceOf[WST]
  @scala.inline
  def WireReference: WireReference = "WireReference".asInstanceOf[WireReference]
  @scala.inline
  def XAF: XAF = "XAF".asInstanceOf[XAF]
  @scala.inline
  def XCD: XCD = "XCD".asInstanceOf[XCD]
  @scala.inline
  def XDR: XDR = "XDR".asInstanceOf[XDR]
  @scala.inline
  def XOF: XOF = "XOF".asInstanceOf[XOF]
  @scala.inline
  def XPF: XPF = "XPF".asInstanceOf[XPF]
  @scala.inline
  def YE: YE = "YE".asInstanceOf[YE]
  @scala.inline
  def YER: YER = "YER".asInstanceOf[YER]
  @scala.inline
  def YT: YT = "YT".asInstanceOf[YT]
  @scala.inline
  def ZA: ZA = "ZA".asInstanceOf[ZA]
  @scala.inline
  def ZAR: ZAR = "ZAR".asInstanceOf[ZAR]
  @scala.inline
  def ZM: ZM = "ZM".asInstanceOf[ZM]
  @scala.inline
  def ZMW: ZMW = "ZMW".asInstanceOf[ZMW]
  @scala.inline
  def ZW: ZW = "ZW".asInstanceOf[ZW]
  @scala.inline
  def ZWD: ZWD = "ZWD".asInstanceOf[ZWD]
  @scala.inline
  def authentication_oauth: authentication_oauth = "authentication_oauth".asInstanceOf[authentication_oauth]
  @scala.inline
  def banking_aliases_all: banking_aliases_all = "banking_aliases_all".asInstanceOf[banking_aliases_all]
  @scala.inline
  def banking_aliases_get: banking_aliases_get = "banking_aliases_get".asInstanceOf[banking_aliases_get]
  @scala.inline
  def banking_aliases_iban_create: banking_aliases_iban_create = "banking_aliases_iban_create".asInstanceOf[banking_aliases_iban_create]
  @scala.inline
  def banking_aliases_update: banking_aliases_update = "banking_aliases_update".asInstanceOf[banking_aliases_update]
  @scala.inline
  def card_get: card_get = "card_get".asInstanceOf[card_get]
  @scala.inline
  def card_get_preauthorizations: card_get_preauthorizations = "card_get_preauthorizations".asInstanceOf[card_get_preauthorizations]
  @scala.inline
  def card_save: card_save = "card_save".asInstanceOf[card_save]
  @scala.inline
  def cardregistration_create: cardregistration_create = "cardregistration_create".asInstanceOf[cardregistration_create]
  @scala.inline
  def cardregistration_get: cardregistration_get = "cardregistration_get".asInstanceOf[cardregistration_get]
  @scala.inline
  def cardregistration_save: cardregistration_save = "cardregistration_save".asInstanceOf[cardregistration_save]
  @scala.inline
  def cards_get_by_fingerprint: cards_get_by_fingerprint = "cards_get_by_fingerprint".asInstanceOf[cards_get_by_fingerprint]
  @scala.inline
  def client_wallets_all: client_wallets_all = "client_wallets_all".asInstanceOf[client_wallets_all]
  @scala.inline
  def client_wallets_by_fundsType: client_wallets_by_fundsType = "client_wallets_by_fundsType".asInstanceOf[client_wallets_by_fundsType]
  @scala.inline
  def client_wallets_get: client_wallets_get = "client_wallets_get".asInstanceOf[client_wallets_get]
  @scala.inline
  def client_wallets_transactions: client_wallets_transactions = "client_wallets_transactions".asInstanceOf[client_wallets_transactions]
  @scala.inline
  def clients_get: clients_get = "clients_get".asInstanceOf[clients_get]
  @scala.inline
  def clients_update: clients_update = "clients_update".asInstanceOf[clients_update]
  @scala.inline
  def clients_upload_logo: clients_upload_logo = "clients_upload_logo".asInstanceOf[clients_upload_logo]
  @scala.inline
  def dispute_save_close: dispute_save_close = "dispute_save_close".asInstanceOf[dispute_save_close]
  @scala.inline
  def disputes_all: disputes_all = "disputes_all".asInstanceOf[disputes_all]
  @scala.inline
  def disputes_document_all: disputes_document_all = "disputes_document_all".asInstanceOf[disputes_document_all]
  @scala.inline
  def disputes_document_create: disputes_document_create = "disputes_document_create".asInstanceOf[disputes_document_create]
  @scala.inline
  def disputes_document_create_consult: disputes_document_create_consult = "disputes_document_create_consult".asInstanceOf[disputes_document_create_consult]
  @scala.inline
  def disputes_document_get: disputes_document_get = "disputes_document_get".asInstanceOf[disputes_document_get]
  @scala.inline
  def disputes_document_get_for_dispute: disputes_document_get_for_dispute = "disputes_document_get_for_dispute".asInstanceOf[disputes_document_get_for_dispute]
  @scala.inline
  def disputes_document_page_create: disputes_document_page_create = "disputes_document_page_create".asInstanceOf[disputes_document_page_create]
  @scala.inline
  def disputes_document_save: disputes_document_save = "disputes_document_save".asInstanceOf[disputes_document_save]
  @scala.inline
  def disputes_get: disputes_get = "disputes_get".asInstanceOf[disputes_get]
  @scala.inline
  def disputes_get_for_user: disputes_get_for_user = "disputes_get_for_user".asInstanceOf[disputes_get_for_user]
  @scala.inline
  def disputes_get_for_wallet: disputes_get_for_wallet = "disputes_get_for_wallet".asInstanceOf[disputes_get_for_wallet]
  @scala.inline
  def disputes_get_transactions: disputes_get_transactions = "disputes_get_transactions".asInstanceOf[disputes_get_transactions]
  @scala.inline
  def disputes_pending_settlement: disputes_pending_settlement = "disputes_pending_settlement".asInstanceOf[disputes_pending_settlement]
  @scala.inline
  def disputes_repudiation_create_settlement: disputes_repudiation_create_settlement = "disputes_repudiation_create_settlement".asInstanceOf[disputes_repudiation_create_settlement]
  @scala.inline
  def disputes_repudiation_get: disputes_repudiation_get = "disputes_repudiation_get".asInstanceOf[disputes_repudiation_get]
  @scala.inline
  def disputes_repudiation_get_settlement: disputes_repudiation_get_settlement = "disputes_repudiation_get_settlement".asInstanceOf[disputes_repudiation_get_settlement]
  @scala.inline
  def disputes_save_contest_funds: disputes_save_contest_funds = "disputes_save_contest_funds".asInstanceOf[disputes_save_contest_funds]
  @scala.inline
  def disputes_save_tag: disputes_save_tag = "disputes_save_tag".asInstanceOf[disputes_save_tag]
  @scala.inline
  def events_all: events_all = "events_all".asInstanceOf[events_all]
  @scala.inline
  def hooks_all: hooks_all = "hooks_all".asInstanceOf[hooks_all]
  @scala.inline
  def hooks_create: hooks_create = "hooks_create".asInstanceOf[hooks_create]
  @scala.inline
  def hooks_get: hooks_get = "hooks_get".asInstanceOf[hooks_get]
  @scala.inline
  def hooks_save: hooks_save = "hooks_save".asInstanceOf[hooks_save]
  @scala.inline
  def kyc_documents_all: kyc_documents_all = "kyc_documents_all".asInstanceOf[kyc_documents_all]
  @scala.inline
  def kyc_documents_create: kyc_documents_create = "kyc_documents_create".asInstanceOf[kyc_documents_create]
  @scala.inline
  def kyc_documents_create_consult: kyc_documents_create_consult = "kyc_documents_create_consult".asInstanceOf[kyc_documents_create_consult]
  @scala.inline
  def kyc_documents_get: kyc_documents_get = "kyc_documents_get".asInstanceOf[kyc_documents_get]
  @scala.inline
  def kyc_documents_get_alt: kyc_documents_get_alt = "kyc_documents_get_alt".asInstanceOf[kyc_documents_get_alt]
  @scala.inline
  def kyc_documents_save: kyc_documents_save = "kyc_documents_save".asInstanceOf[kyc_documents_save]
  @scala.inline
  def kyc_page_create: kyc_page_create = "kyc_page_create".asInstanceOf[kyc_page_create]
  @scala.inline
  def mandates_all: mandates_all = "mandates_all".asInstanceOf[mandates_all]
  @scala.inline
  def mandates_cancel: mandates_cancel = "mandates_cancel".asInstanceOf[mandates_cancel]
  @scala.inline
  def `mandates_directdebit-web_create`: `mandates_directdebit-web_create` = "mandates_directdebit-web_create".asInstanceOf[`mandates_directdebit-web_create`]
  @scala.inline
  def mandates_get: mandates_get = "mandates_get".asInstanceOf[mandates_get]
  @scala.inline
  def mandates_get_for_bank_account: mandates_get_for_bank_account = "mandates_get_for_bank_account".asInstanceOf[mandates_get_for_bank_account]
  @scala.inline
  def mandates_get_for_user: mandates_get_for_user = "mandates_get_for_user".asInstanceOf[mandates_get_for_user]
  @scala.inline
  def `payins_bankwire-direct_create`: `payins_bankwire-direct_create` = "payins_bankwire-direct_create".asInstanceOf[`payins_bankwire-direct_create`]
  @scala.inline
  def `payins_card-direct_create`: `payins_card-direct_create` = "payins_card-direct_create".asInstanceOf[`payins_card-direct_create`]
  @scala.inline
  def `payins_card-web_create`: `payins_card-web_create` = "payins_card-web_create".asInstanceOf[`payins_card-web_create`]
  @scala.inline
  def payins_createrefunds: payins_createrefunds = "payins_createrefunds".asInstanceOf[payins_createrefunds]
  @scala.inline
  def `payins_directdebit-direct_create`: `payins_directdebit-direct_create` = "payins_directdebit-direct_create".asInstanceOf[`payins_directdebit-direct_create`]
  @scala.inline
  def `payins_directdebit-web_create`: `payins_directdebit-web_create` = "payins_directdebit-web_create".asInstanceOf[`payins_directdebit-web_create`]
  @scala.inline
  def payins_get: payins_get = "payins_get".asInstanceOf[payins_get]
  @scala.inline
  def `payins_paypal-web_create`: `payins_paypal-web_create` = "payins_paypal-web_create".asInstanceOf[`payins_paypal-web_create`]
  @scala.inline
  def `payins_preauthorized-direct_create`: `payins_preauthorized-direct_create` = "payins_preauthorized-direct_create".asInstanceOf[`payins_preauthorized-direct_create`]
  @scala.inline
  def payouts_bankwire_create: payouts_bankwire_create = "payouts_bankwire_create".asInstanceOf[payouts_bankwire_create]
  @scala.inline
  def payouts_get: payouts_get = "payouts_get".asInstanceOf[payouts_get]
  @scala.inline
  def preauthorization_create: preauthorization_create = "preauthorization_create".asInstanceOf[preauthorization_create]
  @scala.inline
  def preauthorization_get: preauthorization_get = "preauthorization_get".asInstanceOf[preauthorization_get]
  @scala.inline
  def preauthorization_save: preauthorization_save = "preauthorization_save".asInstanceOf[preauthorization_save]
  @scala.inline
  def preauthorizations_get_for_user: preauthorizations_get_for_user = "preauthorizations_get_for_user".asInstanceOf[preauthorizations_get_for_user]
  @scala.inline
  def refunds_get: refunds_get = "refunds_get".asInstanceOf[refunds_get]
  @scala.inline
  def refunds_get_for_payin: refunds_get_for_payin = "refunds_get_for_payin".asInstanceOf[refunds_get_for_payin]
  @scala.inline
  def refunds_get_for_payout: refunds_get_for_payout = "refunds_get_for_payout".asInstanceOf[refunds_get_for_payout]
  @scala.inline
  def refunds_get_for_repudiation: refunds_get_for_repudiation = "refunds_get_for_repudiation".asInstanceOf[refunds_get_for_repudiation]
  @scala.inline
  def refunds_get_for_transfer: refunds_get_for_transfer = "refunds_get_for_transfer".asInstanceOf[refunds_get_for_transfer]
  @scala.inline
  def reports_all: reports_all = "reports_all".asInstanceOf[reports_all]
  @scala.inline
  def reports_get: reports_get = "reports_get".asInstanceOf[reports_get]
  @scala.inline
  def reports_transaction_create: reports_transaction_create = "reports_transaction_create".asInstanceOf[reports_transaction_create]
  @scala.inline
  def reports_wallet_create: reports_wallet_create = "reports_wallet_create".asInstanceOf[reports_wallet_create]
  @scala.inline
  def responses_get: responses_get = "responses_get".asInstanceOf[responses_get]
  @scala.inline
  def transactions_get_for_bank_account: transactions_get_for_bank_account = "transactions_get_for_bank_account".asInstanceOf[transactions_get_for_bank_account]
  @scala.inline
  def transactions_get_for_card: transactions_get_for_card = "transactions_get_for_card".asInstanceOf[transactions_get_for_card]
  @scala.inline
  def transactions_get_for_mandate: transactions_get_for_mandate = "transactions_get_for_mandate".asInstanceOf[transactions_get_for_mandate]
  @scala.inline
  def transfers_create: transfers_create = "transfers_create".asInstanceOf[transfers_create]
  @scala.inline
  def transfers_createrefunds: transfers_createrefunds = "transfers_createrefunds".asInstanceOf[transfers_createrefunds]
  @scala.inline
  def transfers_get: transfers_get = "transfers_get".asInstanceOf[transfers_get]
  @scala.inline
  def ubo_declaration_create: ubo_declaration_create = "ubo_declaration_create".asInstanceOf[ubo_declaration_create]
  @scala.inline
  def ubo_declaration_get: ubo_declaration_get = "ubo_declaration_get".asInstanceOf[ubo_declaration_get]
  @scala.inline
  def ubo_declaration_update: ubo_declaration_update = "ubo_declaration_update".asInstanceOf[ubo_declaration_update]
  @scala.inline
  def users_all: users_all = "users_all".asInstanceOf[users_all]
  @scala.inline
  def users_allbankaccount: users_allbankaccount = "users_allbankaccount".asInstanceOf[users_allbankaccount]
  @scala.inline
  def users_allcards: users_allcards = "users_allcards".asInstanceOf[users_allcards]
  @scala.inline
  def users_allkycdocuments: users_allkycdocuments = "users_allkycdocuments".asInstanceOf[users_allkycdocuments]
  @scala.inline
  def users_alltransactions: users_alltransactions = "users_alltransactions".asInstanceOf[users_alltransactions]
  @scala.inline
  def users_allwallets: users_allwallets = "users_allwallets".asInstanceOf[users_allwallets]
  @scala.inline
  def users_createbankaccounts_ca: users_createbankaccounts_ca = "users_createbankaccounts_ca".asInstanceOf[users_createbankaccounts_ca]
  @scala.inline
  def users_createbankaccounts_gb: users_createbankaccounts_gb = "users_createbankaccounts_gb".asInstanceOf[users_createbankaccounts_gb]
  @scala.inline
  def users_createbankaccounts_iban: users_createbankaccounts_iban = "users_createbankaccounts_iban".asInstanceOf[users_createbankaccounts_iban]
  @scala.inline
  def users_createbankaccounts_other: users_createbankaccounts_other = "users_createbankaccounts_other".asInstanceOf[users_createbankaccounts_other]
  @scala.inline
  def users_createbankaccounts_us: users_createbankaccounts_us = "users_createbankaccounts_us".asInstanceOf[users_createbankaccounts_us]
  @scala.inline
  def users_createlegals: users_createlegals = "users_createlegals".asInstanceOf[users_createlegals]
  @scala.inline
  def users_createnaturals: users_createnaturals = "users_createnaturals".asInstanceOf[users_createnaturals]
  @scala.inline
  def users_deactivate_bankaccount: users_deactivate_bankaccount = "users_deactivate_bankaccount".asInstanceOf[users_deactivate_bankaccount]
  @scala.inline
  def users_get: users_get = "users_get".asInstanceOf[users_get]
  @scala.inline
  def users_getbankaccount: users_getbankaccount = "users_getbankaccount".asInstanceOf[users_getbankaccount]
  @scala.inline
  def users_getemoney: users_getemoney = "users_getemoney".asInstanceOf[users_getemoney]
  @scala.inline
  def users_getlegals: users_getlegals = "users_getlegals".asInstanceOf[users_getlegals]
  @scala.inline
  def users_getnaturals: users_getnaturals = "users_getnaturals".asInstanceOf[users_getnaturals]
  @scala.inline
  def users_savelegals: users_savelegals = "users_savelegals".asInstanceOf[users_savelegals]
  @scala.inline
  def users_savenaturals: users_savenaturals = "users_savenaturals".asInstanceOf[users_savenaturals]
  @scala.inline
  def wallets_alltransactions: wallets_alltransactions = "wallets_alltransactions".asInstanceOf[wallets_alltransactions]
  @scala.inline
  def wallets_create: wallets_create = "wallets_create".asInstanceOf[wallets_create]
  @scala.inline
  def wallets_get: wallets_get = "wallets_get".asInstanceOf[wallets_get]
  @scala.inline
  def wallets_save: wallets_save = "wallets_save".asInstanceOf[wallets_save]
}

