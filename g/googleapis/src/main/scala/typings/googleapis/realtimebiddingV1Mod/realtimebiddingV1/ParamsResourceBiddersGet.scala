package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the bidder to get. Format: `bidders/{bidderAccountId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersGet {
  
  inline def apply(): ParamsResourceBiddersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersGet]
  }
  
  extension [Self <: ParamsResourceBiddersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
