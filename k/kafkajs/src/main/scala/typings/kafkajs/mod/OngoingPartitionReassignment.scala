package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OngoingPartitionReassignment extends StObject {
  
  var addingReplicas: js.UndefOr[js.Array[Double]] = js.undefined
  
  var partitionIndex: Double
  
  var removingReplicas: js.UndefOr[js.Array[Double]] = js.undefined
  
  var replicas: js.Array[Double]
}
object OngoingPartitionReassignment {
  
  inline def apply(partitionIndex: Double, replicas: js.Array[Double]): OngoingPartitionReassignment = {
    val __obj = js.Dynamic.literal(partitionIndex = partitionIndex.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[OngoingPartitionReassignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OngoingPartitionReassignment] (val x: Self) extends AnyVal {
    
    inline def setAddingReplicas(value: js.Array[Double]): Self = StObject.set(x, "addingReplicas", value.asInstanceOf[js.Any])
    
    inline def setAddingReplicasUndefined: Self = StObject.set(x, "addingReplicas", js.undefined)
    
    inline def setAddingReplicasVarargs(value: Double*): Self = StObject.set(x, "addingReplicas", js.Array(value*))
    
    inline def setPartitionIndex(value: Double): Self = StObject.set(x, "partitionIndex", value.asInstanceOf[js.Any])
    
    inline def setRemovingReplicas(value: js.Array[Double]): Self = StObject.set(x, "removingReplicas", value.asInstanceOf[js.Any])
    
    inline def setRemovingReplicasUndefined: Self = StObject.set(x, "removingReplicas", js.undefined)
    
    inline def setRemovingReplicasVarargs(value: Double*): Self = StObject.set(x, "removingReplicas", js.Array(value*))
    
    inline def setReplicas(value: js.Array[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasVarargs(value: Double*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
