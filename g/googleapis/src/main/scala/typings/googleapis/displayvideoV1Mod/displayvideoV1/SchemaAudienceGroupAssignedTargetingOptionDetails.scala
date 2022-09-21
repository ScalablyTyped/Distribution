package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudienceGroupAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The first and third party audience ids and recencies of the excluded first and third party audience group. Used for negative targeting. The COMPLEMENT of the UNION of this group and other excluded audience groups is used as an INTERSECTION to any positive audience targeting. All items are logically ‘OR’ of each other.
    */
  var excludedFirstAndThirdPartyAudienceGroup: js.UndefOr[SchemaFirstAndThirdPartyAudienceGroup] = js.undefined
  
  /**
    * The Google audience ids of the excluded Google audience group. Used for negative targeting. The COMPLEMENT of the UNION of this group and other excluded audience groups is used as an INTERSECTION to any positive audience targeting. Only contains Affinity, In-market and Installed-apps type Google audiences. All items are logically ‘OR’ of each other.
    */
  var excludedGoogleAudienceGroup: js.UndefOr[SchemaGoogleAudienceGroup] = js.undefined
  
  /**
    * The combined audience ids of the included combined audience group. Contains combined audience ids only.
    */
  var includedCombinedAudienceGroup: js.UndefOr[SchemaCombinedAudienceGroup] = js.undefined
  
  /**
    * The custom list ids of the included custom list group. Contains custom list ids only.
    */
  var includedCustomListGroup: js.UndefOr[SchemaCustomListGroup] = js.undefined
  
  /**
    * The first and third party audience ids and recencies of included first and third party audience groups. Each first and third party audience group contains first and third party audience ids only. The relation between each first and third party audience group is INTERSECTION, and the result is UNION'ed with other audience groups. Repeated groups with same settings will be ignored.
    */
  var includedFirstAndThirdPartyAudienceGroups: js.UndefOr[js.Array[SchemaFirstAndThirdPartyAudienceGroup]] = js.undefined
  
  /**
    * The Google audience ids of the included Google audience group. Contains Google audience ids only.
    */
  var includedGoogleAudienceGroup: js.UndefOr[SchemaGoogleAudienceGroup] = js.undefined
}
object SchemaAudienceGroupAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaAudienceGroupAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudienceGroupAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAudienceGroupAssignedTargetingOptionDetails](x: Self) {
    
    inline def setExcludedFirstAndThirdPartyAudienceGroup(value: SchemaFirstAndThirdPartyAudienceGroup): Self = StObject.set(x, "excludedFirstAndThirdPartyAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setExcludedFirstAndThirdPartyAudienceGroupUndefined: Self = StObject.set(x, "excludedFirstAndThirdPartyAudienceGroup", js.undefined)
    
    inline def setExcludedGoogleAudienceGroup(value: SchemaGoogleAudienceGroup): Self = StObject.set(x, "excludedGoogleAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setExcludedGoogleAudienceGroupUndefined: Self = StObject.set(x, "excludedGoogleAudienceGroup", js.undefined)
    
    inline def setIncludedCombinedAudienceGroup(value: SchemaCombinedAudienceGroup): Self = StObject.set(x, "includedCombinedAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setIncludedCombinedAudienceGroupUndefined: Self = StObject.set(x, "includedCombinedAudienceGroup", js.undefined)
    
    inline def setIncludedCustomListGroup(value: SchemaCustomListGroup): Self = StObject.set(x, "includedCustomListGroup", value.asInstanceOf[js.Any])
    
    inline def setIncludedCustomListGroupUndefined: Self = StObject.set(x, "includedCustomListGroup", js.undefined)
    
    inline def setIncludedFirstAndThirdPartyAudienceGroups(value: js.Array[SchemaFirstAndThirdPartyAudienceGroup]): Self = StObject.set(x, "includedFirstAndThirdPartyAudienceGroups", value.asInstanceOf[js.Any])
    
    inline def setIncludedFirstAndThirdPartyAudienceGroupsUndefined: Self = StObject.set(x, "includedFirstAndThirdPartyAudienceGroups", js.undefined)
    
    inline def setIncludedFirstAndThirdPartyAudienceGroupsVarargs(value: SchemaFirstAndThirdPartyAudienceGroup*): Self = StObject.set(x, "includedFirstAndThirdPartyAudienceGroups", js.Array(value*))
    
    inline def setIncludedGoogleAudienceGroup(value: SchemaGoogleAudienceGroup): Self = StObject.set(x, "includedGoogleAudienceGroup", value.asInstanceOf[js.Any])
    
    inline def setIncludedGoogleAudienceGroupUndefined: Self = StObject.set(x, "includedGoogleAudienceGroup", js.undefined)
  }
}
