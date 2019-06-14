package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafkajs", "Kafka")
@js.native
class Kafka protected () extends js.Object {
  def this(config: KafkaConfig) = this()
  def admin(): Admin = js.native
  def admin(config: AdminConfig): Admin = js.native
  def consumer(): Consumer = js.native
  def consumer(config: ConsumerConfig): Consumer = js.native
  def logger(): Logger = js.native
  def producer(): Producer = js.native
  def producer(config: ProducerConfig): Producer = js.native
}

