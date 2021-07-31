package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the owner of a Drive item.
  */
trait SchemaOwner extends StObject {
  
  /**
    * The domain of the Drive item owner.
    */
  var domain: js.UndefOr[SchemaDomain] = js.undefined
  
  /**
    * The Team Drive that owns the Drive item.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.undefined
  
  /**
    * The user that owns the Drive item.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaOwner {
  
  @scala.inline
  def apply(): SchemaOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOwner]
  }
  
  @scala.inline
  implicit class SchemaOwnerMutableBuilder[Self <: SchemaOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: SchemaDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: SchemaTeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
