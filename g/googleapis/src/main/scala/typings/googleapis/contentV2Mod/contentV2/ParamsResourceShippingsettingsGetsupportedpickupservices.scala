package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceShippingsettingsGetsupportedpickupservices
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account for which to retrieve the supported pickup services.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceShippingsettingsGetsupportedpickupservices {
  
  inline def apply(): ParamsResourceShippingsettingsGetsupportedpickupservices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShippingsettingsGetsupportedpickupservices]
  }
  
  extension [Self <: ParamsResourceShippingsettingsGetsupportedpickupservices](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
