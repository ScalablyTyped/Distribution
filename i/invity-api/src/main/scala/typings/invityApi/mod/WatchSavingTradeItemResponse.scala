package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchSavingTradeItemResponse
  extends StObject
     with WatchSavingTradeItemErrorResponse {
  
  var savingsTradeItem: js.UndefOr[SavingsTradeItem] = js.undefined
}
object WatchSavingTradeItemResponse {
  
  inline def apply(): WatchSavingTradeItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchSavingTradeItemResponse]
  }
  
  extension [Self <: WatchSavingTradeItemResponse](x: Self) {
    
    inline def setSavingsTradeItem(value: SavingsTradeItem): Self = StObject.set(x, "savingsTradeItem", value.asInstanceOf[js.Any])
    
    inline def setSavingsTradeItemUndefined: Self = StObject.set(x, "savingsTradeItem", js.undefined)
  }
}
