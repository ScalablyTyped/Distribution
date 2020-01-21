package typings.gracefulFs.mod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "writevSync")
@js.native
object writevSync extends js.Object {
  /**
    * See `writev`.
    */
  def apply(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def apply(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}

