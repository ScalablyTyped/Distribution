package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "HighLevelProducer")
@js.native
open class HighLevelProducer protected () extends Producer {
  def this(client: KafkaClient) = this()
  def this(client: KafkaClient, options: ProducerOptions) = this()
  def this(client: KafkaClient, options: Unit, customPartitioner: CustomPartitioner) = this()
  def this(client: KafkaClient, options: ProducerOptions, customPartitioner: CustomPartitioner) = this()
}
