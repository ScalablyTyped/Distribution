package typings.hexoFs.mod

import typings.hexoFs.AnonAutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensureWriteStreamSync")
@js.native
object ensureWriteStreamSync extends js.Object {
  def apply(path: String): typings.gracefulFs.mod.WriteStream = js.native
  def apply(path: String, options: String): typings.gracefulFs.mod.WriteStream = js.native
  def apply(path: String, options: AnonAutoClose): typings.gracefulFs.mod.WriteStream = js.native
}

