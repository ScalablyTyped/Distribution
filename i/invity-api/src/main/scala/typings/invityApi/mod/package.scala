package typings.invityApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.invityApi.invityApiStrings.NONE
import typings.invityApi.invityApiStrings.bankTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BuyTradeFormResponse = FormResponse

type BuyTradeQuoteResponse = js.Array[BuyTrade]

type Coin = String

type CountryCode = String

type Currency = String

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

type Id = String

type SavingsPaymentMethod = bankTransfer

type SavingsStepAML = SavingsStepEnabled

type SavingsStepAfterLogin = SavingsStepEnabled

type SavingsStepAfterSuccessfulPhoneVerification = SavingsStepEnabled

type SavingsStepBankAccount = SavingsStepEnabled

type SavingsStepCryptoWalletVerification = SavingsStepEnabled

type SellFiatTradeFormResponse = FormResponse

type SellFiatTradeQuoteResponse = js.Array[SellFiatTrade]

type SellVoucherTradeQuoteResponse = js.Array[SellVoucherTrade]

type SpendTrade = SellVoucherTrade

type StringMap = StringDictionary[String]
