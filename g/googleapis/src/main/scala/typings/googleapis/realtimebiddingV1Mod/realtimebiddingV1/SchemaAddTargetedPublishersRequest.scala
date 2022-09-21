package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddTargetedPublishersRequest extends StObject {
  
  /**
    * A list of publisher IDs to target in the pretargeting configuration. These values will be added to the list of targeted publisher IDs in PretargetingConfig.publisherTargeting.values. Publishers are identified by their publisher ID from ads.txt / app-ads.txt. See https://iabtechlab.com/ads-txt/ and https://iabtechlab.com/app-ads-txt/ for more details.
    */
  var publisherIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The targeting mode that should be applied to the list of publisher IDs. If are existing publisher IDs, must be equal to the existing PretargetingConfig.publisherTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddTargetedPublishersRequest {
  
  inline def apply(): SchemaAddTargetedPublishersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddTargetedPublishersRequest]
  }
  
  extension [Self <: SchemaAddTargetedPublishersRequest](x: Self) {
    
    inline def setPublisherIds(value: js.Array[String]): Self = StObject.set(x, "publisherIds", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdsNull: Self = StObject.set(x, "publisherIds", null)
    
    inline def setPublisherIdsUndefined: Self = StObject.set(x, "publisherIds", js.undefined)
    
    inline def setPublisherIdsVarargs(value: String*): Self = StObject.set(x, "publisherIds", js.Array(value*))
    
    inline def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    inline def setTargetingModeNull: Self = StObject.set(x, "targetingMode", null)
    
    inline def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
  }
}
