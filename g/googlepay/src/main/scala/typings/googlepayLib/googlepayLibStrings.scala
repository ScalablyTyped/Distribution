package typings
package googlepayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googlepayLibStrings {
  @js.native
  sealed trait AMEX
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedCardNetwork
  
  @js.native
  sealed trait BUYER_ACCOUNT_ERROR
    extends googlepayLib.googleNs.paymentsNs.apiNs.ErrorStatusCode
  
  @js.native
  sealed trait CANCELED
    extends googlepayLib.googleNs.paymentsNs.apiNs.ErrorStatusCode
  
  @js.native
  sealed trait CARD extends js.Object
  
  @js.native
  sealed trait CRYPTOGRAM_3DS
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedAuthMethod
  
  @js.native
  sealed trait DEVELOPER_ERROR
    extends googlepayLib.googleNs.paymentsNs.apiNs.ErrorStatusCode
  
  @js.native
  sealed trait DIRECT
    extends googlepayLib.googleNs.paymentsNs.apiNs.TokenizationType
  
  @js.native
  sealed trait DISCOVER
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedCardNetwork
  
  @js.native
  sealed trait ESTIMATED
    extends googlepayLib.googleNs.paymentsNs.apiNs.TotalPriceStatus
  
  @js.native
  sealed trait FINAL
    extends googlepayLib.googleNs.paymentsNs.apiNs.TotalPriceStatus
  
  @js.native
  sealed trait FULL
    extends googlepayLib.googleNs.paymentsNs.apiNs.BillingAddressFormat
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends googlepayLib.googleNs.paymentsNs.apiNs.ErrorStatusCode
  
  @js.native
  sealed trait JCB
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedCardNetwork
  
  @js.native
  sealed trait MASTERCARD
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedCardNetwork
  
  @js.native
  sealed trait MIN
    extends googlepayLib.googleNs.paymentsNs.apiNs.BillingAddressFormat
  
  @js.native
  sealed trait NOT_CURRENTLY_KNOWN
    extends googlepayLib.googleNs.paymentsNs.apiNs.TotalPriceStatus
  
  @js.native
  sealed trait PAN_ONLY
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedAuthMethod
  
  @js.native
  sealed trait PAYMENT_GATEWAY
    extends googlepayLib.googleNs.paymentsNs.apiNs.TokenizationType
  
  @js.native
  sealed trait PRODUCTION
    extends googlepayLib.googleNs.paymentsNs.apiNs.EnvironmentType
  
  @js.native
  sealed trait TEST
    extends googlepayLib.googleNs.paymentsNs.apiNs.EnvironmentType
  
  @js.native
  sealed trait VISA
    extends googlepayLib.googleNs.paymentsNs.apiNs.AllowedCardNetwork
  
  @js.native
  sealed trait black
    extends googlepayLib.googleNs.paymentsNs.apiNs.ButtonColor
  
  @js.native
  sealed trait default
    extends googlepayLib.googleNs.paymentsNs.apiNs.ButtonColor
  
  @js.native
  sealed trait long
    extends googlepayLib.googleNs.paymentsNs.apiNs.ButtonType
  
  @js.native
  sealed trait short
    extends googlepayLib.googleNs.paymentsNs.apiNs.ButtonType
  
  @js.native
  sealed trait white
    extends googlepayLib.googleNs.paymentsNs.apiNs.ButtonColor
  
  @scala.inline
  def AMEX: AMEX = "AMEX".asInstanceOf[AMEX]
  @scala.inline
  def BUYER_ACCOUNT_ERROR: BUYER_ACCOUNT_ERROR = "BUYER_ACCOUNT_ERROR".asInstanceOf[BUYER_ACCOUNT_ERROR]
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  @scala.inline
  def CARD: CARD = "CARD".asInstanceOf[CARD]
  @scala.inline
  def CRYPTOGRAM_3DS: CRYPTOGRAM_3DS = "CRYPTOGRAM_3DS".asInstanceOf[CRYPTOGRAM_3DS]
  @scala.inline
  def DEVELOPER_ERROR: DEVELOPER_ERROR = "DEVELOPER_ERROR".asInstanceOf[DEVELOPER_ERROR]
  @scala.inline
  def DIRECT: DIRECT = "DIRECT".asInstanceOf[DIRECT]
  @scala.inline
  def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  @scala.inline
  def ESTIMATED: ESTIMATED = "ESTIMATED".asInstanceOf[ESTIMATED]
  @scala.inline
  def FINAL: FINAL = "FINAL".asInstanceOf[FINAL]
  @scala.inline
  def FULL: FULL = "FULL".asInstanceOf[FULL]
  @scala.inline
  def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  @scala.inline
  def MIN: MIN = "MIN".asInstanceOf[MIN]
  @scala.inline
  def NOT_CURRENTLY_KNOWN: NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN".asInstanceOf[NOT_CURRENTLY_KNOWN]
  @scala.inline
  def PAN_ONLY: PAN_ONLY = "PAN_ONLY".asInstanceOf[PAN_ONLY]
  @scala.inline
  def PAYMENT_GATEWAY: PAYMENT_GATEWAY = "PAYMENT_GATEWAY".asInstanceOf[PAYMENT_GATEWAY]
  @scala.inline
  def PRODUCTION: PRODUCTION = "PRODUCTION".asInstanceOf[PRODUCTION]
  @scala.inline
  def TEST: TEST = "TEST".asInstanceOf[TEST]
  @scala.inline
  def VISA: VISA = "VISA".asInstanceOf[VISA]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

