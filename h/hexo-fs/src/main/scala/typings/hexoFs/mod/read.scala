package typings.hexoFs.mod

import typings.hexoFs.anon.BytesRead
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.mod.^[typings.hexoFs.anon.Buffer] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[typings.hexoFs.anon.Buffer] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.mod.^[BytesRead] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[BytesRead] = js.native
}

