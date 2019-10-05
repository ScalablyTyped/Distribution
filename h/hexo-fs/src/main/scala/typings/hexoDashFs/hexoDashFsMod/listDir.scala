package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "listDir")
@js.native
object listDir extends js.Object {
  def apply(path: String): ^[js.Array[String]] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): ^[js.Array[String]] = js.native
  def apply(path: String, options: DirectoryOptions): ^[js.Array[String]] = js.native
  def apply(
    path: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): ^[js.Array[String]] = js.native
}

