package typings.gracefulFs.mod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readvSync")
@js.native
object readvSync extends js.Object {
  /**
    * See `readv`.
    */
  def apply(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def apply(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}

