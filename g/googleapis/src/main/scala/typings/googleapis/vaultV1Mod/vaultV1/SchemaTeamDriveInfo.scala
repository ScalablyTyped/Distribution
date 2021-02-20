package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Team Drives to search
  */
@js.native
trait SchemaTeamDriveInfo extends StObject {
  
  /**
    * List of Team Drive ids, as provided by &lt;a
    * href=&quot;https://developers.google.com/drive&quot;&gt;Drive
    * API&lt;/a&gt;.
    */
  var teamDriveIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTeamDriveInfo {
  
  @scala.inline
  def apply(): SchemaTeamDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveInfo]
  }
  
  @scala.inline
  implicit class SchemaTeamDriveInfoMutableBuilder[Self <: SchemaTeamDriveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeamDriveIds(value: js.Array[String]): Self = StObject.set(x, "teamDriveIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdsUndefined: Self = StObject.set(x, "teamDriveIds", js.undefined)
    
    @scala.inline
    def setTeamDriveIdsVarargs(value: String*): Self = StObject.set(x, "teamDriveIds", js.Array(value :_*))
  }
}
