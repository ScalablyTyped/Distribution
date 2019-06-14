package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Admin extends js.Object {
  var events: AdminEvents
  def alterConfigs(configs: kafkajsLib.Anon_Resources): js.Promise[_]
  def connect(): js.Promise[scala.Unit]
  def createTopics(options: kafkajsLib.Anon_Timeout): js.Promise[scala.Boolean]
  def deleteTopics(topics: kafkajsLib.Anon_TimeoutTopics): js.Promise[scala.Unit]
  def describeConfigs(configs: kafkajsLib.Anon_IncludeSynonyms): js.Promise[DescribeConfigResponse]
  def disconnect(): js.Promise[scala.Unit]
  def fetchOffsets(topic: kafkajsLib.Anon_GroupIdTopic): js.Promise[js.Array[kafkajsLib.Anon_Offset]]
  def fetchTopicMetadata(topicMetadata: ITopicMetadata): js.Promise[scala.Unit]
  def fetchTopicOffsets(topic: java.lang.String): js.Promise[scala.Unit]
  def logger(): Logger
  def on(eventName: ValueOf[AdminEvents], listener: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit
  def resetOffsets(topic: kafkajsLib.Anon_Earliest): js.Promise[scala.Unit]
  def setOffsets(topic: kafkajsLib.Anon_GroupIdPartitions): js.Promise[scala.Unit]
}

object Admin {
  @scala.inline
  def apply(
    alterConfigs: kafkajsLib.Anon_Resources => js.Promise[_],
    connect: () => js.Promise[scala.Unit],
    createTopics: kafkajsLib.Anon_Timeout => js.Promise[scala.Boolean],
    deleteTopics: kafkajsLib.Anon_TimeoutTopics => js.Promise[scala.Unit],
    describeConfigs: kafkajsLib.Anon_IncludeSynonyms => js.Promise[DescribeConfigResponse],
    disconnect: () => js.Promise[scala.Unit],
    events: AdminEvents,
    fetchOffsets: kafkajsLib.Anon_GroupIdTopic => js.Promise[js.Array[kafkajsLib.Anon_Offset]],
    fetchTopicMetadata: ITopicMetadata => js.Promise[scala.Unit],
    fetchTopicOffsets: java.lang.String => js.Promise[scala.Unit],
    logger: () => Logger,
    on: (ValueOf[AdminEvents], js.Function1[/* repeated */ js.Any, scala.Unit]) => scala.Unit,
    resetOffsets: kafkajsLib.Anon_Earliest => js.Promise[scala.Unit],
    setOffsets: kafkajsLib.Anon_GroupIdPartitions => js.Promise[scala.Unit]
  ): Admin = {
    val __obj = js.Dynamic.literal(alterConfigs = js.Any.fromFunction1(alterConfigs), connect = js.Any.fromFunction0(connect), createTopics = js.Any.fromFunction1(createTopics), deleteTopics = js.Any.fromFunction1(deleteTopics), describeConfigs = js.Any.fromFunction1(describeConfigs), disconnect = js.Any.fromFunction0(disconnect), events = events, fetchOffsets = js.Any.fromFunction1(fetchOffsets), fetchTopicMetadata = js.Any.fromFunction1(fetchTopicMetadata), fetchTopicOffsets = js.Any.fromFunction1(fetchTopicOffsets), logger = js.Any.fromFunction0(logger), on = js.Any.fromFunction2(on), resetOffsets = js.Any.fromFunction1(resetOffsets), setOffsets = js.Any.fromFunction1(setOffsets))
  
    __obj.asInstanceOf[Admin]
  }
}

