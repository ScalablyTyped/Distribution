package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change to a file or Team Drive.
  */
trait SchemaChange extends StObject {
  
  /**
    * The updated state of the file. Present if the type is file and the file
    * has not been removed from this list of changes.
    */
  var file: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * The ID of the file which has changed.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#change&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the file or Team Drive has been removed from this list of
    * changes, for example by deletion or loss of access.
    */
  var removed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated state of the Team Drive. Present if the type is teamDrive,
    * the user is still a member of the Team Drive, and the Team Drive has not
    * been removed.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.undefined
  
  /**
    * The ID of the Team Drive associated with this change.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
  
  /**
    * The time of this change (RFC 3339 date-time).
    */
  var time: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the change. Possible values are file and teamDrive.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaChange {
  
  inline def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  
  extension [Self <: SchemaChange](x: Self) {
    
    inline def setFile(value: SchemaFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setTeamDrive(value: SchemaTeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
