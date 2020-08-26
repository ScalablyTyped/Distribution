package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a targeting template. A targeting template
  * encapsulates targeting information which can be reused across multiple ads.
  */
@js.native
trait SchemaTargetingTemplate extends js.Object {
  /**
    * Account ID of this targeting template. This field, if left unset, will be
    * auto-generated on insert and is read-only after insert.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this targeting template. This is a required field on
    * insert and is read-only after insert.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Time and day targeting criteria.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.native
  /**
    * Geographical targeting criteria.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.native
  /**
    * ID of this targeting template. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Key-value targeting criteria.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplate&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Language targeting criteria.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.native
  /**
    * Remarketing list targeting criteria.
    */
  var listTargetingExpression: js.UndefOr[SchemaListTargetingExpression] = js.native
  /**
    * Name of this targeting template. This field is required. It must be less
    * than 256 characters long and unique within an advertiser.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this targeting template. This field, if left unset, will
    * be auto-generated on insert and is read-only after insert.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Technology platform targeting criteria.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
}

object SchemaTargetingTemplate {
  @scala.inline
  def apply(): SchemaTargetingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplate]
  }
  @scala.inline
  implicit class SchemaTargetingTemplateOps[Self <: SchemaTargetingTemplate] (val x: Self) extends AnyVal {
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
    def setDayPartTargeting(value: SchemaDayPartTargeting): Self = this.set("dayPartTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPartTargeting: Self = this.set("dayPartTargeting", js.undefined)
    @scala.inline
    def setGeoTargeting(value: SchemaGeoTargeting): Self = this.set("geoTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoTargeting: Self = this.set("geoTargeting", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = this.set("keyValueTargetingExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyValueTargetingExpression: Self = this.set("keyValueTargetingExpression", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguageTargeting(value: SchemaLanguageTargeting): Self = this.set("languageTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageTargeting: Self = this.set("languageTargeting", js.undefined)
    @scala.inline
    def setListTargetingExpression(value: SchemaListTargetingExpression): Self = this.set("listTargetingExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListTargetingExpression: Self = this.set("listTargetingExpression", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = this.set("technologyTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTechnologyTargeting: Self = this.set("technologyTargeting", js.undefined)
  }
  
}

