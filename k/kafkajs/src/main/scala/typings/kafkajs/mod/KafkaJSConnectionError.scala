package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSConnectionError")
@js.native
open class KafkaJSConnectionError protected () extends KafkaJSError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSConnectionErrorMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSConnectionErrorMetadata) = this()
  
  val broker: String = js.native
}
