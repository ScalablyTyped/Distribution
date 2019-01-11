package typings
package iltorbLib.iltorbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iltorb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(buffer: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def compress(buffer: nodeLib.Buffer, callback: iltorbLib.iltorbMod.IltorbCallback): scala.Unit = js.native
  def compress(buffer: nodeLib.Buffer, options: iltorbLib.iltorbMod.BrotliEncodeParams): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    buffer: nodeLib.Buffer,
    options: iltorbLib.iltorbMod.BrotliEncodeParams,
    callback: iltorbLib.iltorbMod.IltorbCallback
  ): scala.Unit = js.native
  def compressStream(): nodeLib.streamMod.Transform with iltorbLib.iltorbMod.BrotliFlushable = js.native
  def compressStream(options: iltorbLib.iltorbMod.BrotliEncodeParams): nodeLib.streamMod.Transform with iltorbLib.iltorbMod.BrotliFlushable = js.native
  def compressSync(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def compressSync(buffer: nodeLib.Buffer, options: iltorbLib.iltorbMod.BrotliEncodeParams): nodeLib.Buffer = js.native
  def decompress(buffer: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def decompress(buffer: nodeLib.Buffer, callback: iltorbLib.iltorbMod.IltorbCallback): scala.Unit = js.native
  def decompressStream(): nodeLib.streamMod.Transform = js.native
  def decompressSync(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
}

