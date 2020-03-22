package typings.hexoFs.mod

import typings.hexoFs.Anon0
import typings.hexoFs.Anon1
import typings.hexoFs.AnonEncoding
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
  def apply(path: PathLike, options: Anon0): typings.bluebird.mod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: Anon1): typings.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: AnonEncoding): typings.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.mod.^[js.Array[String]] = js.native
}

