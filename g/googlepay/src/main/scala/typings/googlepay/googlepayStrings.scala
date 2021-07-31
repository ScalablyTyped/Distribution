package typings.googlepay

import typings.googlepay.google.payments.api.BillingAddressFormat
import typings.googlepay.google.payments.api.ButtonColor
import typings.googlepay.google.payments.api.ButtonSizeMode
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googlepayStrings {
  
  @js.native
  sealed trait AMEX
    extends StObject
       with CardNetwork
  @scala.inline
  def AMEX: AMEX = "AMEX".asInstanceOf[AMEX]
  
  @js.native
  sealed trait BUYER_ACCOUNT_ERROR
    extends StObject
       with PaymentsErrorStatusCode
  @scala.inline
  def BUYER_ACCOUNT_ERROR: BUYER_ACCOUNT_ERROR = "BUYER_ACCOUNT_ERROR".asInstanceOf[BUYER_ACCOUNT_ERROR]
  
  @js.native
  sealed trait CARD
    extends StObject
       with PaymentMethodType
  @scala.inline
  def CARD: CARD = "CARD".asInstanceOf[CARD]
  
  @js.native
  sealed trait COMPLETE_IMMEDIATE_PURCHASE
    extends StObject
       with CheckoutOption
  @scala.inline
  def COMPLETE_IMMEDIATE_PURCHASE: COMPLETE_IMMEDIATE_PURCHASE = "COMPLETE_IMMEDIATE_PURCHASE".asInstanceOf[COMPLETE_IMMEDIATE_PURCHASE]
  
  @js.native
  sealed trait CRYPTOGRAM_3DS
    extends StObject
       with CardAuthMethod
  @scala.inline
  def CRYPTOGRAM_3DS: CRYPTOGRAM_3DS = "CRYPTOGRAM_3DS".asInstanceOf[CRYPTOGRAM_3DS]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with CheckoutOption
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait DEVELOPER_ERROR
    extends StObject
       with PaymentsErrorStatusCode
  @scala.inline
  def DEVELOPER_ERROR: DEVELOPER_ERROR = "DEVELOPER_ERROR".asInstanceOf[DEVELOPER_ERROR]
  
  @js.native
  sealed trait DIRECT
    extends StObject
       with PaymentMethodTokenizationType
  @scala.inline
  def DIRECT: DIRECT = "DIRECT".asInstanceOf[DIRECT]
  
  @js.native
  sealed trait DISCOUNT
    extends StObject
       with DisplayItemType
  @scala.inline
  def DISCOUNT: DISCOUNT = "DISCOUNT".asInstanceOf[DISCOUNT]
  
  @js.native
  sealed trait DISCOVER
    extends StObject
       with CardNetwork
  @scala.inline
  def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  
  @js.native
  sealed trait ELECTRON
    extends StObject
       with CardNetwork
  @scala.inline
  def ELECTRON: ELECTRON = "ELECTRON".asInstanceOf[ELECTRON]
  
  @js.native
  sealed trait ELO
    extends StObject
       with CardNetwork
  @scala.inline
  def ELO: ELO = "ELO".asInstanceOf[ELO]
  
  @js.native
  sealed trait ELO_DEBIT
    extends StObject
       with CardNetwork
  @scala.inline
  def ELO_DEBIT: ELO_DEBIT = "ELO_DEBIT".asInstanceOf[ELO_DEBIT]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with TransactionState
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait ESTIMATED
    extends StObject
       with TotalPriceStatus
  @scala.inline
  def ESTIMATED: ESTIMATED = "ESTIMATED".asInstanceOf[ESTIMATED]
  
  @js.native
  sealed trait FINAL
    extends StObject
       with DisplayItemStatus
       with TotalPriceStatus
  @scala.inline
  def FINAL: FINAL = "FINAL".asInstanceOf[FINAL]
  
  @js.native
  sealed trait FULL
    extends StObject
       with BillingAddressFormat
  @scala.inline
  def FULL: FULL = "FULL".asInstanceOf[FULL]
  
  @js.native
  sealed trait INITIALIZE
    extends StObject
       with CallbackTrigger
  @scala.inline
  def INITIALIZE: INITIALIZE = "INITIALIZE".asInstanceOf[INITIALIZE]
  
  @js.native
  sealed trait INTERAC
    extends StObject
       with CardNetwork
  @scala.inline
  def INTERAC: INTERAC = "INTERAC".asInstanceOf[INTERAC]
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with PaymentsErrorStatusCode
  @scala.inline
  def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  
  @js.native
  sealed trait JCB
    extends StObject
       with CardNetwork
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait LINE_ITEM
    extends StObject
       with DisplayItemType
  @scala.inline
  def LINE_ITEM: LINE_ITEM = "LINE_ITEM".asInstanceOf[LINE_ITEM]
  
  @js.native
  sealed trait MAESTRO
    extends StObject
       with CardNetwork
  @scala.inline
  def MAESTRO: MAESTRO = "MAESTRO".asInstanceOf[MAESTRO]
  
  @js.native
  sealed trait MASTERCARD
    extends StObject
       with CardNetwork
  @scala.inline
  def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  
  @js.native
  sealed trait MERCHANT_ACCOUNT_ERROR
    extends StObject
       with PaymentsErrorStatusCode
  @scala.inline
  def MERCHANT_ACCOUNT_ERROR: MERCHANT_ACCOUNT_ERROR = "MERCHANT_ACCOUNT_ERROR".asInstanceOf[MERCHANT_ACCOUNT_ERROR]
  
  @js.native
  sealed trait MIN
    extends StObject
       with BillingAddressFormat
  @scala.inline
  def MIN: MIN = "MIN".asInstanceOf[MIN]
  
  @js.native
  sealed trait NOT_CURRENTLY_KNOWN
    extends StObject
       with TotalPriceStatus
  @scala.inline
  def NOT_CURRENTLY_KNOWN: NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN".asInstanceOf[NOT_CURRENTLY_KNOWN]
  
  @js.native
  sealed trait OFFER_INFO
    extends StObject
       with CallbackTrigger
  @scala.inline
  def OFFER_INFO: OFFER_INFO = "OFFER_INFO".asInstanceOf[OFFER_INFO]
  
  @js.native
  sealed trait OTHER_ERROR
    extends StObject
       with ErrorReason
  @scala.inline
  def OTHER_ERROR: OTHER_ERROR = "OTHER_ERROR".asInstanceOf[OTHER_ERROR]
  
  @js.native
  sealed trait PAN_ONLY
    extends StObject
       with CardAuthMethod
  @scala.inline
  def PAN_ONLY: PAN_ONLY = "PAN_ONLY".asInstanceOf[PAN_ONLY]
  
  @js.native
  sealed trait PAYMENT_AUTHORIZATION
    extends StObject
       with CallbackIntent
  @scala.inline
  def PAYMENT_AUTHORIZATION: PAYMENT_AUTHORIZATION = "PAYMENT_AUTHORIZATION".asInstanceOf[PAYMENT_AUTHORIZATION]
  
  @js.native
  sealed trait PAYMENT_DATA_INVALID
    extends StObject
       with ErrorReason
  @scala.inline
  def PAYMENT_DATA_INVALID: PAYMENT_DATA_INVALID = "PAYMENT_DATA_INVALID".asInstanceOf[PAYMENT_DATA_INVALID]
  
  @js.native
  sealed trait PAYMENT_GATEWAY
    extends StObject
       with PaymentMethodTokenizationType
  @scala.inline
  def PAYMENT_GATEWAY: PAYMENT_GATEWAY = "PAYMENT_GATEWAY".asInstanceOf[PAYMENT_GATEWAY]
  
  @js.native
  sealed trait PAYMENT_METHOD
    extends StObject
       with CallbackIntent
  @scala.inline
  def PAYMENT_METHOD: PAYMENT_METHOD = "PAYMENT_METHOD".asInstanceOf[PAYMENT_METHOD]
  
  @js.native
  sealed trait PAYPAL
    extends StObject
       with PaymentMethodType
  @scala.inline
  def PAYPAL: PAYPAL = "PAYPAL".asInstanceOf[PAYPAL]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with DisplayItemStatus
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PRODUCTION
    extends StObject
       with Environment
  @scala.inline
  def PRODUCTION: PRODUCTION = "PRODUCTION".asInstanceOf[PRODUCTION]
  
  @js.native
  sealed trait SHIPPING_ADDRESS
    extends StObject
       with CallbackIntent
       with CallbackTrigger
  @scala.inline
  def SHIPPING_ADDRESS: SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[SHIPPING_ADDRESS]
  
  @js.native
  sealed trait SHIPPING_ADDRESS_INVALID
    extends StObject
       with ErrorReason
  @scala.inline
  def SHIPPING_ADDRESS_INVALID: SHIPPING_ADDRESS_INVALID = "SHIPPING_ADDRESS_INVALID".asInstanceOf[SHIPPING_ADDRESS_INVALID]
  
  @js.native
  sealed trait SHIPPING_ADDRESS_UNSERVICEABLE
    extends StObject
       with ErrorReason
  @scala.inline
  def SHIPPING_ADDRESS_UNSERVICEABLE: SHIPPING_ADDRESS_UNSERVICEABLE = "SHIPPING_ADDRESS_UNSERVICEABLE".asInstanceOf[SHIPPING_ADDRESS_UNSERVICEABLE]
  
  @js.native
  sealed trait SHIPPING_OPTION
    extends StObject
       with CallbackIntent
       with CallbackTrigger
       with DisplayItemType
  @scala.inline
  def SHIPPING_OPTION: SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[SHIPPING_OPTION]
  
  @js.native
  sealed trait SHIPPING_OPTION_INVALID
    extends StObject
       with ErrorReason
  @scala.inline
  def SHIPPING_OPTION_INVALID: SHIPPING_OPTION_INVALID = "SHIPPING_OPTION_INVALID".asInstanceOf[SHIPPING_OPTION_INVALID]
  
  @js.native
  sealed trait SUBTOTAL
    extends StObject
       with DisplayItemType
  @scala.inline
  def SUBTOTAL: SUBTOTAL = "SUBTOTAL".asInstanceOf[SUBTOTAL]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with TransactionState
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait TAX
    extends StObject
       with DisplayItemType
  @scala.inline
  def TAX: TAX = "TAX".asInstanceOf[TAX]
  
  @js.native
  sealed trait TEST
    extends StObject
       with Environment
  @scala.inline
  def TEST: TEST = "TEST".asInstanceOf[TEST]
  
  @js.native
  sealed trait VISA
    extends StObject
       with CardNetwork
  @scala.inline
  def VISA: VISA = "VISA".asInstanceOf[VISA]
  
  @js.native
  sealed trait black
    extends StObject
       with ButtonColor
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait buy
    extends StObject
       with ButtonType
  @scala.inline
  def buy: buy = "buy".asInstanceOf[buy]
  
  @js.native
  sealed trait default_
    extends StObject
       with ButtonColor
  @scala.inline
  def default_ : default_ = "default".asInstanceOf[default_]
  
  @js.native
  sealed trait donate
    extends StObject
       with ButtonType
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait fill
    extends StObject
       with ButtonSizeMode
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait long
    extends StObject
       with ButtonType
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait plain
    extends StObject
       with ButtonType
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait short
    extends StObject
       with ButtonType
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  
  @js.native
  sealed trait static
    extends StObject
       with ButtonSizeMode
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait white
    extends StObject
       with ButtonColor
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}
