package typings.iltorb.iltorbMod

import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iltorb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(buffer: Buffer): js.Promise[Buffer] = js.native
  def compress(buffer: Buffer, callback: IltorbCallback): Unit = js.native
  def compress(buffer: Buffer, options: BrotliEncodeParams): js.Promise[Buffer] = js.native
  def compress(buffer: Buffer, options: BrotliEncodeParams, callback: IltorbCallback): Unit = js.native
  def compressStream(): Transform with BrotliFlushable = js.native
  def compressStream(options: BrotliEncodeParams): Transform with BrotliFlushable = js.native
  def compressSync(buffer: Buffer): Buffer = js.native
  def compressSync(buffer: Buffer, options: BrotliEncodeParams): Buffer = js.native
  def decompress(buffer: Buffer): js.Promise[Buffer] = js.native
  def decompress(buffer: Buffer, callback: IltorbCallback): Unit = js.native
  def decompressStream(): Transform = js.native
  def decompressSync(buffer: Buffer): Buffer = js.native
}

