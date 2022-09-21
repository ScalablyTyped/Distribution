package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrdersGettestordertemplate
  extends StObject
     with StandardParameters {
  
  /**
    * The country of the template to retrieve. Defaults to `US`.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that should manage the order. This cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the template to retrieve.
    */
  var templateName: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrdersGettestordertemplate {
  
  inline def apply(): ParamsResourceOrdersGettestordertemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersGettestordertemplate]
  }
  
  extension [Self <: ParamsResourceOrdersGettestordertemplate](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
