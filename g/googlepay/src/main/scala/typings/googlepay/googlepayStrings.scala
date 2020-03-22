package typings.googlepay

import typings.googlepay.google.payments.api.BillingAddressFormat
import typings.googlepay.google.payments.api.ButtonColor
import typings.googlepay.google.payments.api.ButtonType
import typings.googlepay.google.payments.api.CallbackIntent
import typings.googlepay.google.payments.api.CallbackTrigger
import typings.googlepay.google.payments.api.CardAuthMethod
import typings.googlepay.google.payments.api.CardNetwork
import typings.googlepay.google.payments.api.CheckoutOption
import typings.googlepay.google.payments.api.DisplayItemStatus
import typings.googlepay.google.payments.api.DisplayItemType
import typings.googlepay.google.payments.api.Environment
import typings.googlepay.google.payments.api.ErrorReason
import typings.googlepay.google.payments.api.PaymentMethodTokenizationType
import typings.googlepay.google.payments.api.PaymentMethodType
import typings.googlepay.google.payments.api.PaymentsErrorStatusCode
import typings.googlepay.google.payments.api.TotalPriceStatus
import typings.googlepay.google.payments.api.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googlepayStrings {
  @js.native
  sealed trait AMEX extends CardNetwork
  
  @js.native
  sealed trait BUYER_ACCOUNT_ERROR extends PaymentsErrorStatusCode
  
  @js.native
  sealed trait CARD extends PaymentMethodType
  
  @js.native
  sealed trait COMPLETE_IMMEDIATE_PURCHASE extends CheckoutOption
  
  @js.native
  sealed trait CRYPTOGRAM_3DS extends CardAuthMethod
  
  @js.native
  sealed trait DEFAULT extends CheckoutOption
  
  @js.native
  sealed trait DEVELOPER_ERROR extends PaymentsErrorStatusCode
  
  @js.native
  sealed trait DIRECT extends PaymentMethodTokenizationType
  
  @js.native
  sealed trait DISCOUNT extends DisplayItemType
  
  @js.native
  sealed trait DISCOVER extends CardNetwork
  
  @js.native
  sealed trait ELECTRON extends CardNetwork
  
  @js.native
  sealed trait ELO extends CardNetwork
  
  @js.native
  sealed trait ELO_DEBIT extends CardNetwork
  
  @js.native
  sealed trait ERROR extends TransactionState
  
  @js.native
  sealed trait ESTIMATED extends TotalPriceStatus
  
  @js.native
  sealed trait FINAL
    extends DisplayItemStatus
       with TotalPriceStatus
  
  @js.native
  sealed trait FULL extends BillingAddressFormat
  
  @js.native
  sealed trait INITIALIZE extends CallbackTrigger
  
  @js.native
  sealed trait INTERAC extends CardNetwork
  
  @js.native
  sealed trait INTERNAL_ERROR extends PaymentsErrorStatusCode
  
  @js.native
  sealed trait JCB extends CardNetwork
  
  @js.native
  sealed trait LINE_ITEM extends DisplayItemType
  
  @js.native
  sealed trait MAESTRO extends CardNetwork
  
  @js.native
  sealed trait MASTERCARD extends CardNetwork
  
  @js.native
  sealed trait MERCHANT_ACCOUNT_ERROR extends PaymentsErrorStatusCode
  
  @js.native
  sealed trait MIN extends BillingAddressFormat
  
  @js.native
  sealed trait NOT_CURRENTLY_KNOWN extends TotalPriceStatus
  
  @js.native
  sealed trait OFFER_INFO extends CallbackTrigger
  
  @js.native
  sealed trait OTHER_ERROR extends ErrorReason
  
  @js.native
  sealed trait PAN_ONLY extends CardAuthMethod
  
  @js.native
  sealed trait PAYMENT_AUTHORIZATION extends CallbackIntent
  
  @js.native
  sealed trait PAYMENT_DATA_INVALID extends ErrorReason
  
  @js.native
  sealed trait PAYMENT_GATEWAY extends PaymentMethodTokenizationType
  
  @js.native
  sealed trait PAYMENT_METHOD extends CallbackIntent
  
  @js.native
  sealed trait PAYPAL extends PaymentMethodType
  
  @js.native
  sealed trait PENDING extends DisplayItemStatus
  
  @js.native
  sealed trait PRODUCTION extends Environment
  
  @js.native
  sealed trait SHIPPING_ADDRESS
    extends CallbackIntent
       with CallbackTrigger
  
  @js.native
  sealed trait SHIPPING_ADDRESS_INVALID extends ErrorReason
  
  @js.native
  sealed trait SHIPPING_ADDRESS_UNSERVICEABLE extends ErrorReason
  
  @js.native
  sealed trait SHIPPING_OPTION
    extends CallbackIntent
       with CallbackTrigger
       with DisplayItemType
  
  @js.native
  sealed trait SHIPPING_OPTION_INVALID extends ErrorReason
  
  @js.native
  sealed trait SUBTOTAL extends DisplayItemType
  
  @js.native
  sealed trait SUCCESS extends TransactionState
  
  @js.native
  sealed trait TAX extends DisplayItemType
  
  @js.native
  sealed trait TEST extends Environment
  
  @js.native
  sealed trait VISA extends CardNetwork
  
  @js.native
  sealed trait black extends ButtonColor
  
  @js.native
  sealed trait default_ extends ButtonColor
  
  @js.native
  sealed trait long extends ButtonType
  
  @js.native
  sealed trait short extends ButtonType
  
  @js.native
  sealed trait white extends ButtonColor
  
  @scala.inline
  def AMEX: AMEX = "AMEX".asInstanceOf[AMEX]
  @scala.inline
  def BUYER_ACCOUNT_ERROR: BUYER_ACCOUNT_ERROR = "BUYER_ACCOUNT_ERROR".asInstanceOf[BUYER_ACCOUNT_ERROR]
  @scala.inline
  def CARD: CARD = "CARD".asInstanceOf[CARD]
  @scala.inline
  def COMPLETE_IMMEDIATE_PURCHASE: COMPLETE_IMMEDIATE_PURCHASE = "COMPLETE_IMMEDIATE_PURCHASE".asInstanceOf[COMPLETE_IMMEDIATE_PURCHASE]
  @scala.inline
  def CRYPTOGRAM_3DS: CRYPTOGRAM_3DS = "CRYPTOGRAM_3DS".asInstanceOf[CRYPTOGRAM_3DS]
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  @scala.inline
  def DEVELOPER_ERROR: DEVELOPER_ERROR = "DEVELOPER_ERROR".asInstanceOf[DEVELOPER_ERROR]
  @scala.inline
  def DIRECT: DIRECT = "DIRECT".asInstanceOf[DIRECT]
  @scala.inline
  def DISCOUNT: DISCOUNT = "DISCOUNT".asInstanceOf[DISCOUNT]
  @scala.inline
  def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  @scala.inline
  def ELECTRON: ELECTRON = "ELECTRON".asInstanceOf[ELECTRON]
  @scala.inline
  def ELO: ELO = "ELO".asInstanceOf[ELO]
  @scala.inline
  def ELO_DEBIT: ELO_DEBIT = "ELO_DEBIT".asInstanceOf[ELO_DEBIT]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def ESTIMATED: ESTIMATED = "ESTIMATED".asInstanceOf[ESTIMATED]
  @scala.inline
  def FINAL: FINAL = "FINAL".asInstanceOf[FINAL]
  @scala.inline
  def FULL: FULL = "FULL".asInstanceOf[FULL]
  @scala.inline
  def INITIALIZE: INITIALIZE = "INITIALIZE".asInstanceOf[INITIALIZE]
  @scala.inline
  def INTERAC: INTERAC = "INTERAC".asInstanceOf[INTERAC]
  @scala.inline
  def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def LINE_ITEM: LINE_ITEM = "LINE_ITEM".asInstanceOf[LINE_ITEM]
  @scala.inline
  def MAESTRO: MAESTRO = "MAESTRO".asInstanceOf[MAESTRO]
  @scala.inline
  def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  @scala.inline
  def MERCHANT_ACCOUNT_ERROR: MERCHANT_ACCOUNT_ERROR = "MERCHANT_ACCOUNT_ERROR".asInstanceOf[MERCHANT_ACCOUNT_ERROR]
  @scala.inline
  def MIN: MIN = "MIN".asInstanceOf[MIN]
  @scala.inline
  def NOT_CURRENTLY_KNOWN: NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN".asInstanceOf[NOT_CURRENTLY_KNOWN]
  @scala.inline
  def OFFER_INFO: OFFER_INFO = "OFFER_INFO".asInstanceOf[OFFER_INFO]
  @scala.inline
  def OTHER_ERROR: OTHER_ERROR = "OTHER_ERROR".asInstanceOf[OTHER_ERROR]
  @scala.inline
  def PAN_ONLY: PAN_ONLY = "PAN_ONLY".asInstanceOf[PAN_ONLY]
  @scala.inline
  def PAYMENT_AUTHORIZATION: PAYMENT_AUTHORIZATION = "PAYMENT_AUTHORIZATION".asInstanceOf[PAYMENT_AUTHORIZATION]
  @scala.inline
  def PAYMENT_DATA_INVALID: PAYMENT_DATA_INVALID = "PAYMENT_DATA_INVALID".asInstanceOf[PAYMENT_DATA_INVALID]
  @scala.inline
  def PAYMENT_GATEWAY: PAYMENT_GATEWAY = "PAYMENT_GATEWAY".asInstanceOf[PAYMENT_GATEWAY]
  @scala.inline
  def PAYMENT_METHOD: PAYMENT_METHOD = "PAYMENT_METHOD".asInstanceOf[PAYMENT_METHOD]
  @scala.inline
  def PAYPAL: PAYPAL = "PAYPAL".asInstanceOf[PAYPAL]
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  @scala.inline
  def PRODUCTION: PRODUCTION = "PRODUCTION".asInstanceOf[PRODUCTION]
  @scala.inline
  def SHIPPING_ADDRESS: SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[SHIPPING_ADDRESS]
  @scala.inline
  def SHIPPING_ADDRESS_INVALID: SHIPPING_ADDRESS_INVALID = "SHIPPING_ADDRESS_INVALID".asInstanceOf[SHIPPING_ADDRESS_INVALID]
  @scala.inline
  def SHIPPING_ADDRESS_UNSERVICEABLE: SHIPPING_ADDRESS_UNSERVICEABLE = "SHIPPING_ADDRESS_UNSERVICEABLE".asInstanceOf[SHIPPING_ADDRESS_UNSERVICEABLE]
  @scala.inline
  def SHIPPING_OPTION: SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[SHIPPING_OPTION]
  @scala.inline
  def SHIPPING_OPTION_INVALID: SHIPPING_OPTION_INVALID = "SHIPPING_OPTION_INVALID".asInstanceOf[SHIPPING_OPTION_INVALID]
  @scala.inline
  def SUBTOTAL: SUBTOTAL = "SUBTOTAL".asInstanceOf[SUBTOTAL]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  @scala.inline
  def TAX: TAX = "TAX".asInstanceOf[TAX]
  @scala.inline
  def TEST: TEST = "TEST".asInstanceOf[TEST]
  @scala.inline
  def VISA: VISA = "VISA".asInstanceOf[VISA]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def default_ : default_ = "default".asInstanceOf[default_]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

