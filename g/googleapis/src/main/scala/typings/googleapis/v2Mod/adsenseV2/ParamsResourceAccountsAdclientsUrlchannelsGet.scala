package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsUrlchannelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the url channel to retrieve. Format: accounts/{account\}/adclients/{adclient\}/urlchannels/{urlchannel\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsUrlchannelsGet {
  
  inline def apply(): ParamsResourceAccountsAdclientsUrlchannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsUrlchannelsGet]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsUrlchannelsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
