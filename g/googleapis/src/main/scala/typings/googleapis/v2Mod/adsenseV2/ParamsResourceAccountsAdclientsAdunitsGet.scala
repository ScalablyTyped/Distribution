package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsAdunitsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. AdUnit to get information about. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsAdunitsGet {
  
  inline def apply(): ParamsResourceAccountsAdclientsAdunitsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsAdunitsGet]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsAdunitsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
