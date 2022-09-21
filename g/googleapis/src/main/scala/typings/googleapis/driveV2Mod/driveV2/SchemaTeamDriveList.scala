package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTeamDriveList extends StObject {
  
  /**
    * The list of Team Drives.
    */
  var items: js.UndefOr[js.Array[SchemaTeamDrive]] = js.undefined
  
  /**
    * This is always drive#teamDriveList
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The page token for the next page of Team Drives.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaTeamDriveList {
  
  inline def apply(): SchemaTeamDriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveList]
  }
  
  extension [Self <: SchemaTeamDriveList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaTeamDrive]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaTeamDrive*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
