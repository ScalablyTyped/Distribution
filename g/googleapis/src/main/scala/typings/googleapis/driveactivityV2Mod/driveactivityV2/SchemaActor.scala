package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The actor of a Drive activity.
  */
trait SchemaActor extends StObject {
  
  /**
    * An administrator.
    */
  var administrator: js.UndefOr[SchemaAdministrator] = js.undefined
  
  /**
    * An anonymous user.
    */
  var anonymous: js.UndefOr[SchemaAnonymousUser] = js.undefined
  
  /**
    * An account acting on behalf of another.
    */
  var impersonation: js.UndefOr[SchemaImpersonation] = js.undefined
  
  /**
    * A non-user actor (i.e. system triggered).
    */
  var system: js.UndefOr[SchemaSystemEvent] = js.undefined
  
  /**
    * An end user.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaActor {
  
  inline def apply(): SchemaActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActor]
  }
  
  extension [Self <: SchemaActor](x: Self) {
    
    inline def setAdministrator(value: SchemaAdministrator): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    inline def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    inline def setAnonymous(value: SchemaAnonymousUser): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setImpersonation(value: SchemaImpersonation): Self = StObject.set(x, "impersonation", value.asInstanceOf[js.Any])
    
    inline def setImpersonationUndefined: Self = StObject.set(x, "impersonation", js.undefined)
    
    inline def setSystem(value: SchemaSystemEvent): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
