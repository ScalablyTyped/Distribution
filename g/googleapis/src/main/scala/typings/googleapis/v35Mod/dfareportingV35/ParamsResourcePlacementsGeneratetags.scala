package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlacementsGeneratetags
  extends StObject
     with StandardParameters {
  
  /**
    * Generate placements belonging to this campaign. This is a required field.
    */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /**
    * Generate tags for these placements.
    */
  var placementIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Tag formats to generate for these placements. *Note:* PLACEMENT_TAG_STANDARD can only be generated for 1x1 placements.
    */
  var tagFormats: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourcePlacementsGeneratetags {
  
  inline def apply(): ParamsResourcePlacementsGeneratetags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlacementsGeneratetags]
  }
  
  extension [Self <: ParamsResourcePlacementsGeneratetags](x: Self) {
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setPlacementIds(value: js.Array[String]): Self = StObject.set(x, "placementIds", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdsUndefined: Self = StObject.set(x, "placementIds", js.undefined)
    
    inline def setPlacementIdsVarargs(value: String*): Self = StObject.set(x, "placementIds", js.Array(value*))
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setTagFormats(value: js.Array[String]): Self = StObject.set(x, "tagFormats", value.asInstanceOf[js.Any])
    
    inline def setTagFormatsUndefined: Self = StObject.set(x, "tagFormats", js.undefined)
    
    inline def setTagFormatsVarargs(value: String*): Self = StObject.set(x, "tagFormats", js.Array(value*))
  }
}
