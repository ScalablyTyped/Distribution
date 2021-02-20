package typings.googleapis.driveV2Mod.driveV2

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
    * The list of Team Drives.
    */
  var items: js.UndefOr[js.Array[SchemaTeamDrive]] = js.native
  
  /**
    * This is always drive#teamDriveList
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of Team Drives.
    */
  var nextPageToken: js.UndefOr[String] = js.native
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
    def setItems(value: js.Array[SchemaTeamDrive]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaTeamDrive*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
