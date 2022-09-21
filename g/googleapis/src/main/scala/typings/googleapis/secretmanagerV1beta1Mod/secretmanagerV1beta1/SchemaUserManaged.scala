package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserManaged extends StObject {
  
  /**
    * Required. The list of Replicas for this Secret. Cannot be empty.
    */
  var replicas: js.UndefOr[js.Array[SchemaReplica]] = js.undefined
}
object SchemaUserManaged {
  
  inline def apply(): SchemaUserManaged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserManaged]
  }
  
  extension [Self <: SchemaUserManaged](x: Self) {
    
    inline def setReplicas(value: js.Array[SchemaReplica]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: SchemaReplica*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
