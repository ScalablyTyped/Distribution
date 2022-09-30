package typings.invityApi.mod

import typings.invityApi.anon.FormAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerInitSuccessResponse extends StObject {
  
  var form: js.UndefOr[FormAction] = js.undefined
  
  var savingsTrade: js.UndefOr[SavingsTrade] = js.undefined
}
object PartnerInitSuccessResponse {
  
  inline def apply(): PartnerInitSuccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerInitSuccessResponse]
  }
  
  extension [Self <: PartnerInitSuccessResponse](x: Self) {
    
    inline def setForm(value: FormAction): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setSavingsTrade(value: SavingsTrade): Self = StObject.set(x, "savingsTrade", value.asInstanceOf[js.Any])
    
    inline def setSavingsTradeUndefined: Self = StObject.set(x, "savingsTrade", js.undefined)
  }
}
