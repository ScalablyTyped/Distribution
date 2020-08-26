package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information relevant only to a restrict entry. NextId: 12
  */
@js.native
trait SchemaRestrictItem extends js.Object {
  /**
    * LINT.ThenChange(//depot/google3/java/com/google/apps/search/quality/itemsuggest/utils/SubtypeRerankingUtils.java)
    */
  var driveFollowUpRestrict: js.UndefOr[SchemaDriveFollowUpRestrict] = js.native
  var driveLocationRestrict: js.UndefOr[SchemaDriveLocationRestrict] = js.native
  /**
    * LINT.IfChange Drive Types.
    */
  var driveMimeTypeRestrict: js.UndefOr[SchemaDriveMimeTypeRestrict] = js.native
  var driveTimeSpanRestrict: js.UndefOr[SchemaDriveTimeSpanRestrict] = js.native
  var gmailActionRestrict: js.UndefOr[SchemaGmailActionRestrict] = js.native
  var gmailAttachmentRestrict: js.UndefOr[SchemaGmailAttachmentRestrict] = js.native
  /**
    * Gmail Types.
    */
  var gmailFolderRestrict: js.UndefOr[SchemaGmailFolderRestrict] = js.native
  var gmailIntelligentRestrict: js.UndefOr[SchemaGmailIntelligentRestrict] = js.native
  var gmailTimeRestrict: js.UndefOr[SchemaGmailTimeRestrict] = js.native
  /**
    * The search restrict (e.g. &quot;after:2017-09-11
    * before:2017-09-12&quot;).
    */
  var searchOperator: js.UndefOr[String] = js.native
}

object SchemaRestrictItem {
  @scala.inline
  def apply(): SchemaRestrictItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictItem]
  }
  @scala.inline
  implicit class SchemaRestrictItemOps[Self <: SchemaRestrictItem] (val x: Self) extends AnyVal {
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
    def setDriveFollowUpRestrict(value: SchemaDriveFollowUpRestrict): Self = this.set("driveFollowUpRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveFollowUpRestrict: Self = this.set("driveFollowUpRestrict", js.undefined)
    @scala.inline
    def setDriveLocationRestrict(value: SchemaDriveLocationRestrict): Self = this.set("driveLocationRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveLocationRestrict: Self = this.set("driveLocationRestrict", js.undefined)
    @scala.inline
    def setDriveMimeTypeRestrict(value: SchemaDriveMimeTypeRestrict): Self = this.set("driveMimeTypeRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveMimeTypeRestrict: Self = this.set("driveMimeTypeRestrict", js.undefined)
    @scala.inline
    def setDriveTimeSpanRestrict(value: SchemaDriveTimeSpanRestrict): Self = this.set("driveTimeSpanRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveTimeSpanRestrict: Self = this.set("driveTimeSpanRestrict", js.undefined)
    @scala.inline
    def setGmailActionRestrict(value: SchemaGmailActionRestrict): Self = this.set("gmailActionRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmailActionRestrict: Self = this.set("gmailActionRestrict", js.undefined)
    @scala.inline
    def setGmailAttachmentRestrict(value: SchemaGmailAttachmentRestrict): Self = this.set("gmailAttachmentRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmailAttachmentRestrict: Self = this.set("gmailAttachmentRestrict", js.undefined)
    @scala.inline
    def setGmailFolderRestrict(value: SchemaGmailFolderRestrict): Self = this.set("gmailFolderRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmailFolderRestrict: Self = this.set("gmailFolderRestrict", js.undefined)
    @scala.inline
    def setGmailIntelligentRestrict(value: SchemaGmailIntelligentRestrict): Self = this.set("gmailIntelligentRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmailIntelligentRestrict: Self = this.set("gmailIntelligentRestrict", js.undefined)
    @scala.inline
    def setGmailTimeRestrict(value: SchemaGmailTimeRestrict): Self = this.set("gmailTimeRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmailTimeRestrict: Self = this.set("gmailTimeRestrict", js.undefined)
    @scala.inline
    def setSearchOperator(value: String): Self = this.set("searchOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchOperator: Self = this.set("searchOperator", js.undefined)
  }
  
}

