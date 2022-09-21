package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnboardBuyOnGoogleProgramRequest extends StObject {
  
  /** The customer service email. */
  var customerServiceEmail: js.UndefOr[String] = js.undefined
}
object OnboardBuyOnGoogleProgramRequest {
  
  inline def apply(): OnboardBuyOnGoogleProgramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnboardBuyOnGoogleProgramRequest]
  }
  
  extension [Self <: OnboardBuyOnGoogleProgramRequest](x: Self) {
    
    inline def setCustomerServiceEmail(value: String): Self = StObject.set(x, "customerServiceEmail", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceEmailUndefined: Self = StObject.set(x, "customerServiceEmail", js.undefined)
  }
}
