package typings.invityApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BuyTradeQuoteResponse = js.Array[typings.invityApi.mod.BuyTrade]
  
  type ExchangeCoinListResponse = js.Array[typings.invityApi.mod.ExchangeCoinInfo]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.invityApi.invityApiStrings.INCLUDED
    - typings.invityApi.invityApiStrings.UNKNOWN
  */
  type ExchangeFee = typings.invityApi.mod._ExchangeFee | scala.Double
  
  type ExchangeListResponse = js.Array[typings.invityApi.mod.ExchangeProviderInfo]
  
  type ExchangeMaximum = scala.Double | typings.invityApi.invityApiStrings.NONE
  
  type ExchangeTradeQuoteResponse = js.Array[typings.invityApi.mod.ExchangeTrade]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
