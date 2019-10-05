package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.hexoDashFs.Anon_BufferEncoding
import typings.hexoDashFs.Anon_EncodingBufferEncoding
import typings.hexoDashFs.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: PathLike): ^[String] = js.native
  def apply(path: PathLike, options: String): ^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon_BufferEncoding): ^[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingBufferEncoding): ^[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): ^[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): ^[String] = js.native
}

