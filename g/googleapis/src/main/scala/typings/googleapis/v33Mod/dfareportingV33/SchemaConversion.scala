package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Conversion represents when a user successfully performs a desired action
  * after seeing an ad.
  */
@js.native
trait SchemaConversion extends js.Object {
  /**
    * Whether this particular request may come from a user under the age of 13,
    * under COPPA compliance.
    */
  var childDirectedTreatment: js.UndefOr[Boolean] = js.native
  /**
    * Custom floodlight variables.
    */
  var customVariables: js.UndefOr[js.Array[SchemaCustomFloodlightVariable]] = js.native
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also
    * be specified. This field is mutually exclusive with
    * encryptedUserIdCandidates[], mobileDeviceId and gclid. This or
    * encryptedUserIdCandidates[] or mobileDeviceId or gclid is a required
    * field.
    */
  var encryptedUserId: js.UndefOr[String] = js.native
  /**
    * A list of the alphanumeric encrypted user IDs. Any user ID with exposure
    * prior to the conversion timestamp will be used in the inserted
    * conversion. If no such user ID is found then the conversion will be
    * rejected with NO_COOKIE_MATCH_FOUND error. When set, encryptionInfo
    * should also be specified. This field may only be used when calling
    * batchinsert; it is not supported by batchupdate. This field is mutually
    * exclusive with encryptedUserId, mobileDeviceId and gclid. This or
    * encryptedUserId or mobileDeviceId or gclid is a required field.
    */
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.native
  /**
    * Floodlight Activity ID of this conversion. This is a required field.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /**
    * Floodlight Configuration ID of this conversion. This is a required field.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * The Google click ID. This field is mutually exclusive with
    * encryptedUserId, encryptedUserIdCandidates[] and mobileDeviceId. This or
    * encryptedUserId or encryptedUserIdCandidates[] or mobileDeviceId is a
    * required field.
    */
  var gclid: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversion&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether Limit Ad Tracking is enabled. When set to true, the conversion
    * will be used for reporting but not targeting. This will prevent
    * remarketing.
    */
  var limitAdTracking: js.UndefOr[Boolean] = js.native
  /**
    * The mobile device ID. This field is mutually exclusive with
    * encryptedUserId, encryptedUserIdCandidates[] and gclid. This or
    * encryptedUserId or encryptedUserIdCandidates[] or gclid is a required
    * field.
    */
  var mobileDeviceId: js.UndefOr[String] = js.native
  /**
    * Whether the conversion was for a non personalized ad.
    */
  var nonPersonalizedAd: js.UndefOr[Boolean] = js.native
  /**
    * The ordinal of the conversion. Use this field to control how conversions
    * of the same user and day are de-duplicated. This is a required field.
    */
  var ordinal: js.UndefOr[String] = js.native
  /**
    * The quantity of the conversion.
    */
  var quantity: js.UndefOr[String] = js.native
  /**
    * The timestamp of conversion, in Unix epoch micros. This is a required
    * field.
    */
  var timestampMicros: js.UndefOr[String] = js.native
  /**
    * Whether this particular request may come from a user under the age of 16
    * (may differ by country), under compliance with the European Union&#39;s
    * General Data Protection Regulation (GDPR).
    */
  var treatmentForUnderage: js.UndefOr[Boolean] = js.native
  /**
    * The value of the conversion.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaConversion {
  @scala.inline
  def apply(
    childDirectedTreatment: js.UndefOr[Boolean] = js.undefined,
    customVariables: js.Array[SchemaCustomFloodlightVariable] = null,
    encryptedUserId: String = null,
    encryptedUserIdCandidates: js.Array[String] = null,
    floodlightActivityId: String = null,
    floodlightConfigurationId: String = null,
    gclid: String = null,
    kind: String = null,
    limitAdTracking: js.UndefOr[Boolean] = js.undefined,
    mobileDeviceId: String = null,
    nonPersonalizedAd: js.UndefOr[Boolean] = js.undefined,
    ordinal: String = null,
    quantity: String = null,
    timestampMicros: String = null,
    treatmentForUnderage: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): SchemaConversion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childDirectedTreatment)) __obj.updateDynamic("childDirectedTreatment")(childDirectedTreatment.get.asInstanceOf[js.Any])
    if (customVariables != null) __obj.updateDynamic("customVariables")(customVariables.asInstanceOf[js.Any])
    if (encryptedUserId != null) __obj.updateDynamic("encryptedUserId")(encryptedUserId.asInstanceOf[js.Any])
    if (encryptedUserIdCandidates != null) __obj.updateDynamic("encryptedUserIdCandidates")(encryptedUserIdCandidates.asInstanceOf[js.Any])
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (gclid != null) __obj.updateDynamic("gclid")(gclid.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(limitAdTracking)) __obj.updateDynamic("limitAdTracking")(limitAdTracking.get.asInstanceOf[js.Any])
    if (mobileDeviceId != null) __obj.updateDynamic("mobileDeviceId")(mobileDeviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersonalizedAd)) __obj.updateDynamic("nonPersonalizedAd")(nonPersonalizedAd.get.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (timestampMicros != null) __obj.updateDynamic("timestampMicros")(timestampMicros.asInstanceOf[js.Any])
    if (!js.isUndefined(treatmentForUnderage)) __obj.updateDynamic("treatmentForUnderage")(treatmentForUnderage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversion]
  }
}

