package typings.invityApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.invityApi.invityApiStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BuyTradeQuoteResponse = js.Array[BuyTrade]

type ExchangeCoinListResponse = js.Array[ExchangeCoinInfo]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.invityApi.invityApiStrings.INCLUDED
  - typings.invityApi.invityApiStrings.UNKNOWN
*/
type ExchangeFee = _ExchangeFee | Double

type ExchangeListResponse = js.Array[ExchangeProviderInfo]

type ExchangeMaximum = Double | NONE

type ExchangeTradeQuoteResponse = js.Array[ExchangeTrade]

type SellFiatTradeQuoteResponse = js.Array[SellFiatTrade]

type SellVoucherTradeQuoteResponse = js.Array[SellVoucherTrade]

type SpendTrade = SellVoucherTrade

type StringMap = StringDictionary[String]
