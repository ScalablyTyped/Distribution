package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGetvoiceofmerchantstate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the location.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGetvoiceofmerchantstate {
  
  inline def apply(): ParamsResourceLocationsGetvoiceofmerchantstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGetvoiceofmerchantstate]
  }
  
  extension [Self <: ParamsResourceLocationsGetvoiceofmerchantstate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
