package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveTargetedPublishersRequest extends StObject {
  
  /**
    * A list of publisher IDs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted publisher IDs in PretargetingConfig.publisherTargeting.values. Publishers are identified by their publisher ID from ads.txt / app-ads.txt. See https://iabtechlab.com/ads-txt/ and https://iabtechlab.com/app-ads-txt/ for more details.
    */
  var publisherIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRemoveTargetedPublishersRequest {
  
  inline def apply(): SchemaRemoveTargetedPublishersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveTargetedPublishersRequest]
  }
  
  extension [Self <: SchemaRemoveTargetedPublishersRequest](x: Self) {
    
    inline def setPublisherIds(value: js.Array[String]): Self = StObject.set(x, "publisherIds", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdsNull: Self = StObject.set(x, "publisherIds", null)
    
    inline def setPublisherIdsUndefined: Self = StObject.set(x, "publisherIds", js.undefined)
    
    inline def setPublisherIdsVarargs(value: String*): Self = StObject.set(x, "publisherIds", js.Array(value*))
  }
}
