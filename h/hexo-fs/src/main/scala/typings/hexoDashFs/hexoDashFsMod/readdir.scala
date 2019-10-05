package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.hexoDashFs.Anon_BufferEncoding
import typings.hexoDashFs.Anon_Encoding
import typings.hexoDashFs.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: PathLike): ^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): ^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Anon_BufferEncoding): ^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: Anon_Encoding): ^[js.Array[String]] = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): ^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: BufferEncoding): ^[js.Array[String]] = js.native
}

