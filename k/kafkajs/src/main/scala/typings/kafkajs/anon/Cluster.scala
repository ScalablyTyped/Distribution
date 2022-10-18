package typings.kafkajs.anon

import typings.kafkajs.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  var cluster: typings.kafkajs.mod.Cluster
  
  var groupId: String
  
  var logger: Logger
}
object Cluster {
  
  inline def apply(cluster: typings.kafkajs.mod.Cluster, groupId: String, logger: Logger): Cluster = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setCluster(value: typings.kafkajs.mod.Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
