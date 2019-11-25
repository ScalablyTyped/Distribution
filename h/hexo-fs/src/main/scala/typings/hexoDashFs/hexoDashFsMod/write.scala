package typings.hexoDashFs.hexoDashFsMod

import typings.hexoDashFs.Anon_BufferBytesWritten
import typings.hexoDashFs.Anon_BufferBytesWrittenNumber
import typings.hexoDashFs.Anon_BufferBytesWrittenNumberString
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, string: js.Any): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
}

