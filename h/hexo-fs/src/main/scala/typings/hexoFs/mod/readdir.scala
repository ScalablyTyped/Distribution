package typings.hexoFs.mod

import typings.hexoFs.AnonBufferEncoding
import typings.hexoFs.AnonEncoding
import typings.hexoFs.AnonEncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: PathLike): typings.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typings.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: AnonBufferEncoding): typings.bluebird.mod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: AnonEncoding): typings.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: AnonEncodingNull): typings.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.mod.^[js.Array[String]] = js.native
}

