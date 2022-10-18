package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaAssignment extends StObject {
  
  var partition: Double
  
  var replicas: js.Array[Double]
}
object ReplicaAssignment {
  
  inline def apply(partition: Double, replicas: js.Array[Double]): ReplicaAssignment = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAssignment]
  }
  
  extension [Self <: ReplicaAssignment](x: Self) {
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: js.Array[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasVarargs(value: Double*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
