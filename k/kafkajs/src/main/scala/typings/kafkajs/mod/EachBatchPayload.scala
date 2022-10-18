package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EachBatchPayload extends StObject {
  
  var batch: Batch = js.native
  
  def commitOffsetsIfNecessary(): js.Promise[Unit] = js.native
  def commitOffsetsIfNecessary(offsets: Offsets): js.Promise[Unit] = js.native
  
  def heartbeat(): js.Promise[Unit] = js.native
  
  def isRunning(): Boolean = js.native
  
  def isStale(): Boolean = js.native
  
  def pause(): js.Function0[Unit] = js.native
  
  def resolveOffset(offset: String): Unit = js.native
  
  def uncommittedOffsets(): OffsetsByTopicPartition = js.native
}
