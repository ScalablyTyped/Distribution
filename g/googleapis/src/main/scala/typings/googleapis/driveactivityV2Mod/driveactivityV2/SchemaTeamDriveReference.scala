package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A lightweight reference to a Team Drive.
  */
trait SchemaTeamDriveReference extends StObject {
  
  /**
    * The resource name of the Team Drive. The format is
    * &quot;teamDrives/TEAM_DRIVE_ID&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the Team Drive.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaTeamDriveReference {
  
  @scala.inline
  def apply(): SchemaTeamDriveReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveReference]
  }
  
  @scala.inline
  implicit class SchemaTeamDriveReferenceMutableBuilder[Self <: SchemaTeamDriveReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
