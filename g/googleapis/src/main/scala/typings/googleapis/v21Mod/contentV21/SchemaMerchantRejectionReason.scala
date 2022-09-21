package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMerchantRejectionReason extends StObject {
  
  /**
    * Description of the reason.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Code of the rejection reason.
    */
  var reasonCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaMerchantRejectionReason {
  
  inline def apply(): SchemaMerchantRejectionReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantRejectionReason]
  }
  
  extension [Self <: SchemaMerchantRejectionReason](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeNull: Self = StObject.set(x, "reasonCode", null)
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
