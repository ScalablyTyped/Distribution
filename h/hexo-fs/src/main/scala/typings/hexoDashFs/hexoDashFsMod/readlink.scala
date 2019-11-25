package typings.hexoDashFs.hexoDashFsMod

import typings.hexoDashFs.Anon_BufferEncoding
import typings.hexoDashFs.Anon_EncodingBufferEncoding
import typings.hexoDashFs.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readlink")
@js.native
object readlink extends js.Object {
  def apply(path: PathLike): typings.bluebird.bluebirdMod.^[String] = js.native
  def apply(path: PathLike, options: String): typings.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon_BufferEncoding): typings.bluebird.bluebirdMod.^[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingBufferEncoding): typings.bluebird.bluebirdMod.^[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): typings.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.bluebirdMod.^[String] = js.native
}

