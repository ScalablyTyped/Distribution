package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPretargetingconfigsActivate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaActivatePretargetingConfigRequest] = js.undefined
}
object ParamsResourceBiddersPretargetingconfigsActivate {
  
  inline def apply(): ParamsResourceBiddersPretargetingconfigsActivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPretargetingconfigsActivate]
  }
  
  extension [Self <: ParamsResourceBiddersPretargetingconfigsActivate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaActivatePretargetingConfigRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
