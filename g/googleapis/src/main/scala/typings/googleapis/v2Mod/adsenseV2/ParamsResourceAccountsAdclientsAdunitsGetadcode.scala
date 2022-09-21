package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsAdunitsGetadcode
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the adunit for which to get the adcode. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsAdunitsGetadcode {
  
  inline def apply(): ParamsResourceAccountsAdclientsAdunitsGetadcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsAdunitsGetadcode]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsAdunitsGetadcode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
