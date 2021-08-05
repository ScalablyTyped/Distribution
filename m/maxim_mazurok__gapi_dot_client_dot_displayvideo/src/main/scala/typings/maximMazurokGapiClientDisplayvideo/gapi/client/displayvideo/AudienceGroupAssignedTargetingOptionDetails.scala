package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudienceGroupAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The first and third party audience ids and recencies of the excluded first and third party audience group. Used for negative targeting. Its COMPLEMENT is used to UNION other
    * audience groups.
    */
  var excludedFirstAndThirdPartyAudienceGroup: js.UndefOr[FirstAndThirdPartyAudienceGroup] = js.undefined
  
  /**
    * The Google audience ids of the excluded Google audience group. Used for negative targeting. It's COMPLEMENT is used to UNION other audience groups. Only contains Affinity, In-market
    * and Installed-apps type Google audiences. All items are logically ‘OR’ of each other.
    */
  var excludedGoogleAudienceGroup: js.UndefOr[GoogleAudienceGroup] = js.undefined
  
  /** The combined audience ids of the included combined audience group. Contains combined audience ids only. */
  var includedCombinedAudienceGroup: js.UndefOr[CombinedAudienceGroup] = js.undefined
  
  /** The custom list ids of the included custom list group. Contains custom list ids only. */
  var includedCustomListGroup: js.UndefOr[CustomListGroup] = js.undefined
  
  /**
    * The first and third party audience ids and recencies of included first and third party audience groups. Each first and third party audience group contains first and third party
    * audience ids only. The relation between each first and third party audience group is INTERSECTION, and the result is UNION'ed with other audience groups. Repeated groups with same
    * settings will be ignored.
    */
  var includedFirstAndThirdPartyAudienceGroups: js.UndefOr[js.Array[FirstAndThirdPartyAudienceGroup]] = js.undefined
  
  /** The Google audience ids of the included Google audience group. Contains Google audience ids only. */
  var includedGoogleAudienceGroup: js.UndefOr[GoogleAudienceGroup] = js.undefined
}
object AudienceGroupAssignedTargetingOptionDetails {
  
  inline def apply(): AudienceGroupAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudienceGroupAssignedTargetingOptionDetails]
  }
  
  extension [Self <: AudienceGroupAssignedTargetingOptionDetails](x: Self) {
    
    inline def setExcludedFirstAndThirdPartyAudienceGroup(value: FirstAndThirdPartyAudienceGroup): Self = StObject.set(x, "excludedFirstAndThirdPartyAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setExcludedFirstAndThirdPartyAudienceGroupUndefined: Self = StObject.set(x, "excludedFirstAndThirdPartyAudienceGroup", js.undefined)
    
    inline def setExcludedGoogleAudienceGroup(value: GoogleAudienceGroup): Self = StObject.set(x, "excludedGoogleAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setExcludedGoogleAudienceGroupUndefined: Self = StObject.set(x, "excludedGoogleAudienceGroup", js.undefined)
    
    inline def setIncludedCombinedAudienceGroup(value: CombinedAudienceGroup): Self = StObject.set(x, "includedCombinedAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setIncludedCombinedAudienceGroupUndefined: Self = StObject.set(x, "includedCombinedAudienceGroup", js.undefined)
    
    inline def setIncludedCustomListGroup(value: CustomListGroup): Self = StObject.set(x, "includedCustomListGroup", value.asInstanceOf[js.Any])
    
    inline def setIncludedCustomListGroupUndefined: Self = StObject.set(x, "includedCustomListGroup", js.undefined)
    
    inline def setIncludedFirstAndThirdPartyAudienceGroups(value: js.Array[FirstAndThirdPartyAudienceGroup]): Self = StObject.set(x, "includedFirstAndThirdPartyAudienceGroups", value.asInstanceOf[js.Any])
    
    inline def setIncludedFirstAndThirdPartyAudienceGroupsUndefined: Self = StObject.set(x, "includedFirstAndThirdPartyAudienceGroups", js.undefined)
    
    inline def setIncludedFirstAndThirdPartyAudienceGroupsVarargs(value: FirstAndThirdPartyAudienceGroup*): Self = StObject.set(x, "includedFirstAndThirdPartyAudienceGroups", js.Array(value :_*))
    
    inline def setIncludedGoogleAudienceGroup(value: GoogleAudienceGroup): Self = StObject.set(x, "includedGoogleAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setIncludedGoogleAudienceGroupUndefined: Self = StObject.set(x, "includedGoogleAudienceGroup", js.undefined)
  }
}
