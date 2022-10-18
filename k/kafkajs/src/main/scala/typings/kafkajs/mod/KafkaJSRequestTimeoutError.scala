package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSRequestTimeoutError")
@js.native
open class KafkaJSRequestTimeoutError protected () extends KafkaJSError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSRequestTimeoutErrorMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSRequestTimeoutErrorMetadata) = this()
  
  val broker: String = js.native
  
  val correlationId: Double = js.native
  
  val createdAt: Double = js.native
  
  val pendingDuration: Double = js.native
  
  val sentAt: Double = js.native
}
