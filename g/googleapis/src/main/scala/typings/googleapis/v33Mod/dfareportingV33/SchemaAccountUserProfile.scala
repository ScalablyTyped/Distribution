package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AccountUserProfiles contains properties of a Campaign Manager user profile.
  * This resource is specifically for managing user profiles, whereas
  * UserProfiles is for accessing the API.
  */
@js.native
trait SchemaAccountUserProfile extends js.Object {
  /**
    * Account ID of the user profile. This is a read-only field that can be
    * left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this user profile is active. This defaults to false, and must be
    * set true on insert for the user profile to be usable.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Filter that describes which advertisers are visible to the user profile.
    */
  var advertiserFilter: js.UndefOr[SchemaObjectFilter] = js.native
  /**
    * Filter that describes which campaigns are visible to the user profile.
    */
  var campaignFilter: js.UndefOr[SchemaObjectFilter] = js.native
  /**
    * Comments for this user profile.
    */
  var comments: js.UndefOr[String] = js.native
  /**
    * Email of the user profile. The email addresss must be linked to a Google
    * Account. This field is required on insertion and is read-only after
    * insertion.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * ID of the user profile. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountUserProfile&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Locale of the user profile. This is a required field. Acceptable values
    * are:   - &quot;cs&quot; (Czech)  - &quot;de&quot; (German)  -
    * &quot;en&quot; (English)  - &quot;en-GB&quot; (English United Kingdom)  -
    * &quot;es&quot; (Spanish)  - &quot;fr&quot; (French)  - &quot;it&quot;
    * (Italian)  - &quot;ja&quot; (Japanese)  - &quot;ko&quot; (Korean)  -
    * &quot;pl&quot; (Polish)  - &quot;pt-BR&quot; (Portuguese Brazil) -
    * &quot;ru&quot; (Russian)  - &quot;sv&quot; (Swedish)  - &quot;tr&quot;
    * (Turkish)  - &quot;zh-CN&quot; (Chinese Simplified)  - &quot;zh-TW&quot;
    * (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Name of the user profile. This is a required field. Must be less than 64
    * characters long, must be globally unique, and cannot contain whitespace
    * or any of the following characters: &quot;&amp;;&quot;#%,&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Filter that describes which sites are visible to the user profile.
    */
  var siteFilter: js.UndefOr[SchemaObjectFilter] = js.native
  /**
    * Subaccount ID of the user profile. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Trafficker type of this user profile. This is a read-only field.
    */
  var traffickerType: js.UndefOr[String] = js.native
  /**
    * User type of the user profile. This is a read-only field that can be left
    * blank.
    */
  var userAccessType: js.UndefOr[String] = js.native
  /**
    * Filter that describes which user roles are visible to the user profile.
    */
  var userRoleFilter: js.UndefOr[SchemaObjectFilter] = js.native
  /**
    * User role ID of the user profile. This is a required field.
    */
  var userRoleId: js.UndefOr[String] = js.native
}

object SchemaAccountUserProfile {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserFilter: SchemaObjectFilter = null,
    campaignFilter: SchemaObjectFilter = null,
    comments: String = null,
    email: String = null,
    id: String = null,
    kind: String = null,
    locale: String = null,
    name: String = null,
    siteFilter: SchemaObjectFilter = null,
    subaccountId: String = null,
    traffickerType: String = null,
    userAccessType: String = null,
    userRoleFilter: SchemaObjectFilter = null,
    userRoleId: String = null
  ): SchemaAccountUserProfile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (advertiserFilter != null) __obj.updateDynamic("advertiserFilter")(advertiserFilter.asInstanceOf[js.Any])
    if (campaignFilter != null) __obj.updateDynamic("campaignFilter")(campaignFilter.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (siteFilter != null) __obj.updateDynamic("siteFilter")(siteFilter.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (traffickerType != null) __obj.updateDynamic("traffickerType")(traffickerType.asInstanceOf[js.Any])
    if (userAccessType != null) __obj.updateDynamic("userAccessType")(userAccessType.asInstanceOf[js.Any])
    if (userRoleFilter != null) __obj.updateDynamic("userRoleFilter")(userRoleFilter.asInstanceOf[js.Any])
    if (userRoleId != null) __obj.updateDynamic("userRoleId")(userRoleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountUserProfile]
  }
}

