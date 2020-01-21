package typings.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "listDirSync")
@js.native
object listDirSync extends js.Object {
  def apply(path: String): String | js.Array[String] = js.native
  def apply(path: String, options: DirectoryOptions): String | js.Array[String] = js.native
  def apply(path: String, options: DirectoryOptions, parent: String): String | js.Array[String] = js.native
}

