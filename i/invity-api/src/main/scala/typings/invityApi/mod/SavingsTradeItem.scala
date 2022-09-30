package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeItem extends StObject {
  
  var created: String
  
  var exchange: String
  
  var fiatCurrency: String
  
  var fiatStringAmount: String
  
  var id: String
  
  var paymentMethod: SavingsPaymentMethod
  
  var receiveAddress: String
  
  var receiveCurrency: String
  
  var receiveStringAmount: String
  
  var savingsTradeId: String
  
  var status: SavingsTradeItemStatus
}
object SavingsTradeItem {
  
  inline def apply(
    created: String,
    exchange: String,
    fiatCurrency: String,
    fiatStringAmount: String,
    id: String,
    paymentMethod: SavingsPaymentMethod,
    receiveAddress: String,
    receiveCurrency: String,
    receiveStringAmount: String,
    savingsTradeId: String,
    status: SavingsTradeItemStatus
  ): SavingsTradeItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], fiatCurrency = fiatCurrency.asInstanceOf[js.Any], fiatStringAmount = fiatStringAmount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], receiveAddress = receiveAddress.asInstanceOf[js.Any], receiveCurrency = receiveCurrency.asInstanceOf[js.Any], receiveStringAmount = receiveStringAmount.asInstanceOf[js.Any], savingsTradeId = savingsTradeId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeItem]
  }
  
  extension [Self <: SavingsTradeItem](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethod(value: SavingsPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    inline def setReceiveCurrency(value: String): Self = StObject.set(x, "receiveCurrency", value.asInstanceOf[js.Any])
    
    inline def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    inline def setSavingsTradeId(value: String): Self = StObject.set(x, "savingsTradeId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SavingsTradeItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
