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
  def apply(
    driveFollowUpRestrict: SchemaDriveFollowUpRestrict = null,
    driveLocationRestrict: SchemaDriveLocationRestrict = null,
    driveMimeTypeRestrict: SchemaDriveMimeTypeRestrict = null,
    driveTimeSpanRestrict: SchemaDriveTimeSpanRestrict = null,
    gmailActionRestrict: SchemaGmailActionRestrict = null,
    gmailAttachmentRestrict: SchemaGmailAttachmentRestrict = null,
    gmailFolderRestrict: SchemaGmailFolderRestrict = null,
    gmailIntelligentRestrict: SchemaGmailIntelligentRestrict = null,
    gmailTimeRestrict: SchemaGmailTimeRestrict = null,
    searchOperator: String = null
  ): SchemaRestrictItem = {
    val __obj = js.Dynamic.literal()
    if (driveFollowUpRestrict != null) __obj.updateDynamic("driveFollowUpRestrict")(driveFollowUpRestrict.asInstanceOf[js.Any])
    if (driveLocationRestrict != null) __obj.updateDynamic("driveLocationRestrict")(driveLocationRestrict.asInstanceOf[js.Any])
    if (driveMimeTypeRestrict != null) __obj.updateDynamic("driveMimeTypeRestrict")(driveMimeTypeRestrict.asInstanceOf[js.Any])
    if (driveTimeSpanRestrict != null) __obj.updateDynamic("driveTimeSpanRestrict")(driveTimeSpanRestrict.asInstanceOf[js.Any])
    if (gmailActionRestrict != null) __obj.updateDynamic("gmailActionRestrict")(gmailActionRestrict.asInstanceOf[js.Any])
    if (gmailAttachmentRestrict != null) __obj.updateDynamic("gmailAttachmentRestrict")(gmailAttachmentRestrict.asInstanceOf[js.Any])
    if (gmailFolderRestrict != null) __obj.updateDynamic("gmailFolderRestrict")(gmailFolderRestrict.asInstanceOf[js.Any])
    if (gmailIntelligentRestrict != null) __obj.updateDynamic("gmailIntelligentRestrict")(gmailIntelligentRestrict.asInstanceOf[js.Any])
    if (gmailTimeRestrict != null) __obj.updateDynamic("gmailTimeRestrict")(gmailTimeRestrict.asInstanceOf[js.Any])
    if (searchOperator != null) __obj.updateDynamic("searchOperator")(searchOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRestrictItem]
  }
}

