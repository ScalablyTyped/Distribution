package typings.kafkaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ControllerId extends StObject {
    
    var controllerId: Double
  }
  object ControllerId {
    
    inline def apply(controllerId: Double): ControllerId = {
      val __obj = js.Dynamic.literal(controllerId = controllerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControllerId]
    }
    
    extension [Self <: ControllerId](x: Self) {
      
      inline def setControllerId(value: Double): Self = StObject.set(x, "controllerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var nodeId: Double
    
    var port: Double
  }
  object Host {
    
    inline def apply(host: String, nodeId: Double, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Isr extends StObject {
    
    var isr: js.Array[Double]
    
    var leader: Double
    
    var partition: Double
    
    var replicas: js.Array[Double]
    
    var topic: String
  }
  object Isr {
    
    inline def apply(
      isr: js.Array[Double],
      leader: Double,
      partition: Double,
      replicas: js.Array[Double],
      topic: String
    ): Isr = {
      val __obj = js.Dynamic.literal(isr = isr.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Isr]
    }
    
    extension [Self <: Isr](x: Self) {
      
      inline def setIsr(value: js.Array[Double]): Self = StObject.set(x, "isr", value.asInstanceOf[js.Any])
      
      inline def setIsrVarargs(value: Double*): Self = StObject.set(x, "isr", js.Array(value :_*))
      
      inline def setLeader(value: Double): Self = StObject.set(x, "leader", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setReplicas(value: js.Array[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasVarargs(value: Double*): Self = StObject.set(x, "replicas", js.Array(value :_*))
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var value: String
  }
  object Name {
    
    inline def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Partition extends StObject {
    
    var partition: Double
    
    var replicas: js.Array[Double]
  }
  object Partition {
    
    inline def apply(partition: Double, replicas: js.Array[Double]): Partition = {
      val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
      __obj.asInstanceOf[Partition]
    }
    
    extension [Self <: Partition](x: Self) {
      
      inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setReplicas(value: js.Array[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasVarargs(value: Double*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    }
  }
}
