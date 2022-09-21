package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdclientsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client to get.
    */
  var adClientId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdclientsGet {
  
  inline def apply(): ParamsResourceAdclientsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdclientsGet]
  }
  
  extension [Self <: ParamsResourceAdclientsGet](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
  }
}
