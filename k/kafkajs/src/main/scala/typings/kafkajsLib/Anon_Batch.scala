package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Batch extends js.Object {
  var batch: kafkajsLib.kafkajsMod.Batch = js.native
  def commitOffsetsIfNecessary(): js.Promise[scala.Unit] = js.native
  def commitOffsetsIfNecessary(offsets: kafkajsLib.kafkajsMod.Offsets): js.Promise[scala.Unit] = js.native
  def heartbeat(): js.Promise[scala.Unit] = js.native
  def isRunning(): scala.Boolean = js.native
  def resolveOffset(offset: java.lang.String): scala.Unit = js.native
  def uncommittedOffsets(): js.Promise[scala.Unit] = js.native
}

