package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersCreativesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the creative to retrieve. See creative.name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the amount of information included in the response. By default only creativeServingDecision is included. To retrieve the entire creative resource (including the declared fields and the creative content) specify the view as "FULL".
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersCreativesGet {
  
  inline def apply(): ParamsResourceBuyersCreativesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersCreativesGet]
  }
  
  extension [Self <: ParamsResourceBuyersCreativesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
