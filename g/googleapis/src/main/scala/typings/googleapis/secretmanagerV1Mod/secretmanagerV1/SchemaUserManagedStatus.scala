package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserManagedStatus extends StObject {
  
  /**
    * Output only. The list of replica statuses for the SecretVersion.
    */
  var replicas: js.UndefOr[js.Array[SchemaReplicaStatus]] = js.undefined
}
object SchemaUserManagedStatus {
  
  inline def apply(): SchemaUserManagedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserManagedStatus]
  }
  
  extension [Self <: SchemaUserManagedStatus](x: Self) {
    
    inline def setReplicas(value: js.Array[SchemaReplicaStatus]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: SchemaReplicaStatus*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
