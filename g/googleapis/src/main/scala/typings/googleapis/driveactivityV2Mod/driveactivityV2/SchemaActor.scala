package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The actor of a Drive activity.
  */
@js.native
trait SchemaActor extends StObject {
  
  /**
    * An administrator.
    */
  var administrator: js.UndefOr[SchemaAdministrator] = js.native
  
  /**
    * An anonymous user.
    */
  var anonymous: js.UndefOr[SchemaAnonymousUser] = js.native
  
  /**
    * An account acting on behalf of another.
    */
  var impersonation: js.UndefOr[SchemaImpersonation] = js.native
  
  /**
    * A non-user actor (i.e. system triggered).
    */
  var system: js.UndefOr[SchemaSystemEvent] = js.native
  
  /**
    * An end user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}
object SchemaActor {
  
  @scala.inline
  def apply(): SchemaActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActor]
  }
  
  @scala.inline
  implicit class SchemaActorMutableBuilder[Self <: SchemaActor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrator(value: SchemaAdministrator): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    @scala.inline
    def setAnonymous(value: SchemaAnonymousUser): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setImpersonation(value: SchemaImpersonation): Self = StObject.set(x, "impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonationUndefined: Self = StObject.set(x, "impersonation", js.undefined)
    
    @scala.inline
    def setSystem(value: SchemaSystemEvent): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
