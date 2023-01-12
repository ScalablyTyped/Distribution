package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightActivity extends StObject {
  
  /** Account ID of this floodlight activity. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Advertiser ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's advertiser or the existing activity's
    * advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether the activity is enabled for attribution. */
  var attributionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Code type used for cache busting in the generated tag. Applicable only when floodlightActivityGroupType is COUNTER and countingMethod is STANDARD_COUNTING or UNIQUE_COUNTING. */
  var cacheBustingType: js.UndefOr[String] = js.undefined
  
  /** Counting method for conversions for this floodlight activity. This is a required field. */
  var countingMethod: js.UndefOr[String] = js.undefined
  
  /** Dynamic floodlight tags. */
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.undefined
  
  /** URL where this tag will be deployed. If specified, must be less than 256 characters long. */
  var expectedUrl: js.UndefOr[String] = js.undefined
  
  /** Floodlight activity group ID of this floodlight activity. This is a required field. */
  var floodlightActivityGroupId: js.UndefOr[String] = js.undefined
  
  /** Name of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupName: js.UndefOr[String] = js.undefined
  
  /** Tag string of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.undefined
  
  /** Type of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupType: js.UndefOr[String] = js.undefined
  
  /**
    * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's floodlight configuration or from
    * the existing activity's floodlight configuration.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** The type of Floodlight tag this activity will generate. This is a required field. */
  var floodlightTagType: js.UndefOr[String] = js.undefined
  
  /** ID of this floodlight activity. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivity". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this floodlight activity. This is a required field. Must be less than 129 characters long and cannot contain quotes. */
  var name: js.UndefOr[String] = js.undefined
  
  /** General notes or implementation instructions for the tag. */
  var notes: js.UndefOr[String] = js.undefined
  
  /** Publisher dynamic floodlight tags. */
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.undefined
  
  /** Whether this tag should use SSL. */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected by the system from the floodlight tags. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  
  /** Whether this floodlight activity must be SSL-compliant. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of the activity. This can only be set to ACTIVE or ARCHIVED_AND_DISABLED. The ARCHIVED status is no longer supported and cannot be set for Floodlight activities. The
    * DISABLED_POLICY status indicates that a Floodlight activity is violating Google policy. Contact your account manager for more information.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this floodlight activity. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /** Tag format type for the floodlight activity. If left blank, the tag format will default to HTML. */
  var tagFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the activity. This is optional: if empty, a new tag string will be generated for you. This
    * string must be 1 to 8 characters long, with valid characters being a-z0-9[ _ ]. This tag string must also be unique among activities of the same activity group. This field is
    * read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.undefined
  
  /**
    * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in the tags. Each of these can have a user defined type. Acceptable values are U1 to
    * U100, inclusive.
    */
  var userDefinedVariableTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object FloodlightActivity {
  
  inline def apply(): FloodlightActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloodlightActivity] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAttributionEnabled(value: Boolean): Self = StObject.set(x, "attributionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttributionEnabledUndefined: Self = StObject.set(x, "attributionEnabled", js.undefined)
    
    inline def setCacheBustingType(value: String): Self = StObject.set(x, "cacheBustingType", value.asInstanceOf[js.Any])
    
    inline def setCacheBustingTypeUndefined: Self = StObject.set(x, "cacheBustingType", js.undefined)
    
    inline def setCountingMethod(value: String): Self = StObject.set(x, "countingMethod", value.asInstanceOf[js.Any])
    
    inline def setCountingMethodUndefined: Self = StObject.set(x, "countingMethod", js.undefined)
    
    inline def setDefaultTags(value: js.Array[FloodlightActivityDynamicTag]): Self = StObject.set(x, "defaultTags", value.asInstanceOf[js.Any])
    
    inline def setDefaultTagsUndefined: Self = StObject.set(x, "defaultTags", js.undefined)
    
    inline def setDefaultTagsVarargs(value: FloodlightActivityDynamicTag*): Self = StObject.set(x, "defaultTags", js.Array(value*))
    
    inline def setExpectedUrl(value: String): Self = StObject.set(x, "expectedUrl", value.asInstanceOf[js.Any])
    
    inline def setExpectedUrlUndefined: Self = StObject.set(x, "expectedUrl", js.undefined)
    
    inline def setFloodlightActivityGroupId(value: String): Self = StObject.set(x, "floodlightActivityGroupId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupIdUndefined: Self = StObject.set(x, "floodlightActivityGroupId", js.undefined)
    
    inline def setFloodlightActivityGroupName(value: String): Self = StObject.set(x, "floodlightActivityGroupName", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupNameUndefined: Self = StObject.set(x, "floodlightActivityGroupName", js.undefined)
    
    inline def setFloodlightActivityGroupTagString(value: String): Self = StObject.set(x, "floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupTagStringUndefined: Self = StObject.set(x, "floodlightActivityGroupTagString", js.undefined)
    
    inline def setFloodlightActivityGroupType(value: String): Self = StObject.set(x, "floodlightActivityGroupType", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupTypeUndefined: Self = StObject.set(x, "floodlightActivityGroupType", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValueUndefined: Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", js.undefined)
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setFloodlightTagType(value: String): Self = StObject.set(x, "floodlightTagType", value.asInstanceOf[js.Any])
    
    inline def setFloodlightTagTypeUndefined: Self = StObject.set(x, "floodlightTagType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPublisherTags(value: js.Array[FloodlightActivityPublisherDynamicTag]): Self = StObject.set(x, "publisherTags", value.asInstanceOf[js.Any])
    
    inline def setPublisherTagsUndefined: Self = StObject.set(x, "publisherTags", js.undefined)
    
    inline def setPublisherTagsVarargs(value: FloodlightActivityPublisherDynamicTag*): Self = StObject.set(x, "publisherTags", js.Array(value*))
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTagFormat(value: String): Self = StObject.set(x, "tagFormat", value.asInstanceOf[js.Any])
    
    inline def setTagFormatUndefined: Self = StObject.set(x, "tagFormat", js.undefined)
    
    inline def setTagString(value: String): Self = StObject.set(x, "tagString", value.asInstanceOf[js.Any])
    
    inline def setTagStringUndefined: Self = StObject.set(x, "tagString", js.undefined)
    
    inline def setUserDefinedVariableTypes(value: js.Array[String]): Self = StObject.set(x, "userDefinedVariableTypes", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedVariableTypesUndefined: Self = StObject.set(x, "userDefinedVariableTypes", js.undefined)
    
    inline def setUserDefinedVariableTypesVarargs(value: String*): Self = StObject.set(x, "userDefinedVariableTypes", js.Array(value*))
  }
}
