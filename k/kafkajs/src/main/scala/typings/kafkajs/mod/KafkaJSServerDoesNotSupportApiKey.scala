package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSServerDoesNotSupportApiKey")
@js.native
open class KafkaJSServerDoesNotSupportApiKey protected () extends KafkaJSNonRetriableError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSServerDoesNotSupportApiKeyMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSServerDoesNotSupportApiKeyMetadata) = this()
  
  val apiKey: Double = js.native
  
  val apiName: String = js.native
}
