package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsGetadcode
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the ad client for which to get the adcode. Format: accounts/{account\}/adclients/{adclient\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsGetadcode {
  
  inline def apply(): ParamsResourceAccountsAdclientsGetadcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsGetadcode]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsGetadcode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
