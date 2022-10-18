package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayInRecurringRegistrationState extends StObject {
  
  var CumulatedDebitedAmount: MoneyData
  
  var CumulatedFeesAmount: MoneyData
  
  var LastPayinId: Double
  
  var PayinsLinked: Double
}
object PayInRecurringRegistrationState {
  
  inline def apply(
    CumulatedDebitedAmount: MoneyData,
    CumulatedFeesAmount: MoneyData,
    LastPayinId: Double,
    PayinsLinked: Double
  ): PayInRecurringRegistrationState = {
    val __obj = js.Dynamic.literal(CumulatedDebitedAmount = CumulatedDebitedAmount.asInstanceOf[js.Any], CumulatedFeesAmount = CumulatedFeesAmount.asInstanceOf[js.Any], LastPayinId = LastPayinId.asInstanceOf[js.Any], PayinsLinked = PayinsLinked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayInRecurringRegistrationState]
  }
  
  extension [Self <: PayInRecurringRegistrationState](x: Self) {
    
    inline def setCumulatedDebitedAmount(value: MoneyData): Self = StObject.set(x, "CumulatedDebitedAmount", value.asInstanceOf[js.Any])
    
    inline def setCumulatedFeesAmount(value: MoneyData): Self = StObject.set(x, "CumulatedFeesAmount", value.asInstanceOf[js.Any])
    
    inline def setLastPayinId(value: Double): Self = StObject.set(x, "LastPayinId", value.asInstanceOf[js.Any])
    
    inline def setPayinsLinked(value: Double): Self = StObject.set(x, "PayinsLinked", value.asInstanceOf[js.Any])
  }
}
