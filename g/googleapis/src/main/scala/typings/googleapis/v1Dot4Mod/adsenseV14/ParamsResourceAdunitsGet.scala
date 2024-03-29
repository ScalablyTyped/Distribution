package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdunitsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client for which to get the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad unit to retrieve.
    */
  var adUnitId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdunitsGet {
  
  inline def apply(): ParamsResourceAdunitsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdunitsGet]
  }
  
  extension [Self <: ParamsResourceAdunitsGet](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
  }
}
