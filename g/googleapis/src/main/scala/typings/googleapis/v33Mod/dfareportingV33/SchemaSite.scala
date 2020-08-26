package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a site.
  */
@js.native
trait SchemaSite extends js.Object {
  /**
    * Account ID of this site. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this site is approved.
    */
  var approved: js.UndefOr[Boolean] = js.native
  /**
    * Directory site associated with this site. This is a required field that
    * is read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the directory site. This is a read-only,
    * auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * ID of this site. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this site. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Key name of this site. This is a read-only, auto-generated field.
    */
  var keyName: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#site&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this site.This is a required field. Must be less than 128
    * characters long. If this site is under a subaccount, the name must be
    * unique among sites of the same subaccount. Otherwise, this site is a
    * top-level site, and the name must be unique among top-level sites of the
    * same account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Site contacts.
    */
  var siteContacts: js.UndefOr[js.Array[SchemaSiteContact]] = js.native
  /**
    * Site-wide settings.
    */
  var siteSettings: js.UndefOr[SchemaSiteSettings] = js.native
  /**
    * Subaccount ID of this site. This is a read-only field that can be left
    * blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Default video settings for new placements created under this site. This
    * value will be used to populate the placements.videoSettings field, when
    * no value is specified for the new placement.
    */
  var videoSettings: js.UndefOr[SchemaSiteVideoSettings] = js.native
}

object SchemaSite {
  @scala.inline
  def apply(): SchemaSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSite]
  }
  @scala.inline
  implicit class SchemaSiteOps[Self <: SchemaSite] (val x: Self) extends AnyVal {
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
    def setApproved(value: Boolean): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproved: Self = this.set("approved", js.undefined)
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    @scala.inline
    def setDirectorySiteIdDimensionValue(value: SchemaDimensionValue): Self = this.set("directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteIdDimensionValue: Self = this.set("directorySiteIdDimensionValue", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSiteContactsVarargs(value: SchemaSiteContact*): Self = this.set("siteContacts", js.Array(value :_*))
    @scala.inline
    def setSiteContacts(value: js.Array[SchemaSiteContact]): Self = this.set("siteContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteContacts: Self = this.set("siteContacts", js.undefined)
    @scala.inline
    def setSiteSettings(value: SchemaSiteSettings): Self = this.set("siteSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteSettings: Self = this.set("siteSettings", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setVideoSettings(value: SchemaSiteVideoSettings): Self = this.set("videoSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSettings: Self = this.set("videoSettings", js.undefined)
  }
  
}

