package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.kafkajs.mod.MessageSetEntry
  - typings.kafkajs.mod.RecordBatchEntry
*/
trait KafkaMessage extends StObject
object KafkaMessage {
  
  inline def MessageSetEntry(attributes: Double, offset: String, size: Double, timestamp: String): typings.kafkajs.mod.MessageSetEntry = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], key = null, value = null)
    __obj.asInstanceOf[typings.kafkajs.mod.MessageSetEntry]
  }
  
  inline def RecordBatchEntry(attributes: Double, headers: IHeaders, offset: String, timestamp: String): typings.kafkajs.mod.RecordBatchEntry = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], key = null, value = null)
    __obj.asInstanceOf[typings.kafkajs.mod.RecordBatchEntry]
  }
}
