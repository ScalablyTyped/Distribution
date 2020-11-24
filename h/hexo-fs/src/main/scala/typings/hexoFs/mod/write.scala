package typings.hexoFs.mod

import typings.hexoFs.anon.BufferBytesWritten
import typings.hexoFs.anon.BytesWritten
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  
  def apply(fd: Double, string: js.Any): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any, position: js.UndefOr[scala.Nothing], encoding: String): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typings.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](
    fd: Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer, offset: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], length: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
  def apply[TBuffer /* <: Buffer | Uint8Array */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double, position: Double): typings.bluebird.mod.^[BytesWritten[TBuffer]] = js.native
}
