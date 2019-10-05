package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensurePath")
@js.native
object ensurePath extends js.Object {
  def apply(path: String): ^[String] = js.native
  def apply(path: String, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): ^[String] = js.native
}

