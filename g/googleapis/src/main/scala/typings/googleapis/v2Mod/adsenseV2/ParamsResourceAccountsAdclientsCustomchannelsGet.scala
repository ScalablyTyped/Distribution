package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsCustomchannelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the custom channel. Format: accounts/{account\}/adclients/{adclient\}/customchannels/{customchannel\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsCustomchannelsGet {
  
  inline def apply(): ParamsResourceAccountsAdclientsCustomchannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsCustomchannelsGet]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsCustomchannelsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
