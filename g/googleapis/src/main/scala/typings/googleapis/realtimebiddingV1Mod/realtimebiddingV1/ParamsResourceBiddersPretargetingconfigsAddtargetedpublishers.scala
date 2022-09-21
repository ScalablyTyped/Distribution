package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    */
  var pretargetingConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddTargetedPublishersRequest] = js.undefined
}
object ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers {
  
  inline def apply(): ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers]
  }
  
  extension [Self <: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers](x: Self) {
    
    inline def setPretargetingConfig(value: String): Self = StObject.set(x, "pretargetingConfig", value.asInstanceOf[js.Any])
    
    inline def setPretargetingConfigUndefined: Self = StObject.set(x, "pretargetingConfig", js.undefined)
    
    inline def setRequestBody(value: SchemaAddTargetedPublishersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
