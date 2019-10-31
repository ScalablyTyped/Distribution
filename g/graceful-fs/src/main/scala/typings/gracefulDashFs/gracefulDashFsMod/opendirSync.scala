package typings.gracefulDashFs.gracefulDashFsMod

import typings.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "opendirSync")
@js.native
object opendirSync extends js.Object {
  def apply(path: String): typings.node.fsMod.Dirent = js.native
  def apply(path: String, options: OpenDirOptions): typings.node.fsMod.Dirent = js.native
}

