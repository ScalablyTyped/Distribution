package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveList extends StObject {
  
  /**
    * The list of shared drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched.
    */
  var drives: js.UndefOr[js.Array[SchemaDrive]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#driveList".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The page token for the next page of shared drives. This will be absent if the end of the list has been reached. If the token is rejected for any reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveList {
  
  inline def apply(): SchemaDriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveList]
  }
  
  extension [Self <: SchemaDriveList](x: Self) {
    
    inline def setDrives(value: js.Array[SchemaDrive]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    inline def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    inline def setDrivesVarargs(value: SchemaDrive*): Self = StObject.set(x, "drives", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
