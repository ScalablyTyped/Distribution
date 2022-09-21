package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicationStatus extends StObject {
  
  /**
    * Describes the replication status of a SecretVersion with automatic replication. Only populated if the parent Secret has an automatic replication policy.
    */
  var automatic: js.UndefOr[SchemaAutomaticStatus] = js.undefined
  
  /**
    * Describes the replication status of a SecretVersion with user-managed replication. Only populated if the parent Secret has a user-managed replication policy.
    */
  var userManaged: js.UndefOr[SchemaUserManagedStatus] = js.undefined
}
object SchemaReplicationStatus {
  
  inline def apply(): SchemaReplicationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicationStatus]
  }
  
  extension [Self <: SchemaReplicationStatus](x: Self) {
    
    inline def setAutomatic(value: SchemaAutomaticStatus): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    inline def setUserManaged(value: SchemaUserManagedStatus): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
