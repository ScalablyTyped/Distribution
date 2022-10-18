package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSOffsetOutOfRange")
@js.native
open class KafkaJSOffsetOutOfRange protected () extends KafkaJSProtocolError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSOffsetOutOfRangeMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSOffsetOutOfRangeMetadata) = this()
  
  val partition: Double = js.native
  
  val topic: String = js.native
}
