package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerEachBatchPayload extends js.Object {
  var batch: ConsumerBatch = js.native
  def commitOffsetsIfNecessary(): js.Promise[scala.Unit] = js.native
  def commitOffsetsIfNecessary(offsets: OffsetsByTopicPartition): js.Promise[scala.Unit] = js.native
  def heartbeat(): js.Promise[scala.Unit] = js.native
  def isRunning(): scala.Boolean = js.native
  def resolveOffset(offset: scala.Double): js.Promise[scala.Unit] = js.native
  def uncommittedOffsets(): OffsetsByTopicPartition = js.native
}

