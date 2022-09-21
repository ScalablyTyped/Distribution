package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTeamDriveInfo extends StObject {
  
  /**
    * List of Team Drive IDs, as provided by the [Drive API](https://developers.google.com/drive).
    */
  var teamDriveIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTeamDriveInfo {
  
  inline def apply(): SchemaTeamDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveInfo]
  }
  
  extension [Self <: SchemaTeamDriveInfo](x: Self) {
    
    inline def setTeamDriveIds(value: js.Array[String]): Self = StObject.set(x, "teamDriveIds", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdsNull: Self = StObject.set(x, "teamDriveIds", null)
    
    inline def setTeamDriveIdsUndefined: Self = StObject.set(x, "teamDriveIds", js.undefined)
    
    inline def setTeamDriveIdsVarargs(value: String*): Self = StObject.set(x, "teamDriveIds", js.Array(value*))
  }
}
