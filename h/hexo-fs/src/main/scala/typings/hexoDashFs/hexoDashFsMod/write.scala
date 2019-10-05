package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
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
  def apply(fd: Double): ^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): ^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): ^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): ^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): ^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): ^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): ^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): ^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): ^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, string: js.Any): ^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): ^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): ^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): ^[Anon_BufferBytesWrittenNumberString] = js.native
}

