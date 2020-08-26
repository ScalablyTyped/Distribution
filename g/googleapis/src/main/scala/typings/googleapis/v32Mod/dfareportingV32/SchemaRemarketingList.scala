package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a remarketing list. Remarketing enables you to
  * create lists of users who have performed specific actions on a site, then
  * target ads to members of those lists. This resource can be used to manage
  * remarketing lists that are owned by your advertisers. To see all
  * remarketing lists that are visible to your advertisers, including those
  * that are shared to your advertiser or account, use the
  * TargetableRemarketingLists resource.
  */
@js.native
trait SchemaRemarketingList extends js.Object {
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated
    * field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this remarketing list is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Dimension value for the advertiser ID that owns this remarketing list.
    * This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Remarketing list description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Number of days that a user should remain in the remarketing list without
    * an impression. Acceptable values are 1 to 540, inclusive.
    */
  var lifeSpan: js.UndefOr[String] = js.native
  /**
    * Rule used to populate the remarketing list with users.
    */
  var listPopulationRule: js.UndefOr[SchemaListPopulationRule] = js.native
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String] = js.native
  /**
    * Product from which this remarketing list was originated.
    */
  var listSource: js.UndefOr[String] = js.native
  /**
    * Name of the remarketing list. This is a required field. Must be no
    * greater than 128 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this remarketing list. This is a read-only,
    * auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object SchemaRemarketingList {
  @scala.inline
  def apply(): SchemaRemarketingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingList]
  }
  @scala.inline
  implicit class SchemaRemarketingListOps[Self <: SchemaRemarketingList] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLifeSpan(value: String): Self = this.set("lifeSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifeSpan: Self = this.set("lifeSpan", js.undefined)
    @scala.inline
    def setListPopulationRule(value: SchemaListPopulationRule): Self = this.set("listPopulationRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListPopulationRule: Self = this.set("listPopulationRule", js.undefined)
    @scala.inline
    def setListSize(value: String): Self = this.set("listSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListSize: Self = this.set("listSize", js.undefined)
    @scala.inline
    def setListSource(value: String): Self = this.set("listSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListSource: Self = this.set("listSource", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
  
}

