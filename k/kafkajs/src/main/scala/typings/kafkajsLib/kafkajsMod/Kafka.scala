package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafkajs", "Kafka")
@js.native
class Kafka protected () extends js.Object {
  def this(options: KafkaOptions) = this()
  def admin(): Admin = js.native
  def admin(options: AdminOptions): Admin = js.native
  def consumer(): Consumer = js.native
  def consumer(options: ConsumerOptions): Consumer = js.native
  def producer(): Producer = js.native
  def producer(options: ProducerOptions): Producer = js.native
}

