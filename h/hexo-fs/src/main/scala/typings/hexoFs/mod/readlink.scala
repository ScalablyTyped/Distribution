package typings.hexoFs.mod

import typings.hexoFs.Anon0
import typings.hexoFs.Anon1
import typings.hexoFs.Anon2
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readlink")
@js.native
object readlink extends js.Object {
  def apply(path: PathLike): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: String): typings.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon0): typings.bluebird.mod.^[Buffer] = js.native
  def apply(path: PathLike, options: Anon1): typings.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon2): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.mod.^[String] = js.native
}

