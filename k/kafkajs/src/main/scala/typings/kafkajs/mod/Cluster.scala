package typings.kafkajs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.kafkajs.anon.FromBeginning
import typings.kafkajs.anon.FromTimestamp
import typings.kafkajs.anon.GroupId
import typings.kafkajs.anon.NodeId
import typings.kafkajs.anon.Partitions
import typings.kafkajs.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  def addMultipleTargetTopics(topics: js.Array[String]): js.Promise[Unit]
  
  def addTargetTopic(topic: String): js.Promise[Unit]
  
  def connect(): js.Promise[Unit]
  
  def defaultOffset(config: FromBeginning): Double
  
  def disconnect(): js.Promise[Unit]
  
  def fetchTopicsOffset(topics: js.Array[Partitions & (XOR[FromBeginning, FromTimestamp])]): js.Promise[js.Array[TopicOffsets]]
  
  def findBroker(node: NodeId): js.Promise[Broker]
  
  def findControllerBroker(): js.Promise[Broker]
  
  def findGroupCoordinator(group: GroupId): js.Promise[Broker]
  
  def findGroupCoordinatorMetadata(group: GroupId): js.Promise[CoordinatorMetadata]
  
  def findLeaderForPartitions(topic: String, partitions: js.Array[Double]): StringDictionary[js.Array[Double]]
  
  def findTopicPartitionMetadata(topic: String): js.Array[PartitionMetadata]
  
  def getNodeIds(): js.Array[Double]
  
  def isConnected(): Boolean
  
  def metadata(): js.Promise[BrokerMetadata]
  
  def refreshMetadata(): js.Promise[Unit]
  
  def refreshMetadataIfNecessary(): js.Promise[Unit]
  
  def removeBroker(options: Port): Unit
}
object Cluster {
  
  inline def apply(
    addMultipleTargetTopics: js.Array[String] => js.Promise[Unit],
    addTargetTopic: String => js.Promise[Unit],
    connect: () => js.Promise[Unit],
    defaultOffset: FromBeginning => Double,
    disconnect: () => js.Promise[Unit],
    fetchTopicsOffset: js.Array[Partitions & (XOR[FromBeginning, FromTimestamp])] => js.Promise[js.Array[TopicOffsets]],
    findBroker: NodeId => js.Promise[Broker],
    findControllerBroker: () => js.Promise[Broker],
    findGroupCoordinator: GroupId => js.Promise[Broker],
    findGroupCoordinatorMetadata: GroupId => js.Promise[CoordinatorMetadata],
    findLeaderForPartitions: (String, js.Array[Double]) => StringDictionary[js.Array[Double]],
    findTopicPartitionMetadata: String => js.Array[PartitionMetadata],
    getNodeIds: () => js.Array[Double],
    isConnected: () => Boolean,
    metadata: () => js.Promise[BrokerMetadata],
    refreshMetadata: () => js.Promise[Unit],
    refreshMetadataIfNecessary: () => js.Promise[Unit],
    removeBroker: Port => Unit
  ): Cluster = {
    val __obj = js.Dynamic.literal(addMultipleTargetTopics = js.Any.fromFunction1(addMultipleTargetTopics), addTargetTopic = js.Any.fromFunction1(addTargetTopic), connect = js.Any.fromFunction0(connect), defaultOffset = js.Any.fromFunction1(defaultOffset), disconnect = js.Any.fromFunction0(disconnect), fetchTopicsOffset = js.Any.fromFunction1(fetchTopicsOffset), findBroker = js.Any.fromFunction1(findBroker), findControllerBroker = js.Any.fromFunction0(findControllerBroker), findGroupCoordinator = js.Any.fromFunction1(findGroupCoordinator), findGroupCoordinatorMetadata = js.Any.fromFunction1(findGroupCoordinatorMetadata), findLeaderForPartitions = js.Any.fromFunction2(findLeaderForPartitions), findTopicPartitionMetadata = js.Any.fromFunction1(findTopicPartitionMetadata), getNodeIds = js.Any.fromFunction0(getNodeIds), isConnected = js.Any.fromFunction0(isConnected), metadata = js.Any.fromFunction0(metadata), refreshMetadata = js.Any.fromFunction0(refreshMetadata), refreshMetadataIfNecessary = js.Any.fromFunction0(refreshMetadataIfNecessary), removeBroker = js.Any.fromFunction1(removeBroker))
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setAddMultipleTargetTopics(value: js.Array[String] => js.Promise[Unit]): Self = StObject.set(x, "addMultipleTargetTopics", js.Any.fromFunction1(value))
    
    inline def setAddTargetTopic(value: String => js.Promise[Unit]): Self = StObject.set(x, "addTargetTopic", js.Any.fromFunction1(value))
    
    inline def setConnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    
    inline def setDefaultOffset(value: FromBeginning => Double): Self = StObject.set(x, "defaultOffset", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setFetchTopicsOffset(
      value: js.Array[Partitions & (XOR[FromBeginning, FromTimestamp])] => js.Promise[js.Array[TopicOffsets]]
    ): Self = StObject.set(x, "fetchTopicsOffset", js.Any.fromFunction1(value))
    
    inline def setFindBroker(value: NodeId => js.Promise[Broker]): Self = StObject.set(x, "findBroker", js.Any.fromFunction1(value))
    
    inline def setFindControllerBroker(value: () => js.Promise[Broker]): Self = StObject.set(x, "findControllerBroker", js.Any.fromFunction0(value))
    
    inline def setFindGroupCoordinator(value: GroupId => js.Promise[Broker]): Self = StObject.set(x, "findGroupCoordinator", js.Any.fromFunction1(value))
    
    inline def setFindGroupCoordinatorMetadata(value: GroupId => js.Promise[CoordinatorMetadata]): Self = StObject.set(x, "findGroupCoordinatorMetadata", js.Any.fromFunction1(value))
    
    inline def setFindLeaderForPartitions(value: (String, js.Array[Double]) => StringDictionary[js.Array[Double]]): Self = StObject.set(x, "findLeaderForPartitions", js.Any.fromFunction2(value))
    
    inline def setFindTopicPartitionMetadata(value: String => js.Array[PartitionMetadata]): Self = StObject.set(x, "findTopicPartitionMetadata", js.Any.fromFunction1(value))
    
    inline def setGetNodeIds(value: () => js.Array[Double]): Self = StObject.set(x, "getNodeIds", js.Any.fromFunction0(value))
    
    inline def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    
    inline def setMetadata(value: () => js.Promise[BrokerMetadata]): Self = StObject.set(x, "metadata", js.Any.fromFunction0(value))
    
    inline def setRefreshMetadata(value: () => js.Promise[Unit]): Self = StObject.set(x, "refreshMetadata", js.Any.fromFunction0(value))
    
    inline def setRefreshMetadataIfNecessary(value: () => js.Promise[Unit]): Self = StObject.set(x, "refreshMetadataIfNecessary", js.Any.fromFunction0(value))
    
    inline def setRemoveBroker(value: Port => Unit): Self = StObject.set(x, "removeBroker", js.Any.fromFunction1(value))
  }
}
