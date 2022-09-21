package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplication extends StObject {
  
  /**
    * The Secret will automatically be replicated without any restrictions.
    */
  var automatic: js.UndefOr[SchemaAutomatic] = js.undefined
  
  /**
    * The Secret will only be replicated into the locations specified.
    */
  var userManaged: js.UndefOr[SchemaUserManaged] = js.undefined
}
object SchemaReplication {
  
  inline def apply(): SchemaReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplication]
  }
  
  extension [Self <: SchemaReplication](x: Self) {
    
    inline def setAutomatic(value: SchemaAutomatic): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    inline def setUserManaged(value: SchemaUserManaged): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
