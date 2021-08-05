package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information relevant only to a restrict entry. NextId: 12
  */
trait SchemaRestrictItem extends StObject {
  
  /**
    * LINT.ThenChange(//depot/google3/java/com/google/apps/search/quality/itemsuggest/utils/SubtypeRerankingUtils.java)
    */
  var driveFollowUpRestrict: js.UndefOr[SchemaDriveFollowUpRestrict] = js.undefined
  
  var driveLocationRestrict: js.UndefOr[SchemaDriveLocationRestrict] = js.undefined
  
  /**
    * LINT.IfChange Drive Types.
    */
  var driveMimeTypeRestrict: js.UndefOr[SchemaDriveMimeTypeRestrict] = js.undefined
  
  var driveTimeSpanRestrict: js.UndefOr[SchemaDriveTimeSpanRestrict] = js.undefined
  
  var gmailActionRestrict: js.UndefOr[SchemaGmailActionRestrict] = js.undefined
  
  var gmailAttachmentRestrict: js.UndefOr[SchemaGmailAttachmentRestrict] = js.undefined
  
  /**
    * Gmail Types.
    */
  var gmailFolderRestrict: js.UndefOr[SchemaGmailFolderRestrict] = js.undefined
  
  var gmailIntelligentRestrict: js.UndefOr[SchemaGmailIntelligentRestrict] = js.undefined
  
  var gmailTimeRestrict: js.UndefOr[SchemaGmailTimeRestrict] = js.undefined
  
  /**
    * The search restrict (e.g. &quot;after:2017-09-11
    * before:2017-09-12&quot;).
    */
  var searchOperator: js.UndefOr[String] = js.undefined
}
object SchemaRestrictItem {
  
  inline def apply(): SchemaRestrictItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictItem]
  }
  
  extension [Self <: SchemaRestrictItem](x: Self) {
    
    inline def setDriveFollowUpRestrict(value: SchemaDriveFollowUpRestrict): Self = StObject.set(x, "driveFollowUpRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveFollowUpRestrictUndefined: Self = StObject.set(x, "driveFollowUpRestrict", js.undefined)
    
    inline def setDriveLocationRestrict(value: SchemaDriveLocationRestrict): Self = StObject.set(x, "driveLocationRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveLocationRestrictUndefined: Self = StObject.set(x, "driveLocationRestrict", js.undefined)
    
    inline def setDriveMimeTypeRestrict(value: SchemaDriveMimeTypeRestrict): Self = StObject.set(x, "driveMimeTypeRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveMimeTypeRestrictUndefined: Self = StObject.set(x, "driveMimeTypeRestrict", js.undefined)
    
    inline def setDriveTimeSpanRestrict(value: SchemaDriveTimeSpanRestrict): Self = StObject.set(x, "driveTimeSpanRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveTimeSpanRestrictUndefined: Self = StObject.set(x, "driveTimeSpanRestrict", js.undefined)
    
    inline def setGmailActionRestrict(value: SchemaGmailActionRestrict): Self = StObject.set(x, "gmailActionRestrict", value.asInstanceOf[js.Any])
    
    inline def setGmailActionRestrictUndefined: Self = StObject.set(x, "gmailActionRestrict", js.undefined)
    
    inline def setGmailAttachmentRestrict(value: SchemaGmailAttachmentRestrict): Self = StObject.set(x, "gmailAttachmentRestrict", value.asInstanceOf[js.Any])
    
    inline def setGmailAttachmentRestrictUndefined: Self = StObject.set(x, "gmailAttachmentRestrict", js.undefined)
    
    inline def setGmailFolderRestrict(value: SchemaGmailFolderRestrict): Self = StObject.set(x, "gmailFolderRestrict", value.asInstanceOf[js.Any])
    
    inline def setGmailFolderRestrictUndefined: Self = StObject.set(x, "gmailFolderRestrict", js.undefined)
    
    inline def setGmailIntelligentRestrict(value: SchemaGmailIntelligentRestrict): Self = StObject.set(x, "gmailIntelligentRestrict", value.asInstanceOf[js.Any])
    
    inline def setGmailIntelligentRestrictUndefined: Self = StObject.set(x, "gmailIntelligentRestrict", js.undefined)
    
    inline def setGmailTimeRestrict(value: SchemaGmailTimeRestrict): Self = StObject.set(x, "gmailTimeRestrict", value.asInstanceOf[js.Any])
    
    inline def setGmailTimeRestrictUndefined: Self = StObject.set(x, "gmailTimeRestrict", js.undefined)
    
    inline def setSearchOperator(value: String): Self = StObject.set(x, "searchOperator", value.asInstanceOf[js.Any])
    
    inline def setSearchOperatorUndefined: Self = StObject.set(x, "searchOperator", js.undefined)
  }
}
