package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSStaleTopicMetadataAssignment")
@js.native
open class KafkaJSStaleTopicMetadataAssignment protected () extends KafkaJSError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSStaleTopicMetadataAssignmentMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSStaleTopicMetadataAssignmentMetadata) = this()
  
  val topic: String = js.native
  
  val unknownPartitions: Double = js.native
}
