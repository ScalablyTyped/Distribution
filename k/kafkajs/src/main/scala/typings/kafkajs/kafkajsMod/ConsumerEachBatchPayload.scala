package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerEachBatchPayload extends js.Object {
  var batch: ConsumerBatch = js.native
  def commitOffsetsIfNecessary(): js.Promise[Unit] = js.native
  def commitOffsetsIfNecessary(offsets: OffsetsByTopicPartition): js.Promise[Unit] = js.native
  def heartbeat(): js.Promise[Unit] = js.native
  def isRunning(): Boolean = js.native
  def resolveOffset(offset: Double): js.Promise[Unit] = js.native
  def uncommittedOffsets(): OffsetsByTopicPartition = js.native
}

