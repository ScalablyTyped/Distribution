package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSAlterPartitionReassignmentsError")
@js.native
open class KafkaJSAlterPartitionReassignmentsError protected () extends KafkaJSProtocolError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, topic: String) = this()
  def this(e: js.Error, topic: String) = this()
  def this(e: String, topic: String, partition: Double) = this()
  def this(e: String, topic: Unit, partition: Double) = this()
  def this(e: js.Error, topic: String, partition: Double) = this()
  def this(e: js.Error, topic: Unit, partition: Double) = this()
  
  val partition: js.UndefOr[Double] = js.native
  
  val topic: js.UndefOr[String] = js.native
}
