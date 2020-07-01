package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a targetable remarketing list. Remarketing enables
  * you to create lists of users who have performed specific actions on a site,
  * then target ads to members of those lists. This resource is a read-only
  * view of a remarketing list to be used to faciliate targeting ads to
  * specific lists. Remarketing lists that are owned by your advertisers and
  * those that are shared to your advertisers or account are accessible via
  * this resource. To manage remarketing lists that are owned by your
  * advertisers, use the RemarketingLists resource.
  */
@js.native
trait SchemaTargetableRemarketingList extends js.Object {
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated
    * field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this targetable remarketing list is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Dimension value for the advertiser ID that owns this targetable
    * remarketing list.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Targetable remarketing list description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Targetable remarketing list ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetableRemarketingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Number of days that a user should remain in the targetable remarketing
    * list without an impression.
    */
  var lifeSpan: js.UndefOr[String] = js.native
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String] = js.native
  /**
    * Product from which this targetable remarketing list was originated.
    */
  var listSource: js.UndefOr[String] = js.native
  /**
    * Name of the targetable remarketing list. Is no greater than 128
    * characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this remarketing list. This is a read-only,
    * auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object SchemaTargetableRemarketingList {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    advertiserIdDimensionValue: SchemaDimensionValue = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    lifeSpan: String = null,
    listSize: String = null,
    listSource: String = null,
    name: String = null,
    subaccountId: String = null
  ): SchemaTargetableRemarketingList = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lifeSpan != null) __obj.updateDynamic("lifeSpan")(lifeSpan.asInstanceOf[js.Any])
    if (listSize != null) __obj.updateDynamic("listSize")(listSize.asInstanceOf[js.Any])
    if (listSource != null) __obj.updateDynamic("listSource")(listSource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetableRemarketingList]
  }
}

