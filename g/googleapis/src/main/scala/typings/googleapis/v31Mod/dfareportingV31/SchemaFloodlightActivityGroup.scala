package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Floodlight activity group.
  */
@js.native
trait SchemaFloodlightActivityGroup extends js.Object {
  /**
    * Account ID of this floodlight activity group. This is a read-only field
    * that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this floodlight activity group. If this field is left
    * blank, the value will be copied over either from the floodlight
    * configuration&#39;s advertiser or from the existing activity group&#39;s
    * advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Floodlight configuration ID of this floodlight activity group. This is a
    * required field.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * ID of this floodlight activity group. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this floodlight activity group. This is a
    * read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivityGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this floodlight activity group. This is a required field. Must be
    * less than 65 characters long and cannot contain quotes.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this floodlight activity group. This is a read-only
    * field that can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Value of the type= parameter in the floodlight tag, which the ad servers
    * use to identify the activity group that the activity belongs to. This is
    * optional: if empty, a new tag string will be generated for you. This
    * string must be 1 to 8 characters long, with valid characters being
    * [a-z][A-Z][0-9][-][ _ ]. This tag string must also be unique among
    * activity groups of the same floodlight configuration. This field is
    * read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.native
  /**
    * Type of the floodlight activity group. This is a required field that is
    * read-only after insertion.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaFloodlightActivityGroup {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: SchemaDimensionValue = null,
    floodlightConfigurationId: String = null,
    floodlightConfigurationIdDimensionValue: SchemaDimensionValue = null,
    id: String = null,
    idDimensionValue: SchemaDimensionValue = null,
    kind: String = null,
    name: String = null,
    subaccountId: String = null,
    tagString: String = null,
    `type`: String = null
  ): SchemaFloodlightActivityGroup = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (tagString != null) __obj.updateDynamic("tagString")(tagString.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloodlightActivityGroup]
  }
}

