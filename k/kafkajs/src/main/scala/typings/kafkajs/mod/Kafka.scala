package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "Kafka")
@js.native
open class Kafka protected () extends StObject {
  def this(config: KafkaConfig) = this()
  
  def admin(): Admin = js.native
  def admin(config: AdminConfig): Admin = js.native
  
  def consumer(config: ConsumerConfig): Consumer = js.native
  
  def logger(): Logger = js.native
  
  def producer(): Producer = js.native
  def producer(config: ProducerConfig): Producer = js.native
}
