package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information relevant only to a restrict entry. NextId: 12
  */
@js.native
trait SchemaRestrictItem extends StObject {
  
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
  implicit class SchemaRestrictItemMutableBuilder[Self <: SchemaRestrictItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFollowUpRestrict(value: SchemaDriveFollowUpRestrict): Self = StObject.set(x, "driveFollowUpRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFollowUpRestrictUndefined: Self = StObject.set(x, "driveFollowUpRestrict", js.undefined)
    
    @scala.inline
    def setDriveLocationRestrict(value: SchemaDriveLocationRestrict): Self = StObject.set(x, "driveLocationRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveLocationRestrictUndefined: Self = StObject.set(x, "driveLocationRestrict", js.undefined)
    
    @scala.inline
    def setDriveMimeTypeRestrict(value: SchemaDriveMimeTypeRestrict): Self = StObject.set(x, "driveMimeTypeRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveMimeTypeRestrictUndefined: Self = StObject.set(x, "driveMimeTypeRestrict", js.undefined)
    
    @scala.inline
    def setDriveTimeSpanRestrict(value: SchemaDriveTimeSpanRestrict): Self = StObject.set(x, "driveTimeSpanRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveTimeSpanRestrictUndefined: Self = StObject.set(x, "driveTimeSpanRestrict", js.undefined)
    
    @scala.inline
    def setGmailActionRestrict(value: SchemaGmailActionRestrict): Self = StObject.set(x, "gmailActionRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailActionRestrictUndefined: Self = StObject.set(x, "gmailActionRestrict", js.undefined)
    
    @scala.inline
    def setGmailAttachmentRestrict(value: SchemaGmailAttachmentRestrict): Self = StObject.set(x, "gmailAttachmentRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailAttachmentRestrictUndefined: Self = StObject.set(x, "gmailAttachmentRestrict", js.undefined)
    
    @scala.inline
    def setGmailFolderRestrict(value: SchemaGmailFolderRestrict): Self = StObject.set(x, "gmailFolderRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailFolderRestrictUndefined: Self = StObject.set(x, "gmailFolderRestrict", js.undefined)
    
    @scala.inline
    def setGmailIntelligentRestrict(value: SchemaGmailIntelligentRestrict): Self = StObject.set(x, "gmailIntelligentRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailIntelligentRestrictUndefined: Self = StObject.set(x, "gmailIntelligentRestrict", js.undefined)
    
    @scala.inline
    def setGmailTimeRestrict(value: SchemaGmailTimeRestrict): Self = StObject.set(x, "gmailTimeRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailTimeRestrictUndefined: Self = StObject.set(x, "gmailTimeRestrict", js.undefined)
    
    @scala.inline
    def setSearchOperator(value: String): Self = StObject.set(x, "searchOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchOperatorUndefined: Self = StObject.set(x, "searchOperator", js.undefined)
  }
}
