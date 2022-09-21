package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFloodlightActivity extends StObject {
  
  /**
    * Account ID of this floodlight activity. This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's advertiser or the existing activity's advertiser.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether the activity is enabled for attribution.
    */
  var attributionEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Code type used for cache busting in the generated tag. Applicable only when floodlightActivityGroupType is COUNTER and countingMethod is STANDARD_COUNTING or UNIQUE_COUNTING.
    */
  var cacheBustingType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Counting method for conversions for this floodlight activity. This is a required field.
    */
  var countingMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dynamic floodlight tags.
    */
  var defaultTags: js.UndefOr[js.Array[SchemaFloodlightActivityDynamicTag]] = js.undefined
  
  /**
    * URL where this tag will be deployed. If specified, must be less than 256 characters long.
    */
  var expectedUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floodlight activity group ID of this floodlight activity. This is a required field.
    */
  var floodlightActivityGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the associated floodlight activity group. This is a read-only field.
    */
  var floodlightActivityGroupName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag string of the associated floodlight activity group. This is a read-only field.
    */
  var floodlightActivityGroupTagString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the associated floodlight activity group. This is a read-only field.
    */
  var floodlightActivityGroupType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's floodlight configuration or from the existing activity's floodlight configuration.
    */
  var floodlightConfigurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * The type of Floodlight tag this activity will generate. This is a required field.
    */
  var floodlightTagType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this floodlight activity. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivity".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this floodlight activity. This is a required field. Must be less than 129 characters long and cannot contain quotes.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * General notes or implementation instructions for the tag.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher dynamic floodlight tags.
    */
  var publisherTags: js.UndefOr[js.Array[SchemaFloodlightActivityPublisherDynamicTag]] = js.undefined
  
  /**
    * Whether this tag should use SSL.
    */
  var secure: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected by the system from the floodlight tags.
    */
  var sslCompliant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this floodlight activity must be SSL-compliant.
    */
  var sslRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The status of the activity. This can only be set to ACTIVE or ARCHIVED_AND_DISABLED. The ARCHIVED status is no longer supported and cannot be set for Floodlight activities. The DISABLED_POLICY status indicates that a Floodlight activity is violating Google policy. Contact your account manager for more information.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this floodlight activity. This is a read-only field that can be left blank.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag format type for the floodlight activity. If left blank, the tag format will default to HTML.
    */
  var tagFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the activity. This is optional: if empty, a new tag string will be generated for you. This string must be 1 to 8 characters long, with valid characters being a-z0-9[ _ ]. This tag string must also be unique among activities of the same activity group. This field is read-only after insertion.
    */
  var tagString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in the tags. Each of these can have a user defined type. Acceptable values are U1 to U100, inclusive.
    */
  var userDefinedVariableTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFloodlightActivity {
  
  inline def apply(): SchemaFloodlightActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivity]
  }
  
  extension [Self <: SchemaFloodlightActivity](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAttributionEnabled(value: Boolean): Self = StObject.set(x, "attributionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttributionEnabledNull: Self = StObject.set(x, "attributionEnabled", null)
    
    inline def setAttributionEnabledUndefined: Self = StObject.set(x, "attributionEnabled", js.undefined)
    
    inline def setCacheBustingType(value: String): Self = StObject.set(x, "cacheBustingType", value.asInstanceOf[js.Any])
    
    inline def setCacheBustingTypeNull: Self = StObject.set(x, "cacheBustingType", null)
    
    inline def setCacheBustingTypeUndefined: Self = StObject.set(x, "cacheBustingType", js.undefined)
    
    inline def setCountingMethod(value: String): Self = StObject.set(x, "countingMethod", value.asInstanceOf[js.Any])
    
    inline def setCountingMethodNull: Self = StObject.set(x, "countingMethod", null)
    
    inline def setCountingMethodUndefined: Self = StObject.set(x, "countingMethod", js.undefined)
    
    inline def setDefaultTags(value: js.Array[SchemaFloodlightActivityDynamicTag]): Self = StObject.set(x, "defaultTags", value.asInstanceOf[js.Any])
    
    inline def setDefaultTagsUndefined: Self = StObject.set(x, "defaultTags", js.undefined)
    
    inline def setDefaultTagsVarargs(value: SchemaFloodlightActivityDynamicTag*): Self = StObject.set(x, "defaultTags", js.Array(value*))
    
    inline def setExpectedUrl(value: String): Self = StObject.set(x, "expectedUrl", value.asInstanceOf[js.Any])
    
    inline def setExpectedUrlNull: Self = StObject.set(x, "expectedUrl", null)
    
    inline def setExpectedUrlUndefined: Self = StObject.set(x, "expectedUrl", js.undefined)
    
    inline def setFloodlightActivityGroupId(value: String): Self = StObject.set(x, "floodlightActivityGroupId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupIdNull: Self = StObject.set(x, "floodlightActivityGroupId", null)
    
    inline def setFloodlightActivityGroupIdUndefined: Self = StObject.set(x, "floodlightActivityGroupId", js.undefined)
    
    inline def setFloodlightActivityGroupName(value: String): Self = StObject.set(x, "floodlightActivityGroupName", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupNameNull: Self = StObject.set(x, "floodlightActivityGroupName", null)
    
    inline def setFloodlightActivityGroupNameUndefined: Self = StObject.set(x, "floodlightActivityGroupName", js.undefined)
    
    inline def setFloodlightActivityGroupTagString(value: String): Self = StObject.set(x, "floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupTagStringNull: Self = StObject.set(x, "floodlightActivityGroupTagString", null)
    
    inline def setFloodlightActivityGroupTagStringUndefined: Self = StObject.set(x, "floodlightActivityGroupTagString", js.undefined)
    
    inline def setFloodlightActivityGroupType(value: String): Self = StObject.set(x, "floodlightActivityGroupType", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupTypeNull: Self = StObject.set(x, "floodlightActivityGroupType", null)
    
    inline def setFloodlightActivityGroupTypeUndefined: Self = StObject.set(x, "floodlightActivityGroupType", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValueUndefined: Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", js.undefined)
    
    inline def setFloodlightConfigurationIdNull: Self = StObject.set(x, "floodlightConfigurationId", null)
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setFloodlightTagType(value: String): Self = StObject.set(x, "floodlightTagType", value.asInstanceOf[js.Any])
    
    inline def setFloodlightTagTypeNull: Self = StObject.set(x, "floodlightTagType", null)
    
    inline def setFloodlightTagTypeUndefined: Self = StObject.set(x, "floodlightTagType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPublisherTags(value: js.Array[SchemaFloodlightActivityPublisherDynamicTag]): Self = StObject.set(x, "publisherTags", value.asInstanceOf[js.Any])
    
    inline def setPublisherTagsUndefined: Self = StObject.set(x, "publisherTags", js.undefined)
    
    inline def setPublisherTagsVarargs(value: SchemaFloodlightActivityPublisherDynamicTag*): Self = StObject.set(x, "publisherTags", js.Array(value*))
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureNull: Self = StObject.set(x, "secure", null)
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantNull: Self = StObject.set(x, "sslCompliant", null)
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredNull: Self = StObject.set(x, "sslRequired", null)
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTagFormat(value: String): Self = StObject.set(x, "tagFormat", value.asInstanceOf[js.Any])
    
    inline def setTagFormatNull: Self = StObject.set(x, "tagFormat", null)
    
    inline def setTagFormatUndefined: Self = StObject.set(x, "tagFormat", js.undefined)
    
    inline def setTagString(value: String): Self = StObject.set(x, "tagString", value.asInstanceOf[js.Any])
    
    inline def setTagStringNull: Self = StObject.set(x, "tagString", null)
    
    inline def setTagStringUndefined: Self = StObject.set(x, "tagString", js.undefined)
    
    inline def setUserDefinedVariableTypes(value: js.Array[String]): Self = StObject.set(x, "userDefinedVariableTypes", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedVariableTypesNull: Self = StObject.set(x, "userDefinedVariableTypes", null)
    
    inline def setUserDefinedVariableTypesUndefined: Self = StObject.set(x, "userDefinedVariableTypes", js.undefined)
    
    inline def setUserDefinedVariableTypesVarargs(value: String*): Self = StObject.set(x, "userDefinedVariableTypes", js.Array(value*))
  }
}
