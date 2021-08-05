package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Conversion represents when a user successfully performs a desired action
  * after seeing an ad.
  */
trait SchemaConversion extends StObject {
  
  /**
    * Whether the conversion was directed toward children.
    */
  var childDirectedTreatment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom floodlight variables.
    */
  var customVariables: js.UndefOr[js.Array[SchemaCustomFloodlightVariable]] = js.undefined
  
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also
    * be specified. This field is mutually exclusive with
    * encryptedUserIdCandidates[], mobileDeviceId and gclid. This or
    * encryptedUserIdCandidates[] or mobileDeviceId or gclid is a required
    * field.
    */
  var encryptedUserId: js.UndefOr[String] = js.undefined
  
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
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Floodlight Activity ID of this conversion. This is a required field.
    */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  
  /**
    * Floodlight Configuration ID of this conversion. This is a required field.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  
  /**
    * The Google click ID. This field is mutually exclusive with
    * encryptedUserId, encryptedUserIdCandidates[] and mobileDeviceId. This or
    * encryptedUserId or encryptedUserIdCandidates[] or mobileDeviceId is a
    * required field.
    */
  var gclid: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversion&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Whether Limit Ad Tracking is enabled. When set to true, the conversion
    * will be used for reporting but not targeting. This will prevent
    * remarketing.
    */
  var limitAdTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The mobile device ID. This field is mutually exclusive with
    * encryptedUserId, encryptedUserIdCandidates[] and gclid. This or
    * encryptedUserId or encryptedUserIdCandidates[] or gclid is a required
    * field.
    */
  var mobileDeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ordinal of the conversion. Use this field to control how conversions
    * of the same user and day are de-duplicated. This is a required field.
    */
  var ordinal: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of the conversion.
    */
  var quantity: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of conversion, in Unix epoch micros. This is a required
    * field.
    */
  var timestampMicros: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the conversion.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SchemaConversion {
  
  inline def apply(): SchemaConversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversion]
  }
  
  extension [Self <: SchemaConversion](x: Self) {
    
    inline def setChildDirectedTreatment(value: Boolean): Self = StObject.set(x, "childDirectedTreatment", value.asInstanceOf[js.Any])
    
    inline def setChildDirectedTreatmentUndefined: Self = StObject.set(x, "childDirectedTreatment", js.undefined)
    
    inline def setCustomVariables(value: js.Array[SchemaCustomFloodlightVariable]): Self = StObject.set(x, "customVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomVariablesUndefined: Self = StObject.set(x, "customVariables", js.undefined)
    
    inline def setCustomVariablesVarargs(value: SchemaCustomFloodlightVariable*): Self = StObject.set(x, "customVariables", js.Array(value :_*))
    
    inline def setEncryptedUserId(value: String): Self = StObject.set(x, "encryptedUserId", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUserIdCandidates(value: js.Array[String]): Self = StObject.set(x, "encryptedUserIdCandidates", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUserIdCandidatesUndefined: Self = StObject.set(x, "encryptedUserIdCandidates", js.undefined)
    
    inline def setEncryptedUserIdCandidatesVarargs(value: String*): Self = StObject.set(x, "encryptedUserIdCandidates", js.Array(value :_*))
    
    inline def setEncryptedUserIdUndefined: Self = StObject.set(x, "encryptedUserId", js.undefined)
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    inline def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLimitAdTracking(value: Boolean): Self = StObject.set(x, "limitAdTracking", value.asInstanceOf[js.Any])
    
    inline def setLimitAdTrackingUndefined: Self = StObject.set(x, "limitAdTracking", js.undefined)
    
    inline def setMobileDeviceId(value: String): Self = StObject.set(x, "mobileDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceIdUndefined: Self = StObject.set(x, "mobileDeviceId", js.undefined)
    
    inline def setOrdinal(value: String): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setTimestampMicros(value: String): Self = StObject.set(x, "timestampMicros", value.asInstanceOf[js.Any])
    
    inline def setTimestampMicrosUndefined: Self = StObject.set(x, "timestampMicros", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
