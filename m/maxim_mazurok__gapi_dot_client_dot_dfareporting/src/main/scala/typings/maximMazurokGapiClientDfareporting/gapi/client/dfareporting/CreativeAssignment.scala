package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeAssignment extends StObject {
  
  /** Whether this creative assignment is active. When true, the creative will be included in the ad's rotation. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether applicable event tags should fire when this creative assignment is rendered. If this value is unset when the ad is inserted or updated, it will default to true for all
    * creative types EXCEPT for INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO.
    */
  var applyEventTags: js.UndefOr[Boolean] = js.undefined
  
  /** Click-through URL of the creative assignment. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  
  /** Companion creative overrides for this creative assignment. Applicable to video ads. */
  var companionCreativeOverrides: js.UndefOr[js.Array[CompanionClickThroughOverride]] = js.undefined
  
  /** Creative group assignments for this creative assignment. Only one assignment per creative group number is allowed for a maximum of two assignments. */
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  
  /** ID of the creative to be assigned. This is a required field. */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the creative. This is a read-only, auto-generated field. */
  var creativeIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Rich media exit overrides for this creative assignment. Applicable when the creative type is any of the following: - DISPLAY - RICH_MEDIA_INPAGE - RICH_MEDIA_INPAGE_FLOATING -
    * RICH_MEDIA_IM_EXPAND - RICH_MEDIA_EXPANDING - RICH_MEDIA_INTERSTITIAL_FLOAT - RICH_MEDIA_MOBILE_IN_APP - RICH_MEDIA_MULTI_FLOATING - RICH_MEDIA_PEEL_DOWN - VPAID_LINEAR -
    * VPAID_NON_LINEAR
    */
  var richMediaExitOverrides: js.UndefOr[js.Array[RichMediaExitOverride]] = js.undefined
  
  /** Sequence number of the creative assignment, applicable when the rotation type is CREATIVE_ROTATION_TYPE_SEQUENTIAL. Acceptable values are 1 to 65535, inclusive. */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /** Whether the creative to be assigned is SSL-compliant. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Weight of the creative assignment, applicable when the rotation type is CREATIVE_ROTATION_TYPE_RANDOM. Value must be greater than or equal to 1. */
  var weight: js.UndefOr[Double] = js.undefined
}
object CreativeAssignment {
  
  @scala.inline
  def apply(): CreativeAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssignment]
  }
  
  @scala.inline
  implicit class CreativeAssignmentMutableBuilder[Self <: CreativeAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setApplyEventTags(value: Boolean): Self = StObject.set(x, "applyEventTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyEventTagsUndefined: Self = StObject.set(x, "applyEventTags", js.undefined)
    
    @scala.inline
    def setClickThroughUrl(value: ClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCompanionCreativeOverrides(value: js.Array[CompanionClickThroughOverride]): Self = StObject.set(x, "companionCreativeOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionCreativeOverridesUndefined: Self = StObject.set(x, "companionCreativeOverrides", js.undefined)
    
    @scala.inline
    def setCompanionCreativeOverridesVarargs(value: CompanionClickThroughOverride*): Self = StObject.set(x, "companionCreativeOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroupAssignments(value: js.Array[CreativeGroupAssignment]): Self = StObject.set(x, "creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupAssignmentsUndefined: Self = StObject.set(x, "creativeGroupAssignments", js.undefined)
    
    @scala.inline
    def setCreativeGroupAssignmentsVarargs(value: CreativeGroupAssignment*): Self = StObject.set(x, "creativeGroupAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "creativeIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdDimensionValueUndefined: Self = StObject.set(x, "creativeIdDimensionValue", js.undefined)
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setRichMediaExitOverrides(value: js.Array[RichMediaExitOverride]): Self = StObject.set(x, "richMediaExitOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichMediaExitOverridesUndefined: Self = StObject.set(x, "richMediaExitOverrides", js.undefined)
    
    @scala.inline
    def setRichMediaExitOverridesVarargs(value: RichMediaExitOverride*): Self = StObject.set(x, "richMediaExitOverrides", js.Array(value :_*))
    
    @scala.inline
    def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
