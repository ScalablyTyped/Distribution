package typings.hexoDashFs.hexoDashFsMod

import typings.hexoDashFs.Anon_Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "emptyDir")
@js.native
object emptyDir extends js.Object {
  def apply(path: String): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def apply(path: String, options: DirectoryOptions with Anon_Exclude): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def apply(
    path: String,
    options: DirectoryOptions with Anon_Exclude,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
}

