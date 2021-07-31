package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversion extends StObject {
  
  /** Whether this particular request may come from a user under the age of 13, under COPPA compliance. */
  var childDirectedTreatment: js.UndefOr[Boolean] = js.undefined
  
  /** Custom floodlight variables. */
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.undefined
  
  /**
    * The display click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId and gclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or matchId or mobileDeviceId or gclid is a required field.
    */
  var dclid: js.UndefOr[String] = js.undefined
  
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also be specified. This field is mutually exclusive with encryptedUserIdCandidates[], matchId, mobileDeviceId,
    * gclid and dclid. This or encryptedUserIdCandidates[] or matchId or mobileDeviceId or gclid or dclid is a required field.
    */
  var encryptedUserId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the alphanumeric encrypted user IDs. Any user ID with exposure prior to the conversion timestamp will be used in the inserted conversion. If no such user ID is found then
    * the conversion will be rejected with INVALID_ARGUMENT error. When set, encryptionInfo should also be specified. This field may only be used when calling batchinsert; it is not
    * supported by batchupdate. This field is mutually exclusive with encryptedUserId, matchId, mobileDeviceId, gclid and dclid. This or encryptedUserId or matchId or mobileDeviceId or
    * gclid or dclid is a required field.
    */
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Floodlight Activity ID of this conversion. This is a required field. */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  
  /** Floodlight Configuration ID of this conversion. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  
  /**
    * The Google click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId and dclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or matchId or mobileDeviceId or dclid is a required field.
    */
  var gclid: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversion". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether Limit Ad Tracking is enabled. When set to true, the conversion will be used for reporting but not targeting. This will prevent remarketing. */
  var limitAdTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The match ID field. A match ID is your own first-party identifier that has been synced with Google using the match ID feature in Floodlight. This field is mutually exclusive with
    * encryptedUserId, encryptedUserIdCandidates[],mobileDeviceId, gclid and dclid. This or encryptedUserId or encryptedUserIdCandidates[] or mobileDeviceId or gclid or dclid is a
    * required field.
    */
  var matchId: js.UndefOr[String] = js.undefined
  
  /**
    * The mobile device ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, gclid and dclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or matchId or gclid or dclid is a required field.
    */
  var mobileDeviceId: js.UndefOr[String] = js.undefined
  
  /** Whether the conversion was for a non personalized ad. */
  var nonPersonalizedAd: js.UndefOr[Boolean] = js.undefined
  
  /** The ordinal of the conversion. Use this field to control how conversions of the same user and day are de-duplicated. This is a required field. */
  var ordinal: js.UndefOr[String] = js.undefined
  
  /** The quantity of the conversion. */
  var quantity: js.UndefOr[String] = js.undefined
  
  /** The timestamp of conversion, in Unix epoch micros. This is a required field. */
  var timestampMicros: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this particular request may come from a user under the age of 16 (may differ by country), under compliance with the European Union's General Data Protection Regulation
    * (GDPR).
    */
  var treatmentForUnderage: js.UndefOr[Boolean] = js.undefined
  
  /** The value of the conversion. */
  var value: js.UndefOr[Double] = js.undefined
}
object Conversion {
  
  @scala.inline
  def apply(): Conversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversion]
  }
  
  @scala.inline
  implicit class ConversionMutableBuilder[Self <: Conversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildDirectedTreatment(value: Boolean): Self = StObject.set(x, "childDirectedTreatment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDirectedTreatmentUndefined: Self = StObject.set(x, "childDirectedTreatment", js.undefined)
    
    @scala.inline
    def setCustomVariables(value: js.Array[CustomFloodlightVariable]): Self = StObject.set(x, "customVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomVariablesUndefined: Self = StObject.set(x, "customVariables", js.undefined)
    
    @scala.inline
    def setCustomVariablesVarargs(value: CustomFloodlightVariable*): Self = StObject.set(x, "customVariables", js.Array(value :_*))
    
    @scala.inline
    def setDclid(value: String): Self = StObject.set(x, "dclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDclidUndefined: Self = StObject.set(x, "dclid", js.undefined)
    
    @scala.inline
    def setEncryptedUserId(value: String): Self = StObject.set(x, "encryptedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUserIdCandidates(value: js.Array[String]): Self = StObject.set(x, "encryptedUserIdCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUserIdCandidatesUndefined: Self = StObject.set(x, "encryptedUserIdCandidates", js.undefined)
    
    @scala.inline
    def setEncryptedUserIdCandidatesVarargs(value: String*): Self = StObject.set(x, "encryptedUserIdCandidates", js.Array(value :_*))
    
    @scala.inline
    def setEncryptedUserIdUndefined: Self = StObject.set(x, "encryptedUserId", js.undefined)
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLimitAdTracking(value: Boolean): Self = StObject.set(x, "limitAdTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitAdTrackingUndefined: Self = StObject.set(x, "limitAdTracking", js.undefined)
    
    @scala.inline
    def setMatchId(value: String): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchIdUndefined: Self = StObject.set(x, "matchId", js.undefined)
    
    @scala.inline
    def setMobileDeviceId(value: String): Self = StObject.set(x, "mobileDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileDeviceIdUndefined: Self = StObject.set(x, "mobileDeviceId", js.undefined)
    
    @scala.inline
    def setNonPersonalizedAd(value: Boolean): Self = StObject.set(x, "nonPersonalizedAd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonPersonalizedAdUndefined: Self = StObject.set(x, "nonPersonalizedAd", js.undefined)
    
    @scala.inline
    def setOrdinal(value: String): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setTimestampMicros(value: String): Self = StObject.set(x, "timestampMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMicrosUndefined: Self = StObject.set(x, "timestampMicros", js.undefined)
    
    @scala.inline
    def setTreatmentForUnderage(value: Boolean): Self = StObject.set(x, "treatmentForUnderage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentForUnderageUndefined: Self = StObject.set(x, "treatmentForUnderage", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
