package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConversion extends StObject {
  
  /**
    * Whether this particular request may come from a user under the age of 13, under COPPA compliance.
    */
  var childDirectedTreatment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Custom floodlight variables. This field may only be used when calling batchinsert; it is not supported by batchupdate.
    */
  var customVariables: js.UndefOr[js.Array[SchemaCustomFloodlightVariable]] = js.undefined
  
  /**
    * The display click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId, gclid, and impressionId. This or encryptedUserId or encryptedUserIdCandidates[] or matchId or mobileDeviceId or gclid or impressionId is a required field.
    */
  var dclid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also be specified. This field is mutually exclusive with encryptedUserIdCandidates[], matchId, mobileDeviceId, gclid, dclid, and impressionId. This or encryptedUserIdCandidates[] or matchId or mobileDeviceId or gclid or dclid or impressionId is a required field.
    */
  var encryptedUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the alphanumeric encrypted user IDs. Any user ID with exposure prior to the conversion timestamp will be used in the inserted conversion. If no such user ID is found then the conversion will be rejected with INVALID_ARGUMENT error. When set, encryptionInfo should also be specified. This field may only be used when calling batchinsert; it is not supported by batchupdate. This field is mutually exclusive with encryptedUserId, matchId, mobileDeviceId, gclid dclid, and impressionId. This or encryptedUserId or matchId or mobileDeviceId or gclid or dclid or impressionId is a required field.
    */
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Floodlight Activity ID of this conversion. This is a required field.
    */
  var floodlightActivityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floodlight Configuration ID of this conversion. This is a required field.
    */
  var floodlightConfigurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId, dclid, and impressionId. This or encryptedUserId or encryptedUserIdCandidates[] or matchId or mobileDeviceId or dclid or impressionId is a required field.
    */
  var gclid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The impression ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId, and gclid. One of these identifiers must be set.
    */
  var impressionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversion".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether Limit Ad Tracking is enabled. When set to true, the conversion will be used for reporting but not targeting. This will prevent remarketing.
    */
  var limitAdTracking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The match ID field. A match ID is your own first-party identifier that has been synced with Google using the match ID feature in Floodlight. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[],mobileDeviceId, gclid, dclid, and impressionId. This or encryptedUserId orencryptedUserIdCandidates[] or mobileDeviceId or gclid or dclid or impressionIdis a required field.
    */
  var matchId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mobile device ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, gclid, dclid, and impressionId. This or encryptedUserId or encryptedUserIdCandidates[] or matchId or gclid or dclid or impressionId is a required field.
    */
  var mobileDeviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the conversion was for a non personalized ad.
    */
  var nonPersonalizedAd: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The ordinal of the conversion. Use this field to control how conversions of the same user and day are de-duplicated. This is a required field.
    */
  var ordinal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quantity of the conversion.
    */
  var quantity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp of conversion, in Unix epoch micros. This is a required field.
    */
  var timestampMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this particular request may come from a user under the age of 16 (may differ by country), under compliance with the European Union's General Data Protection Regulation (GDPR).
    */
  var treatmentForUnderage: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value of the conversion.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaConversion {
  
  inline def apply(): SchemaConversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversion]
  }
  
  extension [Self <: SchemaConversion](x: Self) {
    
    inline def setChildDirectedTreatment(value: Boolean): Self = StObject.set(x, "childDirectedTreatment", value.asInstanceOf[js.Any])
    
    inline def setChildDirectedTreatmentNull: Self = StObject.set(x, "childDirectedTreatment", null)
    
    inline def setChildDirectedTreatmentUndefined: Self = StObject.set(x, "childDirectedTreatment", js.undefined)
    
    inline def setCustomVariables(value: js.Array[SchemaCustomFloodlightVariable]): Self = StObject.set(x, "customVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomVariablesUndefined: Self = StObject.set(x, "customVariables", js.undefined)
    
    inline def setCustomVariablesVarargs(value: SchemaCustomFloodlightVariable*): Self = StObject.set(x, "customVariables", js.Array(value*))
    
    inline def setDclid(value: String): Self = StObject.set(x, "dclid", value.asInstanceOf[js.Any])
    
    inline def setDclidNull: Self = StObject.set(x, "dclid", null)
    
    inline def setDclidUndefined: Self = StObject.set(x, "dclid", js.undefined)
    
    inline def setEncryptedUserId(value: String): Self = StObject.set(x, "encryptedUserId", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUserIdCandidates(value: js.Array[String]): Self = StObject.set(x, "encryptedUserIdCandidates", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUserIdCandidatesNull: Self = StObject.set(x, "encryptedUserIdCandidates", null)
    
    inline def setEncryptedUserIdCandidatesUndefined: Self = StObject.set(x, "encryptedUserIdCandidates", js.undefined)
    
    inline def setEncryptedUserIdCandidatesVarargs(value: String*): Self = StObject.set(x, "encryptedUserIdCandidates", js.Array(value*))
    
    inline def setEncryptedUserIdNull: Self = StObject.set(x, "encryptedUserId", null)
    
    inline def setEncryptedUserIdUndefined: Self = StObject.set(x, "encryptedUserId", js.undefined)
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdNull: Self = StObject.set(x, "floodlightActivityId", null)
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdNull: Self = StObject.set(x, "floodlightConfigurationId", null)
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    inline def setGclidNull: Self = StObject.set(x, "gclid", null)
    
    inline def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
    inline def setImpressionId(value: String): Self = StObject.set(x, "impressionId", value.asInstanceOf[js.Any])
    
    inline def setImpressionIdNull: Self = StObject.set(x, "impressionId", null)
    
    inline def setImpressionIdUndefined: Self = StObject.set(x, "impressionId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLimitAdTracking(value: Boolean): Self = StObject.set(x, "limitAdTracking", value.asInstanceOf[js.Any])
    
    inline def setLimitAdTrackingNull: Self = StObject.set(x, "limitAdTracking", null)
    
    inline def setLimitAdTrackingUndefined: Self = StObject.set(x, "limitAdTracking", js.undefined)
    
    inline def setMatchId(value: String): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
    
    inline def setMatchIdNull: Self = StObject.set(x, "matchId", null)
    
    inline def setMatchIdUndefined: Self = StObject.set(x, "matchId", js.undefined)
    
    inline def setMobileDeviceId(value: String): Self = StObject.set(x, "mobileDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceIdNull: Self = StObject.set(x, "mobileDeviceId", null)
    
    inline def setMobileDeviceIdUndefined: Self = StObject.set(x, "mobileDeviceId", js.undefined)
    
    inline def setNonPersonalizedAd(value: Boolean): Self = StObject.set(x, "nonPersonalizedAd", value.asInstanceOf[js.Any])
    
    inline def setNonPersonalizedAdNull: Self = StObject.set(x, "nonPersonalizedAd", null)
    
    inline def setNonPersonalizedAdUndefined: Self = StObject.set(x, "nonPersonalizedAd", js.undefined)
    
    inline def setOrdinal(value: String): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalNull: Self = StObject.set(x, "ordinal", null)
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setTimestampMicros(value: String): Self = StObject.set(x, "timestampMicros", value.asInstanceOf[js.Any])
    
    inline def setTimestampMicrosNull: Self = StObject.set(x, "timestampMicros", null)
    
    inline def setTimestampMicrosUndefined: Self = StObject.set(x, "timestampMicros", js.undefined)
    
    inline def setTreatmentForUnderage(value: Boolean): Self = StObject.set(x, "treatmentForUnderage", value.asInstanceOf[js.Any])
    
    inline def setTreatmentForUnderageNull: Self = StObject.set(x, "treatmentForUnderage", null)
    
    inline def setTreatmentForUnderageUndefined: Self = StObject.set(x, "treatmentForUnderage", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
