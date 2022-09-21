package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChange extends StObject {
  
  /**
    * The type of the change. Possible values are file and drive.
    */
  var changeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the file or shared drive has been removed from this list of changes, for example by deletion or loss of access.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The updated state of the shared drive. Present if the changeType is drive, the user is still a member of the shared drive, and the shared drive has not been deleted.
    */
  var drive: js.UndefOr[SchemaDrive] = js.undefined
  
  /**
    * The ID of the shared drive associated with this change.
    */
  var driveId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The updated state of the file. Present if the type is file and the file has not been removed from this list of changes.
    */
  var file: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * The ID of the file associated with this change.
    */
  var fileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the change.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always drive#change.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time of this modification.
    */
  var modificationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link back to this change.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated - use drive instead.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.undefined
  
  /**
    * Deprecated - use driveId instead.
    */
  var teamDriveId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated - use changeType instead.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaChange {
  
  inline def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  
  extension [Self <: SchemaChange](x: Self) {
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeNull: Self = StObject.set(x, "changeType", null)
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDrive(value: SchemaDrive): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdNull: Self = StObject.set(x, "driveId", null)
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setFile(value: SchemaFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdNull: Self = StObject.set(x, "fileId", null)
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModificationDate(value: String): Self = StObject.set(x, "modificationDate", value.asInstanceOf[js.Any])
    
    inline def setModificationDateNull: Self = StObject.set(x, "modificationDate", null)
    
    inline def setModificationDateUndefined: Self = StObject.set(x, "modificationDate", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTeamDrive(value: SchemaTeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdNull: Self = StObject.set(x, "teamDriveId", null)
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
