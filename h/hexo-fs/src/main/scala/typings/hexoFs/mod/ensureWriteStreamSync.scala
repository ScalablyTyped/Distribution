package typings.hexoFs.mod

import typings.hexoFs.anon.AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensureWriteStreamSync")
@js.native
object ensureWriteStreamSync extends js.Object {
  def apply(path: String): typings.gracefulFs.mod.WriteStream = js.native
  def apply(path: String, options: String): typings.gracefulFs.mod.WriteStream = js.native
  def apply(path: String, options: AutoClose): typings.gracefulFs.mod.WriteStream = js.native
}

