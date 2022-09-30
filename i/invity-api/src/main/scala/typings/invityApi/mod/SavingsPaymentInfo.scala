package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPaymentInfo extends StObject {
  
  var bic: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var iban: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object SavingsPaymentInfo {
  
  inline def apply(): SavingsPaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPaymentInfo]
  }
  
  extension [Self <: SavingsPaymentInfo](x: Self) {
    
    inline def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    inline def setBicUndefined: Self = StObject.set(x, "bic", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIban(value: String): Self = StObject.set(x, "iban", value.asInstanceOf[js.Any])
    
    inline def setIbanUndefined: Self = StObject.set(x, "iban", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
