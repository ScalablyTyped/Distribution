package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnPolicyOnlineRestockingFee extends StObject {
  
  /** Fixed restocking fee. */
  var fixedFee: js.UndefOr[PriceAmount] = js.undefined
  
  /** Percent of total price in micros. 15,000,000 means 15% of the total price would be charged. */
  var microPercent: js.UndefOr[Double] = js.undefined
}
object ReturnPolicyOnlineRestockingFee {
  
  inline def apply(): ReturnPolicyOnlineRestockingFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicyOnlineRestockingFee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnPolicyOnlineRestockingFee] (val x: Self) extends AnyVal {
    
    inline def setFixedFee(value: PriceAmount): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    inline def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    inline def setMicroPercent(value: Double): Self = StObject.set(x, "microPercent", value.asInstanceOf[js.Any])
    
    inline def setMicroPercentUndefined: Self = StObject.set(x, "microPercent", js.undefined)
  }
}
