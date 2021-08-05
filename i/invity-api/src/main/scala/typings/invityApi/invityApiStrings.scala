package typings.invityApi

import typings.invityApi.mod.BuyCryptoPaymentMethod
import typings.invityApi.mod.BuyTradeFinalStatus
import typings.invityApi.mod.BuyTradeStatus
import typings.invityApi.mod.BuyTradeTag
import typings.invityApi.mod.ExchangeTradeFinalStatus
import typings.invityApi.mod.ExchangeTradeStatus
import typings.invityApi.mod.TicketTopic
import typings.invityApi.mod._ExchangeFee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invityApiStrings {
  
  @js.native
  sealed trait APPROVAL_PENDING
    extends StObject
       with BuyTradeStatus
  inline def APPROVAL_PENDING: APPROVAL_PENDING = "APPROVAL_PENDING".asInstanceOf[APPROVAL_PENDING]
  
  @js.native
  sealed trait BLOCKED
    extends StObject
       with BuyTradeFinalStatus
       with BuyTradeStatus
  inline def BLOCKED: BLOCKED = "BLOCKED".asInstanceOf[BLOCKED]
  
  @js.native
  sealed trait `Buy crypto`
    extends StObject
       with TicketTopic
  inline def `Buy crypto`: `Buy crypto` = ("Buy crypto").asInstanceOf[`Buy crypto`]
  
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
  sealed trait ERROR
    extends StObject
       with BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait `Exchange crypto`
    extends StObject
       with TicketTopic
  inline def `Exchange crypto`: `Exchange crypto` = ("Exchange crypto").asInstanceOf[`Exchange crypto`]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait IFRAME extends StObject
  inline def IFRAME: IFRAME = "IFRAME".asInstanceOf[IFRAME]
  
  @js.native
  sealed trait INCLUDED
    extends StObject
       with _ExchangeFee
  inline def INCLUDED: INCLUDED = "INCLUDED".asInstanceOf[INCLUDED]
  
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
  inline def LOGIN_REQUEST: LOGIN_REQUEST = "LOGIN_REQUEST".asInstanceOf[LOGIN_REQUEST]
  
  @js.native
  sealed trait NONE extends StObject
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait QUOTE_TIMEOUT extends StObject
  inline def QUOTE_TIMEOUT: QUOTE_TIMEOUT = "QUOTE_TIMEOUT".asInstanceOf[QUOTE_TIMEOUT]
  
  @js.native
  sealed trait REQUESTING
    extends StObject
       with BuyTradeStatus
  inline def REQUESTING: REQUESTING = "REQUESTING".asInstanceOf[REQUESTING]
  
  @js.native
  sealed trait SENDING
    extends StObject
       with ExchangeTradeStatus
  inline def SENDING: SENDING = "SENDING".asInstanceOf[SENDING]
  
  @js.native
  sealed trait SUBMITTED
    extends StObject
       with BuyTradeStatus
  inline def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with BuyTradeFinalStatus
       with BuyTradeStatus
       with ExchangeTradeFinalStatus
       with ExchangeTradeStatus
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with _ExchangeFee
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait alternativeCurrency
    extends StObject
       with BuyTradeTag
  inline def alternativeCurrency: alternativeCurrency = "alternativeCurrency".asInstanceOf[alternativeCurrency]
  
  @js.native
  sealed trait bancontact
    extends StObject
       with BuyCryptoPaymentMethod
  inline def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bankTransfer
    extends StObject
       with BuyCryptoPaymentMethod
  inline def bankTransfer: bankTransfer = "bankTransfer".asInstanceOf[bankTransfer]
  
  @js.native
  sealed trait bestRate
    extends StObject
       with BuyTradeTag
  inline def bestRate: bestRate = "bestRate".asInstanceOf[bestRate]
  
  @js.native
  sealed trait creditCard
    extends StObject
       with BuyCryptoPaymentMethod
  inline def creditCard: creditCard = "creditCard".asInstanceOf[creditCard]
  
  @js.native
  sealed trait eps
    extends StObject
       with BuyCryptoPaymentMethod
  inline def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait favorite
    extends StObject
       with BuyTradeTag
  inline def favorite: favorite = "favorite".asInstanceOf[favorite]
  
  @js.native
  sealed trait giropay
    extends StObject
       with BuyCryptoPaymentMethod
  inline def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait hex extends StObject
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait iDeal
    extends StObject
       with BuyCryptoPaymentMethod
  inline def iDeal: iDeal = "iDeal".asInstanceOf[iDeal]
  
  @js.native
  sealed trait number extends StObject
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait renewed
    extends StObject
       with BuyTradeTag
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
  sealed trait wantCrypto
    extends StObject
       with BuyTradeTag
  inline def wantCrypto: wantCrypto = "wantCrypto".asInstanceOf[wantCrypto]
}
