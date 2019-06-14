package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  def addTargetTopic(topic: java.lang.String): js.Promise[scala.Unit]
  def connect(): js.Promise[scala.Unit]
  def defaultOffset(config: kafkajsLib.Anon_FromBeginning): scala.Double
  def disconnect(): js.Promise[scala.Unit]
  def fetchTopicsOffset(topics: js.Array[kafkajsLib.Anon_FromBeginningPartitions]): js.Promise[kafkajsLib.Anon_Partitions]
  def findBroker(node: kafkajsLib.Anon_NodeId): js.Promise[Broker]
  def findControllerBroker(): js.Promise[Broker]
  def findGroupCoordinator(group: kafkajsLib.Anon_GroupId): js.Promise[Broker]
  def findGroupCoordinatorMetadata(group: kafkajsLib.Anon_GroupId): js.Promise[kafkajsLib.Anon_Coordinator]
  def findLeaderForPartitions(topic: java.lang.String, partitions: js.Array[scala.Double]): org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  def findTopicPartitionMetadata(topic: java.lang.String): js.Array[PartitionMetadata]
  def isConnected(): scala.Unit
  def refreshMetadata(): js.Promise[scala.Unit]
  def refreshMetadataIfNecessary(): js.Promise[scala.Unit]
}

object Cluster {
  @scala.inline
  def apply(
    addTargetTopic: java.lang.String => js.Promise[scala.Unit],
    connect: () => js.Promise[scala.Unit],
    defaultOffset: kafkajsLib.Anon_FromBeginning => scala.Double,
    disconnect: () => js.Promise[scala.Unit],
    fetchTopicsOffset: js.Array[kafkajsLib.Anon_FromBeginningPartitions] => js.Promise[kafkajsLib.Anon_Partitions],
    findBroker: kafkajsLib.Anon_NodeId => js.Promise[Broker],
    findControllerBroker: () => js.Promise[Broker],
    findGroupCoordinator: kafkajsLib.Anon_GroupId => js.Promise[Broker],
    findGroupCoordinatorMetadata: kafkajsLib.Anon_GroupId => js.Promise[kafkajsLib.Anon_Coordinator],
    findLeaderForPartitions: (java.lang.String, js.Array[scala.Double]) => org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]],
    findTopicPartitionMetadata: java.lang.String => js.Array[PartitionMetadata],
    isConnected: () => scala.Unit,
    refreshMetadata: () => js.Promise[scala.Unit],
    refreshMetadataIfNecessary: () => js.Promise[scala.Unit]
  ): Cluster = {
    val __obj = js.Dynamic.literal(addTargetTopic = js.Any.fromFunction1(addTargetTopic), connect = js.Any.fromFunction0(connect), defaultOffset = js.Any.fromFunction1(defaultOffset), disconnect = js.Any.fromFunction0(disconnect), fetchTopicsOffset = js.Any.fromFunction1(fetchTopicsOffset), findBroker = js.Any.fromFunction1(findBroker), findControllerBroker = js.Any.fromFunction0(findControllerBroker), findGroupCoordinator = js.Any.fromFunction1(findGroupCoordinator), findGroupCoordinatorMetadata = js.Any.fromFunction1(findGroupCoordinatorMetadata), findLeaderForPartitions = js.Any.fromFunction2(findLeaderForPartitions), findTopicPartitionMetadata = js.Any.fromFunction1(findTopicPartitionMetadata), isConnected = js.Any.fromFunction0(isConnected), refreshMetadata = js.Any.fromFunction0(refreshMetadata), refreshMetadataIfNecessary = js.Any.fromFunction0(refreshMetadataIfNecessary))
  
    __obj.asInstanceOf[Cluster]
  }
}

