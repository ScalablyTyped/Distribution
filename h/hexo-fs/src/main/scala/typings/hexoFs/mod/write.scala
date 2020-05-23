package typings.hexoFs.mod

import typings.hexoFs.anon.BufferBytesWritten
import typings.hexoFs.anon.BufferString
import typings.hexoFs.anon.BytesWritten
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typings.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typings.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typings.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any): typings.bluebird.mod.^[BufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typings.bluebird.mod.^[BufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typings.bluebird.mod.^[BufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typings.bluebird.mod.^[BufferString] = js.native
}

