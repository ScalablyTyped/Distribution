package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeldDriveQuery extends StObject {
  
  /**
    * To include files in shared drives in the hold, set to **true**.
    */
  var includeSharedDriveFiles: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * To include files in Team Drives in the hold, set to **true**.
    */
  var includeTeamDriveFiles: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHeldDriveQuery {
  
  inline def apply(): SchemaHeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldDriveQuery]
  }
  
  extension [Self <: SchemaHeldDriveQuery](x: Self) {
    
    inline def setIncludeSharedDriveFiles(value: Boolean): Self = StObject.set(x, "includeSharedDriveFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedDriveFilesNull: Self = StObject.set(x, "includeSharedDriveFiles", null)
    
    inline def setIncludeSharedDriveFilesUndefined: Self = StObject.set(x, "includeSharedDriveFiles", js.undefined)
    
    inline def setIncludeTeamDriveFiles(value: Boolean): Self = StObject.set(x, "includeTeamDriveFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveFilesNull: Self = StObject.set(x, "includeTeamDriveFiles", null)
    
    inline def setIncludeTeamDriveFilesUndefined: Self = StObject.set(x, "includeTeamDriveFiles", js.undefined)
  }
}
