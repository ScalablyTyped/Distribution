package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the buyer to get. Format: `buyers/{buyerId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersGet {
  
  inline def apply(): ParamsResourceBuyersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersGet]
  }
  
  extension [Self <: ParamsResourceBuyersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
