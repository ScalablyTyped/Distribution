package typings.invityApi

import typings.invityApi.mod.BuyCryptoPaymentMethod
import typings.invityApi.mod.BuyTradeFinalStatus
import typings.invityApi.mod.BuyTradeStatus
import typings.invityApi.mod.BuyTradeTag
import typings.invityApi.mod.ExchangeTradeFinalStatus
import typings.invityApi.mod.ExchangeTradeStatus
import typings.invityApi.mod.TicketTopic
import typings.invityApi.mod._ExchangeFee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invityApiStrings {
  
  @scala.inline
  def APPROVAL_PENDING: APPROVAL_PENDING = "APPROVAL_PENDING".asInstanceOf[APPROVAL_PENDING]
  
  @scala.inline
  def BLOCKED: BLOCKED = "BLOCKED".asInstanceOf[BLOCKED]
  
  @scala.inline
  def `Buy crypto`: `Buy crypto` = ("Buy crypto").asInstanceOf[`Buy crypto`]
  
  @scala.inline
  def CONFIRM: CONFIRM = "CONFIRM".asInstanceOf[CONFIRM]
  
  @scala.inline
  def CONFIRMING: CONFIRMING = "CONFIRMING".asInstanceOf[CONFIRMING]
  
  @scala.inline
  def CONVERTING: CONVERTING = "CONVERTING".asInstanceOf[CONVERTING]
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @scala.inline
  def `Exchange crypto`: `Exchange crypto` = ("Exchange crypto").asInstanceOf[`Exchange crypto`]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def IFRAME: IFRAME = "IFRAME".asInstanceOf[IFRAME]
  
  @scala.inline
  def INCLUDED: INCLUDED = "INCLUDED".asInstanceOf[INCLUDED]
  
  @scala.inline
  def `Invest in crypto`: `Invest in crypto` = ("Invest in crypto").asInstanceOf[`Invest in crypto`]
  
  @scala.inline
  def InvityDotio: InvityDotio = "Invity.io".asInstanceOf[InvityDotio]
  
  @scala.inline
  def KYC: KYC = "KYC".asInstanceOf[KYC]
  
  @scala.inline
  def LOADING: LOADING = "LOADING".asInstanceOf[LOADING]
  
  @scala.inline
  def LOGIN_REQUEST: LOGIN_REQUEST = "LOGIN_REQUEST".asInstanceOf[LOGIN_REQUEST]
  
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def QUOTE_TIMEOUT: QUOTE_TIMEOUT = "QUOTE_TIMEOUT".asInstanceOf[QUOTE_TIMEOUT]
  
  @scala.inline
  def REQUESTING: REQUESTING = "REQUESTING".asInstanceOf[REQUESTING]
  
  @scala.inline
  def SENDING: SENDING = "SENDING".asInstanceOf[SENDING]
  
  @scala.inline
  def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @scala.inline
  def alternativeCurrency: alternativeCurrency = "alternativeCurrency".asInstanceOf[alternativeCurrency]
  
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @scala.inline
  def bankTransfer: bankTransfer = "bankTransfer".asInstanceOf[bankTransfer]
  
  @scala.inline
  def bestRate: bestRate = "bestRate".asInstanceOf[bestRate]
  
  @scala.inline
  def creditCard: creditCard = "creditCard".asInstanceOf[creditCard]
  
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  
  @scala.inline
  def favorite: favorite = "favorite".asInstanceOf[favorite]
  
  @scala.inline
  def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @scala.inline
  def iDeal: iDeal = "iDeal".asInstanceOf[iDeal]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def renewed: renewed = "renewed".asInstanceOf[renewed]
  
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @scala.inline
  def wantCrypto: wantCrypto = "wantCrypto".asInstanceOf[wantCrypto]
  
  @js.native
  sealed trait APPROVAL_PENDING extends BuyTradeStatus
  
  @js.native
  sealed trait BLOCKED
    extends BuyTradeFinalStatus
       with BuyTradeStatus
  
  @js.native
  sealed trait `Buy crypto` extends TicketTopic
  
  @js.native
  sealed trait CONFIRM extends ExchangeTradeStatus
  
  @js.native
  sealed trait CONFIRMING extends ExchangeTradeStatus
  
  @js.native
  sealed trait CONVERTING extends ExchangeTradeStatus
  
  @js.native
  sealed trait ERROR
    extends BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  
  @js.native
  sealed trait `Exchange crypto` extends TicketTopic
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait IFRAME extends js.Object
  
  @js.native
  sealed trait INCLUDED extends _ExchangeFee
  
  @js.native
  sealed trait `Invest in crypto` extends TicketTopic
  
  @js.native
  sealed trait InvityDotio extends TicketTopic
  
  @js.native
  sealed trait KYC
    extends ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  
  @js.native
  sealed trait LOADING extends ExchangeTradeStatus
  
  @js.native
  sealed trait LOGIN_REQUEST extends BuyTradeStatus
  
  @js.native
  sealed trait NONE extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait QUOTE_TIMEOUT extends js.Object
  
  @js.native
  sealed trait REQUESTING extends BuyTradeStatus
  
  @js.native
  sealed trait SENDING extends ExchangeTradeStatus
  
  @js.native
  sealed trait SUBMITTED extends BuyTradeStatus
  
  @js.native
  sealed trait SUCCESS
    extends BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  
  @js.native
  sealed trait UNKNOWN extends _ExchangeFee
  
  @js.native
  sealed trait alternativeCurrency extends BuyTradeTag
  
  @js.native
  sealed trait bancontact extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait bankTransfer extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait bestRate extends BuyTradeTag
  
  @js.native
  sealed trait creditCard extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait eps extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait favorite extends BuyTradeTag
  
  @js.native
  sealed trait giropay extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait hex extends js.Object
  
  @js.native
  sealed trait iDeal extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait renewed extends BuyTradeTag
  
  @js.native
  sealed trait sofort extends BuyCryptoPaymentMethod
  
  @js.native
  sealed trait text extends js.Object
  
  @js.native
  sealed trait wantCrypto extends BuyTradeTag
}
