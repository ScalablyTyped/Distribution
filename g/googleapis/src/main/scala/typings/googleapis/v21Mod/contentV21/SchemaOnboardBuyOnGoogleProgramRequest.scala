package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnboardBuyOnGoogleProgramRequest extends StObject {
  
  /**
    * The customer service email.
    */
  var customerServiceEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaOnboardBuyOnGoogleProgramRequest {
  
  inline def apply(): SchemaOnboardBuyOnGoogleProgramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnboardBuyOnGoogleProgramRequest]
  }
  
  extension [Self <: SchemaOnboardBuyOnGoogleProgramRequest](x: Self) {
    
    inline def setCustomerServiceEmail(value: String): Self = StObject.set(x, "customerServiceEmail", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceEmailNull: Self = StObject.set(x, "customerServiceEmail", null)
    
    inline def setCustomerServiceEmailUndefined: Self = StObject.set(x, "customerServiceEmail", js.undefined)
  }
}
