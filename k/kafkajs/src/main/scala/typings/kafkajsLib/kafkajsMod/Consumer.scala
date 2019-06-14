package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consumer extends js.Object {
  var events: ConsumerEvents = js.native
  def connect(): js.Promise[scala.Unit] = js.native
  def describeGroup(): js.Promise[GroupDescription] = js.native
  def disconnect(): js.Promise[scala.Unit] = js.native
  def logger(): Logger = js.native
  def on(eventName: ValueOf[ConsumerEvents], listener: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def pause(topicPartitions: js.Array[TopicPartitions]): scala.Unit = js.native
  def resume(topicPartitions: js.Array[TopicPartitions]): scala.Unit = js.native
  def run(): js.Promise[scala.Unit] = js.native
  def run(config: kafkajsLib.Anon_AutoCommit): js.Promise[scala.Unit] = js.native
  def seek(topicPartition: kafkajsLib.Anon_OffsetPartitionTopic): scala.Unit = js.native
  def stop(): js.Promise[scala.Unit] = js.native
  def subscribe(topic: kafkajsLib.Anon_FromBeginningTopic): js.Promise[scala.Unit] = js.native
}

