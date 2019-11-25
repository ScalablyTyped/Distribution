package typings.hexoDashFs.hexoDashFsMod

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
  def apply(path: PathLike): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typings.bluebird.bluebirdMod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Anon_BufferEncoding): typings.bluebird.bluebirdMod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: Anon_Encoding): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): typings.bluebird.bluebirdMod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
}

