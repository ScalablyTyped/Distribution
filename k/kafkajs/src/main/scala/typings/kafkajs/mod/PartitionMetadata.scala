package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionMetadata extends StObject {
  
  var isr: js.Array[Double]
  
  var leader: Double
  
  var offlineReplicas: js.UndefOr[js.Array[Double]] = js.undefined
  
  var partitionErrorCode: Double
  
  var partitionId: Double
  
  var replicas: js.Array[Double]
}
object PartitionMetadata {
  
  inline def apply(
    isr: js.Array[Double],
    leader: Double,
    partitionErrorCode: Double,
    partitionId: Double,
    replicas: js.Array[Double]
  ): PartitionMetadata = {
    val __obj = js.Dynamic.literal(isr = isr.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], partitionErrorCode = partitionErrorCode.asInstanceOf[js.Any], partitionId = partitionId.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionMetadata]
  }
  
  extension [Self <: PartitionMetadata](x: Self) {
    
    inline def setIsr(value: js.Array[Double]): Self = StObject.set(x, "isr", value.asInstanceOf[js.Any])
    
    inline def setIsrVarargs(value: Double*): Self = StObject.set(x, "isr", js.Array(value*))
    
    inline def setLeader(value: Double): Self = StObject.set(x, "leader", value.asInstanceOf[js.Any])
    
    inline def setOfflineReplicas(value: js.Array[Double]): Self = StObject.set(x, "offlineReplicas", value.asInstanceOf[js.Any])
    
    inline def setOfflineReplicasUndefined: Self = StObject.set(x, "offlineReplicas", js.undefined)
    
    inline def setOfflineReplicasVarargs(value: Double*): Self = StObject.set(x, "offlineReplicas", js.Array(value*))
    
    inline def setPartitionErrorCode(value: Double): Self = StObject.set(x, "partitionErrorCode", value.asInstanceOf[js.Any])
    
    inline def setPartitionId(value: Double): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: js.Array[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasVarargs(value: Double*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
