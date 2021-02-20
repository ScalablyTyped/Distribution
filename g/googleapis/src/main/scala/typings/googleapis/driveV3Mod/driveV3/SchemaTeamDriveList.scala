package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Team Drives.
  */
@js.native
trait SchemaTeamDriveList extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#teamDriveList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of Team Drives. This will be absent if
    * the end of the Team Drives list has been reached. If the token is
    * rejected for any reason, it should be discarded, and pagination should be
    * restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of Team Drives. If nextPageToken is populated, then this list
    * may be incomplete and an additional page of results should be fetched.
    */
  var teamDrives: js.UndefOr[js.Array[SchemaTeamDrive]] = js.native
}
object SchemaTeamDriveList {
  
  @scala.inline
  def apply(): SchemaTeamDriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveList]
  }
  
  @scala.inline
  implicit class SchemaTeamDriveListMutableBuilder[Self <: SchemaTeamDriveList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTeamDrives(value: js.Array[SchemaTeamDrive]): Self = StObject.set(x, "teamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivesUndefined: Self = StObject.set(x, "teamDrives", js.undefined)
    
    @scala.inline
    def setTeamDrivesVarargs(value: SchemaTeamDrive*): Self = StObject.set(x, "teamDrives", js.Array(value :_*))
  }
}
