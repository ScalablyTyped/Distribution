package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRefundReason extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var reasonCode: js.UndefOr[String] = js.undefined
}
object SchemaRefundReason {
  
  inline def apply(): SchemaRefundReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefundReason]
  }
  
  extension [Self <: SchemaRefundReason](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
