package typings.invityApi

import typings.invityApi.mod.BuyCryptoPaymentMethod
import typings.invityApi.mod.BuyTradeFinalStatus
import typings.invityApi.mod.BuyTradeStatus
import typings.invityApi.mod.BuyTradeTag
import typings.invityApi.mod.DexApprovalType
import typings.invityApi.mod.ExchangeTradeFinalStatus
import typings.invityApi.mod.ExchangeTradeStatus
import typings.invityApi.mod.ExchangeTradeTag
import typings.invityApi.mod.OnlineStatus
import typings.invityApi.mod.PaymentFrequency
import typings.invityApi.mod.SavingsAMLStatus
import typings.invityApi.mod.SavingsKYCStatus
import typings.invityApi.mod.SavingsPaymentMethod
import typings.invityApi.mod.SavingsSetupStatus
import typings.invityApi.mod.SavingsStatus
import typings.invityApi.mod.SavingsTradeItemStatus
import typings.invityApi.mod.SavingsTradeUserKYCStartDocumentImageSide
import typings.invityApi.mod.SavingsTradeUserKYCStartDocumentType
import typings.invityApi.mod.SellCryptoPaymentMethod
import typings.invityApi.mod.SellFiatFlowType
import typings.invityApi.mod.SellProviderType
import typings.invityApi.mod.SellTradeFinalStatus
import typings.invityApi.mod.SellTradeStatus
import typings.invityApi.mod.SellTradeTag
import typings.invityApi.mod.TicketTopic
import typings.invityApi.mod._ExchangeFee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invityApiStrings {
  
  @js.native
  sealed trait AML
    extends StObject
       with SavingsSetupStatus
       with SavingsStatus
  inline def AML: AML = "AML".asInstanceOf[AML]
  
  @js.native
  sealed trait APPROVAL_PENDING
    extends StObject
       with BuyTradeStatus
       with ExchangeTradeStatus
  inline def APPROVAL_PENDING: APPROVAL_PENDING = "APPROVAL_PENDING".asInstanceOf[APPROVAL_PENDING]
  
  @js.native
  sealed trait APPROVAL_REQ
    extends StObject
       with ExchangeTradeStatus
  inline def APPROVAL_REQ: APPROVAL_REQ = "APPROVAL_REQ".asInstanceOf[APPROVAL_REQ]
  
  @js.native
  sealed trait Active
    extends StObject
       with SavingsStatus
  inline def Active: Active = "Active".asInstanceOf[Active]
  
  @js.native
  sealed trait AppIDRequired extends StObject
  inline def AppIDRequired: AppIDRequired = "AppIDRequired".asInstanceOf[AppIDRequired]
  
  @js.native
  sealed trait BANK_ACCOUNT
    extends StObject
       with SellFiatFlowType
  inline def BANK_ACCOUNT: BANK_ACCOUNT = "BANK_ACCOUNT".asInstanceOf[BANK_ACCOUNT]
  
  @js.native
  sealed trait BLOCKED
    extends StObject
       with BuyTradeFinalStatus
       with BuyTradeStatus
       with SellTradeFinalStatus
       with SellTradeStatus
  inline def BLOCKED: BLOCKED = "BLOCKED".asInstanceOf[BLOCKED]
  
  @js.native
  sealed trait Back
    extends StObject
       with SavingsTradeUserKYCStartDocumentImageSide
  inline def Back: Back = "Back".asInstanceOf[Back]
  
  @js.native
  sealed trait Biweekly
    extends StObject
       with PaymentFrequency
  inline def Biweekly: Biweekly = "Biweekly".asInstanceOf[Biweekly]
  
  @js.native
  sealed trait Blocked_
    extends StObject
       with SavingsTradeItemStatus
  inline def Blocked_ : Blocked_ = "Blocked".asInstanceOf[Blocked_]
  
  @js.native
  sealed trait `Buy crypto`
    extends StObject
       with TicketTopic
  inline def `Buy crypto`: `Buy crypto` = ("Buy crypto").asInstanceOf[`Buy crypto`]
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with SellTradeFinalStatus
       with SellTradeStatus
  inline def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @js.native
  sealed trait CONFIRM
    extends StObject
       with ExchangeTradeStatus
  inline def CONFIRM: CONFIRM = "CONFIRM".asInstanceOf[CONFIRM]
  
  @js.native
  sealed trait CONFIRMING
    extends StObject
       with ExchangeTradeStatus
  inline def CONFIRMING: CONFIRMING = "CONFIRMING".asInstanceOf[CONFIRMING]
  
  @js.native
  sealed trait CONVERTING
    extends StObject
       with ExchangeTradeStatus
  inline def CONVERTING: CONVERTING = "CONVERTING".asInstanceOf[CONVERTING]
  
  @js.native
  sealed trait Cancelled_
    extends StObject
       with SavingsStatus
       with SavingsTradeItemStatus
  inline def Cancelled_ : Cancelled_ = "Cancelled".asInstanceOf[Cancelled_]
  
  @js.native
  sealed trait ClientApp extends StObject
  inline def ClientApp: ClientApp = "ClientApp".asInstanceOf[ClientApp]
  
  @js.native
  sealed trait Completed
    extends StObject
       with SavingsKYCStatus
       with SavingsTradeItemStatus
  inline def Completed: Completed = "Completed".asInstanceOf[Completed]
  
  @js.native
  sealed trait ConfirmPaymentInfo
    extends StObject
       with SavingsSetupStatus
       with SavingsStatus
  inline def ConfirmPaymentInfo: ConfirmPaymentInfo = "ConfirmPaymentInfo".asInstanceOf[ConfirmPaymentInfo]
  
  @js.native
  sealed trait Daily
    extends StObject
       with PaymentFrequency
  inline def Daily: Daily = "Daily".asInstanceOf[Daily]
  
  @js.native
  sealed trait DrivingLicence
    extends StObject
       with SavingsTradeUserKYCStartDocumentType
  inline def DrivingLicence: DrivingLicence = "DrivingLicence".asInstanceOf[DrivingLicence]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
       with SellTradeFinalStatus
       with SellTradeStatus
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait Error_
    extends StObject
       with SavingsKYCStatus
       with SavingsTradeItemStatus
  inline def Error_ : Error_ = "Error".asInstanceOf[Error_]
  
  @js.native
  sealed trait `Exchange crypto`
    extends StObject
       with TicketTopic
  inline def `Exchange crypto`: `Exchange crypto` = ("Exchange crypto").asInstanceOf[`Exchange crypto`]
  
  @js.native
  sealed trait ExchangeNotFound extends StObject
  inline def ExchangeNotFound: ExchangeNotFound = "ExchangeNotFound".asInstanceOf[ExchangeNotFound]
  
  @js.native
  sealed trait External extends StObject
  inline def External: External = "External".asInstanceOf[External]
  
  @js.native
  sealed trait Failed
    extends StObject
       with SavingsKYCStatus
  inline def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @js.native
  sealed trait Fiat
    extends StObject
       with SellProviderType
  inline def Fiat: Fiat = "Fiat".asInstanceOf[Fiat]
  
  @js.native
  sealed trait FlowStepDisabled extends StObject
  inline def FlowStepDisabled: FlowStepDisabled = "FlowStepDisabled".asInstanceOf[FlowStepDisabled]
  
  @js.native
  sealed trait Front
    extends StObject
       with SavingsTradeUserKYCStartDocumentImageSide
  inline def Front: Front = "Front".asInstanceOf[Front]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait GetIdentityInfoFailed extends StObject
  inline def GetIdentityInfoFailed: GetIdentityInfoFailed = "GetIdentityInfoFailed".asInstanceOf[GetIdentityInfoFailed]
  
  @js.native
  sealed trait GetUserInfoFailed extends StObject
  inline def GetUserInfoFailed: GetUserInfoFailed = "GetUserInfoFailed".asInstanceOf[GetUserInfoFailed]
  
  @js.native
  sealed trait IFRAME extends StObject
  inline def IFRAME: IFRAME = "IFRAME".asInstanceOf[IFRAME]
  
  @js.native
  sealed trait INCLUDED
    extends StObject
       with _ExchangeFee
  inline def INCLUDED: INCLUDED = "INCLUDED".asInstanceOf[INCLUDED]
  
  @js.native
  sealed trait INFINITE
    extends StObject
       with DexApprovalType
  inline def INFINITE: INFINITE = "INFINITE".asInstanceOf[INFINITE]
  
  @js.native
  sealed trait IdentityCard
    extends StObject
       with SavingsTradeUserKYCStartDocumentType
  inline def IdentityCard: IdentityCard = "IdentityCard".asInstanceOf[IdentityCard]
  
  @js.native
  sealed trait InProgress
    extends StObject
       with SavingsKYCStatus
       with SavingsTradeItemStatus
  inline def InProgress: InProgress = "InProgress".asInstanceOf[InProgress]
  
  @js.native
  sealed trait InternalError extends StObject
  inline def InternalError: InternalError = "InternalError".asInstanceOf[InternalError]
  
  @js.native
  sealed trait `Invest in crypto`
    extends StObject
       with TicketTopic
  inline def `Invest in crypto`: `Invest in crypto` = ("Invest in crypto").asInstanceOf[`Invest in crypto`]
  
  @js.native
  sealed trait InvityDotio
    extends StObject
       with TicketTopic
  inline def InvityDotio: InvityDotio = "Invity.io".asInstanceOf[InvityDotio]
  
  @js.native
  sealed trait KYC
    extends StObject
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
       with SavingsSetupStatus
       with SavingsStatus
  inline def KYC: KYC = "KYC".asInstanceOf[KYC]
  
  @js.native
  sealed trait LOADING
    extends StObject
       with ExchangeTradeStatus
  inline def LOADING: LOADING = "LOADING".asInstanceOf[LOADING]
  
  @js.native
  sealed trait LOGIN_REQUEST
    extends StObject
       with BuyTradeStatus
       with SellTradeStatus
  inline def LOGIN_REQUEST: LOGIN_REQUEST = "LOGIN_REQUEST".asInstanceOf[LOGIN_REQUEST]
  
  @js.native
  sealed trait MINIMAL
    extends StObject
       with DexApprovalType
  inline def MINIMAL: MINIMAL = "MINIMAL".asInstanceOf[MINIMAL]
  
  @js.native
  sealed trait MissingRequestBody extends StObject
  inline def MissingRequestBody: MissingRequestBody = "MissingRequestBody".asInstanceOf[MissingRequestBody]
  
  @js.native
  sealed trait Monthly
    extends StObject
       with PaymentFrequency
  inline def Monthly: Monthly = "Monthly".asInstanceOf[Monthly]
  
  @js.native
  sealed trait NONE extends StObject
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NSlashA
    extends StObject
       with SellFiatFlowType
  inline def NSlashA: NSlashA = "N/A".asInstanceOf[NSlashA]
  
  @js.native
  sealed trait OFFLINE
    extends StObject
       with OnlineStatus
  inline def OFFLINE: OFFLINE = "OFFLINE".asInstanceOf[OFFLINE]
  
  @js.native
  sealed trait ONLINE
    extends StObject
       with OnlineStatus
  inline def ONLINE: ONLINE = "ONLINE".asInstanceOf[ONLINE]
  
  @js.native
  sealed trait Open
    extends StObject
       with SavingsAMLStatus
       with SavingsKYCStatus
  inline def Open: Open = "Open".asInstanceOf[Open]
  
  @js.native
  sealed trait PAYMENT_GATE
    extends StObject
       with SellFiatFlowType
  inline def PAYMENT_GATE: PAYMENT_GATE = "PAYMENT_GATE".asInstanceOf[PAYMENT_GATE]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with SellTradeStatus
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PRESET
    extends StObject
       with DexApprovalType
  inline def PRESET: PRESET = "PRESET".asInstanceOf[PRESET]
  
  @js.native
  sealed trait PartnerInitFailed extends StObject
  inline def PartnerInitFailed: PartnerInitFailed = "PartnerInitFailed".asInstanceOf[PartnerInitFailed]
  
  @js.native
  sealed trait Passport
    extends StObject
       with SavingsTradeUserKYCStartDocumentType
  inline def Passport: Passport = "Passport".asInstanceOf[Passport]
  
  @js.native
  sealed trait Pending_
    extends StObject
       with SavingsTradeItemStatus
  inline def Pending_ : Pending_ = "Pending".asInstanceOf[Pending_]
  
  @js.native
  sealed trait ProofOfResidency
    extends StObject
       with SavingsTradeUserKYCStartDocumentImageSide
  inline def ProofOfResidency: ProofOfResidency = "ProofOfResidency".asInstanceOf[ProofOfResidency]
  
  @js.native
  sealed trait QUOTE_TIMEOUT extends StObject
  inline def QUOTE_TIMEOUT: QUOTE_TIMEOUT = "QUOTE_TIMEOUT".asInstanceOf[QUOTE_TIMEOUT]
  
  @js.native
  sealed trait Quarterly
    extends StObject
       with PaymentFrequency
  inline def Quarterly: Quarterly = "Quarterly".asInstanceOf[Quarterly]
  
  @js.native
  sealed trait RECENTLY_ONLINE
    extends StObject
       with OnlineStatus
  inline def RECENTLY_ONLINE: RECENTLY_ONLINE = "RECENTLY_ONLINE".asInstanceOf[RECENTLY_ONLINE]
  
  @js.native
  sealed trait REFUNDED
    extends StObject
       with SellTradeFinalStatus
       with SellTradeStatus
  inline def REFUNDED: REFUNDED = "REFUNDED".asInstanceOf[REFUNDED]
  
  @js.native
  sealed trait REQUESTING
    extends StObject
       with BuyTradeStatus
       with SellTradeStatus
  inline def REQUESTING: REQUESTING = "REQUESTING".asInstanceOf[REQUESTING]
  
  @js.native
  sealed trait Refunded_
    extends StObject
       with SavingsTradeItemStatus
  inline def Refunded_ : Refunded_ = "Refunded".asInstanceOf[Refunded_]
  
  @js.native
  sealed trait ResidencePermit
    extends StObject
       with SavingsTradeUserKYCStartDocumentType
  inline def ResidencePermit: ResidencePermit = "ResidencePermit".asInstanceOf[ResidencePermit]
  
  @js.native
  sealed trait ReturnUrlRequired extends StObject
  inline def ReturnUrlRequired: ReturnUrlRequired = "ReturnUrlRequired".asInstanceOf[ReturnUrlRequired]
  
  @js.native
  sealed trait SENDING
    extends StObject
       with ExchangeTradeStatus
  inline def SENDING: SENDING = "SENDING".asInstanceOf[SENDING]
  
  @js.native
  sealed trait SEND_CRYPTO
    extends StObject
       with SellTradeStatus
  inline def SEND_CRYPTO: SEND_CRYPTO = "SEND_CRYPTO".asInstanceOf[SEND_CRYPTO]
  
  @js.native
  sealed trait SITE_ACTION_REQUEST
    extends StObject
       with SellTradeStatus
  inline def SITE_ACTION_REQUEST: SITE_ACTION_REQUEST = "SITE_ACTION_REQUEST".asInstanceOf[SITE_ACTION_REQUEST]
  
  @js.native
  sealed trait SUBMITTED
    extends StObject
       with BuyTradeStatus
       with SellTradeStatus
  inline def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
       with SellTradeFinalStatus
       with SellTradeStatus
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SavingsTradeCountryRequired extends StObject
  inline def SavingsTradeCountryRequired: SavingsTradeCountryRequired = "SavingsTradeCountryRequired".asInstanceOf[SavingsTradeCountryRequired]
  
  @js.native
  sealed trait SavingsTradeIdRequired extends StObject
  inline def SavingsTradeIdRequired: SavingsTradeIdRequired = "SavingsTradeIdRequired".asInstanceOf[SavingsTradeIdRequired]
  
  @js.native
  sealed trait SavingsTradeItemIdRequired extends StObject
  inline def SavingsTradeItemIdRequired: SavingsTradeItemIdRequired = "SavingsTradeItemIdRequired".asInstanceOf[SavingsTradeItemIdRequired]
  
  @js.native
  sealed trait SavingsTradeItemNotFound extends StObject
  inline def SavingsTradeItemNotFound: SavingsTradeItemNotFound = "SavingsTradeItemNotFound".asInstanceOf[SavingsTradeItemNotFound]
  
  @js.native
  sealed trait SavingsTransactionExists extends StObject
  inline def SavingsTransactionExists: SavingsTransactionExists = "SavingsTransactionExists".asInstanceOf[SavingsTransactionExists]
  
  @js.native
  sealed trait SavingsTransactionNotFound extends StObject
  inline def SavingsTransactionNotFound: SavingsTransactionNotFound = "SavingsTransactionNotFound".asInstanceOf[SavingsTransactionNotFound]
  
  @js.native
  sealed trait SecondSelfie
    extends StObject
       with SavingsTradeUserKYCStartDocumentImageSide
  inline def SecondSelfie: SecondSelfie = "SecondSelfie".asInstanceOf[SecondSelfie]
  
  @js.native
  sealed trait Selfie
    extends StObject
       with SavingsTradeUserKYCStartDocumentImageSide
       with SavingsTradeUserKYCStartDocumentType
  inline def Selfie: Selfie = "Selfie".asInstanceOf[Selfie]
  
  @js.native
  sealed trait SetSavingsParameters
    extends StObject
       with SavingsSetupStatus
       with SavingsStatus
  inline def SetSavingsParameters: SetSavingsParameters = "SetSavingsParameters".asInstanceOf[SetSavingsParameters]
  
  @js.native
  sealed trait SubmitBankAccount
    extends StObject
       with SavingsSetupStatus
       with SavingsStatus
  inline def SubmitBankAccount: SubmitBankAccount = "SubmitBankAccount".asInstanceOf[SubmitBankAccount]
  
  @js.native
  sealed trait Success_ extends StObject
  inline def Success_ : Success_ = "Success".asInstanceOf[Success_]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with _ExchangeFee
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UnknownStatus extends StObject
  inline def UnknownStatus: UnknownStatus = "UnknownStatus".asInstanceOf[UnknownStatus]
  
  @js.native
  sealed trait UserNotFoundInPartnerSystem extends StObject
  inline def UserNotFoundInPartnerSystem: UserNotFoundInPartnerSystem = "UserNotFoundInPartnerSystem".asInstanceOf[UserNotFoundInPartnerSystem]
  
  @js.native
  sealed trait Verified
    extends StObject
       with SavingsAMLStatus
       with SavingsKYCStatus
  inline def Verified: Verified = "Verified".asInstanceOf[Verified]
  
  @js.native
  sealed trait Voucher
    extends StObject
       with SellProviderType
  inline def Voucher: Voucher = "Voucher".asInstanceOf[Voucher]
  
  @js.native
  sealed trait WAITING_FOR_USER
    extends StObject
       with BuyTradeStatus
  inline def WAITING_FOR_USER: WAITING_FOR_USER = "WAITING_FOR_USER".asInstanceOf[WAITING_FOR_USER]
  
  @js.native
  sealed trait WalletVerification
    extends StObject
       with SavingsSetupStatus
       with SavingsStatus
       with SavingsTradeUserKYCStartDocumentImageSide
       with SavingsTradeUserKYCStartDocumentType
  inline def WalletVerification: WalletVerification = "WalletVerification".asInstanceOf[WalletVerification]
  
  @js.native
  sealed trait Weekly
    extends StObject
       with PaymentFrequency
  inline def Weekly: Weekly = "Weekly".asInstanceOf[Weekly]
  
  @js.native
  sealed trait ZERO
    extends StObject
       with DexApprovalType
  inline def ZERO: ZERO = "ZERO".asInstanceOf[ZERO]
  
  @js.native
  sealed trait _blank extends StObject
  inline def _blank: _blank = "_blank".asInstanceOf[_blank]
  
  @js.native
  sealed trait _self extends StObject
  inline def _self: _self = "_self".asInstanceOf[_self]
  
  @js.native
  sealed trait ach
    extends StObject
       with SavingsPaymentMethod
  inline def ach: ach = "ach".asInstanceOf[ach]
  
  @js.native
  sealed trait alternativeCurrency
    extends StObject
       with BuyTradeTag
       with SellTradeTag
  inline def alternativeCurrency: alternativeCurrency = "alternativeCurrency".asInstanceOf[alternativeCurrency]
  
  @js.native
  sealed trait applePay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def applePay: applePay = "applePay".asInstanceOf[applePay]
  
  @js.native
  sealed trait auspost
    extends StObject
       with BuyCryptoPaymentMethod
  inline def auspost: auspost = "auspost".asInstanceOf[auspost]
  
  @js.native
  sealed trait bancontact
    extends StObject
       with BuyCryptoPaymentMethod
  inline def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bankTransfer
    extends StObject
       with BuyCryptoPaymentMethod
       with SavingsPaymentMethod
       with SellCryptoPaymentMethod
  inline def bankTransfer: bankTransfer = "bankTransfer".asInstanceOf[bankTransfer]
  
  @js.native
  sealed trait bestRate
    extends StObject
       with BuyTradeTag
       with ExchangeTradeTag
       with SellTradeTag
  inline def bestRate: bestRate = "bestRate".asInstanceOf[bestRate]
  
  @js.native
  sealed trait bpay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def bpay: bpay = "bpay".asInstanceOf[bpay]
  
  @js.native
  sealed trait creditCard
    extends StObject
       with BuyCryptoPaymentMethod
       with SellCryptoPaymentMethod
  inline def creditCard: creditCard = "creditCard".asInstanceOf[creditCard]
  
  @js.native
  sealed trait dcinterac
    extends StObject
       with BuyCryptoPaymentMethod
  inline def dcinterac: dcinterac = "dcinterac".asInstanceOf[dcinterac]
  
  @js.native
  sealed trait duitnow
    extends StObject
       with BuyCryptoPaymentMethod
  inline def duitnow: duitnow = "duitnow".asInstanceOf[duitnow]
  
  @js.native
  sealed trait enable extends StObject
  inline def enable: enable = "enable".asInstanceOf[enable]
  
  @js.native
  sealed trait eps
    extends StObject
       with BuyCryptoPaymentMethod
  inline def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait exclusively extends StObject
  inline def exclusively: exclusively = "exclusively".asInstanceOf[exclusively]
  
  @js.native
  sealed trait favorite
    extends StObject
       with BuyTradeTag
       with ExchangeTradeTag
       with SellTradeTag
  inline def favorite: favorite = "favorite".asInstanceOf[favorite]
  
  @js.native
  sealed trait fps
    extends StObject
       with BuyCryptoPaymentMethod
  inline def fps: fps = "fps".asInstanceOf[fps]
  
  @js.native
  sealed trait giropay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait gojekid
    extends StObject
       with BuyCryptoPaymentMethod
  inline def gojekid: gojekid = "gojekid".asInstanceOf[gojekid]
  
  @js.native
  sealed trait hex extends StObject
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait iDeal
    extends StObject
       with BuyCryptoPaymentMethod
  inline def iDeal: iDeal = "iDeal".asInstanceOf[iDeal]
  
  @js.native
  sealed trait instapay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def instapay: instapay = "instapay".asInstanceOf[instapay]
  
  @js.native
  sealed trait kyc_
    extends StObject
       with ExchangeTradeTag
  inline def kyc_ : kyc_ = "kyc".asInstanceOf[kyc_]
  
  @js.native
  sealed trait number extends StObject
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait payid
    extends StObject
       with BuyCryptoPaymentMethod
  inline def payid: payid = "payid".asInstanceOf[payid]
  
  @js.native
  sealed trait paynow
    extends StObject
       with BuyCryptoPaymentMethod
  inline def paynow: paynow = "paynow".asInstanceOf[paynow]
  
  @js.native
  sealed trait poli
    extends StObject
       with BuyCryptoPaymentMethod
  inline def poli: poli = "poli".asInstanceOf[poli]
  
  @js.native
  sealed trait promptpay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def promptpay: promptpay = "promptpay".asInstanceOf[promptpay]
  
  @js.native
  sealed trait renewed
    extends StObject
       with BuyTradeTag
       with ExchangeTradeTag
       with SellTradeTag
  inline def renewed: renewed = "renewed".asInstanceOf[renewed]
  
  @js.native
  sealed trait sofort
    extends StObject
       with BuyCryptoPaymentMethod
  inline def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait toss
    extends StObject
       with BuyCryptoPaymentMethod
  inline def toss: toss = "toss".asInstanceOf[toss]
  
  @js.native
  sealed trait upi
    extends StObject
       with BuyCryptoPaymentMethod
  inline def upi: upi = "upi".asInstanceOf[upi]
  
  @js.native
  sealed trait viettelpay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def viettelpay: viettelpay = "viettelpay".asInstanceOf[viettelpay]
  
  @js.native
  sealed trait wantCrypto
    extends StObject
       with BuyTradeTag
  inline def wantCrypto: wantCrypto = "wantCrypto".asInstanceOf[wantCrypto]
  
  @js.native
  sealed trait wantFiat
    extends StObject
       with SellTradeTag
  inline def wantFiat: wantFiat = "wantFiat".asInstanceOf[wantFiat]
  
  @js.native
  sealed trait widget
    extends StObject
       with BuyTradeTag
       with ExchangeTradeTag
       with SellTradeTag
  inline def widget: widget = "widget".asInstanceOf[widget]
}
