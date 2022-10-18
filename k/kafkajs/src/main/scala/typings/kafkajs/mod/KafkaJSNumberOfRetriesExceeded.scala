package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSNumberOfRetriesExceeded")
@js.native
open class KafkaJSNumberOfRetriesExceeded protected () extends KafkaJSNonRetriableError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSNumberOfRetriesExceededMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSNumberOfRetriesExceededMetadata) = this()
  
  val retryCount: Double = js.native
  
  val retryTime: Double = js.native
  
  @JSName("stack")
  val stack_KafkaJSNumberOfRetriesExceeded: String = js.native
}
