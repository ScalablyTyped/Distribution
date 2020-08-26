package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Floodlight activity.
  */
@js.native
trait SchemaFloodlightActivity extends js.Object {
  /**
    * Account ID of this floodlight activity. This is a read-only field that
    * can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this floodlight activity. If this field is left blank,
    * the value will be copied over either from the activity group&#39;s
    * advertiser or the existing activity&#39;s advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Code type used for cache busting in the generated tag. Applicable only
    * when floodlightActivityGroupType is COUNTER and countingMethod is
    * STANDARD_COUNTING or UNIQUE_COUNTING.
    */
  var cacheBustingType: js.UndefOr[String] = js.native
  /**
    * Counting method for conversions for this floodlight activity. This is a
    * required field.
    */
  var countingMethod: js.UndefOr[String] = js.native
  /**
    * Dynamic floodlight tags.
    */
  var defaultTags: js.UndefOr[js.Array[SchemaFloodlightActivityDynamicTag]] = js.native
  /**
    * URL where this tag will be deployed. If specified, must be less than 256
    * characters long.
    */
  var expectedUrl: js.UndefOr[String] = js.native
  /**
    * Floodlight activity group ID of this floodlight activity. This is a
    * required field.
    */
  var floodlightActivityGroupId: js.UndefOr[String] = js.native
  /**
    * Name of the associated floodlight activity group. This is a read-only
    * field.
    */
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  /**
    * Tag string of the associated floodlight activity group. This is a
    * read-only field.
    */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  /**
    * Type of the associated floodlight activity group. This is a read-only
    * field.
    */
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  /**
    * Floodlight configuration ID of this floodlight activity. If this field is
    * left blank, the value will be copied over either from the activity
    * group&#39;s floodlight configuration or from the existing activity&#39;s
    * floodlight configuration.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * The type of Floodlight tag this activity will generate. This is a
    * required field.
    */
  var floodlightTagType: js.UndefOr[String] = js.native
  /**
    * Whether this activity is archived.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * ID of this floodlight activity. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this floodlight activity. This is a
    * read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivity&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this floodlight activity. This is a required field. Must be less
    * than 129 characters long and cannot contain quotes.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * General notes or implementation instructions for the tag.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Publisher dynamic floodlight tags.
    */
  var publisherTags: js.UndefOr[js.Array[SchemaFloodlightActivityPublisherDynamicTag]] = js.native
  /**
    * Whether this tag should use SSL.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Whether the floodlight activity is SSL-compliant. This is a read-only
    * field, its value detected by the system from the floodlight tags.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Whether this floodlight activity must be SSL-compliant.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  /**
    * Subaccount ID of this floodlight activity. This is a read-only field that
    * can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Tag format type for the floodlight activity. If left blank, the tag
    * format will default to HTML.
    */
  var tagFormat: js.UndefOr[String] = js.native
  /**
    * Value of the cat= parameter in the floodlight tag, which the ad servers
    * use to identify the activity. This is optional: if empty, a new tag
    * string will be generated for you. This string must be 1 to 8 characters
    * long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag
    * string must also be unique among activities of the same activity group.
    * This field is read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.native
  /**
    * List of the user-defined variables used by this conversion tag. These map
    * to the &quot;u[1-100]=&quot; in the tags. Each of these can have a user
    * defined type. Acceptable values are U1 to U100, inclusive.
    */
  var userDefinedVariableTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFloodlightActivity {
  @scala.inline
  def apply(): SchemaFloodlightActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivity]
  }
  @scala.inline
  implicit class SchemaFloodlightActivityOps[Self <: SchemaFloodlightActivity] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    @scala.inline
    def setCacheBustingType(value: String): Self = this.set("cacheBustingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheBustingType: Self = this.set("cacheBustingType", js.undefined)
    @scala.inline
    def setCountingMethod(value: String): Self = this.set("countingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountingMethod: Self = this.set("countingMethod", js.undefined)
    @scala.inline
    def setDefaultTagsVarargs(value: SchemaFloodlightActivityDynamicTag*): Self = this.set("defaultTags", js.Array(value :_*))
    @scala.inline
    def setDefaultTags(value: js.Array[SchemaFloodlightActivityDynamicTag]): Self = this.set("defaultTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTags: Self = this.set("defaultTags", js.undefined)
    @scala.inline
    def setExpectedUrl(value: String): Self = this.set("expectedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedUrl: Self = this.set("expectedUrl", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupId(value: String): Self = this.set("floodlightActivityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupId: Self = this.set("floodlightActivityGroupId", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupName(value: String): Self = this.set("floodlightActivityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupName: Self = this.set("floodlightActivityGroupName", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupTagString(value: String): Self = this.set("floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupTagString: Self = this.set("floodlightActivityGroupTagString", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupType(value: String): Self = this.set("floodlightActivityGroupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupType: Self = this.set("floodlightActivityGroupType", js.undefined)
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    @scala.inline
    def setFloodlightConfigurationIdDimensionValue(value: SchemaDimensionValue): Self = this.set("floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightConfigurationIdDimensionValue: Self = this.set("floodlightConfigurationIdDimensionValue", js.undefined)
    @scala.inline
    def setFloodlightTagType(value: String): Self = this.set("floodlightTagType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightTagType: Self = this.set("floodlightTagType", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPublisherTagsVarargs(value: SchemaFloodlightActivityPublisherDynamicTag*): Self = this.set("publisherTags", js.Array(value :_*))
    @scala.inline
    def setPublisherTags(value: js.Array[SchemaFloodlightActivityPublisherDynamicTag]): Self = this.set("publisherTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherTags: Self = this.set("publisherTags", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTagFormat(value: String): Self = this.set("tagFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFormat: Self = this.set("tagFormat", js.undefined)
    @scala.inline
    def setTagString(value: String): Self = this.set("tagString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagString: Self = this.set("tagString", js.undefined)
    @scala.inline
    def setUserDefinedVariableTypesVarargs(value: String*): Self = this.set("userDefinedVariableTypes", js.Array(value :_*))
    @scala.inline
    def setUserDefinedVariableTypes(value: js.Array[String]): Self = this.set("userDefinedVariableTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDefinedVariableTypes: Self = this.set("userDefinedVariableTypes", js.undefined)
  }
  
}

