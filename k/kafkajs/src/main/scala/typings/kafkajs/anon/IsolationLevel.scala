package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsolationLevel extends StObject {
  
  var isolationLevel: js.UndefOr[Double] = js.undefined
  
  var maxBytes: js.UndefOr[Double] = js.undefined
  
  var maxWaitTime: js.UndefOr[Double] = js.undefined
  
  var minBytes: js.UndefOr[Double] = js.undefined
  
  var rackId: js.UndefOr[String] = js.undefined
  
  var replicaId: js.UndefOr[Double] = js.undefined
  
  var topics: js.Array[PartitionsArray]
}
object IsolationLevel {
  
  inline def apply(topics: js.Array[PartitionsArray]): IsolationLevel = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsolationLevel]
  }
  
  extension [Self <: IsolationLevel](x: Self) {
    
    inline def setIsolationLevel(value: Double): Self = StObject.set(x, "isolationLevel", value.asInstanceOf[js.Any])
    
    inline def setIsolationLevelUndefined: Self = StObject.set(x, "isolationLevel", js.undefined)
    
    inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
    
    inline def setMaxWaitTime(value: Double): Self = StObject.set(x, "maxWaitTime", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitTimeUndefined: Self = StObject.set(x, "maxWaitTime", js.undefined)
    
    inline def setMinBytes(value: Double): Self = StObject.set(x, "minBytes", value.asInstanceOf[js.Any])
    
    inline def setMinBytesUndefined: Self = StObject.set(x, "minBytes", js.undefined)
    
    inline def setRackId(value: String): Self = StObject.set(x, "rackId", value.asInstanceOf[js.Any])
    
    inline def setRackIdUndefined: Self = StObject.set(x, "rackId", js.undefined)
    
    inline def setReplicaId(value: Double): Self = StObject.set(x, "replicaId", value.asInstanceOf[js.Any])
    
    inline def setReplicaIdUndefined: Self = StObject.set(x, "replicaId", js.undefined)
    
    inline def setTopics(value: js.Array[PartitionsArray]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: PartitionsArray*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
