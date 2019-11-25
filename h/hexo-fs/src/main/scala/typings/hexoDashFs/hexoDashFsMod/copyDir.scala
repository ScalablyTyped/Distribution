package typings.hexoDashFs.hexoDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "copyDir")
@js.native
object copyDir extends js.Object {
  def apply(src: String, dest: String): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(src: String, dest: String, options: DirectoryOptions): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
}

