package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query options for Drive holds.
  */
trait SchemaHeldDriveQuery extends StObject {
  
  /**
    * If true, include files in Team Drives in the hold.
    */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined
}
object SchemaHeldDriveQuery {
  
  inline def apply(): SchemaHeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldDriveQuery]
  }
  
  extension [Self <: SchemaHeldDriveQuery](x: Self) {
    
    inline def setIncludeTeamDriveFiles(value: Boolean): Self = StObject.set(x, "includeTeamDriveFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveFilesUndefined: Self = StObject.set(x, "includeTeamDriveFiles", js.undefined)
  }
}
