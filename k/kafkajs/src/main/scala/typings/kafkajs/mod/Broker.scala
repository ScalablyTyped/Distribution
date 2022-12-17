package typings.kafkajs.mod

import typings.kafkajs.anon.Acks
import typings.kafkajs.anon.GroupGenerationId
import typings.kafkajs.anon.GroupIdTopics
import typings.kafkajs.anon.GroupIds
import typings.kafkajs.anon.IsolationLevel
import typings.kafkajs.anon.Responses
import typings.kafkajs.anon.TimeoutTopicsArray
import typings.kafkajs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broker extends StObject {
  
  def alterPartitionReassignments(request: TimeoutTopicsArray): js.Promise[Any]
  
  def apiVersions(): js.Promise[ApiVersions]
  
  def connect(): js.Promise[Unit]
  
  def describeGroups(options: GroupIds): js.Promise[Any]
  
  def disconnect(): js.Promise[Unit]
  
  def fetch(request: IsolationLevel): js.Promise[Any]
  
  def isConnected(): Boolean
  
  def listPartitionReassignments(request: `0`): js.Promise[ListPartitionReassignmentsResponse]
  
  def metadata(topics: js.Array[String]): js.Promise[BrokerMetadata]
  
  def offsetCommit(request: GroupGenerationId): js.Promise[Any]
  
  def offsetFetch(request: GroupIdTopics): js.Promise[Responses]
  
  def produce(request: Acks): js.Promise[Any]
}
object Broker {
  
  inline def apply(
    alterPartitionReassignments: TimeoutTopicsArray => js.Promise[Any],
    apiVersions: () => js.Promise[ApiVersions],
    connect: () => js.Promise[Unit],
    describeGroups: GroupIds => js.Promise[Any],
    disconnect: () => js.Promise[Unit],
    fetch: IsolationLevel => js.Promise[Any],
    isConnected: () => Boolean,
    listPartitionReassignments: `0` => js.Promise[ListPartitionReassignmentsResponse],
    metadata: js.Array[String] => js.Promise[BrokerMetadata],
    offsetCommit: GroupGenerationId => js.Promise[Any],
    offsetFetch: GroupIdTopics => js.Promise[Responses],
    produce: Acks => js.Promise[Any]
  ): Broker = {
    val __obj = js.Dynamic.literal(alterPartitionReassignments = js.Any.fromFunction1(alterPartitionReassignments), apiVersions = js.Any.fromFunction0(apiVersions), connect = js.Any.fromFunction0(connect), describeGroups = js.Any.fromFunction1(describeGroups), disconnect = js.Any.fromFunction0(disconnect), fetch = js.Any.fromFunction1(fetch), isConnected = js.Any.fromFunction0(isConnected), listPartitionReassignments = js.Any.fromFunction1(listPartitionReassignments), metadata = js.Any.fromFunction1(metadata), offsetCommit = js.Any.fromFunction1(offsetCommit), offsetFetch = js.Any.fromFunction1(offsetFetch), produce = js.Any.fromFunction1(produce))
    __obj.asInstanceOf[Broker]
  }
  
  extension [Self <: Broker](x: Self) {
    
    inline def setAlterPartitionReassignments(value: TimeoutTopicsArray => js.Promise[Any]): Self = StObject.set(x, "alterPartitionReassignments", js.Any.fromFunction1(value))
    
    inline def setApiVersions(value: () => js.Promise[ApiVersions]): Self = StObject.set(x, "apiVersions", js.Any.fromFunction0(value))
    
    inline def setConnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    
    inline def setDescribeGroups(value: GroupIds => js.Promise[Any]): Self = StObject.set(x, "describeGroups", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setFetch(value: IsolationLevel => js.Promise[Any]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    
    inline def setListPartitionReassignments(value: `0` => js.Promise[ListPartitionReassignmentsResponse]): Self = StObject.set(x, "listPartitionReassignments", js.Any.fromFunction1(value))
    
    inline def setMetadata(value: js.Array[String] => js.Promise[BrokerMetadata]): Self = StObject.set(x, "metadata", js.Any.fromFunction1(value))
    
    inline def setOffsetCommit(value: GroupGenerationId => js.Promise[Any]): Self = StObject.set(x, "offsetCommit", js.Any.fromFunction1(value))
    
    inline def setOffsetFetch(value: GroupIdTopics => js.Promise[Responses]): Self = StObject.set(x, "offsetFetch", js.Any.fromFunction1(value))
    
    inline def setProduce(value: Acks => js.Promise[Any]): Self = StObject.set(x, "produce", js.Any.fromFunction1(value))
  }
}
