package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Team Drives.
  */
@js.native
trait SchemaTeamDriveList extends js.Object {
  
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
  implicit class SchemaTeamDriveListOps[Self <: SchemaTeamDriveList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTeamDrivesVarargs(value: SchemaTeamDrive*): Self = this.set("teamDrives", js.Array(value :_*))
    
    @scala.inline
    def setTeamDrives(value: js.Array[SchemaTeamDrive]): Self = this.set("teamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDrives: Self = this.set("teamDrives", js.undefined)
  }
}
