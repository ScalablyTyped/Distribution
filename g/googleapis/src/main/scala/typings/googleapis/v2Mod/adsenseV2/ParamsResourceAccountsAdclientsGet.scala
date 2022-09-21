package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the ad client to retrieve. Format: accounts/{account\}/adclients/{adclient\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsGet {
  
  inline def apply(): ParamsResourceAccountsAdclientsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsGet]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
