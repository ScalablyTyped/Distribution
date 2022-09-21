package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChange extends StObject {
  
  /**
    * The type of the change. Possible values are file and drive.
    */
  var changeType: js.UndefOr[String | Null] = js.undefined
  
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
    * The ID of the file which has changed.
    */
  var fileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#change".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the file or shared drive has been removed from this list of changes, for example by deletion or loss of access.
    */
  var removed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Deprecated - use drive instead.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.undefined
  
  /**
    * Deprecated - use driveId instead.
    */
  var teamDriveId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time of this change (RFC 3339 date-time).
    */
  var time: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedNull: Self = StObject.set(x, "removed", null)
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setTeamDrive(value: SchemaTeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdNull: Self = StObject.set(x, "teamDriveId", null)
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
