package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPretargetingconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the pretargeting configuration to get. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersPretargetingconfigsGet {
  
  inline def apply(): ParamsResourceBiddersPretargetingconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPretargetingconfigsGet]
  }
  
  extension [Self <: ParamsResourceBiddersPretargetingconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
