package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Assignment.
  */
trait SchemaCreativeAssignment extends StObject {
  
  /**
    * Whether this creative assignment is active. When true, the creative will
    * be included in the ad&#39;s rotation.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether applicable event tags should fire when this creative assignment
    * is rendered. If this value is unset when the ad is inserted or updated,
    * it will default to true for all creative types EXCEPT for
    * INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO.
    */
  var applyEventTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Click-through URL of the creative assignment.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.undefined
  
  /**
    * Companion creative overrides for this creative assignment. Applicable to
    * video ads.
    */
  var companionCreativeOverrides: js.UndefOr[js.Array[SchemaCompanionClickThroughOverride]] = js.undefined
  
  /**
    * Creative group assignments for this creative assignment. Only one
    * assignment per creative group number is allowed for a maximum of two
    * assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[SchemaCreativeGroupAssignment]] = js.undefined
  
  /**
    * ID of the creative to be assigned. This is a required field.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the creative. This is a read-only,
    * auto-generated field.
    */
  var creativeIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Date and time that the assigned creative should stop serving. Must be
    * later than the start time.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Rich media exit overrides for this creative assignment. Applicable when
    * the creative type is any of the following:  - DISPLAY - RICH_MEDIA_INPAGE
    * - RICH_MEDIA_INPAGE_FLOATING - RICH_MEDIA_IM_EXPAND -
    * RICH_MEDIA_EXPANDING - RICH_MEDIA_INTERSTITIAL_FLOAT -
    * RICH_MEDIA_MOBILE_IN_APP - RICH_MEDIA_MULTI_FLOATING -
    * RICH_MEDIA_PEEL_DOWN - VPAID_LINEAR - VPAID_NON_LINEAR
    */
  var richMediaExitOverrides: js.UndefOr[js.Array[SchemaRichMediaExitOverride]] = js.undefined
  
  /**
    * Sequence number of the creative assignment, applicable when the rotation
    * type is CREATIVE_ROTATION_TYPE_SEQUENTIAL. Acceptable values are 1 to
    * 65535, inclusive.
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the creative to be assigned is SSL-compliant. This is a read-only
    * field that is auto-generated when the ad is inserted or updated.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Date and time that the assigned creative should start serving.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Weight of the creative assignment, applicable when the rotation type is
    * CREATIVE_ROTATION_TYPE_RANDOM. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object SchemaCreativeAssignment {
  
  inline def apply(): SchemaCreativeAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssignment]
  }
  
  extension [Self <: SchemaCreativeAssignment](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setApplyEventTags(value: Boolean): Self = StObject.set(x, "applyEventTags", value.asInstanceOf[js.Any])
    
    inline def setApplyEventTagsUndefined: Self = StObject.set(x, "applyEventTags", js.undefined)
    
    inline def setClickThroughUrl(value: SchemaClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setCompanionCreativeOverrides(value: js.Array[SchemaCompanionClickThroughOverride]): Self = StObject.set(x, "companionCreativeOverrides", value.asInstanceOf[js.Any])
    
    inline def setCompanionCreativeOverridesUndefined: Self = StObject.set(x, "companionCreativeOverrides", js.undefined)
    
    inline def setCompanionCreativeOverridesVarargs(value: SchemaCompanionClickThroughOverride*): Self = StObject.set(x, "companionCreativeOverrides", js.Array(value :_*))
    
    inline def setCreativeGroupAssignments(value: js.Array[SchemaCreativeGroupAssignment]): Self = StObject.set(x, "creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupAssignmentsUndefined: Self = StObject.set(x, "creativeGroupAssignments", js.undefined)
    
    inline def setCreativeGroupAssignmentsVarargs(value: SchemaCreativeGroupAssignment*): Self = StObject.set(x, "creativeGroupAssignments", js.Array(value :_*))
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "creativeIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdDimensionValueUndefined: Self = StObject.set(x, "creativeIdDimensionValue", js.undefined)
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setRichMediaExitOverrides(value: js.Array[SchemaRichMediaExitOverride]): Self = StObject.set(x, "richMediaExitOverrides", value.asInstanceOf[js.Any])
    
    inline def setRichMediaExitOverridesUndefined: Self = StObject.set(x, "richMediaExitOverrides", js.undefined)
    
    inline def setRichMediaExitOverridesVarargs(value: SchemaRichMediaExitOverride*): Self = StObject.set(x, "richMediaExitOverrides", js.Array(value :_*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
