package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a change to a file or Team Drive.
  */
trait SchemaChange extends StObject {
  
  /**
    * Whether the file or Team Drive has been removed from this list of
    * changes, for example by deletion or loss of access.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated state of the file. Present if the type is file and the file
    * has not been removed from this list of changes.
    */
  var file: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * The ID of the file associated with this change.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the change.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#change.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The time of this modification.
    */
  var modificationDate: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this change.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The updated state of the Team Drive. Present if the type is teamDrive,
    * the user is still a member of the Team Drive, and the Team Drive has not
    * been deleted.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.undefined
  
  /**
    * The ID of the Team Drive associated with this change.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
  
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
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setFile(value: SchemaFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModificationDate(value: String): Self = StObject.set(x, "modificationDate", value.asInstanceOf[js.Any])
    
    inline def setModificationDateUndefined: Self = StObject.set(x, "modificationDate", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTeamDrive(value: SchemaTeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
