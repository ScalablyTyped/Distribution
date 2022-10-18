package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.utf8
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "ProducerStream")
@js.native
open class ProducerStream () extends Writable {
  def this(options: ProducerStreamOptions) = this()
  
  def _write(
    message: ProduceRequest,
    encoding: buffer | utf8,
    cb: js.Function2[/* error */ Any, /* data */ Any, Any]
  ): Unit = js.native
  
  @JSName("_writev")
  def _writev_MProducerStream(chunks: js.Array[Chunk], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  def close(): Unit = js.native
  def close(cb: js.Function0[Any]): Unit = js.native
  
  def sendPayload(payloads: js.Array[ProduceRequest], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
}
