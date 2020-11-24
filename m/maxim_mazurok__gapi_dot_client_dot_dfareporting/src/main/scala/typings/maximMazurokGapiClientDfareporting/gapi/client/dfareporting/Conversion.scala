package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conversion extends js.Object {
  
  /** Whether this particular request may come from a user under the age of 13, under COPPA compliance. */
  var childDirectedTreatment: js.UndefOr[Boolean] = js.native
  
  /** Custom floodlight variables. */
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.native
  
  /**
    * The display click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId and gclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or matchId or mobileDeviceId or gclid is a required field.
    */
  var dclid: js.UndefOr[String] = js.native
  
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also be specified. This field is mutually exclusive with encryptedUserIdCandidates[], matchId, mobileDeviceId,
    * gclid and dclid. This or encryptedUserIdCandidates[] or matchId or mobileDeviceId or gclid or dclid is a required field.
    */
  var encryptedUserId: js.UndefOr[String] = js.native
  
  /**
    * A list of the alphanumeric encrypted user IDs. Any user ID with exposure prior to the conversion timestamp will be used in the inserted conversion. If no such user ID is found then
    * the conversion will be rejected with INVALID_ARGUMENT error. When set, encryptionInfo should also be specified. This field may only be used when calling batchinsert; it is not
    * supported by batchupdate. This field is mutually exclusive with encryptedUserId, matchId, mobileDeviceId, gclid and dclid. This or encryptedUserId or matchId or mobileDeviceId or
    * gclid or dclid is a required field.
    */
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.native
  
  /** Floodlight Activity ID of this conversion. This is a required field. */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /** Floodlight Configuration ID of this conversion. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * The Google click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, mobileDeviceId and dclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or matchId or mobileDeviceId or dclid is a required field.
    */
  var gclid: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversion". */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether Limit Ad Tracking is enabled. When set to true, the conversion will be used for reporting but not targeting. This will prevent remarketing. */
  var limitAdTracking: js.UndefOr[Boolean] = js.native
  
  /**
    * The match ID field. A match ID is your own first-party identifier that has been synced with Google using the match ID feature in Floodlight. This field is mutually exclusive with
    * encryptedUserId, encryptedUserIdCandidates[],mobileDeviceId, gclid and dclid. This or encryptedUserId or encryptedUserIdCandidates[] or mobileDeviceId or gclid or dclid is a
    * required field.
    */
  var matchId: js.UndefOr[String] = js.native
  
  /**
    * The mobile device ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[], matchId, gclid and dclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or matchId or gclid or dclid is a required field.
    */
  var mobileDeviceId: js.UndefOr[String] = js.native
  
  /** Whether the conversion was for a non personalized ad. */
  var nonPersonalizedAd: js.UndefOr[Boolean] = js.native
  
  /** The ordinal of the conversion. Use this field to control how conversions of the same user and day are de-duplicated. This is a required field. */
  var ordinal: js.UndefOr[String] = js.native
  
  /** The quantity of the conversion. */
  var quantity: js.UndefOr[String] = js.native
  
  /** The timestamp of conversion, in Unix epoch micros. This is a required field. */
  var timestampMicros: js.UndefOr[String] = js.native
  
  /**
    * Whether this particular request may come from a user under the age of 16 (may differ by country), under compliance with the European Union's General Data Protection Regulation
    * (GDPR).
    */
  var treatmentForUnderage: js.UndefOr[Boolean] = js.native
  
  /** The value of the conversion. */
  var value: js.UndefOr[Double] = js.native
}
object Conversion {
  
  @scala.inline
  def apply(): Conversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversion]
  }
  
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildDirectedTreatment(value: Boolean): Self = this.set("childDirectedTreatment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildDirectedTreatment: Self = this.set("childDirectedTreatment", js.undefined)
    
    @scala.inline
    def setCustomVariablesVarargs(value: CustomFloodlightVariable*): Self = this.set("customVariables", js.Array(value :_*))
    
    @scala.inline
    def setCustomVariables(value: js.Array[CustomFloodlightVariable]): Self = this.set("customVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomVariables: Self = this.set("customVariables", js.undefined)
    
    @scala.inline
    def setDclid(value: String): Self = this.set("dclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDclid: Self = this.set("dclid", js.undefined)
    
    @scala.inline
    def setEncryptedUserId(value: String): Self = this.set("encryptedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedUserId: Self = this.set("encryptedUserId", js.undefined)
    
    @scala.inline
    def setEncryptedUserIdCandidatesVarargs(value: String*): Self = this.set("encryptedUserIdCandidates", js.Array(value :_*))
    
    @scala.inline
    def setEncryptedUserIdCandidates(value: js.Array[String]): Self = this.set("encryptedUserIdCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedUserIdCandidates: Self = this.set("encryptedUserIdCandidates", js.undefined)
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setGclid(value: String): Self = this.set("gclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGclid: Self = this.set("gclid", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLimitAdTracking(value: Boolean): Self = this.set("limitAdTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitAdTracking: Self = this.set("limitAdTracking", js.undefined)
    
    @scala.inline
    def setMatchId(value: String): Self = this.set("matchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchId: Self = this.set("matchId", js.undefined)
    
    @scala.inline
    def setMobileDeviceId(value: String): Self = this.set("mobileDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceId: Self = this.set("mobileDeviceId", js.undefined)
    
    @scala.inline
    def setNonPersonalizedAd(value: Boolean): Self = this.set("nonPersonalizedAd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonPersonalizedAd: Self = this.set("nonPersonalizedAd", js.undefined)
    
    @scala.inline
    def setOrdinal(value: String): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setTimestampMicros(value: String): Self = this.set("timestampMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampMicros: Self = this.set("timestampMicros", js.undefined)
    
    @scala.inline
    def setTreatmentForUnderage(value: Boolean): Self = this.set("treatmentForUnderage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatmentForUnderage: Self = this.set("treatmentForUnderage", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
