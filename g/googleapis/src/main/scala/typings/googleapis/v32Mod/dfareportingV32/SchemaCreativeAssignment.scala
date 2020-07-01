package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Assignment.
  */
@js.native
trait SchemaCreativeAssignment extends js.Object {
  /**
    * Whether this creative assignment is active. When true, the creative will
    * be included in the ad&#39;s rotation.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Whether applicable event tags should fire when this creative assignment
    * is rendered. If this value is unset when the ad is inserted or updated,
    * it will default to true for all creative types EXCEPT for
    * INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO.
    */
  var applyEventTags: js.UndefOr[Boolean] = js.native
  /**
    * Click-through URL of the creative assignment.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * Companion creative overrides for this creative assignment. Applicable to
    * video ads.
    */
  var companionCreativeOverrides: js.UndefOr[js.Array[SchemaCompanionClickThroughOverride]] = js.native
  /**
    * Creative group assignments for this creative assignment. Only one
    * assignment per creative group number is allowed for a maximum of two
    * assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[SchemaCreativeGroupAssignment]] = js.native
  /**
    * ID of the creative to be assigned. This is a required field.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the creative. This is a read-only,
    * auto-generated field.
    */
  var creativeIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Date and time that the assigned creative should stop serving. Must be
    * later than the start time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Rich media exit overrides for this creative assignment. Applicable when
    * the creative type is any of the following:  - DISPLAY - RICH_MEDIA_INPAGE
    * - RICH_MEDIA_INPAGE_FLOATING - RICH_MEDIA_IM_EXPAND -
    * RICH_MEDIA_EXPANDING - RICH_MEDIA_INTERSTITIAL_FLOAT -
    * RICH_MEDIA_MOBILE_IN_APP - RICH_MEDIA_MULTI_FLOATING -
    * RICH_MEDIA_PEEL_DOWN - VPAID_LINEAR - VPAID_NON_LINEAR
    */
  var richMediaExitOverrides: js.UndefOr[js.Array[SchemaRichMediaExitOverride]] = js.native
  /**
    * Sequence number of the creative assignment, applicable when the rotation
    * type is CREATIVE_ROTATION_TYPE_SEQUENTIAL. Acceptable values are 1 to
    * 65535, inclusive.
    */
  var sequence: js.UndefOr[Double] = js.native
  /**
    * Whether the creative to be assigned is SSL-compliant. This is a read-only
    * field that is auto-generated when the ad is inserted or updated.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Date and time that the assigned creative should start serving.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Weight of the creative assignment, applicable when the rotation type is
    * CREATIVE_ROTATION_TYPE_RANDOM. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaCreativeAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    applyEventTags: js.UndefOr[Boolean] = js.undefined,
    clickThroughUrl: SchemaClickThroughUrl = null,
    companionCreativeOverrides: js.Array[SchemaCompanionClickThroughOverride] = null,
    creativeGroupAssignments: js.Array[SchemaCreativeGroupAssignment] = null,
    creativeId: String = null,
    creativeIdDimensionValue: SchemaDimensionValue = null,
    endTime: String = null,
    richMediaExitOverrides: js.Array[SchemaRichMediaExitOverride] = null,
    sequence: js.UndefOr[Double] = js.undefined,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null,
    weight: js.UndefOr[Double] = js.undefined
  ): SchemaCreativeAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(applyEventTags)) __obj.updateDynamic("applyEventTags")(applyEventTags.get.asInstanceOf[js.Any])
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (companionCreativeOverrides != null) __obj.updateDynamic("companionCreativeOverrides")(companionCreativeOverrides.asInstanceOf[js.Any])
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (creativeIdDimensionValue != null) __obj.updateDynamic("creativeIdDimensionValue")(creativeIdDimensionValue.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (richMediaExitOverrides != null) __obj.updateDynamic("richMediaExitOverrides")(richMediaExitOverrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeAssignment]
  }
}

